mport java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		ArrayList<ArrayList<Integer>> allPos = new ArrayList<>();
		int currI = 0 ;
		int currJ = 0 ;
		ArrayList<Integer> initial = new ArrayList<>();
		initial.add(0);
		initial.add(0);
		allPos.add(initial);
		for(int i = 0 ; i < S.length() ; i++){
		    if(S.charAt(i) == 'N'){
		        currI++;
		    }else if(S.charAt(i) == 'S'){
		        currI--;
		    }else if(S.charAt(i) == 'E'){
		        currJ++;
		    }else{
		        currJ--;
		    }
		    ArrayList<Integer> currPos = new ArrayList<>();
		    currPos.add(currI);
		    currPos.add(currJ);
		    if(allPos.contains(currPos)){
		        System.out.printf("YES");
		        return;
		    }
		    allPos.add(currPos);
		}
		System.out.printf("NO");

	}
}