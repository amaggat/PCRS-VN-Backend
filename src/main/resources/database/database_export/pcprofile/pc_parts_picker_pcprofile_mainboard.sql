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
-- Table structure for table `pcprofile_mainboard`
--

DROP TABLE IF EXISTS `pcprofile_mainboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pcprofile_mainboard`
(
    `PcID`   varchar(100) NOT NULL,
    `MainID` varchar(100) NOT NULL,
    KEY      `FK17u5liyjp8myqcs4754802a9s` (`MainID`),
    KEY      `FKss6nuiptw48x7931loq18upjw` (`PcID`),
    CONSTRAINT `FK17u5liyjp8myqcs4754802a9s` FOREIGN KEY (`MainID`) REFERENCES `mainboard` (`ID`),
    CONSTRAINT `FKss6nuiptw48x7931loq18upjw` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
    CONSTRAINT `pcprofile_mainboard_ibfk_1` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
    CONSTRAINT `pcprofile_mainboard_ibfk_2` FOREIGN KEY (`MainID`) REFERENCES `mainboard` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pcprofile_mainboard`
--

LOCK
TABLES `pcprofile_mainboard` WRITE;
/*!40000 ALTER TABLE `pcprofile_mainboard` DISABLE KEYS */;
INSERT INTO `pcprofile_mainboard`
VALUES ('entry-level-amd-build', 'asrock-b450m-steel-legend'),
       ('entry-level-intel-build', 'asus-rog-strix-b460-f-gaming'),
       ('high-end-intel-build', 'gigabyte-z490i-aorus-ultra'),
       ('high-end-amd-build', 'asus-rog-crosshair-viii-formula'),
       ('low-end-intel-build', 'asrock-b460-phantom-gaming-4'),
       ('low-end-amd-build', 'asus-rog-strix-b460-f-gaming'),
       ('streaming-intel-build', 'asus-rog-strix-b460-f-gaming'),
       ('streaming-amd-build', 'asus-rog-strix-b460-f-gaming');
/*!40000 ALTER TABLE `pcprofile_mainboard` ENABLE KEYS */;
UNLOCK
TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-03 14:03:23
