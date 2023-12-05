const isPrime = (n) => {
	if (n === 1) return true;

	let i = 2;
	while (i * i <= n) {
		if (n % i === 0) {
			return false;
		}
		i++;
	}
	return i * i > n;
};

console.log(isPrime(11));
