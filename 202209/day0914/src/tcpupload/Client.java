package tcpupload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// 客户端
public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("服务端连接成功！");

        // 将文件读取到缓冲数组，并写入到输出管道
        String filePath = "Z:\\Lappland.jpg";
        byte[] bytes = new byte[1024]; // 缓冲数组
        int readLen = 0; // 读取字节数
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath)); // 文件读取流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream()); // 管道写入流
        while((readLen = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, readLen);
        }
        bis.close(); // 关闭文件读取流
        bos.flush(); // 结束写入
        socket.shutdownOutput(); // 停止输出

        // 等待接收上传是否成功的通知
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 字节读取流
        String line = null; // 读取行
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 关闭连接
        br.close();
        bos.close();
        socket.close();
    }
}
