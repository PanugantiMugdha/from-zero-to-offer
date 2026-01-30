public class SubarraySumMinMax {
    public static void printSubarrays(int numbers[])
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int totalSubarrays=0;
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                System.out.println();
                System.out.println("Sum:"+sum);
                if(sum>max)
                {
                    max=sum;
                }
                if(sum<min)
                {
                    min=sum;
                }
                totalSubarrays++;
                
            }
            System.out.println();
        }
        System.out.println("Total subarrays:"+totalSubarrays);
        System.out.println("Minimum sum subarray:"+min);
        System.out.println("Maximum sum subarray:"+max);
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}

    
