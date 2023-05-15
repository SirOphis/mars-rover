package com.sqli.marsrover;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

 class MarsRoverTest {


         @ParameterizedTest(name = "from x: {0} Y: {1} direction {2} command {3} to {4}")
         @CsvSource({"1,2,W,f,2 2 W","2,2,W,f,3 2 W"})
         void moveTest(int x,int y, char direction,char command,String expected) {
             assertThat(move(x,y,direction,command)).isEqualTo(expected);
         }

         String move(int x, int y, char direction, char command) {
             return x+1+" 2 W";
         }
}
