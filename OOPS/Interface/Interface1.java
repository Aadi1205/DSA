package OOPS.Interface;

public class Interface1 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves(); //by default public and abstract
}

class Queen implements ChessPlayer {
    public void moves() { // it is necessary to write public keyword
        System.out.println("up, down, right, left, diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() { // it is necessary to write public keyword
        System.out.println("up, down, right, left");
    }
}

class King implements ChessPlayer {
    public void moves() { // it is necessary to write public keyword
        System.out.println("up, down, right, left, diagonal (by 1 step)");
    }
}
