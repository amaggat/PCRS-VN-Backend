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
-- Table structure for table `pcprofile_psu`
--

DROP TABLE IF EXISTS `pcprofile_psu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pcprofile_psu` (
  `PcID` varchar(100) NOT NULL,
  `PsuID` varchar(100) NOT NULL,
  KEY `FK8tumuxe3jvu70ukbxnr36rai` (`PsuID`),
  KEY `FKi0nqeyu5h3gsbljxjiym0177h` (`PcID`),
  CONSTRAINT `FK8tumuxe3jvu70ukbxnr36rai` FOREIGN KEY (`PsuID`) REFERENCES `psu` (`ID`),
  CONSTRAINT `FKi0nqeyu5h3gsbljxjiym0177h` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `pcprofile_psu_ibfk_1` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `pcprofile_psu_ibfk_2` FOREIGN KEY (`PsuID`) REFERENCES `psu` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pcprofile_psu`
--

LOCK TABLES `pcprofile_psu` WRITE;
/*!40000 ALTER TABLE `pcprofile_psu` DISABLE KEYS */;
INSERT INTO `pcprofile_psu` VALUES ('entry-level-amd-build','cm-mwe-gold-650-gold'),('entry-level-intel-build','cm-mwe-gold-650-gold'),('high-end-intel-build','seasonic-focus-1000-gold'),('high-end-amd-build','seasonic-prime-ultra-1000-platinum'),('low-end-intel-build','cm-mwe-v2-500-white'),('low-end-amd-build','corsair-cv-550-bronze'),('streaming-intel-build','cm-mwe-gold-650-gold'),('streaming-amd-build','cm-mwe-gold-650-gold');
/*!40000 ALTER TABLE `pcprofile_psu` ENABLE KEYS */;
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
