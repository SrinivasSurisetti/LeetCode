class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix)
        m = len(matrix[0])
        left, ryt  = 0, m - 1 
        top, bottom = 0, n - 1 
        ans = []
        while(top <= bottom and left <= ryt):
            #top (left - ryt)
            for i in range(left,ryt + 1):
                ans.append(matrix[top][i])
            top += 1

            #ryt (top - bttom)
            for i in range(top,bottom + 1):
                ans.append(matrix[i][ryt])
            ryt -= 1

            #bottom (ryt - left)
            if top <= bottom:
                for i in range(ryt,left - 1,-1):
                    ans.append(matrix[bottom][i])
                bottom -= 1

            #left (bottom - top)    
            if left <= ryt:
                for i in range(bottom,top - 1,-1):
                    ans.append(matrix[i][left])
                left += 1
        return ans