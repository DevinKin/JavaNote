package chapter7;

import static chapter7.ParentTest.Parent.A;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-10-31 17:50
 * @description: <clinit>()方法执行顺序
 **/
public class ParentTest {
    static class Parent {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class SubClass extends ParentTest {
        public static  int B = A;
    }

//    public static void main(String[] args) {
//        System.out.println(FieldResolution.Sub.B);
//    }
}

