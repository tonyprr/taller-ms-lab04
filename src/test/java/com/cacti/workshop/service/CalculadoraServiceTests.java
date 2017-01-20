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

    @Test
    public void test_subs() {
        CalculadoraService service = new CalculadoraService();

        assertEquals("La resta de 2 con 1 debe ser 1", Integer.valueOf(1), service.subs(2, 1));
    }

    @Test
    public void test_mult() {
        CalculadoraService service = new CalculadoraService();

        assertEquals("La multiplicación de 3 x 2 debe ser 6", Integer.valueOf(6), service.mult(3, 2));
    }

}
