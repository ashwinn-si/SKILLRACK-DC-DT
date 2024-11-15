/*The program must accept the upper left triangle elements of an integer matrix size of NXN as
the input. The program must fill the lower right triangle of the matrix with the inverted upper
left triangle elements. Finally, the program must print the modified matrix as the output

Input:
4
3 7 3 7
3 2 8
9

Output
3 7 3 7
3 2 8 3
4 8 2 7
9 4 3 3
*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    int n;
    scanf("%d",&n);
    int matrix[n][n];
    for (int r=0;r<n;r++){
        for(int c=0;c<n-1;c++){
            scanf("%d",&matrix[r][c]);
            printf("%d ",matrix[r][c]);
        }
        for(int inverted_r=r-1;inverted_r>=0;inverted_r--){
            printf("%d ",matrix[inverted_r][n-r-1]);
        }
    }
    printf("\n");
}