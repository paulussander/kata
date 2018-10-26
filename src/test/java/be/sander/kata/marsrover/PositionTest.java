package be.sander.kata.marsrover;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static be.sander.kata.marsrover.Position.*;
import static be.sander.kata.marsrover.Position.Builder.*;
import static be.sander.kata.marsrover.Position.Builder.position;
import static org.assertj.core.api.Assertions.*;

public class PositionTest {

    @Test
    public void constructor_initializesOnX0AndY0() {
        Position position = position().build();
        assertThat(position.getXCoordinate()).isEqualTo(0);
        assertThat(position.getYCoordinate()).isEqualTo(0);
    }

    @Test
    public void constructor_givenXAndYCoordinate_initializesWithGivenXCoordinates() {
        Position position = position(3,7);
        assertThat(position.getXCoordinate()).isEqualTo(3);
        assertThat(position.getYCoordinate()).isEqualTo(7);
    }

    @Test
    public void HOME_initializesOnX0AndY0() {
        Position position = HOME;
        assertThat(position.getXCoordinate()).isEqualTo(0);
        assertThat(position.getYCoordinate()).isEqualTo(0);
    }

    @Test
    public void moveUp_addsOneToTheYCoordinate(){
        Position position = position(0,0);

        position = position.moveUp();

        assertThat(position).isEqualTo(position(0,1));
    }

    @Test
    public void moveUp_whenCalledMultipleTimes_addsOneToTheYCoordinateForEachCall(){
        Position position = position(0,0);

        position = position.moveUp();
        position = position.moveUp();
        position = position.moveUp();

        assertThat(position).isEqualTo(position(0,3));
    }
}