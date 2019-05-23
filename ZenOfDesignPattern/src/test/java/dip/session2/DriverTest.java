package dip.session2;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

public class DriverTest {
    Mockery context = new JUnit4Mockery();

    @Test
    public void testDriver() {
        // 根据接口虚拟一个对象
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();
        // 内部类
        context.checking(new Expectations(){{
            oneOf(car).run();
        }});
        driver.drive(car);
    }
}
