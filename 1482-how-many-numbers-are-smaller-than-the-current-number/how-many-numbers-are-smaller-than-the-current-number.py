class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        hashMap = {}
        arr = sorted(nums)
        for i,val in enumerate(arr):
            if val not in hashMap:
                hashMap[val] = i
        result = []
        for val in nums:
            result.append(hashMap[val])
        return result