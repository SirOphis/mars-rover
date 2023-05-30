package com.sqli.marsrover;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.sqli.marsrover.Command.BACKWARD;
import static com.sqli.marsrover.Command.FORWARD;
import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @ParameterizedTest(name = "from x: {0} Y: {1} direction {2} command {3} to {4}")
    @CsvSource({
            "1,2,WEST,0,2,WEST",
            "2,2,WEST,1,2,WEST",
            "2,1,WEST,1,1,WEST",
            "10,-5,NORTH,10,-4,NORTH",
            "-4,7,SOUTH,-4,6,SOUTH",
            "7,-2,EAST,8,-2,EAST",
    })
    void moveForwardTest(int x, int y, Direction direction, int newX, int newY, Direction newDir) {
        Rover rover = new Rover(x, y, direction);
        Rover result = FORWARD.move(rover);
        assertThat(result).isEqualTo(new Rover(newX, newY, newDir));
    }

    @ParameterizedTest(name = "from x: {0} Y: {1} direction {2} command {3} to {4}")
    @CsvSource({
            "1,2,WEST,2,2,WEST",
            "2,2,WEST,3,2,WEST",
            "2,1,WEST,3,1,WEST",
            "10,-5,NORTH,10,-6,NORTH",
            "-4,7,SOUTH,-4,8,SOUTH",
            "7,-2,EAST,6,-2,EAST",
    })

    void moveBackwardTest(int x, int y, Direction direction, int newX, int newY, Direction newDir) {
        Rover rover = new Rover(x, y, direction);
        Rover result = BACKWARD.move(rover);
        assertThat(result).isEqualTo(new Rover(newX, newY, newDir));
    }
}