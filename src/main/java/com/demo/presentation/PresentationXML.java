package com.demo.presentation;

import com.demo.metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXML {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext contexte =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            IMetier calculateur = contexte.getBean("metierXml", IMetier.class);
            System.out.println("Résultat avec la configuration XML = " + calculateur.calcul());
        }
    }
}
