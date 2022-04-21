package study.hsp.IO文件;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Stream_ {

    @Test
    //转换流
    public void reader() throws IOException {
        File file = new File("D:\\1\\file02.txt");
        if (!file.exists() ) {
           file.createNewFile();
        }
        //将FileOutputStream 转换成 OutputStreamWriter
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);

        //写入内容
        writer.write("你好霓虹拟合");

        writer.close();

        //将 FileInputStream 转换成  InputStreamReader  并用 BufferedReader 包裹
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), StandardCharsets.UTF_8));
        //读取内容
        System.out.println(reader.readLine());

        reader.close();

    }
}
