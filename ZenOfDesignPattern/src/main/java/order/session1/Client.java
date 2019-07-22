package order.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:00
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println("------客户要求增加一项需求------");
        Group rg = new RequirementGroup();
        rg.find();
        rg.add();
        rg.plan();


        System.out.println("------客户要求删除一个页面------");
        Group pg = new PageGroup();
        pg.find();
        pg.delete();
        pg.plan();
    }
}
