package com.sqli.marsrover;

import static com.sqli.marsrover.Command.BACKWARD;
import static com.sqli.marsrover.Command.FORWARD;
import static com.sqli.marsrover.Direction.*;

record Rover(int x, int y, Direction direction) {
    Rover moveByCommand(Command command) {
        int x1 = this.x();
        int y1 = this.y();

        if (toEast(command)) {
            x1++;
        }

        if (toWest(command)) {
            x1--;
        }

        if (toSouth(command)) {
            y1--;
        }

        if (toNorth(command)) {
            y1++;
        }

        return new Rover(x1, y1, direction);
    }

    private boolean toNorth(Command command) {
        return (command == FORWARD && direction == NORTH) || command == BACKWARD && direction == SOUTH;
    }

    private boolean toSouth(Command command) {
        return (command == FORWARD && direction == SOUTH) || command == BACKWARD && direction == NORTH;
    }

    private boolean toWest(Command command) {
        return (command == FORWARD && direction == WEST) || command == BACKWARD && direction == EAST;
    }

    private boolean toEast(Command command) {
        return (command == BACKWARD && direction == WEST) || command == FORWARD && direction == EAST;
    }

}

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

enum Command {
    FORWARD,
    BACKWARD
}