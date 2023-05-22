package com.sqli.marsrover;

record Rover(int x, int y, char direction) {
    Rover moveForward() {
        return new Rover(x() + 1, y(), 'W');
    }
}
