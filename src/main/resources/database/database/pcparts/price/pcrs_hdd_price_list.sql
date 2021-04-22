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
-- Table structure for table `hdd_price_list`
--

DROP TABLE IF EXISTS `hdd_price_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hdd_price_list` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `link` text NOT NULL,
  `name` text NOT NULL,
  `price` int NOT NULL,
  `rid` int NOT NULL,
  `fid` varchar(100) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `fid` (`fid`),
  KEY `hdd_price_list_ibfk_2_idx` (`rid`),
  CONSTRAINT `hdd_price_list_ibfk_1` FOREIGN KEY (`fid`) REFERENCES `hdd` (`ID`),
  CONSTRAINT `hdd_price_list_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `retailer` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hdd_price_list`
--

LOCK TABLES `hdd_price_list` WRITE;
/*!40000 ALTER TABLE `hdd_price_list` DISABLE KEYS */;
INSERT INTO `hdd_price_list` VALUES (1,'https://www.anphatpc.com.vn/o-cung-western-digital-datacenter-re-1tb-sata_id20350.html','Ổ cứng Western Digital Datacenter RE 1TB SATA',2510000,3,'wd-re-1024-3.5sata'),(2,'https://www.anphatpc.com.vn/o-cung-western-digital-enterprise-re-3tb-sata_id20345.html','Ổ cứng Western Digital Enterprise RE 3TB SATA',7060000,3,'wd-re-3072-3.5sata'),(3,'https://www.anphatpc.com.vn/o-cung-western-digital-enterprise-re-4tb-sata_id20347.html','Ổ cứng Western Digital Enterprise RE 4TB SATA',9080000,3,'wd-re-4096-3.5sata'),(4,'https://www.anphatpc.com.vn/seagate-pipeline-hd-500gb-8mb-cache-sata-30gbs-st3500312cs_id16190.html','Ổ cứng Seagate Pipeline HD 500GB 8MB cache',1520000,3,'seagate-pipeline-hd-500-3.5sata'),(5,'https://www.anphatpc.com.vn/seagate-pipeline-hd-1tb-64mb-cache-sata-30gbs-st1000vm002_id16191.html','Ổ cứng Seagate Pipeline HD 1TB 64MB Cache',1820000,3,'seagate-pipeline-hd-1024-3.5sata'),(6,'https://www.anphatpc.com.vn/seagate-pipeline-hd-2tb-64mb-cache-sata-30gbs-st2000vm003_id16192.html','Ổ cứng Seagate Pipeline HD 2TB 64MB cache',2530000,3,'seagate-pipeline-hd-2048-3.5sata'),(7,'https://www.anphatpc.com.vn/o-cung-western-digital-enterprise-se-1tb-sata_id20348.html','Ổ cứng Western Digital Enterprise Se 1TB SATA',2360000,3,'wd-se-1024-3.5sata'),(8,'https://www.anphatpc.com.vn/o-cung-western-digital-enterprise-re-500gb-sata_id11269.html','Ổ cứng Western Digital Enterprise RE 500GB SATA',2210000,3,'wd-re-500-3.5sata'),(9,'https://www.anphatpc.com.vn/o-cung-western-digital-enterprise-re-1tb-sata_id11270.html','Ổ cứng Western Digital Enterprise RE 1TB SATA',2580000,3,'wd-re-1024-3.5sata'),(10,'https://www.anphatpc.com.vn/o-cung-western-digital-enterprise-re-2tb-sata_id11271.html','Ổ cứng Western Digital Enterprise RE 2TB SATA',4310000,3,'wd-re-2048-3.5sata'),(11,'https://www.anphatpc.com.vn/o-cung-seagate-ironwolf-pro-14tb-sata-7200rpm-st14000ne0008_id33894.html','Ổ cứng Seagate Ironwolf Pro 14TB SATA 7200rpm (ST14000NE0008) ',14199000,3,'seagate-ironwolf-pro-14336-3.5sata'),(12,'https://www.anphatpc.com.vn/o-cung-seagate-ironwolf-pro-16tb-sata-7200rpm-st16000ne000_id33895.html','Ổ cứng Seagate Ironwolf Pro 16TB SATA 7200rpm (ST16000NE000) ',15990000,3,'seagate-ironwolf-pro-16384-3.5sata'),(13,'https://www.anphatpc.com.vn/o-cung-western-digital-caviar-black-1tb-64mb-cache_id11263.html','Ổ cứng Western Digital Caviar Black 1TB 64MB Cache',1950000,3,'wd-black2-1024-2.5sata'),(14,'https://www.anphatpc.com.vn/o-cung-seagate-skyhawk-ai-10tb-3-5-st10000ve0008-chuyen-dung-cho-camera_id30809.html','Ổ cứng Seagate Skyhawk AI 10TB 3.5\'\' ST10000VE0008 (Chuyên dụng cho Camera)',8399000,3,'seagate-skyhawk-ai-10240-3.5sata'),(15,'https://www.anphatpc.com.vn/o-cung-sshd-seagate-firecuda-1tb-25-128mb-cache_id24857.html','Ổ cứng SSHD Seagate Firecuda 1TB 2.5\'\' 128MB (ST1000LX015)',1790000,3,'seagate-firecuda-1024-2.5sata'),(16,'https://www.anphatpc.com.vn/o-cung-seagate-firecuda-1tb-35-sata-st1000dx002_id22622.html','Ổ cứng Seagate FireCuda 1TB 3.5\" SATA ST1000DX002 SSHD',1850000,3,'seagate-firecuda-1024-2.5sata'),(17,'https://www.anphatpc.com.vn/o-cung-western-digital-red-1tb-64mb-cache_id11265.html','Ổ cứng Western Digital Red 1TB 64MB Cache',1550000,3,'wd-re4-1024-3.5sata'),(18,'https://www.anphatpc.com.vn/o-cung-western-digital-red-2tb-256mb-cache_id11266.html','Ổ cứng Western Digital Red 2TB 256MB Cache',2010000,3,'wd-re4-2048-3.5sata'),(19,'https://www.hanoicomputer.vn/o-cung-gan-trong-seagate-skyhawk-ai-8tb-7200rpm-sata-3.5-st8000ve000','Ổ cứng gắn trong Seagate SkyHawk AI 8TB 7200rpm SATA 3.5 inch ( ST8000VE000 ) ',6699000,2,'seagate-skyhawk-ai-8192-3.5sata'),(20,'https://gearvn.com/products/hdd-seagate-barracuda-3tb-5200rpm','HDD Seagate Barracuda 3TB 5200rpm',2350000,1,'seagate-barracuda-3072-3.5sata'),(21,'https://gearvn.com/products/hdd-seagate-barracuda-4tb-5400rpm','HDD Seagate Barracuda 4TB 5400rpm',2950000,1,'seagate-barracuda-4096-3.5sata'),(22,'https://gearvn.com/products/hdd-seagate-barracuda-6tb-5400rpm','HDD Seagate Barracuda 6TB 5400rpm',4950000,1,'seagate-barracuda-6144-3.5sata'),(23,'https://gearvn.com/products/hdd-seagate-ironwolf-pro-14tb-7200rpm','HDD Seagate Ironwolf PRO 14TB 7200rpm',14490000,1,'seagate-ironwolf-pro-14336-3.5sata'),(24,'https://gearvn.com/products/hdd-seagate-ironwolf-pro-12tb-7200rpm','HDD Seagate Ironwolf PRO 12TB 7200rpm',11990000,1,'seagate-ironwolf-pro-12288-3.5sata'),(25,'https://gearvn.com/products/hdd-seagate-ironwolf-pro-10tb-7200rpm','HDD Seagate Ironwolf PRO 10TB 7200rpm',12700000,1,'seagate-ironwolf-pro-10240-3.5sata'),(26,'https://gearvn.com/products/hdd-seagate-ironwolf-pro-4tb-7200rpm','HDD Seagate Ironwolf PRO 4TB 7200rpm',5090000,1,'seagate-ironwolf-pro-4096-3.5sata'),(27,'https://gearvn.com/products/hdd-seagate-ironwolf-pro-6tb-7200rpm','HDD Seagate Ironwolf PRO 6TB 7200rpm',7900000,1,'seagate-ironwolf-pro-6144-3.5sata'),(28,'https://gearvn.com/products/hdd-seagate-ironwolf-pro-8tb-7200rpm','HDD Seagate Ironwolf PRO 8TB 7200rpm',8690000,1,'seagate-ironwolf-pro-8192-3.5sata');
/*!40000 ALTER TABLE `hdd_price_list` ENABLE KEYS */;
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
