
def vowel_checker(w):
    if(w in 'aeiouAEIOU'):
        return True
    else:
        return False
string=input().strip()
len_string=len(string)
vowel_pos=[]
s1=''
s2=''
for i in range(len_string):
    if(i==0):
        if(vowel_checker(string[-1])):
            vowel_pos.append(0)
            continue
    if(vowel_checker(string[i-1])):
        vowel_pos.append(i)
for i in range(len_string):
    if(i in vowel_pos):
        s1+='*'
        s2+=string[i]
    else:
        s1+=string[i]
        s2+='*'
print(s1)
print(s2)