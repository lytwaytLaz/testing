package oca_my_questions.chapter_3;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-18
 */
public class BuildMeAString
{
    public static String ab = "camel";
    public static String cd;
    public static Boolean bool;

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(ab);
        sb.append(3.14);
        sb.append(bool);
        sb.append(cd);
        sb.insert(5, "Case");
        System.out.println(sb);
    }
}

//A. camelCase3.14nullnull
//B. camelCase3.14falsenull
//C. camelCase3.14false
//D. camelCase3.14
//E. Compile error on line
//F. Compile error on line
//G. An exception is thrown





