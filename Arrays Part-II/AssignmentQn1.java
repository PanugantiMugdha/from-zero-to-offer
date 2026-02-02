public class AssignmentQn1 {
    public static boolean duplicateElement(int nums[])
    {
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
                if(count>=2)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result=duplicateElement(nums);
        System.out.println(result);
    }
}
