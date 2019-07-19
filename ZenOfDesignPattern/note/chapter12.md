- [代理模式](#sec-1)
  - [代理模式的定义](#sec-1-1)
  - [代理模式的应用](#sec-1-2)
    - [代理模式的优点](#sec-1-2-1)
    - [代理模式的使用场景](#sec-1-2-2)
  - [代理模式的扩展](#sec-1-3)
    - [普通代理](#sec-1-3-1)
    - [强制代理](#sec-1-3-2)
    - [代理是有个性的](#sec-1-3-3)
    - [动态代理](#sec-1-3-4)

# 代理模式<a id="sec-1"></a>

## 代理模式的定义<a id="sec-1-1"></a>

定义：为其他对象提供一种代理以控制这个对象的访问。

代理模式也叫做委托模式，它是一项基本设计技巧。

代理模式有三个角色

-   Subject抽象主题角色，它可以是抽象类也可以是接口，是一个最普通的业务类型定义，无特殊要求。
-   RealSubject具体主题角色，委托角色，被代理角色，是业务的具体执行者。
-   Proxy代理主题角色，委托类，代理类。它负责对真实角色的应用，把所有抽象主题类定义的方法限制委托给真实主题角色实现，并且在真实主题角色处理完毕前后做预处理和善后工作。

抽象主题类

```java
package pp.session3;

public interface Subject {
    // 定义一个方法
    void request();
}
```

具体主题类

```java
package pp.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 16:51
 * @description: 真实主题类
 **/
public class RealSubject implements Subject{
    @Override
    public void request() {
        // 业务逻辑处理
    }
}
```

代理主题角色

```java
package pp.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 16:51
 * @description: 代理类
 **/
public class Proxy implements Subject{
    // 要代理哪个实现类
    private Subject subject = null;

    // 默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }

    // 通过构造函数传递代理者
    public Proxy(Object ...objects) {

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    // 预处理
    public void before() {
        // do something
    }

    // 善后处理
    public void after() {
        // do something
    }
}
```

一个代理类可以代理多个被委托者或被代理者，因此一个代理类具体代理哪个真实主题角色，是由场景类决定的。

## 代理模式的应用<a id="sec-1-2"></a>

### 代理模式的优点<a id="sec-1-2-1"></a>

-   职责清晰。
-   高扩展性。具体主题角色是随时都会发生变化的，只要它实现了接口。
-   智能化。

### 代理模式的使用场景<a id="sec-1-2-2"></a>

Spring AOP，是典型的动态代理。

## 代理模式的扩展<a id="sec-1-3"></a>

### 普通代理<a id="sec-1-3-1"></a>

普通代理就是我们要知道代理的存在，然后才能访问。

强制代理则是调用者直接调用真实角色，而不用关心代理是否存在，其代理的产生是由真实角色决定的。

普通代理的游戏者

```java
package pp.session4;

import pp.session1.IGamePlayer;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:05
 * @description: 普通代理的游戏者
 **/
public class GamePlayer implements IGamePlayer {
    private String name = "";

    // 构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        } else {
            this.name = _name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name +  " 又升了一级！");
    }
}
```

普通代理的代理者

```java
package pp.session4;

import pp.session1.IGamePlayer;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:10
 * @description: 普通代理的代理者
 **/
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    // 通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            // TODO 异常处理
        }
    }
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
```

普通代理的场景类

```java
package pp.session4;

import pp.session1.IGamePlayer;

import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:15
 * @description: 普通代理的场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("张三");
        // 开始打游戏，几下时间戳
        System.out.println("开始时间是：" + new Date());

        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：" + new Date());
    }
}
```

在普通代理模式下，调用者只知代理而不知真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响。

### 强制代理<a id="sec-1-3-2"></a>

必须通过真实的角色找到代理角色，否则不能访问。

强制代理的接口类

```java
package pp.session5;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:22
 * @description: 强制代理的接口类
 **/
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
```

强制代理的真实角色

```java
package pp.session5;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:23
 * @description: 强制代理的真实角色
 **/
public class GamePlayer implements IGamePlayer{
    private String name = "";

    private IGamePlayer proxy = null;

    public GamePlayer(String _name) {
        this.name = _name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        } else {
            System.out.printf("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        } else {
            System.out.printf("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "又升了一级！");
        } else {
            System.out.printf("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }


    // 检验是否是代理访问
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
```

强制代理的代理类

```java
package pp.session5;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:25
 * @description: 强制代理的代理类
 **/
public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
```

直接访问真实类

```java
package pp.session5;

import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:33
 * @description: 直接访问真实类
 **/
public class Client {
    public static void main(String[] args) {
        // 定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是：" + new Date());
        player.login("zhangSan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是：" + new Date());
    }
}
```

直接访问代理类

```java
package pp.session5;

import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:35
 * @description: 直接访问代理类
 **/
public class Client2 {
    public static void main(String[] args) {
        // 定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        // 获得指定的代理
        IGamePlayer proxy = player.getProxy();

        System.out.println("开始时间是：" + new Date());
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：" + new Date());
    }
}
```

### 代理是有个性的<a id="sec-1-3-3"></a>

代理类不仅可以实现主题接口，还可以实现其他接口完成不同的任务，而且代理的目的是在目标对象的基础上作增强，这种增强的本质就是对目标对象的方法进行拦截和过滤。

代理类

```java
package pp.session6;

import pp.session1.IGamePlayer;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 20:03
 * @description: 代理类
 **/
public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
```

通常情况下代理的职责并不一定单一，它可以组合其他真实的角色，也可以实现自己的职责。

### 动态代理<a id="sec-1-3-4"></a>

动态代理是在实现阶段不用关心代理谁，而在运行阶段才指定代理哪一个对象。

动态代理类

```java
package pp.session7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-18 15:43
 * @description: 动态代理类
 **/
public class GamePlayerIH implements InvocationHandler {
    // 被代理者
    Class cls = null;
    // 被代理的实例
    Object obj = null;
    // 我要代理谁
    public GamePlayerIH(Object _obj) {
        this.obj = _obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
```

动态代理是根据被代理的接口生成所有的方法。

1.  动态代理通用模型

    抽象主题接口
    
    ```java
    package pp.session8;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-07-19 10:58
     * @description: 抽象主题
     **/
    public interface Subject {
        // 业务操作
        public void doSomething(String str);
    }
    ```
    
    主题实现类
    
    ```java
    package pp.session8;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-07-19 11:00
     * @description: 真实主题类
     **/
    public class RealSubject implements Subject{
        // 业务操作
        @Override
        public void doSomething(String str) {
            System.out.println("do something!---->" + str);
        }
    }
    ```
    
    动态代理Handler类
    
    ```java
    package pp.session8;
    
    import java.lang.reflect.InvocationHandler;
    import java.lang.reflect.Method;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-07-19 14:46
     * @description: 动态代理的Handler类
     **/
    public class MyInvocationHandler implements InvocationHandler {
        // 被代理的对象
        private Object target = null;
    
        // 通过构造函数传递一个对象
        public MyInvocationHandler(Object _object) {
            this.target = _object;
        }
    
        // 代理方法
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 执行被代理的方法
            return method.invoke(this.target, args);
        }
    }
    ```
    
    动态代理类
    
    ```java
    package pp.session8;
    
    import java.lang.reflect.InvocationHandler;
    import java.lang.reflect.Proxy;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-07-19 14:47
     * @description: 动态代理类
     **/
    public class DynamicProxy<T> {
        public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
                                             InvocationHandler h) {
            // 寻找JoinPoint连接点，AOP框架使用元数据定义
            if (true) {
                (new BeforeAdvice()).exec();
            }
            // 执行目编，并返回结果
            return (T) Proxy.newProxyInstance(loader, interfaces, h);
        }
    }
    ```
    
    通知接口
    
    ```java
    package pp.session8;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-07-19 15:02
     * @description: 通知接口
     **/
    public interface IAdvice {
        // 通知只有一个方法，执行即可
        public void exec();
    }
    ```
    
    通知实现(前置通知)类
    
    ```java
    package pp.session8;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-07-19 15:02
     * @description: 通知实现类
     **/
    public class BeforeAdvice implements IAdvice{
        @Override
        public void exec() {
            System.out.println("我是前置通知，我被执行了！");
        }
    }
    ```
    
    动态代理场景类
    
    ```java
    package pp.session8;
    
    import java.lang.reflect.InvocationHandler;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-07-19 15:03
     * @description: 场景类
     **/
    public class Client {
        public static void main(String[] args) {
            // 定义一个主题
            Subject subject = new RealSubject();
            // 定义一个Handler
            InvocationHandler handler  = new MyInvocationHandler(subject);
            // 定义主题的代理
            Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                                                          subject.getClass().getInterfaces(), handler);
            // 代理的行为
            proxy.doSomething("Finish");
    
            Subject subject1 = new RealSubject();
            Subject proxy1 = SubjectDynamicProxy.newProxyInstance(subject);
            proxy1.doSomething("Finish");
        }
    }
    ```
    
    具体业务的动态代理类
    
    ```java
    package pp.session8;
    
    import java.lang.reflect.InvocationHandler;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-07-19 15:22
     * @description: 具体业务的动态代理
     **/
    public class SubjectDynamicProxy extends DynamicProxy {
        public static <T> T newProxyInstance(Subject subject) {
            // 获得ClassLoader
            ClassLoader loader = subject.getClass().getClassLoader();
            // 获得接口数组
            Class<?>[] classes = subject.getClass().getInterfaces();
            // 获得handler
            InvocationHandler handler = new MyInvocationHandler(subject);
            return newProxyInstance(loader, classes, handler);
        }
    }
    ```
