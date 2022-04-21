package study.hsp.IO文件;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MoveImg {
    public static void main(String[] args) {

    }

    @Test
    public void move() throws IOException {
        String urlInput = "D:\\1\\miao.png";
        String urlOutput = "D:\\1\\miaoCy.png";

        FileInputStream input = new FileInputStream(urlInput);
        FileOutputStream output = new FileOutputStream(urlOutput);

        //定义byte[]数组用于存放数据
        byte[] b = new byte[input.available()];

        // 将文件内容写入byte数组 b， 并将b数组写入到文件输出流
        input.read(b);
        output.write(b);

        //关闭流
        input.close();
        output.close();
    }
}

