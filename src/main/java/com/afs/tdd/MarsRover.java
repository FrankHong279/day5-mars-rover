package com.afs.tdd;

import java.util.Map;
import java.util.HashMap;

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

    private static final Map<String, String> RIGHT_TURN = new HashMap<>();
    private static final Map<String, String> LEFT_TURN = new HashMap<>();
    private static final Map<String, int[]> MOVE_FORWARD = new HashMap<>();

    static {
        RIGHT_TURN.put(NORTH, EAST);
        RIGHT_TURN.put(EAST, SOUTH);
        RIGHT_TURN.put(SOUTH, WEST);
        RIGHT_TURN.put(WEST, NORTH);

        LEFT_TURN.put(NORTH, WEST);
        LEFT_TURN.put(WEST, SOUTH);
        LEFT_TURN.put(SOUTH, EAST);
        LEFT_TURN.put(EAST, NORTH);

        MOVE_FORWARD.put(NORTH, new int[]{0, 1});
        MOVE_FORWARD.put(EAST, new int[]{1, 0});
        MOVE_FORWARD.put(SOUTH, new int[]{0, -1});
        MOVE_FORWARD.put(WEST, new int[]{-1, 0});
    }

    public Position report(Position position, String command) {
        String direction = position.getDirection();
        switch (command) {
            case MOVE:
                int[] distanceTable = MOVE_FORWARD.get(direction);
                position.setX(position.getX() + distanceTable[0]);
                position.setY(position.getY() + distanceTable[1]);
                break;
            case RIGHT:
                position.setDirection(RIGHT_TURN.get(direction));
                break;
            case LEFT:
                position.setDirection(LEFT_TURN.get(direction));
                break;
        }
        return position;
    }
}
