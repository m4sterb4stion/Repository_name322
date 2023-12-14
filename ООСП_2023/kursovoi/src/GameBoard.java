class GameBoard {
    protected char[][] board;
    protected char currentPlayerSymbol;

    public GameBoard() {
        board = new char[3][3];
        currentPlayerSymbol = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void draw() {
        System.out.println("Игровое поле:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col) {
        if (isValidMove(row, col)) {
            board[row][col] = currentPlayerSymbol;
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    public boolean isGameOver() {
        // Проверка на победу или ничью
        return checkRows() || checkColumns() || checkDiagonals() || isBoardFull();
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public void switchPlayer() {
        currentPlayerSymbol = (currentPlayerSymbol == 'X') ? 'O' : 'X';
    }
}