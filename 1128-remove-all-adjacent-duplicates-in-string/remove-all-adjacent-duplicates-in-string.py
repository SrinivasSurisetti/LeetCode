class Solution:
    def removeDuplicates(self, s: str) -> str:
        st = []
        for i in s:
            if st and st[-1] == i: #checking that st is not empty
                st.pop()
            else:
                st.append(i)
        return ''.join(st)