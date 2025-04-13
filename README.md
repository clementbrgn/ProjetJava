# Projet Gestion de Tri Sélectif

Ce projet implémente un système de gestion de tri sélectif avec les fonctionnalités suivantes :

## Structure du projet

- `src/main/java/fr/cytech/gestiontrisellectif/` : Package principal contenant les classes métier
  - `model/` : Classes du modèle de données
  - `dao/` : Classes d'accès aux données (DAO)
  - `service/` : Services métier
  - `ui/` : Interface utilisateur
  - `Main.java` : Point d'entrée de l'application

- `src/test/java/fr/cytech/gestiontrisellectif/` : Package contenant les tests
  - `MainTest.java` : Classe principale de test

## Fonctionnalités principales

1. Gestion des centres de tri
2. Gestion des poubelles intelligentes
3. Gestion des utilisateurs (ménages)
4. Système de points de fidélité
5. Gestion des partenariats avec les commerces
6. Statistiques et prédictions

## Prérequis

- Java 21
- Maven
- MySQL
- JavaFX 21

## Installation

1. Cloner le projet
2. Créer la base de données MySQL
3. Exécuter `mvn clean install`
4. Lancer l'application avec `mvn javafx:run`

## Guide d'utilisation de Git

🔁 Quand tu as modifié ton code :
✅ 1. FAIRE UN COMMIT

    Clic droit sur le projet → Team > Commit…

    Coche tous les fichiers modifiés (ou clique sur Select All)

    Écris un message (ex : Ajout de la classe Client)

    Clique sur "Commit"

☁️ 2. ENVOYER SUR GITHUB (PUSH)

    Clic droit sur le projet → Team > Push to origin

    (ou Push to Upstream si c'est ce que tu vois)

    ✅ C'est envoyé ! Tu peux vérifier sur GitHub !
