let nums = [12, 33, 45, 67, 99];

const sorted = num => {
  for (let i = 0; i < nums.length; i++) {
    let pos = i;

    for (let j = 1; j < num.length; j++) {
      if (num[pos] > num[j]) {
        pos = j;
      }

      if (pos != i) {
        let temp = num[i];
        num[i] = num[pos];
        num[pos] = temp;
      }
    }
  }

  console.log("After: ", nums);
};

console.log("Before: ", nums);
sorted(nums);
