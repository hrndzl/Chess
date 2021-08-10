package com.hrndzl.chess;

public class Game {
    Board gameBoard = new Board();
    public void generateBlackPawns() {
        for (int i = 0; i<8;i++) {
            Pawn blackPawns = new Pawn("Pawn", gameBoard.board[6][i], "black");
        }
    }

    public void generateWhitePawns() {
        for (int i = 0; i<8;i++) {
            Pawn blackPawns = new Pawn("Pawn", gameBoard.board[2][i], "white");
        }
    }
}