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

    public CarLocation report(CarLocation carLocation, String command) {
        String direction = carLocation.getDirection();
        switch (command) {
            case MOVE:
                if (direction.equals(NORTH)) {
                    carLocation.setY(carLocation.getY() + 1);
                } else if (direction.equals(EAST)) {
                    carLocation.setX(carLocation.getX() + 1);
                } else if (direction.equals(SOUTH)) {
                    carLocation.setY(carLocation.getY() - 1);
                } else if (direction.equals(WEST)) {
                    carLocation.setX(carLocation.getX() - 1);
                }
                break;
            case RIGHT:
                if (direction.equals(NORTH)) {
                    carLocation.setDirection(EAST);
                } else if (direction.equals(EAST)) {
                    carLocation.setDirection(SOUTH);
                } else if (direction.equals(SOUTH)) {
                    carLocation.setDirection(WEST);
                } else if (direction.equals(WEST)) {
                    carLocation.setDirection(NORTH);
                }
                break;
            case LEFT:
                if (direction.equals(NORTH)) {
                    carLocation.setDirection(WEST);
                } else if (direction.equals(WEST)) {
                    carLocation.setDirection(SOUTH);
                } else if (direction.equals(SOUTH)) {
                    carLocation.setDirection(EAST);
                } else if (direction.equals(EAST)) {
                    carLocation.setDirection(NORTH);
                }
                break;
        }
        return carLocation;
    }
}
