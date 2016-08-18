/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-17
 */
public class Pnum2
{
    public static boolean Checker(String persNum)
    {
        int control;
        int checksum = 0;
        int num = Integer.parseInt(persNum.substring(2, 11));
        for (int i = 0; i < 9; i++)
        {
            control = num % 10;
            num = num / 10;
            if (i % 2 == 0)
            {
                control *= 2;
                control = control % 10 + control / 10;
            }
            checksum += control;
        }

        return (10 - checksum % 10 == Integer.parseInt(persNum.substring(11)));
    }

    public static void main(String[] args)
    {
        System.out.println(Checker("196705043294"));
    }

}
