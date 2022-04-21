package study.hsp.Internet网络编程;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//使用socket 拷贝图片
//使用字节流
public class SocketImg {
    public static void main(String[] args) throws IOException {
        //实例化 serverSocket 和 处理字节流
        ServerSocket server = new ServerSocket(9999);
        System.out.println("链接到端口：" + server.getLocalPort());
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("D:\\1\\2.jpg"));

        //监听端口
        Socket accept = server.accept();
        System.out.println("链接到地址：" + accept.getLocalAddress() + " 端口:" + accept.getLocalPort());
        //获取输入流
        InputStream inputStream = accept.getInputStream();
        //定义一次读取数据量的初始值
        int readLen = 0;
        //定义byte数组存储 并初始化长度
        byte[] buf = new byte[1024];
        //取出数据并写入输出流
        while ((readLen = inputStream.read(buf)) != -1)
            output.write(buf, 0, readLen);

//        accept.shutdownInput();

        System.out.println("向客户端反馈...");
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        writer.write("receive Img...");
        writer.newLine();
        writer.flush();

        //关闭流
        output.close();
        inputStream.close();
        outputStream.close();
        writer.close();
        accept.close();
        server.close();
    }
}

class Client02 {
    @Test
    public void client() throws IOException {
        //初始化socket 和 字节流
        Socket client = new Socket(InetAddress.getByName("192.168.10.46"), 9999);
        System.out.println("客户端地址" + client.getLocalAddress() + " 端口:" + client.getLocalPort());
        BufferedInputStream input = new BufferedInputStream(new FileInputStream("D:\\1\\1.jpg"));

        //获取输出流
        OutputStream outputStream = client.getOutputStream();

        //传入数据到输出流
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = input.read(buf)) != -1) {
            outputStream.write(buf, 0, readLen);
        }

        client.shutdownOutput();

        System.out.println("接收服务端返回的数据...");
        InputStream inputStream = client.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(reader.readLine());


        //关闭流
        inputStream.close();
        outputStream.close();
        input.close();
        client.close();
    }
}
