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
        CarLocation result = new CarLocation(0,1,"N");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 0, "N");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_10E_when_00E_input_M(){
        String command = "M";
        CarLocation result = new CarLocation(1,0,"E");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 0, "E");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_00S_when_01S_input_M(){
        String command = "M";
        CarLocation result = new CarLocation(0,0,"S");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 1, "S");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_00W_when_10W_input_M(){
        String command = "M";
        CarLocation result = new CarLocation(0,0,"W");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(1, 0, "W");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_00E_when_00N_input_R(){
        String command = "R";
        CarLocation result = new CarLocation(0,0,"E");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 0, "N");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_00S_when_00E_input_R(){
        String command = "R";
        CarLocation result = new CarLocation(0,0,"S");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 0, "E");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_00W_when_00S_input_R(){
        String command = "R";
        CarLocation result = new CarLocation(0,0,"W");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 0, "S");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_00N_when_00W_input_R(){
        String command = "R";
        CarLocation result = new CarLocation(0,0,"N");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 0, "W");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_00W_when_00N_input_L(){
        String command = "L";
        CarLocation result = new CarLocation(0,0,"W");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 0, "N");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }

    @Test
    public void should_return_00S_when_00W_input_L(){
        String command = "L";
        CarLocation result = new CarLocation(0,0,"S");
        MarsRover marsRover = new MarsRover();

        CarLocation carLocation = new CarLocation(0, 0, "W");

        CarLocation report = marsRover.report(carLocation, command);
        assertEquals(result.getX(),report.getX());
        assertEquals(result.getY(),report.getY());
        assertEquals(result.getDirection(),report.getDirection());
    }
}
