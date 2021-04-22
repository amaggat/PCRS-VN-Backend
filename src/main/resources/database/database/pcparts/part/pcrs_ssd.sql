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
-- Table structure for table `ssd`
--

DROP TABLE IF EXISTS `ssd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ssd` (
  `ID` varchar(100) NOT NULL,
  `manufacturer` varchar(100) NOT NULL,
  `serieName` varchar(100) NOT NULL,
  `chipset` varchar(100) NOT NULL,
  `storage` varchar(100) NOT NULL,
  `fullname` text NOT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ssd`
--

LOCK TABLES `ssd` WRITE;
/*!40000 ALTER TABLE `ssd` DISABLE KEYS */;
INSERT INTO `ssd` VALUES ('adata-xpg-spectrix-s40g-rgb-256-m2-nvme','ADATA','XPG SPECTRIX S40G RGB','M2 NVMe','256 GB','SSD ADATA XPG SPECTRIX S40G RGB 256 GB',''),('adata-xpg-spectrix-s40g-rgb-512-m2-nvme','ADATA','XPG SPECTRIX S40G RGB','M2 NVMe','512 GB','SSD ADATA XPG SPECTRIX S40G RGB 512 GB',''),('kingston-a2000-1024-m2-nvme','Kingston','A2000','M2 NVMe','1 TB','SSD Kingston A2000 1 TB',''),('kingston-a2000-250-m2-nvme','Kingston','A2000','M2 NVMe','250 GB','SSD Kingston A2000 250 GB',''),('kingston-a2000-500-m2-nvme','Kingston','A2000','M2 NVMe','500 GB','SSD Kingston A2000 500 GB',''),('kingston-a400-120-m2-sata','Kingston','A400','M2 SATA','120 GB','SSD Kingston A400 120 GB',''),('kingston-a400-240-m2-sata','Kingston','A400','M2 SATA','240 GB','SSD Kingston A400 240 GB',''),('kingston-hyperx-fury-rgb-240-m2-sata','Kingston','HyperX FURY RGB','M2 SATA','240 GB','SSD Kingston HyperX FURY RGB 240 GB',''),('kingston-hyperx-fury-rgb-480-m2-sata','Kingston','HyperX FURY RGB','M2 SATA','480 GB','SSD Kingston HyperX FURY RGB 480 GB',''),('kingston-hyperx-fury-rgb-960-m2-sata','Kingston','HyperX FURY RGB','M2 SATA','960 GB','SSD Kingston HyperX FURY RGB 960 GB',''),('kingston-kc600-256-m2-sata','Kingston','KC600','M2 SATA','256 GB','SSD Kingston KC600 256 GB',''),('kingston-kc600-512-m2-sata','Kingston','KC600','M2 SATA','512 GB','SSD Kingston KC600 512 GB',''),('samsung-870-qvo-1024-m2-sata','Samsung','870 QVO','M2 SATA','1 TB','SSD Samsung 870 QVO 1 TB',''),('samsung-870-qvo-2048-m2-sata','Samsung','870 QVO','M2 SATA','2 TB','SSD Samsung 870 QVO 2 TB',''),('samsung-870-qvo-4096-m2-sata','Samsung','870 QVO','M2 SATA','4 TB','SSD Samsung 870 QVO 4 TB',''),('samsung-870-qvo-8192-m2-sata','Samsung','870 QVO','M2 SATA','8 TB','SSD Samsung 870 QVO 8 TB','');
/*!40000 ALTER TABLE `ssd` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-22 20:43:43
