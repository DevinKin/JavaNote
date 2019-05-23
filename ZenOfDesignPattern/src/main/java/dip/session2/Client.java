package dip.session2;

public class Client {
    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
//        ICar benz = new Benz();
//        zhangSan.drive(benz);

        ICar bmw = new BMW();
        zhangSan.drive(bmw);
    }
}