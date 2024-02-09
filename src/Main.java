import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> list = new ArrayList<>();
        list.add(171);
        list.add(161);
        list.add(151);
        list.add(141);
        list.add(131);
        list.add(121);
        for (int num: list) {
            System.out.println(num);

        }
        System.out.println("----------");
        Collections.sort(list);
        for (int num: list) {
            System.out.println(num);

        }
    }
}