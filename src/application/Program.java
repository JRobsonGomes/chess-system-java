package application;

import chess.ChessMatch;

public class Program {
    public static void main(String[] args) throws Exception {
        ChessMatch chessMath = new ChessMatch();
        UI.printBoard(chessMath.getPieces());
    }
}
