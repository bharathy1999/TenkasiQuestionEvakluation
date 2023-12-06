/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner scanner =new Scanner(System.in);
	String string=scanner.next();
	char a[][]=new char[7][5];
	int i=0;
	int j=0;
	int k=0;
	while(i<a.length&&j<a[0].length&&k<string.length()){
	    a[i][j]=string.charAt(k);
	    j++;
	    k++;
	    if(j==a[0].length){
	        i++;
	        j=0;
	    }
	}
	for(int m=0;m<a.length;m++){
	    for(int n=0;n<a[0].length;n++){
	        System.out.print(a[m][n]);
	    }
	    System.out.println();
	}
	
	String s=scanner.next();
	for(int m=0;m<a.length;m++){
	    for(int n=0;n<a[0].length;n++){
	       if(a[m][n]==s.charAt(0)){
	           int q=1;
	           int r=n;
	           StringBuilder str=new StringBuilder();
	           str.append(String.valueOf(a[m][n]));
	           while(q<s.length()&&n+q<a[0].length){
	              str.append(String.valueOf(a[m][n+q++])); 
	           }
	           if(str.toString().equals(s)){
	               System.out.println("From left to right");
	               System.out.println("Starting index :"+m+" "+n);
	               System.out.println("Last index :"+m+" "+(n+(q-1)));
	           }
	           q=1;
	           StringBuilder strb=new StringBuilder();
	            strb.append(String.valueOf(a[m][n]));
	            while(q<s.length()&&m+q<a.length){
	                strb.append(String.valueOf(a[m+q++][n])); 
	           }
	           
	            if(strb.toString().equals(s)){
	                System.out.println("From top to bottom");
	               System.out.println("Starting index :"+m+" "+n);
	               System.out.println("Last index :"+(m+(q-1))+" "+n);
	           }
	       }
	    }
	    System.out.println();
	}
	}
}
