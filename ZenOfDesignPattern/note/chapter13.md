- [第13章 原型模式](#sec-1)
  - [原型模式的定义](#sec-1-1)
  - [原型模式的优缺点](#sec-1-2)
  - [原型模式的使用场景](#sec-1-3)
  - [原型模式的注意事项](#sec-1-4)
    - [构造函数不会被执行](#sec-1-4-1)
    - [浅拷贝和深拷贝](#sec-1-4-2)
  - [clone和final关键字](#sec-1-5)

# 第13章 原型模式<a id="sec-1"></a>

通过对象复制来实现的模式叫做原型模式。

## 原型模式的定义<a id="sec-1-1"></a>

原型模式（Prototype Pattern）指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

原型模式通用源码

```java
package prototype.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 16:25
 * @description: 原型模式通用类
 **/
public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
```

## 原型模式的优缺点<a id="sec-1-2"></a>

性能优良。原型模式是再内存二进制流的拷贝，要比直接new一个对象性能能要好很多。

逃避构造函数的约束。直接在内存中拷贝，构造函数是不会执行的。

## 原型模式的使用场景<a id="sec-1-3"></a>

-   资源优化场景
-   性能和安全要求场景
-   一个对象多个修改者的场景

原型模式一般和工厂方法模式一起出现，通过 `clone` 方法创建一个对象。

## 原型模式的注意事项<a id="sec-1-4"></a>

### 构造函数不会被执行<a id="sec-1-4-1"></a>

原型类

```java
package prototype.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 17:02
 * @description: 可拷贝对象
 **/
public class Thing implements Cloneable{
    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
```

场景类

```java
package prototype.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 17:03
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
```

### 浅拷贝和深拷贝<a id="sec-1-4-2"></a>

浅拷贝：Object类的clone方法只是拷贝本对象，本对象内部的数组、引用对象等都不拷贝。两个对象共享了一个私有变量。

使用原型模式时，引用的成员变量必须满足两个条件才不会被拷贝。

-   类的成员变量，而不是方法内的变量。
-   必须是一个可变的引用对象，而不是一个原始类型或不可变对象。

浅拷贝原型类

```java
package prototype.session5;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 17:12
 * @description: 原型类
 **/
public class Thing implements Cloneable{
    // 定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    // 设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
```

浅拷贝场景类

```java
package prototype.session5;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 17:15
 * @description: 浅拷贝测试类
 **/
public class Client1 {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 设置一个值
        thing.setValue("张三");
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
```

深拷贝原型类

```java
package prototype.session6;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 10:00
 * @description: 深拷贝对象
 **/
public class Thing implements Cloneable{
    // 定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Object clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
```

## clone和final关键字<a id="sec-1-5"></a>

要使用 `clone` 方法，在类的成员变量上不要增加 `final` 关键字。
