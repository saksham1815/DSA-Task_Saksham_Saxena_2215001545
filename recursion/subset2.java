package recursion;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subso(curr, result, nums, 0);
        return result;
    }

    public static void subso(List<Integer> curr, List<List<Integer>> result, int[] nums, int idx) {
        result.add(new ArrayList<>(curr));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1])
                continue;
            curr.add(nums[i]);
            subso(curr, result, nums, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
