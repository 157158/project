package study.hsp.task.task01;

//9.定义Music 类,里面有音乐名name、音乐时长Etimes)属性,
// 并有播放play功能和返 回本身属性信息的功能方法getInfo .Homework09 .java
public class Homework09 {
    public static void main(String[] args) {
        Music music = new Music("荷塘月色", 155);
        music.getInfo();
        music.play();
    }
}
class Music {
    String name;
    int etime;

    public Music(String name, int etime) {
        this.name = name;
        this.etime = etime;
    }

    public void play () {
        System.out.println("播放音乐：" + name);
    }

    public void getInfo () {
        System.out.println("音乐名" + name);
        System.out.println("音乐时长" + etime + "小时");
    }
}
