package com.sqli.marsrover;

enum Command {
    FORWARD{
        @Override
        Rover move(Rover rover) {
            int x = rover.x();
            int y = rover.y();

            switch (rover.direction()) {
                case EAST -> x++;
                case WEST -> x--;
                case SOUTH -> y--;
                case NORTH -> y++;
            }
            return new Rover(x, y, rover.direction());
        }
    },
    BACKWARD{
        @Override
        Rover move(Rover rover) {
            int x = rover.x();
            int y = rover.y();

            switch (rover.direction()) {
                case WEST -> x++;
                case EAST -> x--;
                case NORTH -> y--;
                case SOUTH -> y++;
            }
            return new Rover(x, y, rover.direction());
        }
    };

    abstract Rover move(Rover rover);
}
