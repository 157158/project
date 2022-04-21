package study.hsp.enum枚举;

/**
 * @author  tianHao
 * @version 1.0
* */
public class enumInterface {
    public static void main(String[] args) {
        Music.getClassicmusic().Playing();
    }
}

interface IPlaying {
    void Playing();
}

enum Music implements IPlaying {
    CLASSICMUSIC("月光");

    private String name;

    @Override
    public void Playing() {
        System.out.println("播放音乐..." + name);
    }

    private Music(String name) {
        this.name = name;
    }

    public static Music getClassicmusic() {
        return CLASSICMUSIC;
    }

    public String getName() {
        return name;
    }
}
