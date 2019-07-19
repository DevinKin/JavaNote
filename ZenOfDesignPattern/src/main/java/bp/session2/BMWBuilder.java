package bp.session2;

import bp.session1.BMWModel;
import bp.session1.CarModel;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 11:31
 * @description: 宝马车组装者
 **/
public class BMWBuilder {
    private BMWModel bmw = new BMWModel();

    public CarModel getCarModel() {
        return this.bmw;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
