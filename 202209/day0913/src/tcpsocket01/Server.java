package tcpsocket01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// 服务端
public class Server {
    public static void main(String[] args) throws IOException {
        // 监听端口8888，等待客户端连接
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端等待连接...");
        Socket socket = serverSocket.accept();

        // 从管道读取
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024]; // 缓冲字节数组
        int readLen = 0; // 读取字节数
        while((readLen = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, readLen));
        }

        // 向管道写入
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client!".getBytes());
        socket.shutdownOutput();

        // 关流、关连接
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();



    }
}
