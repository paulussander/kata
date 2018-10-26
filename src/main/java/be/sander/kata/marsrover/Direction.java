package be.sander.kata.marsrover;

public enum Direction {
    NORTH(WEST, EAST),
    WEST(SOUTH, NORTH),
    SOUTH(EAST, WEST),
    EAST(NORTH, SOUTH);

    private final Direction left;
    private final Direction right;

    Direction(Direction left, Direction right){
        this.left = left;
        this.right = right;
    }

    public Direction left() {
        return this.left;
    }

    public Direction right() {
        return right;
    }
}
