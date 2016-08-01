package oca_study_examples;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-21
 */
public class VarargsVSArray
{
    public static void fly (int[] lengths)
//    public static void fly (int... lengths)
    {
        for(int element: lengths)
            System.out.print(element);
        System.out.println();
    }

    public static void main(String[] args)
    {
        VarargsVSArray.fly(new int[]{1, 2, 3}); //both int[] and int... can take this as input
//        VarargsVSArray.fly(1, 2, 3); //only int... can take this as input

    }
}