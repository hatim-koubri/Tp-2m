package com.demo.presentation;

import com.demo.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demo.dao", "com.demo.metier"})
public class Presentation2 {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext contexte =
                     new AnnotationConfigApplicationContext(Presentation2.class)) {

            IMetier calculPrincipal = (IMetier) contexte.getBean("metier");
            System.out.println("Résultat avec le DAO principal = " + calculPrincipal.calcul());

            IMetier calculAlternatif = (IMetier) contexte.getBean("metierAlternatif");
            System.out.println("Résultat avec @Qualifier = " + calculAlternatif.calcul());
        }
    }
}
