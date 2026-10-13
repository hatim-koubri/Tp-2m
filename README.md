## Captures des résultats

### 1. Injection par annotations et choix avec `@Qualifier`

Le DAO principal retourne `100.0` et le résultat métier est `200.0`. Avec `@Qualifier`, le DAO alternatif retourne `150.0` et le résultat est `300.0`.

![Exécution avec les annotations et Qualifier](../img/tp2/1.png)

### 2. Sélection d'une implémentation avec un profil Spring

Le profil `dev` sélectionne la source de données de développement. Le calcul affiche `300.0`.

![Exécution du profil dev](../img/tp2/2.png)

### 3. Configuration Spring par XML

La configuration `applicationContext.xml` sélectionne le DAO alternatif. Le résultat affiché est `300.0`.

![Exécution avec la configuration XML](../img/tp2/3.png)

### 4. Test unitaire de la couche métier

Le test vérifie qu’une valeur fournie par le DAO est bien multipliée par deux. Le résultat attendu est `20.0` et le test réussit.

<img width="1441" height="857" alt="4" src="https://github.com/user-attachments/assets/700a521e-00bc-4be0-bec3-55b79450f662" />


