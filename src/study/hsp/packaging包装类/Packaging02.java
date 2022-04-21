package study.hsp.packaging包装类;
//包装类转String
public class Packaging02 {
    public static void main(String[] args) {
        // integer ---> String
        Integer i = 100;
        //方式1
        String str1 = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String ---> integer
        String str = "123456";
        //方式1 使用自动装箱
        Integer integer = Integer.parseInt(str);
        //方式2 构造器
        Integer integer1 = new Integer(str);
    }
}
