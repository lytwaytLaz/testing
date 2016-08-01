/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-12
 */
public class OCA_fel {
    public static void main(String[] args) {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }
}
