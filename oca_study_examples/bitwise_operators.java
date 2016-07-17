package oca_study_examples;

//import static java.lang.Integer.toBinaryString;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-16
 */
public class bitwise_operators
{
    public static void main(String[] args)
    {
        byte x = 0b11;
        int y = 0b10;
        byte z1 = (byte) ~ x;//bitwise NOT
        int z2 = x ^ y; //bitwise XOR
        int z3 = x | y; //bitwise OR
        int z4 = x & y; //bitwise AND

        System.out.println(x+" "+y+" "+ "\nz1 = "+z1+"\nz2 = "+z2+"\nz3 = "+z3+"\nz4 = "+z4);
        System.out.println();
    }
}