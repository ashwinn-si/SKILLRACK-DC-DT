#Your code below
hashmap = {}
for i in sorted(input().strip()):
    if(i not in hashmap):
        hashmap[i] = 1
    else:
        hashmap[i] += 1
curr_count = 1
while(True):
    flag = False
    curr_string=[]
    for i in hashmap:
        if(hashmap[i] > 0):
            curr_string.append(i)
            flag = True
            hashmap[i]-=1
    curr_count += 1
    curr_string = sorted(curr_string)
    print(''.join(i for i in curr_string),end="")
    if(not flag):
        quit()