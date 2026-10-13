package com.demo.dao;

import org.springframework.stereotype.Component;

@Component("daoAlternative")
public class DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("[DAO alternatif] Valeur récupérée : 150.0");
        return 150.0;
    }
}
