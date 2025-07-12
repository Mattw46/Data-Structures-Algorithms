const assert = require('assert');

let numberList = [1,2,3,4,5,6,7,8];
let number = 4;

assert.strictEqual(linearSearch(number, numberList), 3);
console.log(number + ' found');

number = 12
assert.strictEqual(linearSearch(number, numberList), -1);
console.log(number + ' not found');

// Retrun the index otherwise return -1
function linearSearch(number, numberList) {
    for (let i = 0; i < numberList.length; i++) {
        if (numberList[i] === number ) {
            return i;
        }
    };
    return -1;
}