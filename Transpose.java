/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	int b[][]=new int [a.length][a.length];
	for(int i=0;i<a.length;i++){
	    for(int j=0;j<a.length;j++){
	        b[i][j]=a[j][i];
	        System.out.print(a[i][j]);
	    }
	    System.out.println();
	}
	for(int i=0;i<a.length;i++){
	    for(int j=0;j<a.length;j++){
	        System.out.print(b[i][j]);
	    }
	    System.out.println();
	}
	
	}
}
