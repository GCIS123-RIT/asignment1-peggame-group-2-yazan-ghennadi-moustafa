package peggame;


// Class representing a move in the Peg Game
public class move {
// Starting location of the move
    private location from; 
    // Destination location of the move
    private location to; 
    // Constructor to initialize the move with from and to locations
    public move(location from, location to) {
        this.from = from;
        this.to = to;
    }
    // Getter method for retrieving the  starting location of the move
    public location getFrom() {
        return from;
    }
    // Getter method for retrieving the destination location of the move
    public location getTo() {
        return to;
    }
}
