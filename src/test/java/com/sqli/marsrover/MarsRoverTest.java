package com.sqli.marsrover;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {
    @ParameterizedTest(name = "from x: {0} Y: {1} direction {2} command {3} to {4}")
    @CsvSource({
            "1,2,W,2,2,W",
            "2,2,W,3,2,W"}
    )
    void moveTest(int x, int y, char direction, int newX, int newY, char newDir) {
        Rover rover = new Rover(x, y, direction);
        Rover result = rover.moveForward();
        assertThat(result).isEqualTo(new Rover(newX, newY, newDir));
    }
}
