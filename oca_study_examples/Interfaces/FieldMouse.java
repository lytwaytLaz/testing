package oca_study_examples.interfaces;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-27
 */
public class FieldMouse implements CanBurrow
{
    public int getMaximumDepth()
    {
        return 10;
    }

    public static void main(String[] args)
    {
        FieldMouse mouse = new FieldMouse();
        System.out.println(mouse.getMaximumDepth());
        System.out.println(mouse.MIN_DEPTH);

        mouse.canJump();
        CanBurrow.canFly();
    }
}
