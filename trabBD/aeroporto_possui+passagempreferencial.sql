CREATE DATABASE  IF NOT EXISTS `aeroporto` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `aeroporto`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: aeroporto
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `possui+passagempreferencial`
--

DROP TABLE IF EXISTS `possui+passagempreferencial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `possui+passagempreferencial` (
  `codPassagem` varchar(7) DEFAULT NULL,
  `codPreferencia` varchar(7) DEFAULT NULL,
  `idPP` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idPP`),
  KEY `codPassagem_idx` (`codPassagem`),
  KEY `codPreferencia_idx` (`codPreferencia`),
  CONSTRAINT `fkPreferencia` FOREIGN KEY (`codPreferencia`) REFERENCES `preferencia` (`codPreferencia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fkcodPassagem` FOREIGN KEY (`codPassagem`) REFERENCES `compra+passagem` (`codPassagem`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `possui+passagempreferencial`
--

LOCK TABLES `possui+passagempreferencial` WRITE;
/*!40000 ALTER TABLE `possui+passagempreferencial` DISABLE KEYS */;
/*!40000 ALTER TABLE `possui+passagempreferencial` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-28 18:40:52
