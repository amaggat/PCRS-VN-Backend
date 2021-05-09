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
-- Table structure for table `ssd_price_list`
--

DROP TABLE IF EXISTS `ssd_price_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ssd_price_list` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `link` text NOT NULL,
  `name` text NOT NULL,
  `price` int NOT NULL,
  `rid` int NOT NULL,
  `fid` varchar(100) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `fid` (`fid`),
  KEY `ssd_price_list_ibfk_2_idx` (`rid`),
  CONSTRAINT `ssd_price_list_ibfk_1` FOREIGN KEY (`fid`) REFERENCES `ssd` (`ID`),
  CONSTRAINT `ssd_price_list_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `retailer` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ssd_price_list`
--

LOCK TABLES `ssd_price_list` WRITE;
/*!40000 ALTER TABLE `ssd_price_list` DISABLE KEYS */;
INSERT INTO `ssd_price_list` VALUES (1,'https://www.anphatpc.com.vn/o-cung-ssd-samsung-870-qvo-1tb-2-5-inch-sata-iii_id34479.html','Ổ cứng SSD Samsung 870 QVO 1TB 2.5-Inch SATA III',3080000,3,'samsung-870-qvo-1024-m2-sata'),(2,'https://www.anphatpc.com.vn/o-cung-ssd-samsung-870-qvo-4tb-2-5-inch-sata-iii_id34481.html','Ổ cứng SSD Samsung 870 QVO 4TB 2.5-Inch SATA III',12240000,3,'samsung-870-qvo-4096-m2-sata'),(3,'https://www.anphatpc.com.vn/o-cung-ssd-samsung-870-qvo-8tb-2-5-inch-sata-iii_id34482.html','Ổ cứng SSD Samsung 870 QVO 8TB 2.5-Inch SATA III',22990000,3,'samsung-870-qvo-8192-m2-sata'),(4,'https://www.anphatpc.com.vn/o-cung-ssd-adata-xpg-spectrix-s40g-rgb-256gb-nvme-m.2-2280-pcie-gen-3.0-x4_id29720.html','Ổ cứng SSD ADATA XPG SPECTRIX S40G RGB 256GB NVMe M.2 2280 PCIe Gen 3.0 x4',1399000,3,'adata-xpg-spectrix-s40g-rgb-256-m2-nvme'),(5,'https://www.anphatpc.com.vn/o-cung-ssd-adata-xpg-spectrix-s40g-rgb-512gb-nvme-m.2-2280-pcie-gen-3.0-x4_id29721.html','Ổ cứng SSD ADATA XPG SPECTRIX S40G RGB 512GB NVMe M.2 2280 PCIe Gen 3.0 x4',2349000,3,'adata-xpg-spectrix-s40g-rgb-512-m2-nvme'),(6,'https://www.anphatpc.com.vn/o-cung-ssd-samsung-870-qvo-2tb-2-5-inch-sata-iii_id34480.html','Ổ cứng SSD Samsung 870 QVO 2TB 2.5-Inch SATA III',6060000,3,'samsung-870-qvo-2048-m2-sata'),(7,'https://gearvn.com/products/ssd-xpg-spectrix-s40g-rgb-led-256gb','SSD ADATA XPG SPECTRIX S40G RGB 256GB',1490000,1,'adata-xpg-spectrix-s40g-rgb-256-m2-nvme'),(8,'https://gearvn.com/products/ssd-adata-xpg-spectrix-s40g-rgb-512gb','SSD ADATA XPG SPECTRIX S40G RGB 512GB',2390000,1,'adata-xpg-spectrix-s40g-rgb-512-m2-nvme'),(9,'https://gearvn.com/products/ssd-kingston-kc600-256gb-2-5-sata3','SSD Kingston KC600 256GB 2.5\" SATA3',1290000,1,'kingston-kc600-256-m2-sata'),(10,'https://gearvn.com/products/ssd-kingston-kc600-512gb-2-5-sata3','SSD Kingston KC600 512GB 2.5\" SATA3',2290000,1,'kingston-kc600-512-m2-sata'),(12,'https://gearvn.com/products/ssd-kingston-a400-120gb-m-2-sata-3','SSD KINGSTON A400 120GB M.2 Sata 3',590000,1,'kingston-a400-120-m2-sata'),(13,'https://gearvn.com/products/ssd-kingston-a400-240gb-m-2-sata-3','SSD KINGSTON A400 240GB M.2 Sata 3',890000,1,'kingston-a400-240-m2-sata'),(14,'https://gearvn.com/products/ssd-kingston-a2000-500gb-m-2-nvme-sa2000m8-500g','SSD KINGSTON A2000 500GB M.2 NVMe - SA2000M8/500G',2190000,1,'kingston-a2000-500-m2-nvme'),(15,'https://gearvn.com/products/ssd-kingston-a2000-250gb-m-2-nvme-sa2000m8-250g','SSD KINGSTON A2000 250GB M.2 NVMe - SA2000M8/250G',1010000,1,'kingston-a2000-250-m2-nvme'),(16,'https://gearvn.com/products/ssd-kingston-a2000-1tb-m-2-nvme-sa2000m8-1000g','SSD KINGSTON A2000 1TB M.2 NVMe - SA2000M8/1000G',3290000,1,'kingston-a2000-1024-m2-nvme'),(17,'https://gearvn.com/products/hyperx-ssd-fury-rgb-240gb-2-5-sata-3','HyperX SSD Fury RGB 240GB 2.5\" Sata 3',1990000,1,'kingston-hyperx-fury-rgb-240-m2-sata'),(18,'https://gearvn.com/products/hyperx-ssd-fury-rgb-480gb-2-5-sata-3','HyperX SSD Fury RGB 480GB 2.5\" Sata 3',3350000,1,'kingston-hyperx-fury-rgb-480-m2-sata'),(19,'https://gearvn.com/products/hyperx-ssd-fury-rgb-960gb-2-5-sata-iii','HyperX SSD Fury RGB 960GB 2.5\" SATA III',5850000,1,'kingston-hyperx-fury-rgb-960-m2-sata');
/*!40000 ALTER TABLE `ssd_price_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-22 20:43:40
