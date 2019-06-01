<div id="table-of-contents">
<h2>Table of Contents</h2>
<div id="text-table-of-contents">
<ul>
<li><a href="#sec-1">1. 单例模式</a>
<ul>
<li><a href="#sec-1-1">1.1. 单例模式的定义</a></li>
<li><a href="#sec-1-2">1.2. 单例模式的应用</a>
<ul>
<li><a href="#sec-1-2-1">1.2.1. 单例模式的优点</a></li>
<li><a href="#sec-1-2-2">1.2.2. 单例模式的缺点</a></li>
<li><a href="#sec-1-2-3">1.2.3. 单例模式的使用场景</a></li>
<li><a href="#sec-1-2-4">1.2.4. 单例模式的注意事项</a></li>
<li><a href="#sec-1-2-5">1.2.5. 单例模式的扩展</a></li>
</ul>
</li>
</ul>
</li>
</ul>
</div>
</div>

# 单例模式<a id="sec-1" name="sec-1"></a>

通过定义一个私有访问权限的构造函数，避免被其他类new出来一个对象。其他类对该类的访问都可以通过getInstance获得同一个对象。

    package sp;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-05-29 15:17
     * @description: 皇帝类
     **/
    public class Emperor {
        // 初始化一个皇帝
        private static final Emperor emperor = new Emperor();
    
        private Emperor() {
            // 世俗化和道德约束：目的就是不能产生第二个皇帝
        }
    
        public static Emperor getInstance() {
            return emperor;
        }
    
        public static void say() {
            System.out.println("我就是皇帝某某某某某....");
        }
    }

## 单例模式的定义<a id="sec-1-1" name="sec-1-1"></a>

定义：确保某一个类只有一个实例，并且自行实例化并向整个系统提供这个实例。

单例模式通用代码

## 单例模式的应用<a id="sec-1-2" name="sec-1-2"></a>

### 单例模式的优点<a id="sec-1-2-1" name="sec-1-2-1"></a>

-   由于单例模式在内存中只有一个实例，减少了内存开支，特别是一个对象需要频繁地创建、销毁时，而且创建或销毁时的性能又无法优化。
-   减少了系统的性能开销。当一个对象的产生需要比较多的资源时，如读取配置、产生其他依赖对象时，则可以通过在应用启动时直接产生一个单例对象，然后用永久驻留内存的方式来解决。
-   避免对资源的多重占用。
-   可以在系统设置全局的访问点，优化和共享资源访问。

### 单例模式的缺点<a id="sec-1-2-2" name="sec-1-2-2"></a>

-   单例模式一般没有接口，扩展很难。
-   单例模式对测试是不利的。
-   单例模式与单一职责原则有冲突。

### 单例模式的使用场景<a id="sec-1-2-3" name="sec-1-2-3"></a>

-   要求生成唯一序列号的环境。
-   在整个项目中需要一个访问点或共享数据。
-   创建一个对象需要消耗的资源过多。
-   需要定义大量的静态常量和静态方法(如工具类)的环境。

### 单例模式的注意事项<a id="sec-1-2-4" name="sec-1-2-4"></a>

线程不安全的单例

    package sp.session2;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-06-01 07:35
     * @description: 线程不安全单例
     **/
    public class ThreadUnsafeSingleton {
        private static ThreadUnsafeSingleton singleton = null;
    
        // 限制产生多个对象
        private ThreadUnsafeSingleton() {
    
        }
    
        // 通过该方法获得实例对象
        public static ThreadUnsafeSingleton getInstance() {
            if (singleton == null) {
                singleton = new ThreadUnsafeSingleton();
            }
            return singleton;
        }
    }

### 单例模式的扩展<a id="sec-1-2-5" name="sec-1-2-5"></a>

有上限的多例模式

    package sp.session3;
    
    import java.util.ArrayList;
    import java.util.Random;
    
    /**
     * @program: zen-of-design-pattern
     * @author: devinkin
     * @create: 2019-06-01 09:15
     * @description: 单例扩展皇帝类
     **/
    public class Emperor {
        // 定义最多能产生的实例数量
        private static int maxNumOfEmperor = 2;
    
        // 每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
        private static ArrayList<String> nameList = new ArrayList<String>();
    
        // 定义一个列表，容纳所有的皇帝实例
        private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
    
        // 当前皇帝序列号
        private static int countNumOfEmperor = 0;
    
        // 产生所有的对象
        static {
            for (int i = 0; i < maxNumOfEmperor; i++) {
                emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
            }
        }
    
        private Emperor() {
    
        }
    
        private Emperor(String name) {
            nameList.add(name);
        }
    
    
        // 随机获得一个皇帝对象
        public static Emperor getInstance() {
            Random random = new Random();
            // 随机拉出一个皇帝，只要是精神领袖就可以了
            countNumOfEmperor = random.nextInt(maxNumOfEmperor);
            return emperorList.get(countNumOfEmperor);
        }
    
        // 皇帝发话了
        public void say() {
            System.out.println(nameList.get(countNumOfEmperor));
        }
    }
