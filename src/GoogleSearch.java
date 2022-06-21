import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleSearch {
	
	public static void main(String[] args) {
		
		String [] products= {"mobile","mouse","moneypot","monitor","mousepad" };
		String searchWord="mouse";
		System.out.println(suggestedProducts(products,searchWord));
		
	}
	

public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        List<List<String>> list = 
                  new ArrayList<List<String>>();
    
        Arrays.sort(products);
        
        for(int i=0;i<searchWord.length();i++)
        {
            List<String> list2=new ArrayList<>();
            for(int j=0;j<products.length;j++)
            {
                
                if(list2.size()==3)break;
                String product=products[j];
                if(i<product.length())
                {
                    boolean cond=true;
                    for(int k=0;k<=i;k++)
                    {
                        if(searchWord.charAt(k) != product.charAt(k))
                        {
                            cond=false;
                        }
                    }
                    if(cond)list2.add(product);
                }
                
            }
            System.out.println(list2);
            list.add(list2);
           
            
        }
        
        return list;
        
    }
}
