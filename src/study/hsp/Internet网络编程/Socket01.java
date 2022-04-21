package study.hsp.Internet网络编程;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //实例化ServerSocket 对象
        ServerSocket server = new ServerSocket(9999);
        //监听端口
        Socket accept = server.accept();
        //获取输入流
        InputStream inputStream = accept.getInputStream();
        //每一次获取的数据长度
        int readLen = 0;
        //转换成字符流
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        //输出数据
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }


        //关闭流
        server.close();
        accept.close();
        reader.close();
        inputStream.close();
    }
}

class Client01 {
    @Test
    public void client() throws IOException, InterruptedException {
        Socket socket = new Socket("192.168.10.46", 9999);
        //输出流 并转换成字符输出流
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        //判断文件是否存在 否则创建
        File file = new File("D:\\1\\1.jpg");
        if (!file.exists()) {
//            file.createNewFile();
            System.out.println("文件不存在.....");
            outputStream.close();
            writer.close();
            socket.close();
            return;
        }
        //输入流
        BufferedReader reader = new BufferedReader(new FileReader(file));
        //临时存储数据
        String str = "";
        //通过输出流写入到数据通道
        char[] buf = new char[1024];
        int readLen = 0;
        while ((str = reader.readLine()) != null) {
            writer.write(str + "\n");
        }
        //必须刷新才能够写入数据通道
        writer.flush();


        outputStream.close();
        writer.close();
        socket.close();
    }
}
