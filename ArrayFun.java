import java.util.ArrayList;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-14
 */
public class ArrayFun {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");

        System.out.println(words.set(1, "B")) ;

        System.out.println(words);

    }
}
