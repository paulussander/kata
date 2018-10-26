package be.sander.kata.marsrover;

import org.junit.Test;

import static be.sander.kata.marsrover.Position.Builder.position;
import static org.assertj.core.api.Assertions.*;

public class RoverTest {

    @Test
    public void constructor_startsOnHomePosition(){
        Rover rover = new Rover();

        assertThat(rover.getPosition()).isEqualTo(Position.HOME);
        assertThat(rover.getDirection()).isEqualTo(Direction.NORTH);
    }

    @Test
    public void moveForward_givenFacingNorth_AddsOneToTheYPosition(){
        Rover rover = new Rover();

        rover.moveForward();

        assertThat(rover.getPosition()).isEqualTo(position(0,1));
        assertThat(rover.getDirection()).isEqualTo(Direction.NORTH);
    }

    @Test
    public void moveForwardMultipleTimes_givenFacingNorth_AddsOneToTheYPositionPerForwardMove(){
        Rover rover = new Rover();

        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();

        assertThat(rover.getPosition()).isEqualTo(position(0,5));
        assertThat(rover.getDirection()).isEqualTo(Direction.NORTH);
    }
}