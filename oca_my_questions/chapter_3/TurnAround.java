package oca_my_questions.chapter_3;
import java.util.Arrays;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-19
 */
public class TurnAround
{
    public static void main(String[] args)
    {
        int[] x = {1,2,3};
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.deepHashCode(x, x));
    }
}
