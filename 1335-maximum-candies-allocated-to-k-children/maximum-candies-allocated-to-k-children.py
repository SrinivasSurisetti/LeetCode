from typing import List

class Solution:
    def maximumCandies(self, candies: List[int], k: int) -> int:
        if sum(candies) < k:
            return 0  # If total candies are less than children, each child gets 0.

        left, right = 1, max(candies)  # Binary search range

        while left < right:
            mid = (left + right + 1) // 2  # Middle value for binary search
            count = sum(c // mid for c in candies)  # Number of children that can be served

            if count >= k:  # If we can serve at least k children, try for more
                left = mid
            else:  # Otherwise, reduce the candy count per child
                right = mid - 1

        return left  # Maximum number of candies each child can get
