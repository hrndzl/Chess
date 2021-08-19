package com.hrndzl.chess;

public class Game {
    Board gameBoard = new Board();
    Pawn[] blackPawns;
    Pawn[] whitePawns;

    public void generateBlackPawns() {
        for (int i = 0; i<8;i++) {
            blackPawns[i] = new Pawn("Pawn", gameBoard.board[1][i], "black");
        }
    }

    public void generateWhitePawns() {
        for (int i = 0; i<8;i++) {
            whitePawns[i] = new Pawn("Pawn", gameBoard.board[6][i], "white");
            whitePawns[i].getLocation();
        }
    }

    public void generateBlackRooks() {
        Rook blackRook1 = new Rook("Rook", gameBoard.board[0][0], "black");
        Rook blackRook2 = new Rook("Rook", gameBoard.board[0][7], "black");
    }

    public void generateWhiteRooks() {
        Rook whiteRook1 = new Rook("Rook", gameBoard.board[7][0], "white");
        Rook whiteRook2 = new Rook("Rook", gameBoard.board[7][7], "white");
    }

    public void generateBlackKnights() {
        Knight blackKnight1 = new Knight("Knight", gameBoard.board[0][1], "black");
        Knight blackKnight2 = new Knight("Knight", gameBoard.board[0][6], "black");
    }

    public void generateWhiteKnights() {
        Knight whiteKnight1 = new Knight("Knight", gameBoard.board[7][1], "white");
        Knight whiteKnight2 = new Knight("Knight", gameBoard.board[7][6], "white");
    }

    public void generateBlackBishops() {
        Bishop blackBishop1 = new Bishop("Bishop", gameBoard.board[0][2], "black");
        Bishop blackBishop2 = new Bishop("Bishop", gameBoard.board[0][5], "black");
    }

    public void generateWhiteBishops() {
        Bishop blackBishop1 = new Bishop("Bishop", gameBoard.board[7][2], "white");
        Bishop blackBishop2 = new Bishop("Bishop", gameBoard.board[7][5], "white");
    }

    public void generateBlackQueen() {
        Queen blackQueen = new Queen("Queen", gameBoard.board[0][4], "black");
    }

    public void generateWhiteQueen() {
        Queen whiteQueen = new Queen("Queen", gameBoard.board[7][4], "white");
    }

    public void generateBlackKing() {
        King blackKing = new King("King" , gameBoard.board[0][3], "black");
    }

    public void generateWhiteKing() {
        King whiteKing = new King("King", gameBoard.board[7][3], "white");
    }
}