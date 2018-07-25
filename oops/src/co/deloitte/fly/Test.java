package co.deloitte.fly;
public class Test
{
    public static void main(String[] args)
    {
        int a[] = {1, 8, 3};

         int b[] = {5, 5, 5, 5, 5, 5};

        System.arraycopy(a, 0, b, 0, 3);
        System.out.println("Contents of a[] ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
      

        System.out.println("\n\nContents of b[] ");
        for (int i=0; i<b.length; i++)
            System.out.print(b[i] + " ");
    }
}