package fmp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 12:11
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*
         * 继续业务处理
         */
    }
}
