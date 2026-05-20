class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0; r<9; r++){
            Set <Character> seen= new HashSet<>(); 
            for(int i=0; i<9; i++){
                char val=board[r][i]; 
                if(val=='.') continue; 
                if(seen.contains(val)) return false; 
                seen.add(val); 
            }
        }

        for(int c=0; c<9; c++){
            Set<Character> seen=new HashSet<>(); 
            for(int i=0; i<9; i++){
                char val=board[i][c]; 
                if(val=='.') continue; ;
                if(seen.contains(val)) return false; 
                seen.add(val); 
            }
        }

        for(int box=0; box<9; box++){
            Set <Character> seen=new HashSet<>(); 
            int sr=(box/3)*3; 
            int sc=(box%3)*3; 
            for(int r=sr; r<sr+3; r++){
                for(int c=sc; c<sc+3; c++){
                    char val=board[r][c]; 
                    if(val=='.') continue; 
                    if(seen.contains(val)) return false; 
                    seen.add(val); 
                }
            }
        }
        return true; 
        
    }
}
