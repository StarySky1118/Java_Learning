package udp_;

import java.io.IOException;
import java.net.*;

// 发送端
public class Sender {
    public static void main(String[] args) throws IOException {
        String messageSent = "hello,明天见！";
        byte[] buf = messageSent.getBytes();
        DatagramSocket socket = new DatagramSocket(8888); // 数据报将经由端口8888传出、传入
        // 创建要传送的数据报
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 9999);
        socket.send(packet);

        socket.receive(packet);
        // 接收并拆包
        int length = packet.getLength(); // 数据字节长度
        byte[] data = packet.getData(); // 数据的字节数组
        System.out.println(new String(data, 0, length));

        // 关闭端口
        socket.close();
    }
}
