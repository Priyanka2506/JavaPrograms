import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

/*
Pascal triangle example
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
*/
	public static void main(String args[]){
		List<Integer> li = new ArrayList();
		List<Integer> prevList = new ArrayList();
		for(int i=1; i<=6; i++){
		    li.add(1);
		    if(prevList.size() > 0){
		      for(int j=0;j<prevList.size()-1;j++){
		        li.add(prevList.get(j)+prevList.get(j+1));
		      }
		    }
		    if(i > 1){
		      li.add(1);
		    }
		    for(int k:li){
		      System.out.print(k+ " ");
		    }
		    System.out.println();
		    prevList = li;
		    li=new ArrayList();
		    
		}
	}

}
