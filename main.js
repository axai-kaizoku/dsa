let arr = [1, 2, 3, 4, 5, 6];

let x = 5;
let a = 0;

for (i = 0; i < arr.length - 1; i++) {
	for (j = i + 1; j < arr.length; j++) {
		if (arr[i] + arr[j] == x) {
			a++;
			console.log(`${arr[i]}, ${arr[j]}    =>  true`);
		} else {
			console.log(`${arr[i]}, ${arr[j]}    =>  false `);
		}
	}
}
console.log(a);
