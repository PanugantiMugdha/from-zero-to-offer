import java.util.*;
public class ArraysPart1
{
    public static void main(String args[])
    {
        int marks[]=new int[50];
        System.out.println("Length of array:"+marks.length);
        // marks[0]=99;
        // marks[1]=98;
        // marks[2]=96;
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Marks:"+marks[0]);
        System.out.println("Marks:"+marks[1]);
        System.out.println("Marks:"+marks[2]);

        marks[2]=marks[2]+4;
        System.out.println("Updated marks:"+marks);
    }
}
