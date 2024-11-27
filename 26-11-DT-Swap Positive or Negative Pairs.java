import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      sc.nextLine();
      int arr[] = new int[N];
      ArrayList<Integer> posPos = new ArrayList<>();
      ArrayList<Integer> negPos = new ArrayList<>();
      for(int i = 0 ;i < N ; i++){
        arr[i] = sc.nextInt();
        if(arr[i] > 0){
          posPos.add(i);
        }else{
          negPos.add(i);
        }
      }
      for(int i = 0 ; i < posPos.size() ; i+=2){
        if(i+1 < posPos.size()){
          int temp = arr[posPos.get(i)];
          arr[posPos.get(i)] = arr[posPos.get(i+1)];
          arr[posPos.get(i+1)] = temp;
        }
      }
      for(int i = 0 ; i < negPos.size() ; i+=2){
        if(i+1 < negPos.size()){
          int temp = arr[negPos.get(i)];
          arr[negPos.get(i)] = arr[negPos.get(i+1)];
          arr[negPos.get(i+1)] = temp;
        }
      }
      for(int i = 0 ; i < N ; i++){
        System.out.printf("%d ",arr[i]);
      }
  }
  
}