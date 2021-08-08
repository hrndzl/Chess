package com.hrndzl.chess;

public class Board {
    String [][] board = new String[8][8];
    String letters[] = new String[]{"A","B","C","D","E","F","G","H"};
    String numbers[] = new String[]{"1","2","3","4","5","6","7","8"};
    public Board() {
        for(int i = 0; i<=board.length-1;i++) {
            for(int j = 0; i<=board[i].length-1;i++) {
                board[i][j] = letters[i]+numbers[j];
            }
        }
    }
}
