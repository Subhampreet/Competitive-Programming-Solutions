var maxSubArray = function(nums) {
    mx = nums[0]
    sm = 0;
    nums.forEach((n) => {
        sm += n
        mx = Math.max(sm, mx);
        if(sm < 0) sm = 0;
    })
    return mx;
};