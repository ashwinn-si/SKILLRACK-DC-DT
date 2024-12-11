#Your code below
string =input().strip()
res_count = -1
res_index = -1
for i in range(1,len(string)):
    curr_count = (string[:i].count('0'))*10+(string[i:].count('1'))
    if(curr_count >= res_count):
        res_count = curr_count
        res_index = i
print(string[:res_index],string[res_index:])