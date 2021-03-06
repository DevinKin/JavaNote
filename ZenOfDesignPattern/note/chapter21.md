- [第21章-组合模式](#sec-1)
  - [组合模式的定义](#sec-1-1)
  - [组合模式的应用](#sec-1-2)
  - [组合模式的扩展](#sec-1-3)
    - [透明的组合模式](#sec-1-3-1)

# 第21章-组合模式<a id="sec-1"></a>

## 组合模式的定义<a id="sec-1-1"></a>

组合模式(Compsite Pattern)也叫合成模式。

组合模式的定义：将对象组合成树形结构以表示”部分-整体“的层次结构，使得用户对单一对象的组合对象的使用具有一致性。

组合模式的角色

-   `Component` 抽象构件角色。
-   `Leaf` 叶子构件。
-   `Composite` 树枝构件。

抽象构件

```java
package comb.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:27
 * @description: 抽象构件类
 **/
public abstract class Component {
    public void doSomething() {
        // 编写业务逻辑
    }
}
```

树枝构件

```java
package comb.session4;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:28
 * @description: 树枝构件
 **/
public class Composite extends Component{
    // 构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    // 删除一个叶子构件或树枝构件
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    // 获得分支下所有叶子构件和树枝构件
    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
```

树叶构件

```java
package comb.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:32
 * @description: 树叶构件
 **/
public class Leaf extends Component{
    @Override
    public void doSomething() {
        super.doSomething();
    }
}
```

场景类

```java
package comb.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:32
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Composite root) {
        for (Component c : root.getChildren()) {
            if (c instanceof  Leaf) {
                c.doSomething();
            } else {
                display((Composite) c);
            }
        }
    }
}
```

## 组合模式的应用<a id="sec-1-2"></a>

优点：

-   高层模块调用简单
-   节点自由增加

缺点：

-   场景类中直接使用了实现类。

使用场景：

-   维护和展示部分-整体关系的场景，如树形菜单、文件和文件夹管理。
-   从一个整体中能独立出来部分模块或功能的场景。

注意事项：只要是体现局部和整体的关系，关系比较深的时候，考虑组合模式。

## 组合模式的扩展<a id="sec-1-3"></a>

组合模式有两种不同的实现，上例为安全模式

-   透明模式
-   安全模式

### 透明的组合模式<a id="sec-1-3-1"></a>

透明模式就是把用来组合使用的方法放到抽象类中。

抽象构件

```java
package comb.session5;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:48
 * @description: 抽象构件
 **/
public abstract class Component {
    public void doSomething() {
        // 编写业务逻辑
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract ArrayList<Component> getChildren();
}
```

叶子节点， `@Deprecated` 注解在编译器告诉调用者，调用这个方法可能回出现错误。

```java
package comb.session5;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:51
 * @description: 树叶节点
 **/
public class Leaf extends Component{
    @Deprecated
    @Override
    public void add(Component component) {
        // 空实现，直接抛出一个不支持请求的异常。
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove(Component component) {
        // 空实现，直接抛出一个不支持请求的异常。
        throw new UnsupportedOperationException();

    }

    @Deprecated
    @Override
    public ArrayList<Component> getChildren() {
        // 空实现，直接抛出一个不支持请求的异常。
        throw new UnsupportedOperationException();
    }
}
```

```java
public class Client {
    public static void display(Composite root) {
        for (Component c : root.getChildren()) {
            if (c instanceof  Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }
    }
}
```

可以在抽象构件类中添加 `parent` 树枝节点支持更丰富的遍历方式。
