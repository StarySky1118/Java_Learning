package tcpsocket02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// 服务端
public class Server {
    public static void main(String[] args) throws IOException {
        // 监听端口6666，等待连接
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("等待客户端连接...");
        Socket socket = serverSocket.accept();
        System.out.println("客户端连接成功！");

        // 接收请求同步消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 发送回复同步消息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("你好客户端，请求同步！");
        bw.flush();
        socket.shutdownOutput();

        // 接收收到消息
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 关闭连接
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
    }
}
