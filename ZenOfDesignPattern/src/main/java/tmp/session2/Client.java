package tmp.session2;


/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-02 11:57
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        // 调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
