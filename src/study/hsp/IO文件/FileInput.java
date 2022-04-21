package study.hsp.IO文件;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static net.mindview.util.Print.*;

public class FileInput {

    public static void main(String[] args) {
        try {
            FileInputStream fIS = new FileInputStream("D:\\1\\file01.txt");
            // available() 返回可以读取的剩余字节数量
            int len = fIS.available();
            StringBuilder str = new StringBuilder(len);
            for (int i = 0; i < len; i++) {
                // read() 读取指定字节的数据 默认读取1字节
                str.append((char) fIS.read());
            }
            print(str);
            //关闭 输入流并释放资源
            fIS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cel() {
        FileInputStream fInpStr = null;
        try {
            fInpStr = new FileInputStream("D:\\1\\file01.txt");
            byte[] buf = new byte[2];
            int readLen = 0;
            // read(byte [] b) 从该输入流读取最多 b.length个字节的数据为字节数组。
            // 返回一个int值 代表读入的总字节数 如已达结尾返回 -1
            // 同时b数组将接收读入的数据
            if (fInpStr.read(buf) != -1) {
                System.out.println(new String(buf));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭输入流
            try {
                if (fInpStr != null) {
                    fInpStr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}