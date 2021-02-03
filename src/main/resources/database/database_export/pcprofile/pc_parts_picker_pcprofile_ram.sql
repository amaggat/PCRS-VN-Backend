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
-- Table structure for table `pcprofile_ram`
--

DROP TABLE IF EXISTS `pcprofile_ram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pcprofile_ram` (
  `PcID` varchar(100) NOT NULL,
  `RamID` varchar(100) NOT NULL,
  KEY `FKrcr8d20xwitjsj0v4yykooeyi` (`RamID`),
  KEY `FK7dsvpcem63jth53lh73pyjnhs` (`PcID`),
  CONSTRAINT `FK7dsvpcem63jth53lh73pyjnhs` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `FKrcr8d20xwitjsj0v4yykooeyi` FOREIGN KEY (`RamID`) REFERENCES `ram` (`ID`),
  CONSTRAINT `pcprofile_ram_ibfk_1` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `pcprofile_ram_ibfk_2` FOREIGN KEY (`RamID`) REFERENCES `ram` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pcprofile_ram`
--

LOCK TABLES `pcprofile_ram` WRITE;
/*!40000 ALTER TABLE `pcprofile_ram` DISABLE KEYS */;
INSERT INTO `pcprofile_ram` VALUES ('entry-level-amd-build','corsair-dominator-platinum-2x8G-3200'),('entry-level-intel-build','corsair-vengeance-RGB-pro-2x8G-3000'),('high-end-intel-build','corsair-dominator-platinum-2x16G-3600'),('high-end-amd-build','g.skill-trident-z-royal-2x8G-3200'),('low-end-intel-build','kingston-hyperx-fury-2x8G-2666'),('low-end-amd-build','corsair-vengeance-lpx-2x8G-2666'),('streaming-intel-build','corsair-vengeance-RGB-pro-2x8G-3000'),('streaming-amd-build','corsair-vengeance-RGB-pro-2x8G-3000');
/*!40000 ALTER TABLE `pcprofile_ram` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-03 14:03:23
