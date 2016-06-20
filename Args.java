/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-13
 */
public class Args
{
    public static void main(String... args)
    {
        if (args.length == 0)
        {
            System.err.println("usage Args <String, [String], [String]>");
            System.exit(1);
        }
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}
