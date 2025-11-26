class Solution:
    def intToRoman(self, num: int) -> str:
        # Roman numeral value map (descending order)
        values = [
            (1000, "M"), (900, "CM"), 
            (500, "D"),  (400, "CD"), 
            (100, "C"),  (90, "XC"), 
            (50, "L"),   (40, "XL"), 
            (10, "X"),   (9, "IX"), 
            (5, "V"),    (4, "IV"), 
            (1, "I")
        ]
        
        result = []
        
        for val, symbol in values:
            if num == 0:
                break
            
            count = num // val
            if count:
                result.append(symbol * count)
                num %= val
        
        return "".join(result) #result