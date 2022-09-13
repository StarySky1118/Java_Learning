package socket04;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("服务端连接成功！");

        // 将图片文件读取到缓冲区并写入管道
        String filePath = "Z:\\Lappland.jpg";
        byte[] bytes = new byte[1024]; // 每次最多读取1024个字节
        int readLen = 0; // 此次读取字节数
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        while((readLen = bis.read(bytes)) != -1) { // 读取图片、写入管道
            bos.write(bytes, 0, readLen);
        }
        bis.close(); // 关闭从文件进行读取的流
        socket.shutdownOutput(); // 停止写入

        // 等待接收上传状态提示
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 关流、关连接
        bos.close();
        br.close();
        socket.close();
    }
}
