'''
The must accept N integers and an integer X as the input The prograrn must print
largest two integers (ascending order) in each window of size K among the N integers as
output

Input:
63
54 8 100 6 200 80

Output:
54 100
8 100
100 200
80 200
'''

#Your code below
N = int(input())
num1 = int(''.join(i for i in input().split()))
M = int(input())
num2 = int(''.join(i for i in input().split()))
for i in str(num1+num2):
    print(i,end=" ")