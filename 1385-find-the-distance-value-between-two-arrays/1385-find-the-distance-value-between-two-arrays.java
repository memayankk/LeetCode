class Solution {

    private int findFastLow (int [] arr, int target){
        int start = 0;
        int end = arr.length;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distance = 0;

        for(int arr : arr1){
            int index = findFastLow(arr2, arr-d);

            if(index<0){
                index = -index - 1;
            }

            if(index < arr2.length && arr2[index]<= arr+d){
                continue;
            }
            distance++;
        }
        return distance;
    }
}