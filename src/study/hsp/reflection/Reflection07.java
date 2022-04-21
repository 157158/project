package study.hsp.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection07 {
    public static void main(String[] args) throws Exception{
        Class<User> userClass = User.class;
        //获取对象实例
        Constructor<User> strConstr = userClass.getDeclaredConstructor(String.class);
        User user = strConstr.newInstance("Tom");
        //获取属性对象
        Field field1 = userClass.getField("name");

        //修改属性内容
        field1.set(user, "Jerry");

        //获取属性内容
        System.out.println(field1.getName() + " = " + field1.get(user));

        //静态属性使用getDeclaredField获取
        Field field2 = userClass.getDeclaredField("xp");
        //开启爆破 可以获取私有属性
        field2.setAccessible(true);
        field2.set(null, "seltsam");
        String xp = field2.get(null).toString();
        System.out.println(field2.getName() + " = " + xp);
    }
}
