package com.cacti.workshop.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by desarrollo on 05/01/17.
 */
public class CalculadoraServiceTests {
    @Test
    public void test_sum() {
        CalculadoraService service = new CalculadoraService();

        assertEquals("La suma de 1 y 2 debe ser 3", Integer.valueOf(3), service.sum(1, 2));
    }
}
