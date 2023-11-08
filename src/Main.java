import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Pair[] pairs = {
                new Pair("a1", "b1"),
                new Pair("a2", "b2"),
                new Pair("a3", "b3")
        };

        pairsToList(pairs);
    }

    public static List<String> pairsToList(Pair[] pairs) {
        Stream<Pair> pairStream = Arrays.stream(pairs);
        List<String> result = pairStream.map(p -> p.getBook() + " " + p.getAuthor()).toList();
        System.out.println(result);
        return result;
    }
}