class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        arr = []
        for i in range (0,n-1):
            for j in range (i+1,n):
                if(nums[i]+nums[j]==target):
                    arr.append(i)
                    arr.append(j)
        return arr