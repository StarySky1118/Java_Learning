package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_ {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress localHost = InetAddress.getLocalHost();
//
//        System.out.println(localHost);

//        InetAddress localHost = InetAddress.getByName("DESKTOP-FKS7NC6");
//        System.out.println(localHost);

        InetAddress baiDu = InetAddress.getByName("www.baidu.com");
//        System.out.println(baiDu);
        System.out.println(baiDu.getHostAddress());
        System.out.println(baiDu.getHostName());
    }
}
