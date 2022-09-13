package socket02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 服务端
public class Server {
    public static void main(String[] args) throws IOException {
        // 服务端监听端口9999，等待客户端连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待客户端连接...");
        Socket socket = serverSocket.accept();

        // 获取InputStream，从管道获取数据
        byte[] bytes = new byte[1024]; // 每次最多从管道读取1024个字节
        int readLen = 0; // 读取字节数
        InputStream inputStream = socket.getInputStream();
        while((readLen = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, readLen));
        }

        // 获取数据完成，向客户端回送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        socket.shutdownOutput(); // 写完结束标记

        // 关流、关连接
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();




    }
}
