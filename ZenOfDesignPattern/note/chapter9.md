<div id="table-of-contents">
<h2>Table of Contents</h2>
<div id="text-table-of-contents">
<ul>
<li><a href="#sec-1">1. 抽象工厂模式</a>
<ul>
<li><a href="#sec-1-1">1.1. 抽象工厂模式的定义</a></li>
<li><a href="#sec-1-2">1.2. 抽象工厂模式的应用</a>
<ul>
<li><a href="#sec-1-2-1">1.2.1. 抽象工厂模式的优点</a></li>
<li><a href="#sec-1-2-2">1.2.2. 抽象工厂模式的缺点</a></li>
<li><a href="#sec-1-2-3">1.2.3. 抽象工厂模式的使用场景</a></li>
</ul>
</li>
<li><a href="#sec-1-3">1.3. 最佳实践</a></li>
</ul>
</li>
</ul>
</div>
</div>

# 抽象工厂模式<a id="sec-1" name="sec-1"></a>

## 抽象工厂模式的定义<a id="sec-1-1" name="sec-1-1"></a>

抽象工厂模式定义如下：为创建一组相关或相互依赖的对象提供一个接口，而无需指定他们具体的类。

抽象工厂模式是工厂模式的升级版。

使用场景类

    package afp.session2;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-06-02 11:13
     * @description: 场景类
     **/
    public class Client {
        public static void main(String[] args) {
            // 定义出两个工厂
            AbstractCreator creator1 = new Creator1();
            AbstractCreator creator2 = new Creator2();
    
            // 产生A1对象
            AbstractProductA a1 = creator1.createProductA();
            // 产生A2对象
            AbstractProductA a2 = creator2.createProductA();
            // 产生B1对象
            AbstractProductB b1 = creator1.createProductB();
            // 产生B2对象
            AbstractProductB b2 = creator2.createProductB();
        }
    }

## 抽象工厂模式的应用<a id="sec-1-2" name="sec-1-2"></a>

### 抽象工厂模式的优点<a id="sec-1-2-1" name="sec-1-2-1"></a>

-   封装性，每个产品的实现类不是高层模块要关心的。
-   产品族内的约束为非公开状态。

### 抽象工厂模式的缺点<a id="sec-1-2-2" name="sec-1-2-2"></a>

-   产品族扩展非常困难。要扩展产品族，就要修改多个类，严重违反了开闭原则。
-   横向扩展容易，纵向扩展困难。

### 抽象工厂模式的使用场景<a id="sec-1-2-3" name="sec-1-2-3"></a>

一个对象族（或是一组没有任何关系的对象）都有相同的约束，就可以使用抽象工厂模式。

## 最佳实践<a id="sec-1-3" name="sec-1-3"></a>

跨平台应用。
