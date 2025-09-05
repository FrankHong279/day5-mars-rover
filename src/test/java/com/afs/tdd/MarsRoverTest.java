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
}
