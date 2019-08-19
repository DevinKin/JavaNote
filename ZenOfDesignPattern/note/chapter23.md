- [第23章-门面模式](#sec-1)
  - [门面模式的定义](#sec-1-1)
  - [门面模式的应用](#sec-1-2)

# 第23章-门面模式<a id="sec-1"></a>

## 门面模式的定义<a id="sec-1-1"></a>

门面模式(Facade Pattern)也叫外观模式，是一种比较常用的封装模式，其定义如下：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。

门面模式的角色

-   Facede门面角色
-   subsystem子系统角色

子系统的类

```java
package facade.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 15:58
 * @description:
 **/
public class ClassA {
    public void doSomethingA() {

    }
}

package facade.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 15:58
 * @description:
 **/
public class ClassB {
    public void doSomethingB() {

    }
}

package facade.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 15:58
 * @description:
 **/
public class ClassC {
    public void doSomethingC() {

    }
}
```

门面角色

```java
package facade.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 15:59
 * @description: 门面对象
 **/
public class Facade {
    // 被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.c.doSomethingC();
    }
}
```

## 门面模式的应用<a id="sec-1-2"></a>

优点：

-   减少系统的互相依赖
-   提高了灵活性
-   提高安全性

缺点：

-   不符合开闭原则，对修改关闭，对扩展开放。

使用场景：

-   一个复杂的模块或子系统提供一个外界访问的接口。
-   子系统相对独立。
-   预防低水平人员带来的风险扩散。

一个子系统可以有多个门面，场景如下

-   门面已经庞大到不能忍受
-   子系统可以提供不同访问路径

门面不参与子系统内的业务逻辑
