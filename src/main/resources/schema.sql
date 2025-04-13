-- Création de la base de données
CREATE DATABASE IF NOT EXISTS gestion_tri_selectif;
USE gestion_tri_selectif;

-- Table CentreTri
CREATE TABLE IF NOT EXISTS centre_tri (
    id VARCHAR(36) PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    adresse VARCHAR(200) NOT NULL
);

-- Table PoubelleIntelligente
CREATE TABLE IF NOT EXISTS poubelle_intelligente (
    id VARCHAR(36) PRIMARY KEY,
    capacite_max DOUBLE NOT NULL,
    emplacement VARCHAR(200) NOT NULL,
    type_poubelle ENUM('VERTE', 'JAUNE', 'BLEUE', 'CLASSIQUE') NOT NULL,
    niveau_actuel DOUBLE DEFAULT 0,
    centre_tri_id VARCHAR(36),
    FOREIGN KEY (centre_tri_id) REFERENCES centre_tri(id)
);

-- Table Utilisateur
CREATE TABLE IF NOT EXISTS utilisateur (
    id VARCHAR(36) PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    prenom VARCHAR(100) NOT NULL,
    email VARCHAR(200) NOT NULL UNIQUE,
    points_fidelite INT DEFAULT 0
);

-- Table Dechet
CREATE TABLE IF NOT EXISTS dechet (
    id VARCHAR(36) PRIMARY KEY,
    type_dechet ENUM('PLASTIQUE', 'VERRE', 'CARTON', 'METAL') NOT NULL,
    poids DOUBLE NOT NULL
);

-- Table HistoriqueDepot
CREATE TABLE IF NOT EXISTS historique_depot (
    id VARCHAR(36) PRIMARY KEY,
    utilisateur_id VARCHAR(36) NOT NULL,
    poubelle_id VARCHAR(36) NOT NULL,
    dechet_id VARCHAR(36) NOT NULL,
    points_gagnes INT NOT NULL,
    date_depot DATETIME NOT NULL,
    FOREIGN KEY (utilisateur_id) REFERENCES utilisateur(id),
    FOREIGN KEY (poubelle_id) REFERENCES poubelle_intelligente(id),
    FOREIGN KEY (dechet_id) REFERENCES dechet(id)
);

-- Table Commerce
CREATE TABLE IF NOT EXISTS commerce (
    id VARCHAR(36) PRIMARY KEY,
    nom VARCHAR(100) NOT NULL
);

-- Table CategorieProduit
CREATE TABLE IF NOT EXISTS categorie_produit (
    id VARCHAR(36) PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    description VARCHAR(200)
);

-- Table Commerce_Categorie
CREATE TABLE IF NOT EXISTS commerce_categorie (
    commerce_id VARCHAR(36),
    categorie_id VARCHAR(36),
    PRIMARY KEY (commerce_id, categorie_id),
    FOREIGN KEY (commerce_id) REFERENCES commerce(id),
    FOREIGN KEY (categorie_id) REFERENCES categorie_produit(id)
);

-- Table ContratPartenariat
CREATE TABLE IF NOT EXISTS contrat_partenariat (
    id VARCHAR(36) PRIMARY KEY,
    commerce_id VARCHAR(36) NOT NULL,
    date_debut DATE NOT NULL,
    date_fin DATE NOT NULL,
    FOREIGN KEY (commerce_id) REFERENCES commerce(id)
);

-- Table ReglePoints
CREATE TABLE IF NOT EXISTS regle_points (
    id VARCHAR(36) PRIMARY KEY,
    contrat_id VARCHAR(36) NOT NULL,
    points_necessaires INT NOT NULL,
    pourcentage_reduction DOUBLE NOT NULL,
    categorie_id VARCHAR(36) NOT NULL,
    FOREIGN KEY (contrat_id) REFERENCES contrat_partenariat(id),
    FOREIGN KEY (categorie_id) REFERENCES categorie_produit(id)
); 