//Mufasa Simsek
//9/16/2021



public class SingleOne {

	public static void main(String[] args) {

		System.out.println(singleNumber(new int[]{2,2,1}));  // 1
        System.out.println(singleNumber(new int[]{4,1,2,1,2})); //4
        System.out.println(singleNumber(new int[]{1})); //1
        
        
		
	}
	static int singleNumber(int[] array)
	{

		int result=0;
		
		for(int i=0;i<array.length;i++)
		{
			result ^= array[i];
		}
		
		return result;
	}

}
