-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: pc_parts_picker
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `post` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `CreationTime` date NOT NULL,
  `Details` text NOT NULL,
  `CreatorID` int NOT NULL,
  `Description` varchar(100) NOT NULL,
  `price` text NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKhtqbhkd9ojw742kw66rupa28e` (`CreatorID`),
  CONSTRAINT `FKhtqbhkd9ojw742kw66rupa28e` FOREIGN KEY (`CreatorID`) REFERENCES `user` (`ID`),
  CONSTRAINT `post_ibfk_1` FOREIGN KEY (`CreatorID`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (1,'Entry-Level AMD Build','2020-12-27','',1,'Hello motherfucker','20.000.000+ VND'),(2,'Entry-Level Intel Build','2020-12-27','',1,'Hello fuckermother','20.000.000+ VND'),(3,'High-End Intel Build','2020-12-27','',1,'Fuckermother Hello','80.000.000+ VND'),(4,'High-End AMD Build','2020-12-27','',1,'Motherfucker Hello ','80.000.000+ VND'),(5,'Low-End Intel Build','2020-12-27','',1,'Motherhello fucker','20.000.000+ VND'),(6,'Low-End AMD Build','2020-12-27','',1,'Fucker motherhello ','20.000.000+ VND'),(7,'Streaming Intel Build','2020-12-27','',1,'Hello fuckermother','20.000.000+ VND'),(8,'Streaming AMD Build','2020-12-27','',1,'Hello fuckermother','20.000.000+ VND');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-03 14:03:24
