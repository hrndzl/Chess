package com.hrndzl.chess;

public class Board {

    // Attributes beginning
    private Board gameBoard = new Board();
    private Pawn[] blackPawns;
    private Pawn[] whitePawns;
    private String[][] board = new String[8][8];
    private final String letters[] = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
    private final String numbers[] = new String[]{"8", "7", "6", "5", "4", "3", "2", "1"};


    // Methods beginning
    public Board() {
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; i < numbers.length; j++) {
                board[i][j] = letters[i] + numbers[j];
            }
        }
        generatePieces();
    }

    public void generatePieces() {
        for (int i = 0; i < 8; i++) {

            blackPawns[i] = new Pawn(gameBoard.board[1][i], 1, i, "black");
            whitePawns[i] = new Pawn(gameBoard.board[6][i], 6, i, "white");
        }
        // Black Rooks
        Rook blackRook1 = new Rook(gameBoard.board[0][0], 0, 0, "black");
        Rook blackRook2 = new Rook(gameBoard.board[0][7], 0, 7, "black");

        // White Rooks
        Rook whiteRook1 = new Rook(gameBoard.board[7][0], 7, 0, "white");
        Rook whiteRook2 = new Rook(gameBoard.board[7][7], 7, 7, "white");

        // Black Knights
        Knight blackKnight1 = new Knight(gameBoard.board[0][1], 0, 1, "black");
        Knight blackKnight2 = new Knight(gameBoard.board[0][6], 0, 6, "black");

        // White Knights
        Knight whiteKnight1 = new Knight(gameBoard.board[7][1], 7, 1, "white");
        Knight whiteKnight2 = new Knight(gameBoard.board[7][6], 7, 6, "white");

        // Black Bishops
        Bishop blackBishop1 = new Bishop(gameBoard.board[0][2], 0, 2, "black");
        Bishop blackBishop2 = new Bishop(gameBoard.board[0][5], 0, 5, "black");

        // White Bishops
        Bishop whiteBishop1 = new Bishop(gameBoard.board[7][2], 7, 2, "white");
        Bishop whiteBishop2 = new Bishop(gameBoard.board[7][5], 7, 5, "white");

        // Black Queen
        Queen blackQueen = new Queen(gameBoard.board[0][4], 0, 4, "black");

        // White Queen
        Queen whiteQueen = new Queen(gameBoard.board[7][4], 7, 4, "white");

        // Black King
        King blackKing = new King(gameBoard.board[0][3], 0, 3, "black");

        // White King
        King whiteKing = new King(gameBoard.board[7][3], 7, 3, "white");
    }

    public String availableLocations(Pieces p)  {
        String availableLocation = new String();
        if (p instanceof Pawn && p.color.equals("black")) {
            p.currentRow = p.currentRow + 1;
            availableLocation = board[p.currentRow][p.currentColumn];
        }
        return availableLocation;
    }

}