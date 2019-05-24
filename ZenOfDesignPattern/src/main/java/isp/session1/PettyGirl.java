package isp.session1;

public class PettyGirl implements IPettyGirl{
    // 美女的名字
    private String name;

    public PettyGirl(String _name) {
        this.name = _name;
    }

    public void goodLooking() {
        System.out.println(this.name + "---脸蛋很漂亮!");
    }

    public void niceFigure() {
        System.out.println(this.name + "---身材非常棒!");
    }

    public void greatTemperament() {
        System.out.println(this.name + "---气质非常好!");
    }
}
