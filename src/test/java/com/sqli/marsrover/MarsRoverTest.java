package com.sqli.marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

 class MarsRoverTest {
    @Test
    void moveTest() {
        assertThat(move()).isEqualTo("1 1 N");
    }

    String move() {
        return "1 1 N";
    }
}
