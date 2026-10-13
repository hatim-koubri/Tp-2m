## Captures des résultats

### 1. Injection par annotations et choix avec `@Qualifier`

Le DAO principal retourne `100.0` et le résultat métier est `200.0`. Avec `@Qualifier`, le DAO alternatif retourne `150.0` et le résultat est `300.0`.

<img width="1320" height="770" alt="1" src="https://github.com/user-attachments/assets/6e3ddc56-5232-416b-af99-8858af38b985" />

### 2. Sélection d'une implémentation avec un profil Spring

Le profil `dev` sélectionne la source de données de développement. Le calcul affiche `300.0`.

<img width="1492" height="762" alt="2" src="https://github.com/user-attachments/assets/57d45fa7-3af0-44a1-88b4-066f5a122b35" />

### 3. Configuration Spring par XML

La configuration `applicationContext.xml` sélectionne le DAO alternatif. Le résultat affiché est `300.0`.

<img width="1425" height="800" alt="3" src="https://github.com/user-attachments/assets/39330039-22e8-4588-a0e5-290db00baa88" />

### 4. Test unitaire de la couche métier

Le test vérifie qu’une valeur fournie par le DAO est bien multipliée par deux. Le résultat attendu est `20.0` et le test réussit.

<img width="1441" height="857" alt="4" src="https://github.com/user-attachments/assets/700a521e-00bc-4be0-bec3-55b79450f662" />


