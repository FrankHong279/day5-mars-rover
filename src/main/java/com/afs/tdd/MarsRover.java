package com.afs.tdd;

/**
 * @author HONGFR
 * @version 1.0
 * @date 9/5/2025 3:12 PM
 */
public class MarsRover {
    public CarLocation report(CarLocation carLocation, String command) {
        String direction = carLocation.getDirection();
        if (command.equals("M")) {
            if (direction.equals("N")) {
                carLocation.setY(carLocation.getY()+1);
            }else if (direction.equals("E")) {
                carLocation.setX(carLocation.getX()+1);
            }else if (direction.equals("S")) {
                carLocation.setY(carLocation.getY()-1);
            }
        }
        return carLocation;
    }
}
