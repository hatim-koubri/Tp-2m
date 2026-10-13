package com.demo.presentation;

import com.demo.dao.IDao;
import com.demo.metier.IMetier;
import com.demo.metier.MetierImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfilConfiguration {

    @Bean
    @Profile("prod")
    public IDao sourceProduction() {
        return () -> 100.0;
    }

    @Bean
    @Profile("dev")
    public IDao sourceDeveloppement() {
        return () -> 150.0;
    }

    @Bean("metierProfil")
    public IMetier metierAvecProfil(IDao sourceActive) {
        MetierImpl calculateur = new MetierImpl();
        calculateur.setDao(sourceActive);
        return calculateur;
    }
}
