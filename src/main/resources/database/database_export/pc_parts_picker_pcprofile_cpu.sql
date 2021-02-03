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
-- Table structure for table `pcprofile_cpu`
--

DROP TABLE IF EXISTS `pcprofile_cpu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pcprofile_cpu` (
  `PcID` varchar(100) NOT NULL,
  `CpuID` varchar(100) NOT NULL,
  KEY `FK2ee2iieg93gujoo985cw5wysa` (`CpuID`),
  KEY `FKajiygmqemxfai80yee65illou` (`PcID`),
  CONSTRAINT `FK2ee2iieg93gujoo985cw5wysa` FOREIGN KEY (`CpuID`) REFERENCES `cpu` (`ID`),
  CONSTRAINT `FKajiygmqemxfai80yee65illou` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `pcprofile_cpu_ibfk_1` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `pcprofile_cpu_ibfk_2` FOREIGN KEY (`CpuID`) REFERENCES `cpu` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pcprofile_cpu`
--

LOCK TABLES `pcprofile_cpu` WRITE;
/*!40000 ALTER TABLE `pcprofile_cpu` DISABLE KEYS */;
INSERT INTO `pcprofile_cpu` VALUES ('entry-level-amd-build','amd-ryzen-5-3600'),('entry-level-intel-build','intel-i5-10400'),('high-end-intel-build','intel-i9-10900K'),('high-end-amd-build','amd-ryzen-9-5900x'),('low-end-intel-build','intel-i3-10100'),('low-end-amd-build','amd-ryzen-3-3100'),('streaming-intel-build','intel-i5-10400'),('streaming-amd-build','intel-i5-10400');
/*!40000 ALTER TABLE `pcprofile_cpu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-03 14:03:25
