package tcpupload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// 服务端
public class Server {
    public static void main(String[] args) throws IOException {
        // 监听端口8888，等待客户端连接
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("等待客户端连接...");
        Socket socket = serverSocket.accept();

        // 读取管道中的字节流 并写入文件
        String destFilePath = "Z:\\Lappland(1).jpg";
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream()); // 管道读取流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath)); // 文件输出流
        byte[] buf = new byte[1024]; // 缓冲区
        int readLen = 0; // 读取字节数
        while((readLen = bis.read(buf)) != -1) {
            bos.write(buf, 0, readLen);
        }
        bos.close(); // 关闭文件输出流

        // 文件接收成功，向客户端发送成功通知
        String message = "文件上传成功！";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 字符输出流
        bw.write(message);
        bw.flush(); // 写入完成标志
        socket.shutdownOutput(); // 写入结束


        // 关连接
        bw.close();
        bis.close();
        socket.close();
        serverSocket.close();

    }
}
