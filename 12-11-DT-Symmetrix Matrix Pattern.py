#Your code below
rows,cols = map(int,input().split())
matrix = [list(map(int,input().split())) for i in range(rows)]
rowsFlag = True
colsFlag = True
for  i in range(rows//2):
    if(matrix[i] != matrix[rows-1-i]):
        rowsFlag = False
        break
for j in range(cols//2):
    for i in range(rows):
        if(matrix[i][j] != matrix[i][cols-j-1]):
            colsFlag = False
            break
if(rowsFlag and colsFlag):
    print("Both")
elif(rowsFlag):
    print("Horizontally Symmetric")
elif(colsFlag):
    print("Vertically Symmetric")
else:
    print("-1")