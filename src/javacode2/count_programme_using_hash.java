package javacode2;


	import java.util.HashMap;
	 
	public class count_programme_using_hash
	{

	    public static void main(String[] args)
	    {
	      
	        String str = "This this is is done by Ashish ashish";
	        String[] split = str.split(" ");
	         
	                HashMap<String,Integer> map = new HashMap<String,Integer>();
	        for (int i=0; i<split.length; i++)
	        {
	            if (map.containsKey(split[i]))
	            {
	                int count = map.get(split[i]);
	                map.put(split[i], count+1);
	            }
	            else 
	            {
	                map.put(split[i], 1);
	            }
	        }
	        System.out.println(map);
	    }
	 
	}