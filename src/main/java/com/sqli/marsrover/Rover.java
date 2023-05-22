package com.sqli.marsrover;

record Rover(int x, int y, char direction) {
    Rover moveForward() {
        Rover rover = new Rover(x(), y(), direction);
        rover = getRoverByDirection(rover);
        return rover;
    }

    private Rover getRoverByDirection(Rover rover) {
        switch (direction) {
            case 'W':
                rover = new Rover(x() - 1, y(), 'W');
                break;
            case 'N':
                rover = new Rover(x(), y() + 1, 'N');
                break;
            case 'S':
                rover = new Rover(x(), y() - 1, 'S');
                break;
            case 'E':
                rover = new Rover(x() + 1, y(), 'E');
                break;
            default:
                break;
        }
        return rover;
    }
}