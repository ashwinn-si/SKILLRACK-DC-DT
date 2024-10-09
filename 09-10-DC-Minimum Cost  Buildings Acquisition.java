import java.util.*;
public class Hello {
    static Long dp[][];
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int matrix[][]=new int[N][N];
		dp=new Long[N][N];
		sc.nextLine();
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		long result=Integer.MAX_VALUE;
		for(int j=0;j<N;j++){
		    long curr_result=(minDisFinder(0,j,matrix,N));
		    if(result>curr_result){
		        result=curr_result;
		    }
		}
		System.out.print(result);
	}
	static long minDisFinder(int curr_i,int curr_j,int matrix[][],int N){
	    if(curr_i<0 || curr_i>=N || curr_j<0 || curr_j>=N || matrix[curr_i][curr_j]==0){ //if curr_element is zero
	        return Integer.MAX_VALUE;
	    }
	    if(curr_i==N-1){ // if we have reached the bottom
	        return matrix[curr_i][curr_j];
	    }
	    if(dp[curr_i][curr_j]!=null){ //!game changer
	        return dp[curr_i][curr_j];
	    }
	    
	   long possible_move_1=minDisFinder(curr_i+1,curr_j+1,matrix,N);
	   long possible_move_2=minDisFinder(curr_i+1,curr_j,matrix,N);
	   long possible_move_3=minDisFinder(curr_i+1,curr_j-1,matrix,N);
	   return dp[curr_i][curr_j]=(matrix[curr_i][curr_j]+Math.min(Math.min(possible_move_1,possible_move_2),possible_move_3));
	    
	}
}