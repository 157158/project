package study.hsp.IO文件;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
    }

    // copy一个文件
    @Test
    public void bufferedChar() throws IOException {
        //实例化对象
        BufferedReader read = new BufferedReader(new FileReader("D:\\1\\fileJava.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\1\\fileJavaCY.txt"));
        //ready() 告这个流是否准备好被读取
        while (read.ready()) {
            // readLine() 读取一行行的数据
            // write() 写入数据
            writer.write(read.readLine());
            //换行
            writer.newLine();
        }
        //关闭流
        read.close();
        writer.close();
    }

    @Test
    public void bufferedByte() throws IOException {
        String url = "D:\\\\1\\\\1.jpg";
        // 实例化对象
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(url));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("D:\\1\\2.jpg"));
        // 循环将数据读取 并输出到文件中
        byte[] buf = new byte[10];
        while (input.read(buf) != -1) {
            output.write(buf);
        }

        //关闭流
        input.close();
        output.close();
    }
}

