package study.hsp.Internet网络编程;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Monitor {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket(9999);
        //监听端口
        Socket accept = server.accept();
        //获取输入流
        InputStream inputStream = accept.getInputStream();
        // readLen 每次获取字符的长度
        int readLen = 0;
        // byte数组提高获取效率
        byte[] buf = new byte[1024];
        //循环取出数据
        while ((readLen = inputStream.read(buf)) != -1) {
            //获取的数据会有许多的空格符 这里只要获取他的指定长度 去除多余的空格符合
            //即只要从 buf 数组里获取 偏移量为0 长度readLen 的数据集
            System.out.println(new String(buf, 0, readLen));
        }

        //关闭流
        inputStream.close();
        accept.close();
        server.close();
    }
}

//客户端
class Client {
    @Test
    public void client() throws IOException, InterruptedException {
        //实例化 Socket 对象
        Socket socket = new Socket(InetAddress.getByName("192.168.10.46"), 9999);
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //输出流写入数据到数据通道
        outputStream.write("world".getBytes());
        //关闭流
        socket.close();
        outputStream.close();
    }
}
