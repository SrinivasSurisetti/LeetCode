class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dir = {}
        for i,v in enumerate(nums):
            if target-v in dir:
                return i,dir[target-v]
            else:
                dir[v] = i