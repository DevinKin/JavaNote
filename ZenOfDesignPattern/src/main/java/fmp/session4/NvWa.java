package fmp.session4;


/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 11:59
 * @description: 女娲类
 **/
public class NvWa {
    public static void main(String[] args) {

        // 女娲第一次造人，火候补租，于是白人产生了
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        // 女娲第二次遭人，火候过足，于是黑人产生了
        System.out.println("\n--造出的第二批人是黑色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        // 第三次造人，火候刚刚好，于是黄色人种产生了
        System.out.println("\n--造出第三批人是黄种人--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
