package study.hsp.Internet网络编程.News;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class ClientNews extends Thread {
    static Socket client;
    boolean flag;

    static {
        try {
            client = new Socket("192.168.10.46", 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ClientNews clientNews = new ClientNews();
        clientNews.start();

        System.out.println("link server: " + client.getLocalPort());
        OutputStream output = client.getOutputStream();


        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
        Scanner scanner = new Scanner(System.in);
        String str;
        String content;

        //输出
        System.out.println("input...");
        while (true) {
            System.out.println("发送消息: ");
            str = scanner.next();
            writer.write(str);
            writer.newLine();
            writer.flush();

            if (clientNews.flag || str.equals("return")) {
                clientNews.flag = true;

                scanner.close();
                writer.close();
                client.close();
                output.close();

                System.out.println("stop...");
                System.exit(0);
            }
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                InputStream input = client.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                String content;

                content = reader.readLine();
                System.out.println("回复消息: " + content);
                //退出
                if (flag || content.equals("return")) {
                    flag = true;
                    reader.close();
                    input.close();
                    System.out.println("stop...");
                    System.exit(0);
                }
            }
        } catch (Exception e) {
//            System.out.println("stop...");
            e.printStackTrace();
        }
    }
}
