def linearSearch(number, numberList):
    for i in range(len(numberList)): 
        if numberList[i] == number:
            return i
    return -1

numberList = [1,2,3,4,5,6,7,8]
number = 4

assert linearSearch(number, numberList) == 3, 'Result shouild be 3'
print(f"{number} was found");

number = 12
assert linearSearch(number, numberList) == -1, 'Result shouild be -1'
print(f"{number} not found");

