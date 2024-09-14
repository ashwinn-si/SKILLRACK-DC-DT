/*A boy is having X candies, he likes to distribute all the candies equally to his N friends. None
of his friends want to get the same type of candies. The program must accept a string S
containing only alphabets, where each alphabet in the string S representing the types of the
candies. The value of N is also passed as the input to the program. The program must print
YES if the boy can distribute all the candies equally to his friends based on the above
conditions. Else the program must print NO as the output.
Note:
- The length of the string S is always multiple of N.
- The string S is case insensitive.
Input
Aacddb
3
Ou tput:
YES
Explanation:
Here the length of the string Aacddb is 6, so the boy is having 6 candies.
Type a: 2 candies (case insensitive)
Type c: 1 candy
Type d: 2 candies
Type b: I candy
The value of N is 3, so the boy has 3 friends.*/

//! 7 -> passed 7 -> failed
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
		    char ch=Character.toLowerCase(str.charAt(i));
		    hash.put(ch,hash.getOrDefault(ch,0)+1);
		}
		int odd_count=0;
		int even_count=0;
		for(Character key:hash.keySet()){
		    if(hash.get(key)%2==0){
		        even_count++;
		    }else{
		        odd_count++;
		    }
		    
		}
		if(even_count==odd_count){
		    System.out.printf("YES");
		}else{
		    System.out.printf("NO");
		}
	}
}