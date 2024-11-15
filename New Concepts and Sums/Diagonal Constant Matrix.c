/*The program must accept an integer matrix of size RxC as the input. A diagonal-constant
matrix is a matrix in which all the elements in each left diagonal are same. The program must
print YES if it is a diagonal-constant matrix. Else the program must print NO as the output.

Input:
3 4
1 2 3 4
5 1 2 3
9 5 1 2

OUPUT:
YES
*/
//yt link https://www.youtube.com/watch?v=wKqAZQ9SRRE&t=1s

#include<stdio.h>
#include<stdlib.h>
int main()
{
    int rows,cols;
    scanf("%d %d\n",&rows,&cols);
    int matrix[rows][cols];
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            scanf("%d ",&matrix[i][j]);
            if(i !=0 && j!=0){ // row should not be zero and col should not be zero
                if(matrix[i][j] !=matrix[i-1][j-1]){ // main logic we are just checking the previous element alone
                    printf("NO");
                    return 0;
                }
            }
        }
    }
    printf("YES");
}