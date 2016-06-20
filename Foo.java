import java.util.Objects;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-08
 */

public class Foo {
    private String bar;
    private int baz;

    public Foo(String bar, char baz) {
        this.bar = Objects.requireNonNull(bar, "bar must not be null");
        this.baz = Objects.requireNonNull(baz, "baz must not be null");

    }

    public static void main(String[] args) {
        char ch = args[1].charAt(0);
        Foo foo = new Foo(args[0], ch); //java automatically cast char to int?
//        Foo foo = new Foo("Gilligans Island", 4);

        System.out.println(foo.bar + " " + foo.baz);
    }
}