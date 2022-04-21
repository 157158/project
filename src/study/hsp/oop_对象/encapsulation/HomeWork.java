package study.hsp.oop_对象.encapsulation;

/*
com. hspedu.encap: AccountTest. java Account. java
创建程序在其中定义两个类:Account 和AccountTest 类体会Java的封装性。
 1.Account 类要求具有属性:姓名(长度为2位3位或4位)、余额(必须>20) 密码(必须是六位),如果不满足,则给出提示信息,并给默认值
2.通过setXxx 的方法给Account 的属性赋值。
3.在AccountTest 中测试
* */
public class HomeWork {

}

class Account {
    private String name;
    private String password;
    private double balance;

    public Account(String name, String password, double balance) {

        setBalance(balance);
        setName(name);
        setPassword(password);
//        this.name = name;
//        this.password = password;
//        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    // 姓名(长度为2位3位或4位)
    public void setName(String name) {
        if (name.length() != 2 && name.length() != 3 && name.length() != 4) {
            System.err.println("姓名长度不正确");
        } else
            this.name = name;
    }

    public String getPassword() {
        return password;
    }

    // 密码(必须是六位)
    public void setPassword(String password) {
        if (password.length() < 6) {
            System.err.println("密码长度不够");
        } else 
            this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    // 余额(必须>20)
    public void setBalance(double balance) {
        if (balance <= 20) {
            System.err.println("余额不能小于20");
        } else 
            this.balance = balance;
    }

}


class AccountTest {
    public static void main (String[] args) {
        Account account = new Account("ssss","12345",21);

        System.out.println("===================");

        System.out.println(account.getName());
        System.out.println(account.getPassword());
        System.out.println(account.getBalance());
    }
}

