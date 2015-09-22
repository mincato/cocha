DROP TABLE IF EXISTS `hotel`;

CREATE TABLE `hotel` (
  `id` varchar(255) NOT NULL,
  `supplierCode` varchar(3) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `countryCode` varchar(255) DEFAULT NULL,
  `currencyCode` varchar(255) DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `starRating` varchar(255) DEFAULT NULL,
  `zipCode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`supplierCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `hotel` VALUES ('107480','EAN','700 Elm St','US','USD',42.98811,-71.46305,'Radisson Hotel Manchester Downtown','3.5','03101'),('130177','EAN','21 Front Street','US','USD',43.00393,-71.47357,'La Quinta Inn & Suites Manchester','3.0','03102'),('184976','BKG','700 Elm Street','US','USD',42.98831943471446,-71.46397233009338,'Radisson Hotel Manchester Downtown','4.0','03101');



DROP TABLE IF EXISTS `hoteldescription`;
CREATE TABLE `hoteldescription` (
  `id` varchar(255) NOT NULL,
  `supplierCode` varchar(3) NOT NULL,
  `description` longtext,
  `languageCode` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`,`supplierCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `hoteldescription` VALUES ('107480','EAN','<p><b>Ubicación del establecimiento</b> <br />En Radisson Hotel Manchester Downtown','es'),('130177','EAN','<p><b>Ubicación del establecimiento</b> <br />Alojandote en La Quinta Inn & Suites Manchester','es'),('184976','BKG','Este hotel goza de una ubicación céntrica frente al estadio Verizon Wireless Arena','es');
