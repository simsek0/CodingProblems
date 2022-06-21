package HackerRank;

public class interview {

	public static void main(String[] args)
	{
		int index=0;
		System.out.println(index++);
		
	}
public static void moveZeroes(int[] nums) {
        
        int length=nums.length;
        
        for(int i=0;i<length;i++)
        {                  
            if(nums[i]==0)
            {
                for(int j=i+1;j<length;j++)
                {
                    nums[j-1]=nums[j];
                }
                nums[length-1]=0;
                
            }
            
        }
        
    }
}
