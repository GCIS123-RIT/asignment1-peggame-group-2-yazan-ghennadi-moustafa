package peggame;


// class representing a location on the peg game board
public class location {
    // row of the location
    private int row;
    // column of the location 
    private int column; 
    // constructor to initialize the location with row and column values
    public location(int row, int column) {
        this.row = row;
        this.column = column;
    }
    // Getter method for retrieving the row value
    public int getRow() {
        return row;
    }
    //getter method for retrieving the column value
    public int getCol() {
        return column;
    }
    //Method to represent the location object as a string
    @Override
    public String toString() {
        return "(" + row + ", " + column + ")";
    }
    // Method to check if two location objects are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null || getClass() != obj.getClass()) 
        return false;
        location location = (location) obj;
        return row == location.row && column == location.column;
    }
}
