class Solution {
    public void rotate(int[][] matrix) {
        
        int row=matrix.length;
        int column=matrix[0].length;
       for(int i=0;i<row-1;i++){
        for(int j=i+1;j<row;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       }

       for(int i=0;i<row;i++){
        reverse(matrix[i]);
       }
    }

   void reverse(int[] m){
        int start=0;
        int end=m.length-1;
        while(start<end){
            int temp=m[start];
            m[start]=m[end];
            m[end]=temp;
            start++;
            end--;
        }
    }
}