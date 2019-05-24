# 第三章-依赖倒置原则
 
## 依赖倒置原则的定义
 
- 依赖倒置原则（Dependence Inversion Principle，DIP）
  - 高层模块不应该依赖低层模块，两者都应该依赖其抽象。
  - 抽象不应该依赖细节。
  - 细节应该依赖抽象。
 
- 依赖倒置原则在Java语言中的表现就是
  - 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的。
  - 接口或抽象类不依赖于实现类。
  - 实现类依赖接口和抽象类。
- 即面向接口编程。
- 依赖倒置原则可以减少类间的耦合性，提高系统的稳定性，降低并行开发引起的风险，提高代码的可读性和可维护性。
 
## 依赖的三种写法
 
- 依赖是可以传递的，但只要做到抽象依赖，即使是多层的依赖传递也不担心。
- 依赖的写法
  - 构造函数传递依赖对象。
  - Setter方法传递依赖对象（Setter依赖注入）。
  - 接口声明依赖对象（接口注入）。
 
## 依赖倒置原则的编写规则
 
- 每个类尽量都有接口或抽象类，或者抽象类和接口两者都具备。
- 变量的表面类型尽量是接口或者是抽象类。
- 任何类都不应该从具体类派生。
- 尽量不要覆写积累的方法。
- 结合里氏替换原则使用。
- 依赖细节的业务逻辑不需要遵顼依赖倒置原则。