def integerEndIndexFinder(string):
    currIndex = -1
    while(True):
        if(not string[currIndex].isdigit()):
            return len(string)+currIndex+1
        currIndex-=1
string = input().strip().split()
currIndex=1
for currString in string:
    numberStartIndex=integerEndIndexFinder(currString)
    if(numberStartIndex == len(currString)):
        print(currString+'1',end=" ")
    else:
        number = int(currString[numberStartIndex:])+currIndex
        padding = len(currString)-len(currString[:numberStartIndex])
        neededpadding= max(0,padding - len(str(number)))
        print(currString[:numberStartIndex]+'0'*neededpadding+str(number),end=" ")
    currIndex+=1