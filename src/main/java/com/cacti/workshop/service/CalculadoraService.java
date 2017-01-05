package com.cacti.workshop.service;


import org.springframework.stereotype.Service;

/**
 * Created by desarrollo on 05/01/17.
 */
@Service
public class CalculadoraService {

    public Integer sum(Integer ope1, Integer ope2) {
        return ope1 + ope2;
    }

    public Integer subs(Integer ope1, Integer ope2) {
        return  ope1 - ope2;
    }

    public Integer mult(Integer ope1, Integer ope2) {
        return  ope1 * ope2;
    }
}
