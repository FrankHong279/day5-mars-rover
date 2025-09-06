package com.afs.tdd;

import java.util.Map;
import java.util.HashMap;

/**
 * Factory class for direction mappings and movement calculations
 */
public class DirectionFactory {

    private static final Map<String, String> RIGHT_TURN = new HashMap<>();
    private static final Map<String, String> LEFT_TURN = new HashMap<>();
    private static final Map<String, int[]> MOVE_FORWARD = new HashMap<>();

    static {
        // Right turn mappings
        RIGHT_TURN.put(MarsRover.NORTH, MarsRover.EAST);
        RIGHT_TURN.put(MarsRover.EAST, MarsRover.SOUTH);
        RIGHT_TURN.put(MarsRover.SOUTH, MarsRover.WEST);
        RIGHT_TURN.put(MarsRover.WEST, MarsRover.NORTH);

        // Left turn mappings
        LEFT_TURN.put(MarsRover.NORTH, MarsRover.WEST);
        LEFT_TURN.put(MarsRover.WEST, MarsRover.SOUTH);
        LEFT_TURN.put(MarsRover.SOUTH, MarsRover.EAST);
        LEFT_TURN.put(MarsRover.EAST, MarsRover.NORTH);

        // Movement deltas [x, y]
        MOVE_FORWARD.put(MarsRover.NORTH, new int[]{0, 1});
        MOVE_FORWARD.put(MarsRover.EAST, new int[]{1, 0});
        MOVE_FORWARD.put(MarsRover.SOUTH, new int[]{0, -1});
        MOVE_FORWARD.put(MarsRover.WEST, new int[]{-1, 0});
    }

    public static String turnRight(String direction) {
        return RIGHT_TURN.get(direction);
    }

    public static String turnLeft(String direction) {
        return LEFT_TURN.get(direction);
    }

    public static int[] getMoveDistance(String direction) {
        return MOVE_FORWARD.get(direction);
    }
}

