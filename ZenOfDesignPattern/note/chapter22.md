- [第22章-观察者模式](#sec-1)
  - [观察者模式的定义](#sec-1-1)
  - [观察者模式的应用](#sec-1-2)
  - [观察者模式的扩展](#sec-1-3)
    - [Java内置的观察者模式](#sec-1-3-1)
    - [项目中真实的观察者模式](#sec-1-3-2)

# 第22章-观察者模式<a id="sec-1"></a>

## 观察者模式的定义<a id="sec-1-1"></a>

观察者模式(Observer Pattern)也叫做发布订阅模式(Publish/subscribe)，是一个常用模式。

定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。

观察者模式的角色

-   Subject被观察者
-   Observer观察者
-   ConcreteSubject具体的被观察者
-   ConcreteObserver具体的观察者

被观察者

```java
package observer.session4;

import java.util.Vector;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:56
 * @description: 被观察者
 **/
public abstract class Subject {
    private Vector<Observer> obsVector = new Vector<>();

    public void addObserver(Observer o) {
        this.obsVector.add(o);
    }

    public void delObserver(Observer o) {
        this.obsVector.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : this.obsVector) {
            o.update();
        }
    }
}
```

观察者

```java
package observer.session4;

public interface Observer {
    void update();
}
```

具体的被观察者

```java
package observer.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:57
 * @description: 具体被观察者
 **/
public class ConcreteSubject extends Subject{
    public void doSomething() {
        super.notifyObservers();;
    }
}
```

具体的观察者

```java
package observer.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:57
 * @description: 具体观察者
 **/
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("接受到信息，并进行处理！");
    }
}
```

场景类

```java
package observer.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:58
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        subject.addObserver(obs);
        subject.doSomething();
    }
}
```

## 观察者模式的应用<a id="sec-1-2"></a>

优点：

-   观察者和被观察者之间是抽象耦合的。
-   建立一套触发机制。

缺点：

-   多个观察者，开发和调试可能比较复杂

使用场景：

-   关联行为场景。关联行为是可拆分的，不是“组合”关系。
-   事件多级触发场景。
-   跨系统的消息交换场景，如消息队列的处理机制。

注意事项：

-   广播链的问题。一个观察者可以有双重身份，既是观察者，也是被观察者，链条一旦被建立，可维护性比较差。建议在一个观察者模式中最多出现一个对象既是观察者也是被观察者。
-   处理时间较长，需异步处理，就要考虑线程安全和队列的问题。

## 观察者模式的扩展<a id="sec-1-3"></a>

### Java内置的观察者模式<a id="sec-1-3-1"></a>

`java.util..Observable` 是java提供的可扩展式的被观察者父类。

使用示例，被观察者

```java
package observer.session5;

import observer.session3.IHanFeiZi;

import java.util.Observable;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-12 11:33
 * @description: 韩非子类
 **/
public class HanFeiZi extends Observable implements IHanFeiZi {
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
```

观察者

```java
package observer.session5;


import java.util.Observable;
import java.util.Observer;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 16:52
 * @description: 观察者
 **/
public class Lisi implements Observer {

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }

    @Override
    public void update(Observable observable, Object context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(context.toString());
        System.out.println("李斯：汇报完毕...\n");
    }
}
```

场景类

```java
package observer.session5;

import java.util.Observer;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:49
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Observer lisi = new Lisi();
        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
```

### 项目中真实的观察者模式<a id="sec-1-3-2"></a>

在系统设计中回对观察者模式进行改造或改装，主要在以下3个方面：

-   观察者或者和被观察间的消息沟通。
-   观察者响应方式，响应的速度影响。
-   被观察者尽量自己做主。
    -   增加一个 `doSomething(boolean isNotifyObs)` 方法，决定是否通知观察者。
