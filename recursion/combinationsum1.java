package recursion;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combino(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }

    private void combino(int[] candidates, int t, List<Integer> curr, List<List<Integer>> result, int start) {
        if (t == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (t - candidates[i] >= 0) {
                curr.add(candidates[i]);
                combino(candidates, t - candidates[i], curr, result, i);
                curr.remove(curr.size() - 1);
            }
}
}
}v