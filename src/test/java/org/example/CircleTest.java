package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CircleTest {

    @Test
    public void CircleAreaTest(){
        Circle circle = new Circle(5);
        assertEquals(Math.PI * 25, circle.area(), 0);
    }
}
