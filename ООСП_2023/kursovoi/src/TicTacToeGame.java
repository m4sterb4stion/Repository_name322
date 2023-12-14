import java.util.Scanner;

class TicTacToeGame extends GameBoard {
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            draw();
            System.out.println("Ход игрока " + currentPlayerSymbol);
            System.out.print("Введите номер строки (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Введите номер столбца (0-2): ");
            int col = scanner.nextInt();

            if (makeMove(row, col)) {
                if (isGameOver()) {
                    draw();
                    System.out.println("Игрок " + currentPlayerSymbol + " победил!");
                    gameOver = true;
                } else if (isBoardFull()) {
                    draw();
                    System.out.println("Ничья!");
                    gameOver = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Некорректный ход! Попробуйте еще раз.");
            }
        }

        scanner.close();
    }
}