package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readyChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readyChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

            System.out.print("Do you want to continue? (yes/no): ");
            String userResponse = sc.nextLine().trim().toLowerCase();
            if (userResponse.equals("no")) {
                break;
            }
        }

        sc.close();
    }
}
