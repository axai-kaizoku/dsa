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
		console.log(int);
	}
}

// console.log(isArmstrong(a));
