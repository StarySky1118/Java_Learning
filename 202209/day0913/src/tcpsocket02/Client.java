package tcpsocket02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 6666);
        System.out.println("服务端连接成功！");

        // 发送请求同步消息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("你好服务端，请求同步！");
        bw.flush();
        socket.shutdownOutput();

        // 接收回复同步消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 发送收到消息
        bw.write("收到！");
        bw.flush();
        socket.shutdownOutput();

        // 关连接
        br.close();
        bw.close();
        socket.close();
    }
}
