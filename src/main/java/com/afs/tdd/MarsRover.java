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
            }else if (direction.equals("W")) {
                carLocation.setX(carLocation.getX()-1);
            }
        }else if (command.equals("R")) {
            if (direction.equals("N")) {
                carLocation.setDirection("E");
            } else if (direction.equals("E")) {
                carLocation.setDirection("S");
            }else if (direction.equals("S")) {
                carLocation.setDirection("W");
            }else if (direction.equals("W")) {
                carLocation.setDirection("N");
            }
        }else if (command.equals("L")) {
            if (direction.equals("N")) {
                carLocation.setDirection("W");
            }else if (direction.equals("W")) {
                carLocation.setDirection("S");
            }else if (direction.equals("S")) {
                carLocation.setDirection("E");
            }
        }
        return carLocation;
    }
}
