import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*arr[] = {8,7,6,4,2,9,10,3,5}
	Input = 10, Output: (8,2),(7,3),(6,4)*/
  
/*This program will make use of only 1 for loop, to iterate through the array and compare elements */

public class FindSubset {
	
	private int i=0;
	private int j=1;
	int[] listofnums = {8,7,6,4,2,9,10,3,5};
	int val=10;

	private static void findSubsetusingArray(){
		FindSubset obj = new FindSubset();
		while(obj.i<obj.listofnums.length-1){
			sum(obj.listofnums[obj.i], obj.listofnums[obj.j],obj.val,obj);
		}
	}
	
	private static void sum(int a, int b, int val, FindSubset obj) {
		if (a!=b && ((a + b) == val)) {
			System.out.println("(" + a + "," + b + ")");
		}
		if (obj.j < obj.listofnums.length-1) {
			obj.j++;
		} else {
			obj.i++;
			obj.j = obj.i+1;
		}
	}
	
	public static void main(String args[]){
		findSubsetusingArray();
	}

}
