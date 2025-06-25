class Solution:
    def findKDistantIndices(self, nums: List[int], key: int, k: int) -> List[int]:
        keys = []
        res = []
        for i in range(len(nums)):
            if nums[i] == key:
                keys.append(i)
        for i in range(len(nums)):
            for j in keys:
                if abs(i-j) <= k:
                    res.append(i)
                    break
        return res