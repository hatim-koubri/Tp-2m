package com.demo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("daoPrincipal")
@Primary
public class DaoImpl implements IDao {

    @Override
    public double getValue() {
        System.out.println("[DAO principal] Valeur récupérée : 100.0");
        return 100.0;
    }
}
