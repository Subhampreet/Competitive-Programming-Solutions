var search = function(nums, target) {
    let start = 0;
    let end = nums.length - 1;

    while (start <= end) {
        let middle = Math.floor((start + end) / 2 );
        let foundVal = nums[middle]

        if(foundVal === target) {
            return middle
        } else if (foundVal < target){
            start = middle + 1
        } else {
            end = middle - 1
        }
    }

    return -1;
};