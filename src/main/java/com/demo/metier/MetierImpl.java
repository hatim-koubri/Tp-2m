package com.demo.metier;

import com.demo.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao source;

    // Spring choisit le DAO principal grâce à @Primary.
    @Autowired
    public void setDao(IDao source) {
        this.source = source;
    }

    @Override
    public double calcul() {
        if (source == null) {
            throw new IllegalStateException("La source de données n'a pas été injectée.");
        }

        double valeur = source.getValue();
        double resultat = valeur * 2;
        System.out.println("[METIER principal] Calcul terminé : " + resultat);
        return resultat;
    }
}
