package study.hsp.IO文件;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static net.mindview.util.Print.*;

public class FileOutput {
    public static void main(String[] args) {

    }

    @Test
    public void output() throws IOException {
        String url = "D:\\1\\file01.txt";
        FileOutputStream output = new FileOutputStream(url);
        //需要传入的字符串
        String str = "world";
        // 使用 getBytes() 方法将字符串转为 byte 数组
        output.write(str.getBytes());
        output.close();
        input(url);
    }

    public void input(String url) throws IOException {
        FileInputStream input = new FileInputStream(url);
        byte[] b = new byte[input.available()];
        input.read(b);
        print(new String(b));
        input.close();
    }
}
