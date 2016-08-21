/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-21
 */
public class NoChainStatic
{
}

class Person2
{
    private String name;
    private int age;

    // In addition to having the side-effect of setting the attributes in question,
    // the setters return "this" (the current Person2 object) to allow for further chained method calls.

    public Person2 setName(String name)
    {
        this.name = name;
        return this;
    }

    public Person2 setAge(int age)
    {
        this.age = age;
        return this;
    }

    public void introduce()
    {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Person3
{
    private static String name;
    private static int age;

    //THIS IS NOT NECESSARILY CORRECT!!!
    // static methods prevent chaining and only the last method in the chain executes.
    // this is because the method can be used without instantiating the class and therefore
    // whatever changes the methods would add to an object get's dropped just like
    // performing an action on a String object without re-referencing.

    public static void setName(String name)
    {
        Person3.name = name;
    }

    public static void setAge(int age)
    {
        Person3.age = age;
    }

    public static void introduce()
    {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Usage:
    public static void main(String[] args)
    {
        // Output: Hello, my name is Peter and I am 21 years old.
        setName("Peter");
        setAge(21);
        introduce();

    }
}

