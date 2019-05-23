package dip.session2;

public class Driver implements IDriver{
    // 司机的主要职责就是加事汽车
    @Override
    public void drive(ICar car) {
        car.run();
    }

}