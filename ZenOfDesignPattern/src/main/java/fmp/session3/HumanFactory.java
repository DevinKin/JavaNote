package fmp.session3;


/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 11:57
 * @description: 人类创建工厂
 **/
public class HumanFactory{
    public static <T extends Human> T createHuman(Class<T> c) {
        // 定义一个生产的人种
        Human human = null;
        try {
            // 生产一个人种
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
