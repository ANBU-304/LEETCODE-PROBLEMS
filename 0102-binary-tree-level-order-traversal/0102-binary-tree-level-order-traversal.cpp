/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
int depth(TreeNode* r){
    if(!r){
        return 0;
    }
    return 1+max(depth(r->left),depth(r->right));
}
void helper(TreeNode* r,vector<vector<int>>& temp,int i){
    if(!r){
        return;
    }
    helper(r->left,temp,i+1);
    temp[i].push_back(r->val);
    helper(r->right,temp,i+1);
}
    vector<vector<int>> levelOrder(TreeNode* root) {
        int h=depth(root);
        vector<vector<int>>temp(h);
        helper(root,temp,0);
        return temp;
    }
};