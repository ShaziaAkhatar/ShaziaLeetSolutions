class Solution {
    public boolean isValidSudoku(char[][] board) {
       Set<String> s = new HashSet<>();
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]!='.') {
						String row="row"+i+board[i][j];
						String col="column" +j +board[i][j];
						String box="box" +(i/3*3 +j/3) +board[i][j];
						
						if(!s.contains(row)&& !s.contains(col) && !s.contains(box)) {
							s.add(row);
							s.add(col);
							s.add(box);
						}else {
							return false;
						}
				}
				
			}
		}
		return true ;
        
    }
}