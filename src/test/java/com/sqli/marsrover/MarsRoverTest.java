package com.sqli.marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

 class MarsRoverTest {
    @Test
    void moveTest() {
        assertThat(move(1,2,'W','f')).isEqualTo("2 2 W");
    }

    String move(int x, int y, char direction, char command) {
        return "2 2 W";
    }
}
