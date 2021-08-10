package com.hrndzl.chess;

public class Board {
    String [][] board = new String[8][8];
    String letters[] = new String[]{"A","B","C","D","E","F","G","H"};
    String numbers[] = new String[]{"8","7","6","5","4","3","2","1"};
    public Board() {
        for(int i = 0; i<board.length;i++) {
            for(int j = 0; i<board[i].length;i++) {
                board[i][j] = letters[j]+numbers[i];
            }
        }
    }
}
