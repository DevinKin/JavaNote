package bp.session2;

import bp.session1.BenzModel;
import bp.session1.CarModel;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 11:30
 * @description: 奔驰组装者
 **/
public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
