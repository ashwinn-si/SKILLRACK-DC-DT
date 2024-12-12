#Your code below
def helper(a , b):
    if(a.islower() and b.isupper()):
        return True
    elif(a.isupper() and b.islower()):
        return True
    return False
string = list(input().strip())
while(True):
    flag = False
    for i in range(len(string)-1):
        if(helper(string[i] , string[i+1]) and string[i].lower() == string[i+1].lower()):
            del string[i] # if we delete 10 then the next index will become 10 
            del string[i]
            flag = True
            break
    if(not flag):
        if(len(string) == 0):
            print("-1")
            quit()
        print(''.join(i for i in string))
        quit()