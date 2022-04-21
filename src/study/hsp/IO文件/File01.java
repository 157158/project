package study.hsp.IO文件;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static net.mindview.util.Print.print;

public class File01 {
    public static void main(String[] args) {

    }

    @Test
    public void createFile01() {
        File file = new File("D:\\", "1\\test.txt");
        try {
            file.createNewFile();
            System.out.println("startSuccess.....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createFile02() throws IOException {
        File file = new File("E:\\1\\FileTest2.txt");
        file.createNewFile();
        print("获取名字 " + file.getName());
        print("绝对路径 " + file.getAbsolutePath());
        print("父级目录 " + file.getParent());
        print("文件大小 " + file.length());
        print("是否存在 " + file.exists());
        print("是不是文件 " + file.isFile());
        print("是不是目录 " + file.isDirectory());
    }

    @Test
    public void createFile03() {
        String str1 = "D:\\1\\mkdir.txt\\temp\\main\\work";
        //创建多级目录
        File file1 = new File(str1);
        file1.mkdirs();

        String str2 = "D:\\1\\new";
        //创建一级目录
        File file = new File(str2);
        file.mkdir();
        //删除 目录
        print(file.delete());

    }

}



