package study.hsp.Interface接口;

public class Interface01 {
    public static void main(String[] args) {
        MysqlDB.setMysqlDB();
        OracleDB.setOracleDB();
    }

}

interface DBInterface {
    void connect(); //连接方法

    void close(); //关闭方法
}

class MysqlDB implements DBInterface {

    private MysqlDB() {
        System.out.println("程序员小A");
        connect();
        close();
    }

    private static MysqlDB mysqlDB = new MysqlDB();

    public static void setMysqlDB() {
    }

    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}

class OracleDB implements DBInterface {

    private OracleDB() {
        System.out.println("程序员小B");
        connect();
        close();
    }

    private static OracleDB oracleDB;

    public static void setOracleDB(OracleDB... db) {
        if (db == null) {
            oracleDB = new OracleDB();
        }
    }

    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");
    }
}
