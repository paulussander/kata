package be.sander.kata.marsrover;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static be.sander.kata.marsrover.Direction.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class DirectionTest {

    @Test
    public void left() {
        assertThat(NORTH.left()).isEqualTo(WEST);
        assertThat(WEST.left()).isEqualTo(SOUTH);
        assertThat(SOUTH.left()).isEqualTo(EAST);
        assertThat(EAST.left()).isEqualTo(NORTH);
    }

    @Test
    public void right() {
        assertThat(NORTH.right()).isEqualTo(EAST);
        assertThat(EAST.right()).isEqualTo(SOUTH);
        assertThat(SOUTH.right()).isEqualTo(WEST);
        assertThat(WEST.right()).isEqualTo(NORTH);
    }
}