public boolean clearPair(int row, int col){
    int num = puzzle[row][col];
    for(int r = row; r<puzzle.length; r++){
        for(int c = col; c<puzzle[0].length; c++){
            if(num==puzzle[r][c]){
                puzzle[row][col]=0;
                puzzle[r][c]=0;
                return true;
            }
            if(num+puzzle[row][c]==10){
                puzzle[row][col]=0;
                puzzle[row][c]=0;
                return true;
            }
        }
    }
    return false;
}
