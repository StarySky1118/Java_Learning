package socket03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 服务端
public class Server {
    public static void main(String[] args) throws IOException {
        // 监听端口9999，等待客户端连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待客户端连接...");
        Socket socket = serverSocket.accept();

        // 从管道获取数据并输出
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 关流、关连接
        br.close();
        socket.close();
        serverSocket.close();



    }
}
