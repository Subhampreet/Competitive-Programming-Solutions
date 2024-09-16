var maxArea = function(height) {
    let left = 0;
    let right = height.length - 1
    let maxArea = 0;

    while(left < right){
        let width = right - left;
        let currentheight = Math.min(height[left], height[right])
        let currentarea = width * currentheight

        maxArea = Math.max(maxArea, currentarea)

        if(height[left] < height[right]){
            left++;
        } else{
            right--;
        }
    }

    return maxArea
};