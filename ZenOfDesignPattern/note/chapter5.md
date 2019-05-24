<div id="table-of-contents">
<h2>Table of Contents</h2>
<div id="text-table-of-contents">
<ul>
<li><a href="#sec-1">1. 第5章 迪米特法则</a>
<ul>
<li><a href="#sec-1-1">1.1. 迪米特法则的定义</a></li>
<li><a href="#sec-1-2">1.2. 我的知识你知道得越少越好</a></li>
<li><a href="#sec-1-3">1.3. 最佳实践</a></li>
</ul>
</li>
</ul>
</div>
</div>

# 第5章 迪米特法则<a id="sec-1" name="sec-1"></a>

## 迪米特法则的定义<a id="sec-1-1" name="sec-1-1"></a>

迪米特法则(Law of Demeter，LoD)，也成为最少知识原则(Least Knowledge Principle，
LKP)。

迪米特法则的定义：一个对象应该对其他对象有最小的了解。一个类应该对自己需要耦
合或调用的类知道得最小。

## 我的知识你知道得越少越好<a id="sec-1-2" name="sec-1-2"></a>

迪米特法则对低的耦合提出了明确的要求，其包含以下4层含义
-   只和朋友交流。朋友类的定义如下，出现在成员变量、方法的输入输出参数中的类称为朋友类，出现在方法体内部的类不属于朋友类。
-   朋友间也是有距离的。尽量不要对外公布太多的public方法和非静态的public变量，尽量内敛，多使用private、package-private、protected等访问权限。
-   自己的就是自己的。如果一个方法放在本类中，既不增加类间关系，也对本类不产生负面影响，那就应该放置在本类中。
-   谨慎使用 `Serializable` 。

## 最佳实践<a id="sec-1-3" name="sec-1-3"></a>

迪米特法则的核心观念就是类间的解耦合，弱耦合，只有弱耦合了之后，类的复用率才可以提高。
