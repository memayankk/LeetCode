class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long individualCost = (long) need1*cost1 + (long) need2*cost2;
        long allBundleCost = (long) costBoth * Math.max(need1, need2);

        int commonNeeds = Math.min(need1, need2);
        long allCost = (long) costBoth * commonNeeds + (long) (need1- commonNeeds) * cost1 + (long) (need2- commonNeeds) * cost2;

        return Math.min(individualCost, Math.min(allBundleCost, allCost));
    }
}