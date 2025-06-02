class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stk = []
        for i in operations:
            if i=='+':
                top1 = stk[-1]
                top2 = stk[-2]
                stk.append(top1+top2)
            elif i == 'D':
                top1 = stk[-1]
                stk.append(top1*2)
            elif i == 'C':
                stk.pop()
            else:
                stk.append(int(i))
        return sum(stk)