import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		char matrix[][] = new char[R][C];
		sc.nextLine();
		for(int i = 0 ; i < R ; i++){
		    int count = 0;
		    for(int j = 0 ; j < C ; j++){
		        matrix[i][j] = sc.next().charAt(0);
		        if(matrix[i][j]=='B') count++;
		    }
		    for(int j = 0 ; j < C ; j++){
		        if(j < count ){
		            System.out.printf("- ");
		        }else{
		            System.out.printf("A ");
		        }
		    }
		    System.out.println();
		}

	}
}
