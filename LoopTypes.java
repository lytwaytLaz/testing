/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-05
 */
public class LoopTypes {
    public static void main(String[] args) {


        Integer[] num = {1,2,3,4,5};

        System.out.println(num.getClass());

        //regular for loop
        for(int i = 0; i < num.length; i++) {
            if(num[i] > 3)
                System.out.println(num[i]);
        }

        //enhanced for loop
        for (int number: num)
        {
            System.out.println(number ^ 2);
        }
    }
}

