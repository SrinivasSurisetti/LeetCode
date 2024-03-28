class Solution:
    def maxSubarrayLength(self, nums, k):
        maxLength = 0
        start = -1
        frequency =  {}
        for end in range(len(nums)):
            frequency[nums[end]] = frequency.get(nums[end], 0) + 1
            while frequency[nums[end]] > k:
                start += 1
                frequency[nums[start]] -= 1
            maxLength = max(maxLength, end - start)

        return maxLength