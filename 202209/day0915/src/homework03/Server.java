package homework03;

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

        // 从管道读取数据
        StringBuilder sb = new StringBuilder(); // 用于字符串处理
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 字节读取流
        String line = null;
        while((line = br.readLine()) != null) {
            sb.append(line);
        }
//        System.out.println(sb);
        String defaultDirectory = "Z:\\";
        String fileName = sb.toString();
//        System.out.println(fileName);

        // 根据文件名将文件读取到缓冲区
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(defaultDirectory + fileName)); // 文件读取流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream()); // 管道输出流
        byte[] bytes = new byte[1024]; // 缓冲区
        int readLen = 0; // 读取字节数
        while((readLen = bis.read(bytes)) != -1)  {
            bos.write(bytes, 0, readLen); // 将文件写入管道
        }

        // 停止使用端口、关闭流
        bos.close();
        bis.close();
        br.close();
        socket.close();
        serverSocket.close();

    }
}
