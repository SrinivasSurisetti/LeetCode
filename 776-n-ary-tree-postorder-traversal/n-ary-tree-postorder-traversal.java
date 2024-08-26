/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        solve(root,ans);
        return ans;
    }
    public void solve(Node root,List<Integer> ans){
        for(Node node : root.children){
            solve(node,ans);
        }
        ans.add(root.val);
    }
}