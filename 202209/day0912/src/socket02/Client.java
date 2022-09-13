package socket02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端：主机号 + 端口号
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("服务端连接成功！");

        // 获取OutputStream，向管道输出数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        socket.shutdownOutput(); // 设置写完标记

        // 获取InputStream，从管道读取数据
        byte[] bytes = new byte[1024];
        int readLen = 0;
        InputStream inputStream = socket.getInputStream();
        while((readLen = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, readLen));
        }

        // 关流、关连接
        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
