class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> dislas = new HashMap<>();
        for (int num : nums) {
            if (dislas.containsKey(num) && dislas.get(num) >= 1)
                return true;
            dislas.put(num, dislas.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}