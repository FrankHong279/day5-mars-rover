package com.afs.tdd;

import java.util.Map;
import java.util.HashMap;

public class DirectionFactory {

    private static final Map<String, String> RIGHT_TURN = new HashMap<>();
    private static final Map<String, String> LEFT_TURN = new HashMap<>();
    private static final Map<String, int[]> MOVE_FORWARD = new HashMap<>();
    private static final Map<String, int[]> MOVE_BACK = new HashMap<>();

    static {
        RIGHT_TURN.put(MarsRover.NORTH, MarsRover.EAST);
        RIGHT_TURN.put(MarsRover.EAST, MarsRover.SOUTH);
        RIGHT_TURN.put(MarsRover.SOUTH, MarsRover.WEST);
        RIGHT_TURN.put(MarsRover.WEST, MarsRover.NORTH);

        LEFT_TURN.put(MarsRover.NORTH, MarsRover.WEST);
        LEFT_TURN.put(MarsRover.WEST, MarsRover.SOUTH);
        LEFT_TURN.put(MarsRover.SOUTH, MarsRover.EAST);
        LEFT_TURN.put(MarsRover.EAST, MarsRover.NORTH);

        MOVE_FORWARD.put(MarsRover.NORTH, new int[]{0, 1});
        MOVE_FORWARD.put(MarsRover.EAST, new int[]{1, 0});
        MOVE_FORWARD.put(MarsRover.SOUTH, new int[]{0, -1});
        MOVE_FORWARD.put(MarsRover.WEST, new int[]{-1, 0});

        MOVE_BACK.put(MarsRover.NORTH, new int[]{0, -1});
        MOVE_BACK.put(MarsRover.EAST, new int[]{-1, 0});
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

    public static int[] getBackDistance(String direction) {
        return MOVE_BACK.get(direction);
    }
}

