var maxProduct = function(nums) {
    let n = nums.length
    let leftprod = 1
    let rightprod = 1
    let ans = nums[0]

    for(let i = 0; i < n; i++){
        leftprod = leftprod == 0 ? 1 : leftprod;
        rightprod = rightprod == 0 ? 1 : rightprod;

        leftprod *= nums[i]
        rightprod *= nums[n-1-i]

        ans = Math.max(ans, Math.max(rightprod, leftprod))
    }
    return ans
};