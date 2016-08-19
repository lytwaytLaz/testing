package oca_my_questions.chapter_3;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-18
 */
public class BuildMeAString
{
    public static String ab;
    public static String cd = "girls";
    public static Boolean bool;

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(cd);
        sb.append(3.14);
        sb.append(bool);
        sb.append(ab);
        sb.insert(5, "BIG");
        System.out.println(sb);
    }
}

//A. girlsBIG3.14falsenull
//B. girlsBIG3.14nullnull
//C. girlsBIG3.14
//D. Compile error on line
//E. Compile error on line
//F. Compile error on line





