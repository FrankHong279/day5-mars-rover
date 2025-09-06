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
                if (direction.equals(NORTH)) {
                    position.setY(position.getY() + 1);
                } else if (direction.equals(EAST)) {
                    position.setX(position.getX() + 1);
                } else if (direction.equals(SOUTH)) {
                    position.setY(position.getY() - 1);
                } else if (direction.equals(WEST)) {
                    position.setX(position.getX() - 1);
                }
                break;
            case RIGHT:
                if (direction.equals(NORTH)) {
                    position.setDirection(EAST);
                } else if (direction.equals(EAST)) {
                    position.setDirection(SOUTH);
                } else if (direction.equals(SOUTH)) {
                    position.setDirection(WEST);
                } else if (direction.equals(WEST)) {
                    position.setDirection(NORTH);
                }
                break;
            case LEFT:
                if (direction.equals(NORTH)) {
                    position.setDirection(WEST);
                } else if (direction.equals(WEST)) {
                    position.setDirection(SOUTH);
                } else if (direction.equals(SOUTH)) {
                    position.setDirection(EAST);
                } else if (direction.equals(EAST)) {
                    position.setDirection(NORTH);
                }
                break;
        }
        return position;
    }
}
