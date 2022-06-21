
public class divideTwoIntegers {

	public static void main(String[] args) {
		
		System.out.println(divide(-214748368,-1));
	}
	   public static int divide(int dividend, int divisor) {
	       
	        if(dividend==0)return 0;
	 
	        boolean div=(dividend>0) ? true:false;
	        boolean dor=(divisor>0) ? true:false;
	        
	        int number=divisor;
	        int count=0;
	        if(div && dor)
	        {
	            while(dividend >=number)
	            {
	                number +=divisor;
	                count++;
	            }
	            return count;
	        }
	        else if(div && !dor )
	        {
	            number=divisor*(-1);
	            divisor=number;
	            while(dividend >=number)
	            {
	                number +=divisor;
	                count--;
	            }
	            return count;
	        }
	        else if(!div && !dor)
	        {
	            
	            if(number==dividend)return 1;
	            while(dividend<=number)
	            {
	                number -=divisor;
	                count++;
	            }
	            return count;
	        }
	        else if(!div && dor )
	        {
	            number=divisor*(-1);
	            divisor=number;
	            if(number==dividend)return -1;
	            while(dividend <= number)
	            {
	                number -=divisor;
	                count--;
	            }
	            return count;
	        }      
	          
	        return 0;
	   }
	        
}
