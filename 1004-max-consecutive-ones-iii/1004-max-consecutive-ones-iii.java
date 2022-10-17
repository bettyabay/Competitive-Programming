class Solution {
    public int longestOnes(int[] A, int k) {
        int result = 0;
        for( int i = 0, j = 0; j < A.length; j++){
            if(A[j] == 0){
                k--;
            }
            while(k < 0){
                if(A[i] == 0){
                    k++;
                }
                i++;
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}