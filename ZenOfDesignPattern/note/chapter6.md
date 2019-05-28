<div id="table-of-contents">
<h2>Table of Contents</h2>
<div id="text-table-of-contents">
<ul>
<li><a href="#sec-1">1. 开闭原则</a>
<ul>
<li><a href="#sec-1-1">1.1. 什么是开闭原则</a></li>
<li><a href="#sec-1-2">1.2. 为什么要采用开闭原则</a>
<ul>
<li><a href="#sec-1-2-1">1.2.1. 开闭原则对测试的影响</a></li>
<li><a href="#sec-1-2-2">1.2.2. 开闭原则可以提高复用性</a></li>
</ul>
</li>
<li><a href="#sec-1-3">1.3. 如何使用开闭原则</a>
<ul>
<li><a href="#sec-1-3-1">1.3.1. 抽象约束</a></li>
<li><a href="#sec-1-3-2">1.3.2. 元数据(metadata)控制模块行为</a></li>
<li><a href="#sec-1-3-3">1.3.3. 制定项目章程</a></li>
<li><a href="#sec-1-3-4">1.3.4. 封装变化</a></li>
</ul>
</li>
</ul>
</li>
</ul>
</div>
</div>

# 开闭原则<a id="sec-1" name="sec-1"></a>

## 什么是开闭原则<a id="sec-1-1" name="sec-1-1"></a>

软件实体包括
-   项目或软件产品中按照一定的逻辑规则划分的模块。
-   抽象和类
-   方法

开闭原则对扩展开放，对修改关闭，并不意味着不做任何修改，低层模块的变更，必然要有高层模块的进行耦合，否则就是一个孤立无意义的代码片段。

## 为什么要采用开闭原则<a id="sec-1-2" name="sec-1-2"></a>

着重介绍了4个方面
-   对测试的影响
-   开闭原则可以提高复用性
-   开闭原则可以提高可维护性
-   面向对象开发的要求

### 开闭原则对测试的影响<a id="sec-1-2-1" name="sec-1-2-1"></a>

新增加的类，新增加的测试方法，只要保证增加类是正确的就可以了。

    package ocp.session1;
    
    import junit.framework.TestCase;
    
    public class OffNovelBookTest extends TestCase {
        private IBook below40NovelBook = new OffNovelBook("平凡的世界", 3000, "路遥");
        private IBook above40NovelBook = new OffNovelBook("平凡的世界", 6000, "路遥");
    
        // 测试低于40元的数据是否打8折
        public void testGetPriceBelow40() {
            super.assertEquals(2400, this.below40NovelBook.getPrice());
        }
    
        public void testGetPriceAbove40() {
            super.assertEquals(5400, this.above40NovelBook.getPrice());
        }
    }

### 开闭原则可以提高复用性<a id="sec-1-2-2" name="sec-1-2-2"></a>

在面向对象的设计忠，所有的逻辑都是从原子逻辑组合而来的，而不是一个类中独立实现一个业务逻辑。只有这样的代码才可以服用，粒度越小，被服用的可能性就越大。

## 如何使用开闭原则<a id="sec-1-3" name="sec-1-3"></a>

### 抽象约束<a id="sec-1-3-1" name="sec-1-3-1"></a>

通过接口或抽象类可以约束一组可能变化的行为，并且能够实现对扩展开放，包含以下三个方面：
-   通过接口或抽象类约束扩展，对扩展进行边界限定，不允许出现在接口或抽象类中不存在的 `public` 方法。
-   参数类型、引用对象尽量使用接口或者抽象类，而不是实现类。
-   抽象层尽量保持稳定，一旦确定即不允许修改。

### 元数据(metadata)控制模块行为<a id="sec-1-3-2" name="sec-1-3-2"></a>

尽量使用元数据来控制程序的行为，减少重复开发。修改配置文件，完成了业务变化。

### 制定项目章程<a id="sec-1-3-3" name="sec-1-3-3"></a>

约定优于配置。

### 封装变化<a id="sec-1-3-4" name="sec-1-3-4"></a>

变化的封装包含两层含义
-   将相同的变化封装到一个接口或抽象类中。
-   将不同的变化封装到不同的接口或抽象类中。

封装变化，就是受保护的变化，找出预计有变化或不稳定的点，我们为这些变化点创建稳定的接口，准确的讲是封装可能发生的变化，一旦预测到变化，就可以进行封装。
