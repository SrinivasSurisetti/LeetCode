class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Negative numbers are never palindrome
        if x < 0:
            return False
        
        # Numbers ending in 0 cannot be palindrome unless the number is 0
        if x % 10 == 0 and x != 0:
            return False
        
        reversed_half = 0
        
        # Reverse only half the digits
        while x > reversed_half:
            reversed_half = reversed_half * 10 + x % 10
            x //= 10
        
        # Palindrome if:
        #   Even length: both halves equal
        #   Odd length: drop the middle digit (reversed_half // 10)
        return x == reversed_half or x == reversed_half // 10
