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
-- Table structure for table `pcprofile_ssd`
--

DROP TABLE IF EXISTS `pcprofile_ssd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pcprofile_ssd` (
  `PcID` varchar(100) NOT NULL,
  `SsdID` varchar(100) NOT NULL,
  KEY `FK3e8ct6lfac4qjjkok471xjg87` (`SsdID`),
  KEY `FK3ushjl8ne69bx6er3rai8vb24` (`PcID`),
  CONSTRAINT `FK3e8ct6lfac4qjjkok471xjg87` FOREIGN KEY (`SsdID`) REFERENCES `ssd` (`ID`),
  CONSTRAINT `FK3ushjl8ne69bx6er3rai8vb24` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `pcprofile_ssd_ibfk_1` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `pcprofile_ssd_ibfk_2` FOREIGN KEY (`SsdID`) REFERENCES `ssd` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pcprofile_ssd`
--

LOCK TABLES `pcprofile_ssd` WRITE;
/*!40000 ALTER TABLE `pcprofile_ssd` DISABLE KEYS */;
INSERT INTO `pcprofile_ssd` VALUES ('entry-level-amd-build','kingston-a2000-500-m2-nvme'),('entry-level-intel-build','kingston-kc600-512-m2-sata'),('high-end-intel-build','samsung-870-qvo-1024-m2-sata'),('high-end-amd-build','samsung-870-qvo-1024-m2-sata'),('low-end-intel-build','kingston-a400-240-m2-sata'),('low-end-amd-build','kingston-a400-240-m2-sata'),('streaming-intel-build','adata-xpg-spectrix-s40g-rgb-256-m2-nvme'),('streaming-amd-build','kingston-kc600-512-m2-sata');
/*!40000 ALTER TABLE `pcprofile_ssd` ENABLE KEYS */;
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
