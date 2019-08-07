package strategy.session3.method4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 11:22
 * @description: 计算器类
 **/
public enum  Calculator {
    // 加法运算
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },

    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };
    String value = "";
    // 定义成员值类型
    Calculator(String value) {
        this.value = value;
    }

    // 获得枚举成员的值
    public String getValue() {
        return this.value;
    }

    // 声明一个抽象函数
    public abstract int exec(int a, int b);
}
