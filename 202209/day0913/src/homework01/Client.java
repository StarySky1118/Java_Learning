package homework01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        // 客户端向管道输入数据
        String data = "爱吃酸萝卜吗？";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(data);
        bw.flush();
        socket.shutdownOutput();

        // 客户端从管道接收
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null; // 读取行
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 关连接
        br.close();
        bw.close();
        socket.close();
    }
}
