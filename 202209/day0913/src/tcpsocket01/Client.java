package tcpsocket01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("服务端连接成功！");

        // 向服务端发送hello消息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server!".getBytes());
        socket.shutdownOutput(); // 结束标志

        // 从管道读取hello消息
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024]; // 缓冲字节数组
        int readLen = 0; // 读取字节数
        while((readLen = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, readLen));
        }

        // 关流、关连接
        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
