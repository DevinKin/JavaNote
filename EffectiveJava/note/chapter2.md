<div id="table-of-contents">
<h2>Table of Contents</h2>
<div id="text-table-of-contents">
<ul>
<li><a href="#sec-1">1. 第二章-创建和销毁对象</a>
<ul>
<li><a href="#sec-1-1">1.1. 第1条：考虑用静态工厂方法代替构造器</a></li>
<li><a href="#sec-1-2">1.2. 第2条：遇到多个构造器参数时要考虑使用构造器</a></li>
</ul>
</li>
</ul>
</div>
</div>

# 第二章-创建和销毁对象<a id="sec-1" name="sec-1"></a>

## 第1条：考虑用静态工厂方法代替构造器<a id="sec-1-1" name="sec-1-1"></a>

类可以通过静态工厂方法提供它的客户端，而不是构造器。有几大优势
-   静态工厂方法有名称，易于阅读，但一个类只能有一个带有指定签名的构造器。
-   不必在每次调用他们的时候都创建一个新对象。这可以使用预先构建好的实例，或将构建好的实例缓存起来，进行重复利用。
-   静态工厂方法可以返回原返回类型的任何子类型的对象。
-   静态工厂所返回的对象的类可以随着每次调用而发生变化，这取决于静态工厂方法的参数值。
-   静态工厂方法返回的对象所属的类，在编写包含该静态工厂方法的类时可以不存在。

静态工厂方法的缺点
-   类如果不含公有的或受保护的构造器，就不能被子类化。
-   静态工厂方法程序员很难发现他们。

    public static Boolean valueOf (boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

## 第2条：遇到多个构造器参数时要考虑使用构造器<a id="sec-1-2" name="sec-1-2"></a>

静态工厂和构造器有个共同的局限性，都不能很好的扩展到大量的可选参数。

重叠构造器模式可行，但是有大量参数时，客户端代码很难编写，难以阅读。

    package chapter2.item2.builder;
    
    public class NutritionFacts {
        private final int servingSize;      // (mL)             required
        private final int servings;         // (per container)  required
        private final int calories;         // (per serving)    optional
        private final int fat;              // (g/serving)      optional
        private final int sodium;           // (mg/serving)     optional
        private final int carbohydrate;     // (g/serving)      optional
    
        public NutritionFacts(int servingSize, int servings) {
            this(servingSize, servings, 0);
        }
    
        public NutritionFacts(int servingSize, int servings, int calories) {
            this(servingSize, servings, calories, 0);
        }
    
        public NutritionFacts(int servingSize, int servings,
                              int calories, int fat) {
            this(servingSize, servings, calories, fat, 0);
        }
    
        public NutritionFacts(int servingSize, int servings,
                              int calories, int fat, int sodium) {
            this(servingSize, servings, calories, fat, sodium, 0);
        }
    
        public NutritionFacts(int servingSize, int servings,
                              int calories, int fat, int sodium, int carbohydrate) {
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
            this.sodium = sodium;
            this.carbohydrate = carbohydrate;
        }
    }

JavaBeans模式，先调用一个无参构造器来创建对象，然后调用setter方法来设置每个必要的参数，以及相关的可选参数。

    package chapter2.item2.javabeans;
    
    public class NutritionFacts {
        // Parameters initialized to default values (if any)
        private int servingSize     = -1;       // Required: no default value
        private int servings        = -1;
        private int calories        = 0;
        private int fat             = 0;
        private int sodium          = 0;
        private int carbohydrate    = 0;
    
        public NutritionFacts() {
    
        }
    
        public void setServingSize(int servingSize) {
            this.servingSize = servingSize;
        }
    
        public void setServings(int servings) {
            this.servings = servings;
        }
    
        public void setCalories(int calories) {
            this.calories = calories;
        }
    
        public void setFat(int fat) {
            this.fat = fat;
        }
    
        public void setSodium(int sodium) {
            this.sodium = sodium;
        }
    
        public void setCarbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
        }
    }

JavaBeans模式缺点
-   构造过程中JavaBean可能处于不一致的状态。
-   JavaBeans模式使得把类做成不可变的可能性不复存在，需要程序员付出额外的努力确保它线程安全。

建造者(Builder)模式不直接生成想要的对象，而是让客户端利用所有必要的参数调用
构造器(或者静态工厂)，得到一个 `builder` 对象，然后客户端在 `builder` 对象
上调用类似 `setter` 的方法，来设置每个相关的可选参数。最后，客户端调用无参
的 `build` 方法来生成通常是不可变的对象。这个 `builder` 通常是它构建类的静
态成员类。
