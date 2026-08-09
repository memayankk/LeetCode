class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            xor ^= (i + 1);
        }

        int bit = xor & -xor;

        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            if ((nums[i] & bit) != 0)
                a ^= nums[i];
            else
                b ^= nums[i];

            if (((i + 1) & bit) != 0)
                a ^= (i + 1);
            else
                b ^= (i + 1);
        }

        for (int num : nums) {
            if (num == a) {
                return new int[]{a, b};
            }
        }

        return new int[]{b, a};
    }
}