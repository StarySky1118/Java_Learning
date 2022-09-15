package homework03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// 客户端
public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("服务端连接成功！");

        System.out.print("请输入文件名: ");

        // 向管道输入数据
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next(); // 请求文件名
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 字节输出流
        bw.write(fileName);
        bw.flush(); // 写入结束标志
        socket.shutdownOutput(); // 停止输出

        // 确定文件存放地
        System.out.print("另存为：");
        String destFilePath = scanner.next();

        // 从管道读取数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream()); // 管道读取流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName)); // 文件写入流
        byte[] bytes = new byte[1024]; // 缓冲字节数组
        int readLen = 0;
        while((readLen = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, readLen);
        }
        System.out.println("文件下载成功！");

        // 停止使用端口、关闭流
        bos.close();
        bis.close();
        bw.close();
        socket.close();
    }
}
