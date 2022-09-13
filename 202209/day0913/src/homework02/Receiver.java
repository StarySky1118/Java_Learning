package homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

// 接收方
public class Receiver {
    public static void main(String[] args) throws IOException {
        // 创建UDP socket
        DatagramSocket socket = new DatagramSocket(8888);

        // 接收数据报
        byte[] bytes = new byte[1024]; // 接收缓存
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length); // 用于接收数据报
        System.out.println("接收方等待UDP数据报...");
        socket.receive(packet);

        // 拆数据报，获取信息
        int length = packet.getLength(); // 数据报长度
        byte[] data = packet.getData(); // 数据报数据
        String question = new String(data, 0, length); // 接收到的问题
        System.out.println(question);

        // 根据问题确定回答
        String answer = ""; // 答复
        if("四大名著是哪些？".equals(question)) {
            answer = "三国演义什么的...";
        } else {
            answer = "我没学过...";
        }

        // 发送回答
        bytes = answer.getBytes();
        packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("10.101.148.99"), 9999);
        socket.send(packet);

        // 关闭socket
        socket.close();
    }
}
