package com.demo.metier;

import com.demo.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metierAlternatif")
public class MetierAlternatif implements IMetier {

    private final IDao sourceChoisie;

    @Autowired
    public MetierAlternatif(@Qualifier("daoAlternative") IDao sourceChoisie) {
        this.sourceChoisie = sourceChoisie;
    }

    @Override
    public double calcul() {
        double resultat = sourceChoisie.getValue() * 2;
        System.out.println("[METIER avec @Qualifier] Calcul terminé : " + resultat);
        return resultat;
    }
}
