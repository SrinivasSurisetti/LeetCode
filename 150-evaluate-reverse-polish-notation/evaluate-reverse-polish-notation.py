class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st = []
        for i in tokens:
            #easy to check symbol cause it's limted
            if i in "+-*/":
                top1 = st.pop()
                top2 = st.pop()
                if i == '+':
                    st.append(top1+top2)
                elif i == '-':
                    st.append(top2-top1)
                elif i== '*':
                    st.append(top1*top2)
                else:
                    st.append(int(top2/top1))
                    # int cause we -5/2 = -2.5,it should be -2(near to zero)
                    # IF WE USE -5//2 then it return -3.
            else:
                st.append(int(i))
        return st[-1]