public class MaxSubarraySum
{
    public static void maxSubarraySum(int nums[])
    {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int start=i;
            for(int j=i;j<nums.length;j++)
            {
                sum=0;
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    sum+=nums[k];
                }
                if(sum>max_sum)
                {
                    max_sum=sum;
                }    
            }
        }
        System.out.println("Max Subarray Sum:"+max_sum);
    }
    public static void main(String args[])
    {
        int nums[]={1,-2,6,-1,3};
        maxSubarraySum(nums);
    }
}
