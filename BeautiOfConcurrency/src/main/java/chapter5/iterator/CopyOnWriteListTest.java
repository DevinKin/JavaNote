package chapter5.iterator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-07 12:33
 * @description:
 **/
public class CopyOnWriteListTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("hello");
        arrayList.add("alibaba");

        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
