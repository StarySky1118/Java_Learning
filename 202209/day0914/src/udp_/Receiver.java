package udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

// 接收端
public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999); // UDP数据报将从端口9999传入
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length); // 用于接收传来数据报的空数据报
        System.out.println("接收端等待数据...");
        socket.receive(packet);

        // 将数据报拆包输出其中的消息
        int length = packet.getLength(); // 数据字节长度
        byte[] data = packet.getData(); // 数据的字节数组
        System.out.println(new String(data, 0, length));

        // 创建发送的数据报
        String messageSent = "收到！";
        buf = messageSent.getBytes();
        packet = new DatagramPacket(buf, 0, buf.length, InetAddress.getLocalHost(), 8888);
        socket.send(packet);

        // 停止使用端口
        socket.close();
    }
}
