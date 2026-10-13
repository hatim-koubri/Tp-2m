package com.demo.metier;

import com.demo.dao.IDao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetierImplTest {

    @Test
    public void calculDoubleLaValeurFournieParLeDao() {
        IDao sourceTest = () -> 10.0;
        MetierImpl calculateur = new MetierImpl();
        calculateur.setDao(sourceTest);

        assertEquals(20.0, calculateur.calcul(), 0.001);
    }
}
