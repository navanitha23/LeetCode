class Solution {
    public void duplicateZeros(int[] arr) {
          for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                int n = arr.length;
                for(int j = n-1 ; j>i ; j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}