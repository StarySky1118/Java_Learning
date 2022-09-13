package socket04;

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

        // 从管道中读取字节并写入目标文件
        String destFilePath = "Z:\\Lappland(1).jpg";
        byte[] bytes = new byte[1024];
        int readLen = 0;
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath)); // 写入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream()); // 管道读取流
        while((readLen = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, readLen);
        }
        bos.close(); // 关闭写入文件的流

        System.out.println("图片接收成功！");

        // 向客户端说明成功信息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("图片上传成功！");
        bw.newLine();
        bw.flush(); // 结束标志

        // 关流、关连接
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
