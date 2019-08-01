- [第16章-责任链模式](#sec-1)
  - [责任链模式的定义](#sec-1-1)
  - [责任链模式的应用](#sec-1-2)

# 第16章-责任链模式<a id="sec-1"></a>

## 责任链模式的定义<a id="sec-1-1"></a>

使多个对象都有机会处理请求，避免了请求的发送者和接收者之间的耦合关系，将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。

抽象处理者

```java
package cor.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-01 12:27
 * @description: 抽象处理者
 **/
public abstract class Handler {
    private Handler nextHandler;

    // 每个处理者都必须对请求做出处理
    public final Response handleMessage(Request request) {
        Response response = null;
        // 判断是否是自己的处理级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 没有适当的处理者，业务自行处理
            }
        }
        return response;
    }

    // 设置下一个处理者是谁
    public void setNextHandler(Handler _handler) {
        this.nextHandler = _handler;
    }

    // 每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    // 每个处理者都必须实现处理方法
    protected abstract Response echo(Request request);
}
```

具体处理者

```java
package cor.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-01 14:50
 * @description: 具体处理者
 **/
public class ConcreteHandler1 extends Handler{
    @Override
    protected Level getHandlerLevel() {
        // 设置自己的处理级别
        return null;
    }

    // 定义自己的处理逻辑
    @Override
    protected Response echo(Request request) {
        // 完成处理逻辑
        return null;
    }
}
```

场景类

```java
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
```

## 责任链模式的应用<a id="sec-1-2"></a>

优点：将请求和处理分开。两者解耦，提高系统的灵活性。 缺点：性能问题，调试不方便。 注意事项：链中节点数量需要控制，避免出现超长链的情况。
