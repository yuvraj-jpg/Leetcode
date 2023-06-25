class Solution {
    public boolean searchMatrix(int[][] arr, int k) {
        
        /*
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==k){
                    return true;
                }
            }
        }
        return false;
        */

        
        int i=0;
        int j= arr[0].length-1;
        if(arr[i][j]==k){
            return true;
        }
        while(i<arr.length && j>=0){
            if(arr[i][j]==k){
                return true;
            }
            else if(arr[i][j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
        
    }
}