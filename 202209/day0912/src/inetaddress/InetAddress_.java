package inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_ {
    public static void main(String[] args) throws UnknownHostException {
        // 1、获取本机InetAddress对象
        // public static InetAddress getLocalHost() throws UnknownHostException
        // InetAddress localHost = InetAddress.getLocalHost();

        // 2、根据主机名获取InetAddress对象
        // public static InetAddress getByName(String host)
        // InetAddress host = InetAddress.getByName("DESKTOP-FKS7NC6");

        // 3、根据域名获取InetAddress对象
        InetAddress baiDu = InetAddress.getByName("www.baidu.com");

        // 4、根据InetAddress对象获取信息
        // IP地址
        System.out.println(baiDu.getHostAddress());
        // 主机名/域名
        System.out.println(baiDu.getHostName());

    }
}
