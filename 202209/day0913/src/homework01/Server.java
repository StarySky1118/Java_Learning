package homework01;

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

        // 从管道获取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null; // 读取行
        StringBuilder sb = new StringBuilder(); // 读取到的字符串
        while((line = br.readLine()) != null) {
            sb.append(line); // 读取到的行添加到读取字符串后面
        }

        // 根据读取到的字符串确定要发送给客户端的数据
        String strReceived = sb.toString();
        String strSent = null; // 要发送给客户端的数据
        switch (strReceived) {
            case "name" :
                strSent = "Nova";
                break;
            case "hobby" :
                strSent = "编写java程序";
                break;
            default:
                strSent = "你说的我还听不懂！";
                break;
        }

        // 向客户端发送数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(strSent);
        bw.flush();
        socket.shutdownOutput();

        // 关连接
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
    }
}
