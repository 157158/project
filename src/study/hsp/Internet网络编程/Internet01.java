package study.hsp.Internet网络编程;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SuppressWarnings("SpellCheckingInspection")
public class Internet01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host3 = InetAddress.getByName("www.baidu.com");

        System.out.println(host3.toString());
        System.out.println("主机名:" + host3.getHostName());
        System.out.println("主机ip:" + host3.getHostAddress());

        //本机ip
        System.out.println("本机ip:" + InetAddress.getLocalHost().getHostAddress());
    }
    @Test
    public void inet() throws IOException {
        //DESKTOP-4PVRQ87
        InetAddress address = InetAddress.getByName("192.168.10.46");


        String ip = address.getHostAddress();
        System.out.println(ip);

        String name = address.getHostName();
        System.out.println(name);

        System.out.println(InetAddress.getLocalHost());

        System.out.println(address.isReachable(10000));





    }
}
