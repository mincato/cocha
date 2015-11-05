-- MySQL dump 10.13  Distrib 5.6.27, for osx10.8 (x86_64)
--
-- Host: localhost    Database: content
-- ------------------------------------------------------
-- Server version	5.6.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `DictionaryReplacementRule`
--

DROP TABLE IF EXISTS `DictionaryReplacementRule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DictionaryReplacementRule` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `countryCode` varchar(255) DEFAULT NULL,
  `hotelAttribute` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DictionaryReplacementRule`
--

LOCK TABLES `DictionaryReplacementRule` WRITE;
/*!40000 ALTER TABLE `DictionaryReplacementRule` DISABLE KEYS */;
INSERT INTO `DictionaryReplacementRule` VALUES (1,NULL,'ADDRESS'),(2,NULL,'NAME');
/*!40000 ALTER TABLE `DictionaryReplacementRule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ReplacementTokens`
--

DROP TABLE IF EXISTS `ReplacementTokens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ReplacementTokens` (
  `ReplacementRule_id` bigint(20) NOT NULL,
  `value` varchar(255) DEFAULT NULL,
  `pattern` varchar(255) NOT NULL,
  PRIMARY KEY (`ReplacementRule_id`,`pattern`),
  KEY `FK_dw2cvawgrktx58gc7wim0atxi` (`ReplacementRule_id`),
  CONSTRAINT `FK_dw2cvawgrktx58gc7wim0atxi` FOREIGN KEY (`ReplacementRule_id`) REFERENCES `DictionaryReplacementRule` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ReplacementTokens`
--

LOCK TABLES `ReplacementTokens` WRITE;
/*!40000 ALTER TABLE `ReplacementTokens` DISABLE KEYS */;
INSERT INTO `ReplacementTokens` VALUES (1,'AV','AVENIDA'),(1,'AVE','AVENUE'),(1,'BLVD','BOULEVARD'),(1,'DR','DRIVE'),(1,'E','EAST'),(1,'HWY','HIGHWAY'),(1,'N','NORTH'),(1,'RD','ROAD'),(1,'S','SOUTH'),(1,'SQ','SQUARE'),(1,'ST','STREET'),(1,'W','WEST'),(2,' ','&AMP;'),(2,'','AND'),(2,'E','EAST'),(2,'','HACIENDA'),(2,'','HOTEL'),(2,'','HOTELS'),(2,'N','NORTH'),(2,'S','SOUTH'),(2,'W','WEST');
/*!40000 ALTER TABLE `ReplacementTokens` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-28 18:11:35
