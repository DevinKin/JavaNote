package fmp.session6;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 13:48
 * @description: 产品工厂类
 **/
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) {
        Product product = null;

        // 如果Map中已经有这个对象
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            // 同时把对象缓存到容器中
            prMap.put(type, product);
        }
        return product;
    }
}
