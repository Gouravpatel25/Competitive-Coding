/*
Given a string str, the task is to find the bracket numbers, i.e., for each bracket in str, return i if the bracket is the ith opening or closing bracket to appear in the string. 

 Examples:

Input:  str = "(aa(bdc))p(dee)"
Output: 1 2 2 1 3 3
Explanation: The highlighted brackets in
the given string (aa(bdc))p(dee) are
assigned the numbers as: 1 2 2 1 3 3.

Input:  str = "(((()("
Output: 1 2 3 4 4 5
Explanation: The highlighted brackets in
the given string (((()( are assigned
the numbers as: 1 2 3 4 4 5
*/

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count++;
                stack.push(count); 
                result.add(count); 
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    result.add(stack.pop()); 
                }
            }
        }

        return result;
    }
};
