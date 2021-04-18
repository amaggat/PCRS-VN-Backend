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
-- Table structure for table `backend.pcprofile`
--

DROP TABLE IF EXISTS `backend.pcprofile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pcprofile`
(
    `ID`     varchar(100) NOT NULL,
    `UserID` int          NOT NULL,
    `PcName` varchar(100) NOT NULL,
    PRIMARY KEY (`ID`),
    KEY      `FK6x7rblh6uojxwknc8fgndl1pl` (`UserID`),
    CONSTRAINT `FK6x7rblh6uojxwknc8fgndl1pl` FOREIGN KEY (`UserID`) REFERENCES `user` (`ID`),
    CONSTRAINT `pcprofile_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `backend.pcprofile`
--

LOCK
TABLES `backend.pcprofile` WRITE;
/*!40000 ALTER TABLE `backend.pcprofile` DISABLE KEYS */;
INSERT INTO `pcprofile`
VALUES ('entry-level-amd-build', 1, 'Entry-Level AMD Build'),
       ('entry-level-intel-build', 1, 'Entry-Level Intel Build'),
       ('high-end-amd-build', 1, 'High-End AMD Build'),
       ('high-end-intel-build', 1, 'High-End Intel Build'),
       ('low-end-amd-build', 1, 'Low-End AMD Build'),
       ('low-end-intel-build', 1, 'Low-End Intel Build'),
       ('streaming-amd-build', 1, 'Streaming AMD Build'),
       ('streaming-intel-build', 1, 'Streaming Intel Build');
/*!40000 ALTER TABLE `backend.pcprofile` ENABLE KEYS */;
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
