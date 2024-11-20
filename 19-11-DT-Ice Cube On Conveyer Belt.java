import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        sc.nextLine();
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        int endIndex = N;
        while(endIndex >= 0){
            boolean flag = false;
            for(int i = 0 ; i < endIndex ; i++){
                if(arr[i] > 0){
                    flag = true;
                    System.out.printf("%d ",arr[i]);
                }
                arr[i]--;
            }
            if(endIndex != 0 && flag){
                System.out.printf("\n");
            }
            endIndex--;
        }
	}
}