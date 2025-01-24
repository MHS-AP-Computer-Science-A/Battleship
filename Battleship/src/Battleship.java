public class Battleship {
    // 2D array for the board
    private String[][] board; //set board here
    // Number of turns remaining
    private int turns;        
    
    // Constructor
    public Battleship() {
        turns = 10;              // Set initial turns to 10
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
