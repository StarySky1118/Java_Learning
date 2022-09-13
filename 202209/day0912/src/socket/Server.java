package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建ServerSocket对象，端口号9999
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端监听9999，等待连接...");
        // 监听端口，返回Socket对象
        Socket socket = serverSocket.accept();

        // 从客户端接收数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[8]; // 每次最多读8个字节
        int readLen = 0; // 每次读取的字节数

        while((readLen = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, readLen));
        }

        // 关流、关连接
        inputStream.close();
        socket.close();
        serverSocket.close();



    }
}
