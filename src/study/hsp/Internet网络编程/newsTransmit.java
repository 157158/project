package study.hsp.Internet网络编程;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import static net.mindview.util.Print.*;


public class newsTransmit {
}


class Server  {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = new Server();

        server.serverNews();
    }

    public void serverNews() throws IOException {
        //实例化serverSocket对象
        ServerSocket server = new ServerSocket(9999);
        print("output端口号: " + server.getLocalPort());
        Scanner scanner = new Scanner(System.in);
        //监听端口
        Socket accept = server.accept();
        print("output地址: " + accept.getLocalAddress() + " output端口号: " + accept.getLocalPort());

        //获得输入输出流
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        System.out.println("input data...(1 = return)");
        while (true) {
            System.out.print("\t\t\t");
            String str = scanner.next();
            writer.write(str);
            writer.newLine();
            writer.flush();
            if (str.equals("1")) {
                writer.close();
                outputStream.close();
                accept.close();
                scanner.close();
                server.close();
                return;
            }
        }
    }


}

class Client_  {
    public static void main(String[] args) throws InterruptedException {
        Client_ client_ = new Client_();
        client_.client();
    }


    public void client() {
        Socket socket = null;
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            socket = new Socket("192.168.10.46", 9999);
            inputStream = socket.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            //保存数据
            String str;
            //输出到控制台
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (reader != null)
                    reader.close();

                if (inputStream != null)
                    inputStream.close();

                if (socket != null)
                    socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


