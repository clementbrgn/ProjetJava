-- Insertion des données de test

-- Centre de tri
INSERT INTO centre_tri (id, nom, adresse) VALUES
('CT1', 'Centre de Tri Paris', '123 Rue de Paris');

-- Poubelles intelligentes
INSERT INTO poubelle_intelligente (id, capacite_max, emplacement, type_poubelle, centre_tri_id) VALUES
('P1', 100.0, 'Rue de la Paix', 'VERTE', 'CT1'),
('P2', 100.0, 'Rue de la Paix', 'JAUNE', 'CT1'),
('P3', 100.0, 'Rue de la Paix', 'BLEUE', 'CT1'),
('P4', 100.0, 'Rue de la Paix', 'CLASSIQUE', 'CT1');

-- Utilisateurs
INSERT INTO utilisateur (id, nom, prenom, email, points_fidelite) VALUES
('U1', 'Dupont', 'Jean', 'jean.dupont@email.com', 0),
('U2', 'Martin', 'Marie', 'marie.martin@email.com', 0),
('U3', 'Bernard', 'Pierre', 'pierre.bernard@email.com', 0);

-- Déchets
INSERT INTO dechet (id, type_dechet, poids) VALUES
('D1', 'VERRE', 2.0),
('D2', 'PLASTIQUE', 1.0),
('D3', 'CARTON', 0.5),
('D4', 'METAL', 0.3);

-- Commerces
INSERT INTO commerce (id, nom) VALUES
('C1', 'SuperMarché'),
('C2', 'Magasin Bio'),
('C3', 'Boutique Écologique');

-- Catégories de produits
INSERT INTO categorie_produit (id, nom, description) VALUES
('CP1', 'ALIMENTAIRE', 'Produits alimentaires'),
('CP2', 'HYGIENE', 'Produits d''hygiène'),
('CP3', 'MENAGER', 'Produits ménagers'),
('CP4', 'LOISIRS', 'Loisirs et divertissement');

-- Associations commerce-catégorie
INSERT INTO commerce_categorie (commerce_id, categorie_id) VALUES
('C1', 'CP1'),
('C1', 'CP2'),
('C1', 'CP3'),
('C2', 'CP1'),
('C2', 'CP2'),
('C3', 'CP1'),
('C3', 'CP2'),
('C3', 'CP3'),
('C3', 'CP4');

-- Contrats de partenariat
INSERT INTO contrat_partenariat (id, commerce_id, date_debut, date_fin) VALUES
('CTP1', 'C1', '2024-01-01', '2024-12-31'),
('CTP2', 'C2', '2024-01-01', '2024-12-31'),
('CTP3', 'C3', '2024-01-01', '2024-12-31');

-- Règles de points
INSERT INTO regle_points (id, contrat_id, points_necessaires, pourcentage_reduction, categorie_id) VALUES
('RP1', 'CTP1', 500, 5.0, 'CP1'),
('RP2', 'CTP1', 1000, 10.0, 'CP2'),
('RP3', 'CTP2', 300, 5.0, 'CP1'),
('RP4', 'CTP3', 800, 15.0, 'CP1'),
('RP5', 'CTP3', 1200, 20.0, 'CP4'); 