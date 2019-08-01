package cor.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-01 14:53
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler1();
        Handler handler3 = new ConcreteHandler1();
        // 设置链中的阶段顺序1-->2-->3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        // 提交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}
