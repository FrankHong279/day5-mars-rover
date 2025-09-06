package com.afs.tdd;

/**
 * @author HONGFR
 * @version 1.0
 * @date 9/5/2025 3:12 PM
 */
public class MarsRover {

    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    public static final String MOVE = "M";
    public static final String RIGHT = "R";
    public static final String LEFT = "L";

    public Position report(Position position, String command) {
        String direction = position.getDirection();
        switch (command) {
            case MOVE:
                int[] distanceTable = DirectionFactory.getMoveDistance(direction);
                position.setX(position.getX() + distanceTable[0]);
                position.setY(position.getY() + distanceTable[1]);
                break;
            case RIGHT:
                position.setDirection(DirectionFactory.turnRight(direction));
                break;
            case LEFT:
                position.setDirection(DirectionFactory.turnLeft(direction));
                break;
        }
        return position;
    }
}
