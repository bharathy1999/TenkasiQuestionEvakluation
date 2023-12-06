/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Map<String,Integer> hashmap=new HashMap();
	
	Scanner sc=new Scanner(System.in);
	String string =sc.nextLine();
	String split[]=string.trim().split(" ");
	for(int i=0;i<split.length;i++){
	    if(!hashmap.containsKey(split[i])){
	        hashmap.put(split[i],1);}
	        else{
	            hashmap.put(split[i],hashmap.get(split[i])+1);
	        }
	}

for(Map.Entry m:hashmap.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
	}
}
