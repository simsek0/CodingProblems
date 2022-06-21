import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class IntersectionOfTwoArrays {	
		
	
	
public static void main(String[] args) {
		
	int [] arr1= {4,9,5};
	int [] arr2= {9,4,9,8,4};
	
	

	intersect(arr1,arr2);
}
public static int[] intersect(int[] nums1, int[] nums2)
    {
        //for(int i=0;i<2;i++) // two times
       //declare a map
        //put all the values into maps so we can have unique keys with the values
        //for each instance of the key,increment the value of the key
        
        //compare maps with each other
        
        //then find out the size of instances and declare an int array
        //return to an int array
        
		HashMap<Integer, Integer> map1=new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> map2=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums1.length;i++)
        {
            if(map1.containsKey(nums1[i]))
            {
            
                int value=map1.get(nums1[i]);
                value++;
                map1.put(nums1[i],value);
            }
            else
            {
                map1.put(nums1[i],1);
            }
        }
        
         for(int i=0;i<nums2.length;i++)
        {
            if(map2.containsKey(nums2[i]))
            {
            
                int value=map2.get(nums2[i]);
                value++;
                map2.put(nums2[i],value);
            }
            else
            {
                map2.put(nums2[i],1);
            }
        }
        Set<Entry<Integer,Integer>> set=new HashSet();
        set=map1.entrySet();
        
        Iterator<Entry<Integer, Integer>> it=set.iterator();
        
        List<Integer> list=new ArrayList();
        while(it.hasNext())
        {
        	Entry e=it.next();
        	int key=(int) e.getKey();
        	int entryValue=(int) e.getValue();
        	if(map2.containsKey(key))
        	{
        		int value=0;
        		if(entryValue<map2.get(key))
        			value=entryValue;
        		else
        			value=map2.get(key);
        		
        		
        		for(int i=0;i<value;i++)
        		{
        			list.add(key);
        		}
        	}
        	
        	
        }

        int [] myArray=new int[list.size()];
        
        for(int i=0;i<list.size();i++)
        {
        	myArray[i]=list.get(i);
        }
        
        System.out.println(myArray.length);
        
    return myArray;
    }
}
