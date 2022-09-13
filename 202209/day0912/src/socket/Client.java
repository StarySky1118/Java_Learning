package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        System.out.println("服务端连接成功！");

        // 向服务端传送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server".getBytes());

        // 关流、关连接
        outputStream.close();
        socket.close();
    }
}
