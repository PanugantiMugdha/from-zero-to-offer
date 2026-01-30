public class LargestSmallest {
    public static int getLargestAndSmallest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largest)
            {
                largest=numbers[i];
            }
            if(numbers[i]<smallest)
            {
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest:"+smallest);
        return largest;
    }
    public static void main(String args[])
    {
        int numbers[]={1,3,5,10,7,9};
        System.out.println("Largest:"+getLargestAndSmallest(numbers));
    }
}
