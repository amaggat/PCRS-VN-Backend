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
-- Table structure for table `post_pc`
--

DROP TABLE IF EXISTS `post_pc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `post_pc` (
  `PcID` varchar(100) NOT NULL,
  `PostID` int NOT NULL,
  KEY `FKtm5o0y54yxj8d8j5kj572rbiv` (`PcID`),
  KEY `FK8le1n0od31bft4a2l2iscy2ql` (`PostID`),
  CONSTRAINT `FK8le1n0od31bft4a2l2iscy2ql` FOREIGN KEY (`PostID`) REFERENCES `post` (`ID`),
  CONSTRAINT `FKtm5o0y54yxj8d8j5kj572rbiv` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
  CONSTRAINT `post_pc_ibfk_1` FOREIGN KEY (`PostID`) REFERENCES `post` (`ID`),
  CONSTRAINT `post_pc_ibfk_2` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post_pc`
--

LOCK TABLES `post_pc` WRITE;
/*!40000 ALTER TABLE `post_pc` DISABLE KEYS */;
INSERT INTO `post_pc` VALUES ('entry-level-amd-build',1),('entry-level-intel-build',2),('high-end-intel-build',3),('high-end-amd-build',4),('low-end-intel-build',5),('low-end-amd-build',6),('streaming-intel-build',7),('streaming-amd-build',8);
/*!40000 ALTER TABLE `post_pc` ENABLE KEYS */;
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
