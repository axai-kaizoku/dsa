let arr = [1,2,3,4];
let sum = arr.reduce((value, sum) => value + sum);
// console.log(sum);

// arr.sort(() => Math.random() - 0.5)
// console.log(arr);
// for (const number of arr) {
//     console.log(number)
// }

// console.log(Array.of(arr))
// console.log(arr.filter((value) => value > 2)); // returns one
// console.log(arr.find((value) => value > 2)); // filters and created new array

// console.log(arr.indexOf(4))
// console.log(arr.includes(0))
// console.log(arr.some(value => value === 1))
// console.log(arr.map(value => value + 1))
// console.log(arr.flatMap(value => value+3))
// console.log(arr.splice(1,10,3))
// console.log(arr.slice(1,3))
// console.log(arr.forEach((value, index) => {
//     console.log(value, index)
// }))
// console.log(arr.unshift(0))
// console.log(arr.shift())
// console.log(arr.push(5))
// console.log(arr.pop())
// console.log(arr)

console.log(arr.reduce((value, sum) => value+ sum))


const solve = (a) => {
    if (a === 0) {
        console.log('a');
        return 0;
    } else if (a === 1) {
        console.log('b');
        return 1;
    } else {
        console.log('c');
        return solve(a - 1) + solve(a - 2);
    }
};
const result = solve(5);
console.log(result);
