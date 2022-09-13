package UDP01;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        // 创建UDP socket
        DatagramSocket socket = new DatagramSocket(9999);

        // 创建待发送的UDP数据包
        byte[] buf = "hello,明天早八！".getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.101.148.99"), 8888);

        // 发送数据包
        socket.send(packet);

        // 接收回复数据包
        byte[] bytes = new byte[1024];
        DatagramPacket packetReceived = new DatagramPacket(bytes, bytes.length); // 接收数据包
        socket.receive(packetReceived);

        // 拆包
        int length = packetReceived.getLength(); // 数据长度
        byte[] data = packetReceived.getData(); // 数据
        System.out.println(new String(data, 0, length));

        // 关闭socket
        socket.close();
    }
}
