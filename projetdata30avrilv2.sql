--GROUPE 4
--KOHL AURELIEN
--LATRUBESSE ANTHEA



-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 01 juin 2020 à 19:22
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projetdata30avrilv2`
--

-- --------------------------------------------------------

--
-- Structure de la table `concerner`
--

DROP TABLE IF EXISTS `concerner`;
CREATE TABLE IF NOT EXISTS `concerner` (
  `identifiant_RendezVous` int(11) NOT NULL,
  `identifiant_patient` int(11) NOT NULL,
  PRIMARY KEY (`identifiant_RendezVous`,`identifiant_patient`),
  KEY `Concerner_Patient1_FK` (`identifiant_patient`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `concerner`
--

INSERT INTO `concerner` (`identifiant_RendezVous`, `identifiant_patient`) VALUES
(1, 1),
(21, 1),
(2, 2),
(11, 2),
(21, 2),
(3, 3),
(11, 3),
(4, 4),
(4, 5),
(17, 5),
(5, 6),
(21, 6),
(19, 11),
(22, 12);

-- --------------------------------------------------------

--
-- Structure de la table `consultation`
--

DROP TABLE IF EXISTS `consultation`;
CREATE TABLE IF NOT EXISTS `consultation` (
  `identifiant_Consultation` int(11) NOT NULL AUTO_INCREMENT,
  `identifiant_RendezVous` int(11) NOT NULL,
  `Date_Consultation` date DEFAULT NULL,
  `Heure_Consultation` time DEFAULT NULL,
  `Duree_Consultation` time DEFAULT NULL,
  `Notes_Consultation` text,
  `Anxiete_Consultation` int(11) DEFAULT NULL,
  `Prix_Consultation` decimal(15,3) DEFAULT NULL,
  `Paiement_Consultation` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`identifiant_Consultation`),
  UNIQUE KEY `Consultation_RendezVous0_AK` (`identifiant_RendezVous`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `consultation`
--

INSERT INTO `consultation` (`identifiant_Consultation`, `identifiant_RendezVous`, `Date_Consultation`, `Heure_Consultation`, `Duree_Consultation`, `Notes_Consultation`, `Anxiete_Consultation`, `Prix_Consultation`, `Paiement_Consultation`) VALUES
(1, 1, '2020-04-27', '10:03:00', '00:28:00', 'rien à signaler \r\n', NULL, '35.000', 'Carte bleu'),
(2, 2, '2020-04-28', '10:05:00', '00:25:00', 'stress \r\n', NULL, '35.000', 'Espece'),
(5, 19, '2020-05-31', '16:52:30', '00:00:21', 'j aime les psy ', 8, '35.000', 'Especes'),
(6, 21, '2020-06-01', '18:34:47', '00:00:04', 'retyui ', NULL, '36.000', 'Especes');

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `consultationpatient`
-- (Voir ci-dessous la vue réelle)
--
DROP VIEW IF EXISTS `consultationpatient`;
CREATE TABLE IF NOT EXISTS `consultationpatient` (
`identifiant_patient` int(11)
,`nom_patient` varchar(150)
,`prenom_patient` varchar(150)
,`identifiant_RendezVous` int(11)
,`Type_RendezVous` varchar(50)
,`Date_Consultation` date
,`Heure_Consultation` time
,`Duree_Consultation` time
,`identifiant_Consultation` int(11)
,`Notes_Consultation` text
,`Anxiete_Consultation` int(11)
,`Prix_Consultation` decimal(15,3)
,`Paiement_Consultation` varchar(50)
);

-- --------------------------------------------------------

--
-- Structure de la table `etre`
--

DROP TABLE IF EXISTS `etre`;
CREATE TABLE IF NOT EXISTS `etre` (
  `identifiant_Profession` int(11) NOT NULL,
  `identifiant_patient` int(11) NOT NULL,
  `Debut_periode` date NOT NULL,
  `Fin_periode` date DEFAULT NULL,
  PRIMARY KEY (`identifiant_Profession`,`identifiant_patient`),
  KEY `Etre_Patient1_FK` (`identifiant_patient`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `etre`
--

INSERT INTO `etre` (`identifiant_Profession`, `identifiant_patient`, `Debut_periode`, `Fin_periode`) VALUES
(1, 1, '2017-09-01', NULL),
(1, 2, '2017-09-01', NULL),
(1, 3, '2017-09-01', NULL),
(1, 4, '2017-09-01', NULL),
(1, 5, '2017-09-01', NULL),
(2, 1, '2019-07-01', '2019-08-31'),
(3, 3, '2019-07-04', '2019-08-29'),
(4, 4, '2011-07-22', NULL),
(6, 5, '2019-12-21', NULL),
(7, 2, '1999-11-07', NULL),
(12, 6, '1993-06-18', '2020-06-01'),
(13, 1, '2020-04-08', '2020-06-01');

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `identifiant_patient` int(11) NOT NULL AUTO_INCREMENT,
  `nom_patient` varchar(150) DEFAULT NULL,
  `prenom_patient` varchar(150) DEFAULT NULL,
  `datenaissance_patient` date DEFAULT NULL,
  `age_patient` int(11) DEFAULT NULL,
  `sexe_patient` varchar(50) DEFAULT NULL,
  `type_patient` varchar(50) DEFAULT NULL,
  `rue` varchar(150) DEFAULT NULL,
  `cp` varchar(5) DEFAULT NULL,
  `ville` varchar(75) DEFAULT NULL,
  `tel_patient` varchar(15) DEFAULT NULL,
  `decouverte_patient` varchar(50) DEFAULT NULL,
  `login_patient` varchar(50) DEFAULT NULL,
  `mdp_patient` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`identifiant_patient`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `patient`
--

INSERT INTO `patient` (`identifiant_patient`, `nom_patient`, `prenom_patient`, `datenaissance_patient`, `age_patient`, `sexe_patient`, `type_patient`, `rue`, `cp`, `ville`, `tel_patient`, `decouverte_patient`, `login_patient`, `mdp_patient`) VALUES
(1, 'KOHL', 'Aurélien', '2000-04-26', 20, 'Homme', 'Homme', '10 rue de la liberté', '94320', 'PARIS', '06.08.03.57.21', 'Internet', 'aurelien.kohl@efrei.net', 'e48db1b10d4dfdbca9b5e38d6c091713'),
(2, 'LATRUBESSE', 'Anthéa', '1999-11-07', 20, 'Femme', 'Femme', '15 rue massue', '94300', 'VINCENNES', '06.63.55.63.99', 'autre patient', 'anthea.latrubesse@efrei.net', '3eaefa8256f214b500ed1b547fcb89c5'),
(3, 'ESTEBAN', 'Tristan', '2005-11-29', 15, 'Homme', 'Ado', 'hamaux de la peruche', '24000', 'EVREUX', '06.83.36.61.39', 'autre patient', 'tristan.esteban@efrei.net', '898a090de9398bff31633e458a9f99b7'),
(4, 'YGORRA', 'Etienne', '1999-12-30', 20, 'Homme', 'Homme', 'maison de la fete', '78210', 'SAINT CYR L ECOLE', '06.80.04.20.60', 'autre patient', 'etienne.ygorra@efrei.net', 'ce98f808ec06a02fbc9a61543c89983f'),
(5, 'PEREZ', 'Florian', '1999-11-10', 20, 'Homme', 'Homme', 'La colocation', '95160', 'MONTMONRENCY', '06.19.19.35.69', 'autre patient', 'florian.perez@efrei.net', '56910c52ed70539e3ce0391edeb6d339'),
(6, 'CAILLARD', 'Catherine', '1966-11-19', 53, 'Femme', 'Femme', '15 rue massue', '94300', 'VINCENNES', '06.99.99.59.60', 'Page Jaune', 'catherine.caillard@gmail.com ', 'bnp'),
(10, 'KOHL', 'Zélia', '2020-11-16', 0, 'Femme', 'Enfant', '9 rue de la marette', '83000', 'Toulon', '06.77.32.99.02.', 'Bouche à Oreille', 'zelia.kohl@neoma.net ', 'c63c8a8cf59aabd53f180430a4376aab'),
(11, 'RUPCHEVA', 'Olena', '1978-02-21', 42, 'Femme', 'Femme', 'rue de marais ', '78220', 'Viroflay', '01.06.05.03.40', 'Internet', 'olena@gmail.com', '46929ec3d692ebf1607c23f53bfa566e'),
(12, 'TEST', 'Jean', '1989-06-14', 30, 'Homme', 'Homme', '12 rue des essaie', '75001', 'Paris', '01.01.01.01.01', 'Internet', 'test@test.fr', '098f6bcd4621d373cade4e832627b4f6');

-- --------------------------------------------------------

--
-- Structure de la table `profession`
--

DROP TABLE IF EXISTS `profession`;
CREATE TABLE IF NOT EXISTS `profession` (
  `identifiant_Profession` int(11) NOT NULL AUTO_INCREMENT,
  `nom_Profession` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`identifiant_Profession`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `profession`
--

INSERT INTO `profession` (`identifiant_Profession`, `nom_Profession`) VALUES
(1, 'Etudiant'),
(2, 'Vendeur'),
(3, 'Etudiant'),
(4, 'Vendeur'),
(5, 'Paysans'),
(6, 'Pro Gamer'),
(7, 'Chomeur'),
(8, 'Charo'),
(9, 'Codeur de l extreme'),
(12, 'Banquiere'),
(13, 'pro du java'),
(14, 'TESTEEE');

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `professionpatient`
-- (Voir ci-dessous la vue réelle)
--
DROP VIEW IF EXISTS `professionpatient`;
CREATE TABLE IF NOT EXISTS `professionpatient` (
`nom_patient` varchar(150)
,`prenom_patient` varchar(150)
,`identifiant_Profession` int(11)
,`nom_Profession` varchar(50)
,`Debut_periode` date
,`Fin_periode` date
);

-- --------------------------------------------------------

--
-- Structure de la table `rendezvous`
--

DROP TABLE IF EXISTS `rendezvous`;
CREATE TABLE IF NOT EXISTS `rendezvous` (
  `identifiant_RendezVous` int(11) NOT NULL AUTO_INCREMENT,
  `Date_RendezVous` date DEFAULT NULL,
  `Heure_RendezVous` time DEFAULT NULL,
  `Type_RendezVous` varchar(50) DEFAULT NULL,
  `identifiant_Consultation` int(11) DEFAULT NULL,
  PRIMARY KEY (`identifiant_RendezVous`),
  UNIQUE KEY `RendezVous_Consultation0_AK` (`identifiant_Consultation`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `rendezvous`
--

INSERT INTO `rendezvous` (`identifiant_RendezVous`, `Date_RendezVous`, `Heure_RendezVous`, `Type_RendezVous`, `identifiant_Consultation`) VALUES
(1, '2020-04-27', '11:30:00', 'Individuel', 1),
(2, '2020-04-28', '10:00:00', 'Individuel', 2),
(3, '2020-05-01', '10:00:00', 'Individuel', NULL),
(4, '2020-05-02', '10:00:00', 'Double', NULL),
(5, '2020-05-29', '08:00:00', 'Individuel', NULL),
(11, '2020-05-20', '10:00:00', 'Double', NULL),
(17, '2025-05-23', '20:00:00', 'Individuel', NULL),
(19, '2020-05-31', '08:00:00', 'Individuel', 5),
(21, '2020-06-01', '16:00:00', 'Triple', 6),
(22, '2020-06-02', '10:00:00', 'Individuel', NULL);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `rendezvouspatient`
-- (Voir ci-dessous la vue réelle)
--
DROP VIEW IF EXISTS `rendezvouspatient`;
CREATE TABLE IF NOT EXISTS `rendezvouspatient` (
`nom_patient` varchar(150)
,`prenom_patient` varchar(150)
,`Date_RendezVous` date
,`Heure_RendezVous` time
,`Type_RendezVous` varchar(50)
);

-- --------------------------------------------------------

--
-- Structure de la vue `consultationpatient`
--
DROP TABLE IF EXISTS `consultationpatient`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `consultationpatient`  AS  select `a`.`identifiant_patient` AS `identifiant_patient`,`a`.`nom_patient` AS `nom_patient`,`a`.`prenom_patient` AS `prenom_patient`,`c`.`identifiant_RendezVous` AS `identifiant_RendezVous`,`c`.`Type_RendezVous` AS `Type_RendezVous`,`d`.`Date_Consultation` AS `Date_Consultation`,`d`.`Heure_Consultation` AS `Heure_Consultation`,`d`.`Duree_Consultation` AS `Duree_Consultation`,`d`.`identifiant_Consultation` AS `identifiant_Consultation`,`d`.`Notes_Consultation` AS `Notes_Consultation`,`d`.`Anxiete_Consultation` AS `Anxiete_Consultation`,`d`.`Prix_Consultation` AS `Prix_Consultation`,`d`.`Paiement_Consultation` AS `Paiement_Consultation` from (((`patient` `a` join `concerner` `b`) join `rendezvous` `c`) join `consultation` `d`) where ((`a`.`identifiant_patient` = `b`.`identifiant_patient`) and (`b`.`identifiant_RendezVous` = `c`.`identifiant_RendezVous`) and (`c`.`identifiant_Consultation` = `d`.`identifiant_Consultation`)) ;

-- --------------------------------------------------------

--
-- Structure de la vue `professionpatient`
--
DROP TABLE IF EXISTS `professionpatient`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `professionpatient`  AS  select `a`.`nom_patient` AS `nom_patient`,`a`.`prenom_patient` AS `prenom_patient`,`c`.`identifiant_Profession` AS `identifiant_Profession`,`c`.`nom_Profession` AS `nom_Profession`,`b`.`Debut_periode` AS `Debut_periode`,`b`.`Fin_periode` AS `Fin_periode` from ((`patient` `a` join `etre` `b`) join `profession` `c`) where ((`a`.`identifiant_patient` = `b`.`identifiant_patient`) and (`b`.`identifiant_Profession` = `c`.`identifiant_Profession`)) ;

-- --------------------------------------------------------

--
-- Structure de la vue `rendezvouspatient`
--
DROP TABLE IF EXISTS `rendezvouspatient`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `rendezvouspatient`  AS  select `p`.`nom_patient` AS `nom_patient`,`p`.`prenom_patient` AS `prenom_patient`,`r`.`Date_RendezVous` AS `Date_RendezVous`,`r`.`Heure_RendezVous` AS `Heure_RendezVous`,`r`.`Type_RendezVous` AS `Type_RendezVous` from ((`rendezvous` `r` join `patient` `p`) join `concerner` `c`) where ((`p`.`identifiant_patient` = `c`.`identifiant_patient`) and (`c`.`identifiant_RendezVous` = `r`.`identifiant_RendezVous`)) ;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `concerner`
--
ALTER TABLE `concerner`
  ADD CONSTRAINT `Concerner_Patient1_FK` FOREIGN KEY (`identifiant_patient`) REFERENCES `patient` (`identifiant_patient`),
  ADD CONSTRAINT `Concerner_RendezVous0_FK` FOREIGN KEY (`identifiant_RendezVous`) REFERENCES `rendezvous` (`identifiant_RendezVous`);

--
-- Contraintes pour la table `consultation`
--
ALTER TABLE `consultation`
  ADD CONSTRAINT `Consultation_RendezVous0_FK` FOREIGN KEY (`identifiant_RendezVous`) REFERENCES `rendezvous` (`identifiant_RendezVous`);

--
-- Contraintes pour la table `etre`
--
ALTER TABLE `etre`
  ADD CONSTRAINT `Etre_Patient1_FK` FOREIGN KEY (`identifiant_patient`) REFERENCES `patient` (`identifiant_patient`),
  ADD CONSTRAINT `Etre_Profession0_FK` FOREIGN KEY (`identifiant_Profession`) REFERENCES `profession` (`identifiant_Profession`);

--
-- Contraintes pour la table `rendezvous`
--
ALTER TABLE `rendezvous`
  ADD CONSTRAINT `RendezVous_Consultation0_FK` FOREIGN KEY (`identifiant_Consultation`) REFERENCES `consultation` (`identifiant_Consultation`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
