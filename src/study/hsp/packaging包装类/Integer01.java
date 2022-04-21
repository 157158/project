package study.hsp.packaging包装类;

public class Integer01 {
    public static void main(String[] args) {
//        Integer.MAX_VALUE : 返回能存储的最大值
        System.out.println(Integer.MAX_VALUE);
//        Integer.MIN_VALUE : 返回能存储的最小值
        System.out.println(Integer.MIN_VALUE);

//        Character.isDigit() : 判断是不是数字
        System.out.println(Character.isDigit('a'));
        //判断是不是字母
        System.out.println(Character.isLetter('a'));
        //判断是不是大写
        System.out.println(Character.isUpperCase('a'));
        //判断是不是小写
        System.out.println(Character.isLowerCase('a'));

        //判断是不是空格
        System.out.println(Character.isWhitespace('a'));
        //转成大写
        System.out.println(Character.toUpperCase('a'));
        //转成小写
        System.out.println(Character.toLowerCase('A'));
    }
}
