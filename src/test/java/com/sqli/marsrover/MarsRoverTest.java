package com.sqli.marsrover;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {
    @ParameterizedTest(name = "from x: {0} Y: {1} direction {2} command {3} to {4}")
    @CsvSource({
            "1,2,W,0,2,W",
            "2,2,W,1,2,W",
            "2,1,W,1,1,W",
            "10,-5,N,10,-4,N",
            "-4,7,S,-4,6,S",
            "7,-2,E,8,-2,E",
    })

    void moveForwardTest(int x, int y, char direction, int newX, int newY, char newDir) {
        Rover rover = new Rover(x, y, direction);
        Rover result = rover.moveForward();
        assertThat(result).isEqualTo(new Rover(newX, newY, newDir));
    }
}



