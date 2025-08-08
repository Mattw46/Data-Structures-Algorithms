#include <stdio.h>
#include <assert.h>

int linearSearch(int numList[], int arraySize, int number);

int main(void) {
    int numbers[] = {1,2,3,4,5,6,7,8};
    int findNum = 4;

    assert(linearSearch(numbers, sizeof(numbers), findNum) >= 0);
    printf("Number %d was found\n", findNum);
    findNum = 12;
    assert(linearSearch(numbers, sizeof(numbers), findNum) < 0);
    printf("Number %d not found\n", findNum);
}

int linearSearch(int numList[], int arraySize, int number) {
    for (int i = 0; i < arraySize; i++) {
        if (numList[i] == number) {
            return number;
        }
    }
    return -1;
}