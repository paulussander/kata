package be.sander.kata.marsrover;

import static be.sander.kata.marsrover.Direction.NORTH;
import static be.sander.kata.marsrover.Position.Builder.position;

public class Rover {

    private Position position;

    public Rover() {
        this.position = position().build();
    }

    public Position getPosition() {
        return this.position;
    }

    public Direction getDirection() {
        return NORTH;
    }

    public void moveForward() {
        this.position = this.position.moveUp();
    }
}
