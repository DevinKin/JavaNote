- [第15章-命令模式](#sec-1)
  - [命令模式的定义](#sec-1-1)
  - [命令模式的应用](#sec-1-2)
    - [命令模式的优缺点](#sec-1-2-1)
  - [命令模式的扩展](#sec-1-3)
  - [最佳实践](#sec-1-4)

# 第15章-命令模式<a id="sec-1"></a>

## 命令模式的定义<a id="sec-1-1"></a>

命令模式是一个高内聚的模式。

命令模式将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令撤销和恢复功能。

命令模式的三个角色

-   `Receiver` 是接收者角色。干活的角色。
-   `Command` 是命令角色。所有的命令都在这里声明。
-   `Invoker` 是调用者角色。接受命令并执行命令。

通用的Receiver类

```java
package order.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:30
 * @description: 通用接收者类
 **/
public abstract class Receiver {
    // 抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
```

具体的Receiver类，具体的接收者可以是N个。

```java
package order.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:35
 * @description: 具体的Receiver类
 **/
public class ConcreteReceiver1 extends Receiver{
    // 每个接收者都必须处理一定的业务逻辑
    @Override
    public void doSomething() {

    }
}
```

抽象的Command类

```java
package order.session3;

import order.session2.CodeGroup;
import order.session2.PageGroup;
import order.session2.RequirementGroup;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:12
 * @description: 抽象命令类
 **/
public abstract class Command {
    // 把三个组都定义好，子类可以直接使用
    protected ConcreteReceiver1 cr1;
    protected ConcreteReceiver2 cr2;
    // 只有一个方法，你要我做什么事情
    public abstract void execute();
}
```

具体的Command类

```java
package order.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:40
 * @description: 具体的Command类
 **/
public class ConcreteCommand1 extends Command{
    // 对哪个Receiver类进行命令处理
    private Receiver receiver;

    // 构造函数传递接收者

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}
```

调用者Invoker类

```java
package order.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:43
 * @description: 调用者类
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
```

场景类

```java
package order.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:59
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();
    }

```

## 命令模式的应用<a id="sec-1-2"></a>

### 命令模式的优缺点<a id="sec-1-2-1"></a>

优点：

-   类间解耦
-   可扩展性
-   命令模式结合模板方法模式可以减少Command子类的膨胀问题。

缺点：有N个命令，类膨胀非常大。

## 命令模式的扩展<a id="sec-1-3"></a>

一个Command可以调用多个Receiver

撤销命令操作

## 最佳实践<a id="sec-1-4"></a>

命令模式的 `Receiver` 在实际应用中一般都会被封装掉。减少高层模块(Client)对低层模块(Receivi)的依赖关系，提高系统整体的稳定性。

完美的Command类

```java
public abstract class Command {
    // 定义一个子类的全局共享变量
    protected final Receiver receiver;
    // 实现类必须定义一个接收者
    pbulic Command(Receiver receiver) {
        this.receiver = receiver;
    }
    // 每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
```

具体的命令

```java
public class ConcreteCommand1 extends Command {
    // 声明自己的默认接收者
    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }
    // 设置新的接收者
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        super.receiver.doSomething();
    }
}
```

场景类，高层次模块(Client)不知道接收者(Receiver)

```java
public class Client {
    public static void main(String[] args) {
        // 首先声明调用者Invoker
        Invoker invoker = new Invoker();
        // 定义一个发送给接收者的命令
        Command command = new ConcreteCommand1();
        // 把命令交给调用者取执行
        invoker.setCommand(command);
        invoker.action();
    }
}
```
