package tmp.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-02 11:50
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("-------H1型号悍马-------");
        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要   1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1Model h1 = new HummerH1Model();

        if (type.equals("0")) {
            h1.setAlarm(false);
        }
        h1.run();
        System.out.println("\n-------H2型号悍马-------");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();

    }
}
