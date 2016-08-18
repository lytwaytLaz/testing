package oca_my_questions.chapter_3;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-18
 */
public class TobyOrNotToby
{
    public static String toby;
    public static String or = "girls";
    public static boolean notToby;

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(toby);
        sb.append(or);
        sb.append(notToby);
        sb.append(3.14);
        sb.insert(sb.indexOf("fa"), "BIG");

        System.out.println(sb);

    }
}

//A. girlsfalseBIG3.14
//B. nullgirlsBIGfalse3.14
//C. girlsfalseBIG3.14
//D. Compile error on line
//D. Compile error on line
//C. Compile error on line
//A. boysfalseBIG
//A. boysfalseBIG





