package homework02;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

// 发送方
public class Sender {
    public static void main(String[] args) throws IOException {
        // 创建UDP socket
        DatagramSocket socket = new DatagramSocket(9999);

        // 发送消息
        String question = "四大名著是哪些？";
        byte[] bytes = question.getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("10.101.148.99"), 8888);
        socket.send(packet);

        // 接收回复
        socket.receive(packet);

        // 拆包
        int length = packet.getLength(); // 数据报长度
        byte[] data = packet.getData(); // 数据报中的数据
        String answer = new String(data, 0, length);
        System.out.println(answer);

        // 关连接
        socket.close();

    }
}
