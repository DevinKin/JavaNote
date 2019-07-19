package bp.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 15:22
 * @description: 抽象建造者
 **/
public abstract class Builder {
    // 设置产品的不同部分，以获得不同的产品
    public abstract void setPart();
    // 建造产品
    public abstract Product buildProduct();
}
