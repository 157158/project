package study.hsp.task.task03;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//泛型练习
/*
创建DAO类的对象，分调用其save、get、update 、list.、delete 方法来操作User对象， 使用Junit 单元测试类进行测试。
*/
public class HomeWork08 {
    @Test
    public void testUser() {
        DAO<User> dao = new DAO<>();
        //增
        dao.save("001", new User(1, 14, "jerry"));
        dao.save("002", new User(2, 23, "tom"));
        dao.save("003", new User(3, 15, "tek"));
        dao.save("004", new User(4, 11, "jack"));
        //删
        dao.delete("004");
        //改
        dao.update("001", new User(1, 21, "jerry"));
        //查
        List<User> list = dao.list();
        System.out.println(list);
        //单独查询
        User user = dao.get("002");
        System.out.println(user);
    }
}

/*
* 定义个泛型类DAO<T>,在其中定义一个Map成员変量，Map的键为String 类型，值为T类型
分别创建以下方法
* */

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public Map<String, T> getMap() {
        return map;
    }

    //    public void save (String id ,T entity ):保存T类型的对象到Map成员变量中
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    //    public T get (String id ):从map中获取id对应的对象
    public T get(String id) {
        return map.get(id);
    }

    //    public void update (String id T entity ):替换map中key为id的内容，改为entity 对象
    public void update(String id, T entity) {
        map.replace(id, entity);
    }

    //   public List <T>list ():返回map中存放的所有T对象
    public List<T> list() {
        return new ArrayList<>(map.values());
    }

    //    public void delete ((String id ):刪除指定id对象
    public void delete(String id) {
        map.remove(id);
        System.out.println("删除成功");
    }

}

/*
* 定义一个User类：
该类包含：成员变量(int类型)id,age;((String 类型)name。*/
class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.setAge(age);
        this.setId(id);
        this.setName(name);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
