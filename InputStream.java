import java.io.IOException;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-09
 */
public class InputStream
{
    public static void main(String[] args)
    {
        int convert;
        char inChar;
        System.out.println("Input character");
        try {
            inChar = (char) System.in.read();
            if (Character.toString(inChar).equals("A"))
            {
                System.out.print("You entered ");
                System.out.println(inChar);
            } else
            {
                System.out.println("Du bist ein Arsch");
            }
        }
        catch (IOException e){
            System.out.println("False input biatch");
        }
    }
}
