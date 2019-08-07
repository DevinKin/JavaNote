- [第19章-适配器模式](#sec-1)
  - [适配器模式的定义](#sec-1-1)
  - [适配模式的应用](#sec-1-2)
  - [适配器模式的扩展](#sec-1-3)

# 第19章-适配器模式<a id="sec-1"></a>

一个对象如果不存储实体状态以及对象之间的关系，该对象就叫做贫血对象，对应的领域模型就是贫血模型。

一个对象如果存储实体状态以及对象之间的关系，该对象就叫充血对象，对应的领域模型就是充血模型。

## 适配器模式的定义<a id="sec-1-1"></a>

将一个类的接口编程客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。

适配器模式又叫变压器模式，也叫做包装模式。

适配器模式的三个角色

-   `Target` 目标角色。
-   `Adaptee` 源角色。
-   `Adapter` 适配器角色。

目标角色

```java
package adapter.session2;

public interface Target {
    // 目标角色有自己的方法
    void request();
}

```

目标角色的实现类

```java
package adapter.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 17:02
 * @description: 目标角色的实现类
 **/
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("if you need any help, pls call me!");
    }
}
```

源角色

```java
package adapter.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 17:03
 * @description: 源角色
 **/
public class Adaptee {
    void doSomething() {
        System.out.println("I'm kind of busy, leave me alon, pls!");
    }
}
```

适配器角色

```java
package adapter.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 17:06
 * @description: 适配器角色
 **/
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
```

场景类

```java
package adapter.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 17:05
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        // 现在增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
```

## 适配模式的应用<a id="sec-1-2"></a>

优点：

-   适配模式可以让两个没有任何关系的类一起运行。
-   增加了类的透明性。
-   提高了类的复用度。
-   灵活性非常好。

使用场景：有动机修改一个已经投产中的接口时，系统扩展。

注意事项：最好在详细设计阶段不要使用适配模式，他主要解决正在服役的项目问题。

## 适配器模式的扩展<a id="sec-1-3"></a>

通过继承进行适配，叫做类适配器。

对象适配器和类适配器的区别是：类适配器是类间继承，对象适配器是对象的合成关系。

对象适配器的代码如下： `OuterUserInfo` 变成了委托服务，把 `IUserInfo` 接口需要的所有操作都委托给其他三个接口下的实现类，他的委托是通过对象层次的关联关系进行委托的，而不是继承关系。

```java
package adapter.session3;

import adapter.session1.IUserInfo;

import java.util.Map;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 18:13
 * @description: 适配器
 **/
public class OuterUserInfo implements IUserInfo {
    // 源目标对象
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    // 数据处理
    private Map baseInfoMap = null;
    private Map homeInfoMap = null;
    private Map officeInfoMap = null;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;

        this.baseInfoMap = this.baseInfo.getUserBaseInfo();
        this.homeInfoMap = this.homeInfo.getUserHomeInfo();
        this.officeInfoMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String) this.baseInfoMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfoMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfoMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfoMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfoMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfoMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
}
```
