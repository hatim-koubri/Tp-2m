package com.demo.presentation;

import com.demo.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationProfil {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext contexte = new AnnotationConfigApplicationContext();
        contexte.getEnvironment().setActiveProfiles("dev");
        contexte.register(ProfilConfiguration.class);
        contexte.refresh();

        try (contexte) {
            IMetier calculateur = contexte.getBean("metierProfil", IMetier.class);
            System.out.println("Résultat avec le profil dev = " + calculateur.calcul());
        }
    }
}
