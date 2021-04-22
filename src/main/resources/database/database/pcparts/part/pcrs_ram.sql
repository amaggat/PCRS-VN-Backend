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
-- Table structure for table `ram`
--

DROP TABLE IF EXISTS `ram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ram` (
  `ID` varchar(100) NOT NULL,
  `manufacturer` varchar(100) NOT NULL,
  `serieName` varchar(100) NOT NULL,
  `sizeOfRam` varchar(100) NOT NULL,
  `chipset` varchar(100) NOT NULL,
  `clockSpeed` int NOT NULL,
  `fullname` text NOT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ram`
--

LOCK TABLES `ram` WRITE;
/*!40000 ALTER TABLE `ram` DISABLE KEYS */;
INSERT INTO `ram` VALUES ('corsair-dominator-platinum-2x16G-3200','Corsair','Dominator','2x16G','DDR4',3200,'Corsair Dominator Platinum 4x16G 3200',''),('corsair-dominator-platinum-2x16G-3600','Corsair','Dominator','2x16G','DDR4',3600,'Corsair Dominator Platinum 4x16G 3600',''),('corsair-dominator-platinum-2x8G-3000','Corsair','Dominator','2x8G','DDR4',3000,'Corsair Dominator Platinum 2x8G 3000',''),('corsair-dominator-platinum-2x8G-3200','Corsair','Dominator','2x8G','DDR4',3200,'Corsair Dominator Platinum 2x8G 3200',''),('corsair-vengeance-lpx-1x16G-3000','Corsair','Vengeance','1x16G','DDR4',3000,'Corsair Vengeance LPX 1x16G 3000',''),('corsair-vengeance-lpx-1x8G-2666','Corsair','Vengeance','1x8G','DDR4',2666,'Corsair Vengeance LPX 1x8G 2666',''),('corsair-vengeance-lpx-1x8G-3000','Corsair','Vengeance','1x8G','DDR4',3000,'Corsair Vengeance LPX 1x8G 3000',''),('corsair-vengeance-lpx-2x16G-2666','Corsair','Vengeance','2x16G','DDR4',2666,'Corsair Vengeance LPX 2x16G 2666',''),('corsair-vengeance-lpx-2x8G-2666','Corsair','Vengeance','2x8G','DDR4',2666,'Corsair Vengeance LPX 2x8G 2666',''),('corsair-vengeance-RGB-pro-1x16G-3000','Corsair','Vengeance','1x16G','DDR4',3000,'Corsair Vengeance RGB Pro 1x16G 3000',''),('corsair-vengeance-RGB-pro-1x8G-3000','Corsair','Vengeance','1x8G','DDR4',3000,'Corsair Vengeance RGB Pro 1x8G 3000',''),('corsair-vengeance-RGB-pro-2x16G-3000','Corsair','Vengeance','2x16G','DDR4',3000,'Corsair Vengeance RGB Pro 2x16G 3000',''),('corsair-vengeance-RGB-pro-2x16G-3200','Corsair','Vengeance','2x16G','DDR4',3200,'Corsair Vengeance RGB Pro 2x16G 3200',''),('corsair-vengeance-RGB-pro-2x16G-3600','Corsair','Vengeance','2x16G','DDR4',3600,'Corsair Vengeance RGB Pro 2x16G 3600',''),('corsair-vengeance-RGB-pro-2x32G-3200','Corsair','Vengeance','2x32G','DDR4',3200,'Corsair Vengeance RGB Pro 2x32G 3200',''),('corsair-vengeance-RGB-pro-2x8G-3000','Corsair','Vengeance','2x8G','DDR4',3000,'Corsair Vengeance RGB Pro 2x8G 3000',''),('g.skill-ripjaws-v-1x16G-3000','G.Skill','Ripjaws','1x16G','DDR4',3000,'G.Skill Ripjaws V 1x8G 3000',''),('g.skill-ripjaws-v-1x8G-2800','G.Skill','Ripjaws','1x8G','DDR4',2800,'G.Skill Ripjaws V 1x8G 2800',''),('g.skill-ripjaws-v-2x16G-3200','G.Skill','Ripjaws','2x16G','DDR4',3200,'G.Skill Ripjaws V 2x16G 3200',''),('g.skill-ripjaws-v-2x8G-3000','G.Skill','Ripjaws','2x8G','DDR4',3000,'G.Skill Ripjaws V 2x8G 3000',''),('g.skill-trident-z-neo-1x16G-3600','G.Skill','Trident','1x16G','DDR4',3600,'G.Skill Trident Z Neo 2x16G 3600',''),('g.skill-trident-z-neo-1x8G-3600','G.Skill','Trident','1x8G','DDR4',3600,'G.Skill Trident Z Neo 1x8G 3600',''),('g.skill-trident-z-neo-2x16G-3600','G.Skill','Trident','2x16G','DDR4',3600,'G.Skill Trident Z Neo 2x16G 3600',''),('g.skill-trident-z-neo-2x32G-3600','G.Skill','Trident','2x32G','DDR4',3600,'G.Skill Trident Z Neo 2x32G 3600',''),('g.skill-trident-z-neo-2x8G-3600','G.Skill','Trident','2x8G','DDR4',3600,'G.Skill Trident Z Neo 2x8G 3600',''),('g.skill-trident-z-RGB-1x16G-3000','G.Skill','Trident','1x16G','DDR4',3000,'G.Skill Trident Z RGB 1x16G 3000',''),('g.skill-trident-z-RGB-1x8G-3000','G.Skill','Trident','1x8G','DDR4',3000,'G.Skill Trident Z RGB 2x8G 3000',''),('g.skill-trident-z-RGB-2x16G-3000','G.Skill','Trident','2x16G','DDR4',3000,'G.Skill Trident Z RGB 2x16G 3000',''),('g.skill-trident-z-RGB-2x8G-3000','G.Skill','Trident','2x8G','DDR4',3000,'G.Skill Trident Z RGB 2x8G 3000',''),('g.skill-trident-z-RGB-2x8G-3200','G.Skill','Trident','2x8G','DDR4',3200,'G.Skill Trident Z RGB 2x8G 3200',''),('g.skill-trident-z-RGB-2x8G-3600','G.Skill','Trident','2x8G','DDR4',3600,'G.Skill Trident Z RGB 2x8G 3600',''),('g.skill-trident-z-royal-2x8G-3000','G.Skill','Trident','2x8G','DDR4',3000,'G.Skill Trident Z Royal 2x8G 3000',''),('g.skill-trident-z-royal-2x8G-3200','G.Skill','Trident','2x8G','DDR4',3200,'G.Skill Trident Z Royal 2x8G 3200',''),('kingston-hyperx-fury-1x16G-2666','Kingston','HyperX','1x16G','DDR4',2666,'Kingston HyperX Fury 2x8G 2666',''),('kingston-hyperx-fury-1x8G-2666','Kingston','HyperX','1x8G','DDR4',2666,'Kingston HyperX Fury 1x8G 2666',''),('kingston-hyperx-fury-1x8G-3200','Kingston','HyperX','1x8G','DDR4',3200,'Kingston HyperX Fury 1x8G 3200',''),('kingston-hyperx-fury-2x16G-3200','Kingston','HyperX','2x16G','DDR4',3200,'Kingston HyperX Fury 2x16G 3200',''),('kingston-hyperx-fury-2x8G-2666','Kingston','HyperX','2x8G','DDR4',2666,'Kingston HyperX Fury 2x8G 2666',''),('kingston-hyperx-fury-2x8G-3200','Kingston','HyperX','2x8G','DDR4',3200,'Kingston HyperX Fury 2x8G 3200',''),('kingston-hyperx-fury-RGB-1x8G-2666','Kingston','HyperX','1x8G','DDR4',2666,'Kingston HyperX Fury RGB 1x8G 2666',''),('kingston-hyperx-fury-RGB-1x8G-3200','Kingston','HyperX','1x8G','DDR4',3200,'Kingston HyperX Fury RGB 1x8G 3200',''),('kingston-hyperx-fury-RGB-2x16G-3200','Kingston','HyperX','2x16G','DDR4',3200,'Kingston HyperX Fury RGB 2x16G 3200',''),('kingston-hyperx-fury-RGB-2x8G-3200','Kingston','HyperX','2x8G','DDR4',3200,'Kingston HyperX Fury RGB 2x8G 3200','');
/*!40000 ALTER TABLE `ram` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-22 20:43:41
