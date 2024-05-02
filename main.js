// print all the 3 digit armstrong numbers

let a = 153;

function isArmstrong(n) {
	let original = n;
	let sum = 0;
	while (n > 0) {
		let rem = n % 10;
		n = Math.floor(n / 10);
		sum += rem * rem * rem;
	}
	return sum === original;
}

// Print all the armstrong numbers upto 1000

for (let int = 1; int < 100000; int++) {
	if (isArmstrong(int)) {
		// console.log(int);
	}
}

// console.log(isArmstrong(a));
const arr = [];

for (let index = 1; index <= 18; index++) {
	arr.push(index);
}

arr.sort((a, b) => Math.random() - 0.5);

console.log(arr[0]);
