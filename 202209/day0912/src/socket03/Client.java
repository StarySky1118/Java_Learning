package socket03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端，主机名 + 端口号
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("连接服务端成功！");

        // 向管道输出数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("你好，服务端！");
        bw.newLine(); // 结束输出
        bw.flush(); // 刷新

        // 关连接、关流
        bw.close();
        socket.close();

    }
}
