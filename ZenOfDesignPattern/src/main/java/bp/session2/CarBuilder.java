package bp.session2;

import bp.session1.CarModel;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 11:27
 * @description: 抽象汽车组装者
 **/
public abstract class CarBuilder {
    // 建造一个模型，你要给我一个顺序要求，就是组装顺序
    abstract void setSequence(ArrayList<String> sequence);

    // 设置完毕顺序后，就可以直接拿到这个车辆模型
    abstract CarModel getCarModel();
}
