'''The program must accept a string S and N unique characters as the input. The program must
print the shortest substring in S containing all the N characters. If two or more such substrings
are present in S, the program must print the first occurring substring as the output. If there is
no such substring, the program must print -1 as the output.

Input:
shopKeeper
3
p e K

Output:
pKe

Explanation:
The substring pKe is the shortest substring containing all the 3 characters p, e and K.
Hence the output is pKe.
'''

#Your code below
def checker(string):
    for i in words:
        if(i not in string):
            return False
    return True
string=input().strip()
n=int(input())
words=input().strip().split()
result=""
for i in range(len(string)):
    for j in range(i,len(string)):
        if(checker(string[i:j+1])):
            if(len(result)==0):
                result=string[i:j+1]
            else:
                if(len(result)>len(string[i:j+1])):
                    result=string[i:j+1]
if(len(result)==0):
    print("-1")
else:
    print(result)