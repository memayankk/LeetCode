class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int currentArrowPosition = points[0][1];

        for (int[] balloon : points) {
            if (balloon[0] > currentArrowPosition) {
                arrows++; 
                currentArrowPosition = balloon[1]; 
            }
        }

        return arrows;
    }
}