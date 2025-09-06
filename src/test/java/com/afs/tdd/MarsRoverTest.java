package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author HONGFR
 * @version 1.0
 * @date 9/5/2025 3:12 PM
 */
public class MarsRoverTest {
    @Test
    public void should_return_01N_when_00N_input_M(){
        String command = "M";
        Position expectedResult = new Position(0,1,"N");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "N");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_10E_when_00E_input_M(){
        String command = "M";
        Position expectedResult = new Position(1,0,"E");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "E");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00S_when_01S_input_M(){
        String command = "M";
        Position expectedResult = new Position(0,0,"S");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 1, "S");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00W_when_10W_input_M(){
        String command = "M";
        Position expectedResult = new Position(0,0,"W");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(1, 0, "W");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00E_when_00N_input_R(){
        String command = "R";
        Position expectedResult = new Position(0,0,"E");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "N");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00S_when_00E_input_R(){
        String command = "R";
        Position expectedResult = new Position(0,0,"S");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "E");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00W_when_00S_input_R(){
        String command = "R";
        Position expectedResult = new Position(0,0,"W");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "S");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00N_when_00W_input_R(){
        String command = "R";
        Position expectedResult = new Position(0,0,"N");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "W");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00W_when_00N_input_L(){
        String command = "L";
        Position expectedResult = new Position(0,0,"W");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "N");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00S_when_00W_input_L(){
        String command = "L";
        Position expectedResult = new Position(0,0,"S");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "W");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00E_when_00S_input_L(){
        String command = "L";
        Position expectedResult = new Position(0,0,"E");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "S");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00N_when_00E_input_L(){
        String command = "L";
        Position expectedResult = new Position(0,0,"N");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 0, "E");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }

    @Test
    public void should_return_00N_when_01N_input_B(){
        String command = "B";
        Position expectedResult = new Position(0,0,"N");
        MarsRover marsRover = new MarsRover();

        Position position = new Position(0, 1, "N");

        Position actualResult = marsRover.report(position, command);
        assertEquals(expectedResult.getX(),actualResult.getX());
        assertEquals(expectedResult.getY(),actualResult.getY());
        assertEquals(expectedResult.getDirection(),actualResult.getDirection());
    }
}
