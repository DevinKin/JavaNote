package chapter2.cache;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-02 10:30
 * @description: 缓存测试类2
 **/
public class TestForContent2 {
    static final int LINE_NUM = 1024;
    static final int COLUMN_NUM = 1024;

    public static void main(String[] args) {
        long [][] array = new long[LINE_NUM][COLUMN_NUM];

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COLUMN_NUM; i++) {
            for (int j = 0; j < LINE_NUM; j++) {
                array[j][i] = i*2 + j;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("no cache time: " + (endTime - startTime));
    }
}
