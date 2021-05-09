-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: pcrs
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `hdd`
--

DROP TABLE IF EXISTS `hdd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hdd` (
  `ID` varchar(100) NOT NULL,
  `manufacturer` varchar(100) NOT NULL,
  `serieName` varchar(100) NOT NULL,
  `chipset` varchar(100) DEFAULT NULL,
  `storage` varchar(100) NOT NULL,
  `fullname` text NOT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hdd`
--

LOCK TABLES `hdd` WRITE;
/*!40000 ALTER TABLE `hdd` DISABLE KEYS */;
INSERT INTO `hdd` VALUES ('seagate-barracuda-3072-3.5sata','Seagate','Barracuda','3.5 SATA','3 TB','HDD Seagate Barracuda 3 TB',''),('seagate-barracuda-4096-3.5sata','Seagate','BarraCuda','3.5 SATA','4 TB','HDD Seagate BarraCuda 4 TB',''),('seagate-barracuda-6144-3.5sata','Seagate','Barracuda','3.5 SATA','6 TB','HDD Seagate Barracuda 6 TB',''),('seagate-firecuda-1024-2.5sata','Seagate','FireCuda','2.5 SATA','1 TB','HDD Seagate FireCuda 1 TB',''),('seagate-firecuda-500-2.5sata','Seagate','FireCuda','2.5 SATA','500 GB','HDD Seagate FireCuda 500 GB',''),('seagate-ironwolf-pro-10240-3.5sata','Seagate','IronWolf Pro','3.5 SATA','10 TB','HDD Seagate IronWolf Pro 10 TB',''),('seagate-ironwolf-pro-12288-3.5sata','Seagate','IronWolf Pro','3.5 SATA','12 TB','HDD Seagate IronWolf Pro 12 TB',''),('seagate-ironwolf-pro-14336-3.5sata','Seagate','IronWolf Pro','3.5 SATA','14 TB','HDD Seagate IronWolf Pro 14 TB',''),('seagate-ironwolf-pro-16384-3.5sata','Seagate','IronWolf Pro','3.5 SATA','16 TB','HDD Seagate IronWolf Pro 16 TB',''),('seagate-ironwolf-pro-4096-3.5sata','Seagate','IronWolf Pro','3.5 SATA','4 TB','HDD Seagate IronWolf Pro 4 TB',''),('seagate-ironwolf-pro-6144-3.5sata','Seagate','IronWolf Pro','3.5 SATA','6 TB','HDD Seagate IronWolf Pro 6 TB',''),('seagate-ironwolf-pro-8192-3.5sata','Seagate','IronWolf Pro','3.5 SATA','8 TB','HDD Seagate IronWolf Pro 8 TB',''),('seagate-pipeline-hd-1024-3.5sata','Seagate','Pipeline HD','3.5 SATA','1 TB','HDD Seagate Pipeline HD 1 TB',''),('seagate-pipeline-hd-2048-3.5sata','Seagate','Pipeline HD','3.5 SATA','2 TB','HDD Seagate Pipeline HD 2 TB',''),('seagate-pipeline-hd-500-3.5sata','Seagate','Pipeline HD','3.5 SATA','500 GB','HDD Seagate Pipeline HD 500 GB',''),('seagate-skyhawk-ai-10240-3.5sata','Seagate','SkyHawk AI','3.5 SATA','10 TB','HDD Seagate SkyHawk AI 10 TB',''),('seagate-skyhawk-ai-8192-3.5sata','Seagate','Skyhawk AI','3.5 SATA','8 TB','HDD Seagate Skyhawk AI 8 TB',''),('wd-black2-1024-2.5sata','Western Digital','Black2','2.5 SATA','1 TB','HDD Western Digital Black2 1 TB',''),('wd-re-1024-3.5sata','Western Digital','Re','3.5 SATA','1 TB','HDD Western Digital Re 1 TB',''),('wd-re-2048-3.5sata','Western Digital','RE','3.5 SATA','2 TB','HDD Western Digital RE 2 TB',''),('wd-re-3072-3.5sata','Western Digital','RE','3.5 SATA','3 TB','HDD Western Digital RE 3 TB',''),('wd-re-4096-3.5sata','Western Digital','RE','3.5 SATA','4 TB','HDD Western Digital RE 4 TB',''),('wd-re-500-3.5sata','Western Digital','Re','3.5 SATA','500 GB','HDD Western Digital Re 500 GB',''),('wd-re4-1024-3.5sata','Western Digital','RE4','3.5 SATA','1 TB','HDD Western Digital RE4 1 TB',''),('wd-re4-2048-3.5sata','Western Digital','RE4','3.5 SATA','2 TB','HDD Western Digital RE4 2 TB',''),('wd-se-1024-3.5sata','Western Digital','Se','3.5 SATA','1 TB','HDD Western Digital Se 1 TB','');
/*!40000 ALTER TABLE `hdd` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-22 20:43:42
