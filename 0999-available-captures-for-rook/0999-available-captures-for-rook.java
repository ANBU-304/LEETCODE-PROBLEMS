class Solution {
    public int numRookCaptures(char[][] board) {
        int a = 0, b = 0;

        outer:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    a = i;
                    b = j;
                    break outer;
                }
            }
        }

        int count = 0;

      
        for (int i = b - 1; i >= 0; i--) {
            if (board[a][i] == 'B') break;
            if (board[a][i] == 'p') {
                count++;
                break;
            }
        }

      
        for (int i = b + 1; i < board[0].length; i++) {
            if (board[a][i] == 'B') break;
            if (board[a][i] == 'p') {
                count++;
                break;
            }
        }

      
        for (int i = a - 1; i >= 0; i--) {
            if (board[i][b] == 'B') break;
            if (board[i][b] == 'p') {
                count++;
                break;
            }
        }

      
        for (int i = a + 1; i < board.length; i++) {
            if (board[i][b] == 'B') break;
            if (board[i][b] == 'p') {
                count++;
                break;
            }
        }

        return count;
    }
}