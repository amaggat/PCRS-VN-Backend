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
-- Table structure for table `pcprofile_hdd`
--

DROP TABLE IF EXISTS `pcprofile_hdd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pcprofile_hdd`
(
    `PcID`  varchar(100) NOT NULL,
    `HddID` varchar(100) NOT NULL,
    KEY     `FKhm7hctqd1hgt82cpjcgjarls1` (`HddID`),
    KEY     `FKcid8tt1k57b5qxrok86cbk6tx` (`PcID`),
    CONSTRAINT `FKcid8tt1k57b5qxrok86cbk6tx` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
    CONSTRAINT `FKhm7hctqd1hgt82cpjcgjarls1` FOREIGN KEY (`HddID`) REFERENCES `hdd` (`ID`),
    CONSTRAINT `pcprofile_hdd_ibfk_1` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
    CONSTRAINT `pcprofile_hdd_ibfk_2` FOREIGN KEY (`HddID`) REFERENCES `hdd` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pcprofile_hdd`
--

LOCK
TABLES `pcprofile_hdd` WRITE;
/*!40000 ALTER TABLE `pcprofile_hdd` DISABLE KEYS */;
INSERT INTO `pcprofile_hdd`
VALUES ('entry-level-amd-build', 'seagate-firecuda-1024-2.5sata'),
       ('entry-level-intel-build', 'seagate-firecuda-1024-2.5sata'),
       ('high-end-intel-build', 'seagate-ironwolf-pro-4096-3.5sata'),
       ('high-end-amd-build', 'seagate-ironwolf-pro-4096-3.5sata'),
       ('low-end-intel-build', 'seagate-firecuda-1024-2.5sata'),
       ('low-end-amd-build', 'seagate-firecuda-1024-2.5sata'),
       ('streaming-intel-build', 'wd-black2-1024-2.5sata'),
       ('streaming-amd-build', 'seagate-firecuda-1024-2.5sata');
/*!40000 ALTER TABLE `pcprofile_hdd` ENABLE KEYS */;
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

-- Dump completed on 2021-02-03 14:03:25
