class Solution {
    static int[] xOffset = {1, 1, 1, 0, -1, -1, -1, 0};
    static int[] yOffset = {0, 1, -1, 1, 1, 0, -1, -1};
    public int solution(int[][] board) {
        int answer = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!isDanger(i, j, board)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    boolean isDanger(int x, int y, int[][] board) {
        if (board[x][y] == 1) return true;
        int xLimit = board[0].length;
        int yLimit = board.length;
        
        for (int i = 0; i < xOffset.length; i++) {
            int xIndex = x + xOffset[i];
            int yIndex = y + yOffset[i];
            if (xIndex < 0 || yIndex < 0 || xIndex >= xLimit || yIndex >= yLimit) continue;
            if (board[xIndex][yIndex] == 1) return true;
        }
        System.out.println("x: " + x + " y: " + y);
        return false; 
    }
}