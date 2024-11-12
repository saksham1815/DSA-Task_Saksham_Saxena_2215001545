package recursion;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subso(curr, result, nums, 0);
        return result;
    }

    public static void subso(List<Integer> curr, List<List<Integer>> result, int[] nums, int idx) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        subso(curr, result, nums, idx + 1);

        curr.add(nums[idx]);
        subso(curr, result, nums, idx + 1);

        curr.remove(curr.size() - 1);
    }
}
