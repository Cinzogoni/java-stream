import java.util.Arrays;
import java.util.List;

public class map_flatmap {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        List<Integer> list3 = Arrays.asList(3, 5, 7);

        List<List<Integer>> list = Arrays.asList(list1, list2, list3);

        System.out.println(list);
        System.out.println("------------------------------");

        list.stream()
                .map(List::size)
                .forEach(System.out::println);
        System.out.println("------------------------------");

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
