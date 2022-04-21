package study.hsp.Internet网络编程.News;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//消息聊天
//服务端
public class ServerNews extends Thread {
    static ServerSocket server;
    static Socket accept;
    boolean flag;
    static ServerNews work01 = new ServerNews();

    static {
        try {

            server = new ServerSocket(9999);
            accept = server.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        work01.start();
        work01.server();
    }

    public void server() throws Exception {
        System.out.println("link client: " + server.getLocalPort());
        OutputStream output = accept.getOutputStream();
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
            if (str.equals("return")) {
                work01.flag = true;

                scanner.close();
                writer.close();
                server.close();
                accept.close();
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
                InputStream input = accept.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                String content;

                content = reader.readLine();
                System.out.println("回复消息: " + content);
                //退出
                if (flag || content.equals("return")) {
                    System.out.println("stop...");
                    reader.close();
                    input.close();
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





