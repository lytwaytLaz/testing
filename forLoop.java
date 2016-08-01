/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-10
 */
public class forLoop
{
    public static void main(String[] args)
    {


        int x = 0;
        int z;
        long y;
        for (y = 0, z = 4; x < 5 && y < 10; x++, y++)
        {
            System.out.print(y + " ");
        }
        System.out.println(x + "\n");


        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for (int i = 0; i < names.size(); i++)
        {
            String name = names.get(i);

            if (i > 0)
            {
                System.out.print(+ i + " , ");
            }
            System.out.print(name);
        }

    }
}
