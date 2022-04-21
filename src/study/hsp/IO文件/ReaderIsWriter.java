package study.hsp.IO文件;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static net.mindview.util.Print.*;

//FileReader 读取字符流
//FileWriter 输出字符流
public class ReaderIsWriter {
    @Test
    //读取字符流文件
    public void read01() throws IOException {
        // 实例化FileReader对象 并传入读取路径
        String url = "D:\\1\\fileJava.txt";
        FileReader reader = new FileReader(url);
        //定义char数组用于读取文件
        char[] c = new char[10];
        //如果读取到了结尾返回-1 表示读取完成
        while (reader.read(c) != -1)
            printnb(new String(c));
        // 关闭流
        reader.close();
    }

    @Test
    //输出字符流
    public void Writer01() throws IOException {
        String url = "D:\\1\\fileJava.txt";
        //使用追加模式
        FileWriter writer = new FileWriter(url, true);
        //添加内容到输出流
        writer.write("world");
        writer.write('c');
        writer.write(new String("\nsss"), 0, 1);
        writer.write("牛马");
        //关闭流
        writer.close();
    }
}
