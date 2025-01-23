public class Battleship {
    private String[][] board; // 2D array for the board
    private int turns;        // Number of turns remaining
    
    // Constructor
    public Battleship() {
    
        turns = 10;              // Set initial turns to 10
       
        // Initialize the board with "-"
        board = {{1} };

        placeShips(); // Call method to place ships
    }
    
    // Method to print the board (provided to students)
    public void printBoard() {
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
    // Students must implement this method
    private void placeShips() {
        // Place ships randomly without overlap
    }
    
    // Students must implement this method
    public String takeTurn(int row, int col) {
        // Handle the player's turn and return "Hit", "Miss", or "Invalid"
        return "";
    }
    
    // Getter for the number of turns
    public int getTurns() {
        return turns;
    }
}
