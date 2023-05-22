package com.sqli.marsrover;

record Rover(int x, int y, char direction) {
    Rover moveByCommand(char command) {
        Rover rover = new Rover(x(), y(), direction);
        rover = getRoverByDirection(rover, command);
        return rover;
    }

    private Rover getRoverByDirection(Rover rover, char command) {
        int x = rover.x;
        int y = rover.y;

        if((command == 'b' && rover.direction == 'W') || command == 'f' && rover.direction == 'E'){
            x++;
        }

        if(((command == 'f' && rover.direction == 'W') || command == 'b' && rover.direction == 'E')){
            x--;
        }

        if(((command == 'f' && rover.direction == 'S') || command == 'b' && rover.direction == 'N')){
            y--;
        }

        if(((command == 'f' && rover.direction == 'N') || command == 'b' && rover.direction == 'S')){
            y++;
        }

        return new Rover(x,y, rover.direction);
    }


}