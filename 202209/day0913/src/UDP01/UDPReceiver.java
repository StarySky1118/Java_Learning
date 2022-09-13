package UDP01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

// UDP接收端
public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        // 创建UDP套接字
        DatagramSocket socket = new DatagramSocket(8888);

        // 创建UDP包对象，接收传来的数据包
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        System.out.println("接收端等待接收UDP数据包...");

        // 等待接收数据包
        socket.receive(packet);

        // 拆包读取数据
        int length = packet.getLength(); // 数据长度
        byte[] data = packet.getData(); // 数据字节数组
        System.out.println(new String(data, 0, length));

        // 创建回复数据包
        byte[] buf = "收到，明天早起！".getBytes();
        DatagramPacket packetSent = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.101.148.99"), 9999);

        // 发送回复数据包
        socket.send(packetSent);

        // 关资源
        socket.close();
    }
}
