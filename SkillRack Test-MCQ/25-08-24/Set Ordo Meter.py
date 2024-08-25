'''
An odometer has 5 slots, where each slot contains a wheel. Initially, the odometer shows the
number 00000. A person wants to set a number N in the odometer. He can rotate the wheels
only in clockwise direction from right to left in the odometer. The value of N is passed as the
input to the program. The program must print the combinations he gets when setting up the
number N in the odometer.

Input:
30151

Output:
00000
00001
00011
00021
00031
00041
00051
00151
10151
20151
30151
'''

N=input().strip()
if(len(N)<5):#to check if 5 character are always there
    N='0'*(5-len(N))+N
value=['0','0','0','0','0']
index=-1
while(''.join(i for i in value) !=N):
    if(value[index]==N[index]):
        index-=1
    else:
        print(''.join(i for i in value))
        value[index]=str(int(value[index])+1)
print(N)