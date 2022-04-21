package study.hsp.Interface接口;

public class InterfacePolymorphic {

    public static void main(String[] args) {
        Usb[] usb = new Usb[2];
        usb[0] = Phone.getPhone();
        usb[1] = Camera.getCamera();
        ((Phone) usb[0]).setName("iPhone");
        ((Camera) usb[1]).setName("大疆无人机");
        for (Usb sb : usb) {
            sb.start();
            sb.work();
            if (sb instanceof Phone) {
                ((Phone) sb).call();
            }
            sb.stop();
        }
    }
}

interface Usb {
    void start();

    void work();

    void stop();
}

class Phone implements Usb {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private Phone() {
    }

    private static final Phone phone = new Phone();

    public static Phone getPhone() {
        return phone;
    }

    @Override
    public void start() {
        System.out.println(getName() + "启动了");
    }

    @Override
    public void work() {
        System.out.println(getName() + "真正被使用");
    }

    @Override
    public void stop() {
        System.out.println(getName() + "关闭了");
    }

    public void call() {
        System.out.println(getName() + "打电话");
    }

}

class Camera implements Usb {
    private String name;

    private Camera() {
    }

    public static Camera camera = new Camera();

    public static Camera getCamera() {
        return camera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(getName() + "启动了");
    }

    @Override
    public void work() {
        System.out.println(getName() + "开始工作");
    }

    @Override
    public void stop() {
        System.out.println(getName() + "关闭了");
    }
}




