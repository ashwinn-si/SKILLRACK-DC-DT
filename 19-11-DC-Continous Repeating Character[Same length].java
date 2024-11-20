import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		ArrayList<Integer> index = new ArrayList<>();
		index.add(0);
		int indexLen = 0;
		int pointer1 = 0;
		int largestLen = 0;
		while(pointer1 < S.length()){
		    int pointer2 = pointer1+1;
		    while(pointer2 < S.length()){
		        if(S.charAt(pointer1) != S.charAt(pointer2)){
		            break;
		        }
		        pointer2++;
		    }
		    if(pointer2 != pointer1+1){
		        index.add(pointer2);
		        indexLen++;
		        largestLen = Math.max(largestLen,index.get(indexLen)-index.get(indexLen-1));
		    }
		    pointer1=pointer2;
		}
		if(index.get(indexLen)!=S.length()){
    		index.add(S.length());
    		indexLen++;
		}
		largestLen = Math.max(largestLen,index.get(indexLen)-index.get(indexLen-1));
		for(int i = 0 ; i < indexLen ;i++){
		    System.out.printf("%s",S.substring(index.get(i),index.get(i+1)));
		    for(int j = 0 ; j < largestLen-S.substring(index.get(i),index.get(i+1)).length();j++){
		        System.out.printf("*");
		    }
		    System.out.printf("\n");
		}

	}
}