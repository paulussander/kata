package be.sander.kata.marsrover;

import java.util.Objects;

import static be.sander.kata.marsrover.Position.Builder.position;

public class Position {

    public static final Position HOME = new Position(0,0);

    private final int x;
    private final int y;

    private Position() {
        this.x = 0;
        this.y = 0;
    }

    private Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXCoordinate() {
        return x;
    }

    public int getYCoordinate() {
        return y;
    }

    public Position moveUp() {
        return position(x, y +1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Position position = (Position) o;

        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static class Builder {
        private Position position;

        private Builder(){
            this.position = new Position();
        }

        public static Builder position(){
            return new Builder();
        }

        public static Position position(int x, int y){
            return new Position(x, y);
        }

        public Position build(){
            return position;
        }
    }
}
