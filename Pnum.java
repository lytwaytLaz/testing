/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-17
 */
public class Pnum
{
    public static void main(String[] args)
    {

    String persNum = "196705043295";
    int[] control = new int[9];
    int sum=0;
    int num = Integer.parseInt(persNum.substring(2, 11));
        for(int i = 0; i < 9;) {
    control[i] = num % 10;
    num = num / 10;
    if(i%2==0)
        control[i] = control[i] * 2;
    if (control[i] > 9)
        control[i] = control[i]%10 + control[i]/10;
    i++;
}
        for(int j: control)
    sum += j;
        if(10-sum%10 == Integer.parseInt(persNum.substring(11)))
            System.out.println("True");
}

}
