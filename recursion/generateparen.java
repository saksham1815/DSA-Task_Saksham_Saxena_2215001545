package recursion;

class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, 0, 0, "", result);
        return result;
    }

    public static void generateParenthesisHelper(int n, int open, int close, String current, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            generateParenthesisHelper(n, open + 1, close, current + "(", result);
        }
        if (close < open) {
            generateParenthesisHelper(n, open, close + 1, current + ")", result);
        }
    }

}