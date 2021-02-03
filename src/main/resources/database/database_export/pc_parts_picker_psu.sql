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
-- Table structure for table `psu`
--

DROP TABLE IF EXISTS `psu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `psu` (
  `ID` varchar(100) NOT NULL,
  `manufacturer` varchar(100) NOT NULL,
  `serieName` varchar(100) NOT NULL,
  `chipset` varchar(100) DEFAULT NULL,
  `power` int NOT NULL,
  `standard_80` varchar(100) NOT NULL,
  `fullname` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `psu`
--

LOCK TABLES `psu` WRITE;
/*!40000 ALTER TABLE `psu` DISABLE KEYS */;
INSERT INTO `psu` VALUES ('aerocool-lux-rgb-550-bronze','AEROCOOL','LUX RGB','ATX',550,'Bronze','AEROCOOL LUX RGB 550W 80 Plus Bronze'),('aerocool-lux-rgb-650-bronze','AEROCOOL','LUX RGB','ATX',650,'Bronze','Aerocool LUX RGB 650W 80 Plus Bronze'),('aerocool-lux-rgb-750-bronze','AEROCOOL','LUX RGB','ATX',750,'Bronze','Aerocool LUX RGB 750W 80 Plus Bronze'),('aerocool-united-power-500-white','AEROCOOL','UNITED POWER','ATX',500,'White','AEROCOOL UNITED POWER 500W 80Plus'),('aerocool-vx-plus-350-none','AEROCOOL','VX PLUS','ATX',350,'None','AEROCOOL VX PLUS 350'),('aerocool-vx-plus-400-none','AEROCOOL','VX PLUS','ATX',400,'None','AEROCOOL VX PLUS 400'),('aerocool-vx-plus-500-none','AEROCOOL','VX PLUS','ATX',500,'None','AEROCOOL VX PLUS 500'),('aerocool-vx-plus-600-none','AEROCOOL','VX PLUS','ATX',600,'None','AEROCOOL VX PLUS 600'),('antec-ae-pro-750-gold','Antec','VP','ATX',750,'Gold','ANTEC EA750G PRO-750W'),('antec-atom-350-none','Antec','ATOM','ATX',350,'None','Antec ATOM V350'),('antec-atom-450-none','Antec','ATOM','ATX',450,'None','Antec ATOM V450'),('antec-atom-550-bronze','Antec','ATOM','ATX',550,'Bronze','Antec ATOM B550 - 550W 80 PLUS BRONZE'),('antec-atom-550-none','Antec','ATOM','ATX',550,'None','Antec ATOM B550 - 550W 80'),('antec-atom-650-bronze','Antec','ATOM','ATX',650,'Bronze','Antec ATOM B650 - 650W 80 PLUS BRONZE'),('antec-vp-500-none','Antec','VP','ATX',500,'None','Antec VP500PC'),('asus-rog-strix-1000-gold','ASUS','ROG STRIX','ATX',1000,'Gold','ASUS ROG STRIX 1000W GOLD'),('asus-rog-strix-750-gold','ASUS','ROG STRIX','ATX',750,'Gold','ASUS ROG STRIX 750W GOLD'),('asus-rog-strix-850-gold','ASUS','ROG STRIX','ATX',850,'Gold','ASUS ROG STRIX 850W GOLD'),('asus-rog-thor-1200-platinum','ASUS','ROG Thor','ATX',1200,'Platinum','Asus ROG Thor 1200w'),('asus-rog-thor-850-platinum','ASUS','ROG Thor','ATX',850,'Platinum','Asus ROG Thor 850w'),('asus-tuf-550-bronze','ASUS','TUF','ATX',550,'Bronze','ASUS TUF GAMING 550W Bronze'),('asus-tuf-650-bronze','ASUS','TUF','ATX',650,'Bronze','ASUS TUF GAMING 650W Bronze'),('cm-elite-v1000-1000-white','Cooler Master','V1000 V3','ATX',1000,'none','Cooler Master Elite V1000 1000W'),('cm-elite-v3-400-none','Cooler Master','Elite V3','ATX',400,'none','Cooler Master Elite V3 400W'),('cm-elite-v3-500-none','Cooler Master','Elite V3','ATX',500,'none','Cooler Master Elite V3 500W'),('cm-elite-v3-600-none','Cooler Master','Elite V3','ATX',600,'None','Cooler Master Elite V3 600W'),('cm-elite-v3-700-none','Cooler Master','Elite V3','ATX',600,'None','Cooler Master Elite V3 700W'),('cm-elite-v4-500-white','Cooler Master','Elite V3','ATX',500,'none','Cooler Master Elite V4 500W'),('cm-elite-v4-600-white','Cooler Master','Elite V3','ATX',600,'none','Cooler Master Elite V4 600W'),('cm-mwe-bronze-v2-400-bronze','Cooler Master','MWE Bronze V2','ATX',400,'bronze','Cooler Master MWE Bronze V2 400W'),('cm-mwe-bronze-v2-450-bronze','Cooler Master','MWE Bronze V2','ATX',450,'bronze','Cooler Master MWE Bronze V2 450W'),('cm-mwe-bronze-v2-550-bronze','Cooler Master','MWE Bronze V2','ATX',550,'bronze','Cooler Master MWE Bronze V2 550W'),('cm-mwe-bronze-v2-600-bronze','Cooler Master','MWE Bronze V2','ATX',600,'bronze','Cooler Master MWE Bronze V2 600W'),('cm-mwe-bronze-v2-650-bronze','Cooler Master','MWE Bronze V2','ATX',650,'bronze','Cooler Master MWE Bronze V2 650W'),('cm-mwe-bronze-v2-700-bronze','Cooler Master','MWE Bronze V2','ATX',700,'bronze','Cooler Master MWE Bronze V2 700W'),('cm-mwe-bronze-v2-750-bronze','Cooler Master','MWE Bronze V2','ATX',750,'bronze','Cooler Master MWE Bronze V2 750W'),('cm-mwe-gold-650-gold','Cooler Master','MWE Gold','ATX',650,'gold','Cooler Master MWE Gold 650W'),('cm-mwe-gold-750-gold','Cooler Master','MWE Gold','ATX',750,'gold','Cooler Master MWE Gold 750W'),('cm-mwe-gold-850-gold','Cooler Master','MWE Gold','ATX',850,'gold','Cooler Master MWE Gold 850W'),('cm-mwe-v2-400-white','Cooler Master','MWE','ATX',400,'White','Cooler master MWE 400 White V2'),('cm-mwe-v2-500-white','Cooler Master','MWE','ATX',500,'White','Cooler master MWE 500 White V2'),('cm-mwe-v2-650-white','Cooler Master','MWE','ATX',650,'White','Cooler Master MWE White 650W'),('cm-mwe-v2-700-white','Cooler Master','MWE','ATX',700,'White','Cooler Master MWE 700 WHITE V2'),('cm-mwe-v2-750-white','Cooler Master','MWE','ATX',750,'White','Cooler Master MWE 750 WHITE V2'),('cm-v-sfx-gold-650-gold','Cooler Master','V SFX Gold','SFX',650,'gold','Cooler Master V SFX Gold 650W'),('cm-v-sfx-gold-750-gold','Cooler Master','V SFX Gold','SFX',750,'gold','Cooler Master V SFX Gold 750W'),('cm-v-sfx-gold-850-gold','Cooler Master','V SFX Gold','SFX',850,'gold','Cooler Master V SFX Gold 850W'),('corsair-axi-1200-titanium','Corsair','RMX','ATX',1200,'Titanium','CORSAIR AX1200i DIGITAL - 80 PLUS Titanium'),('corsair-axi-1600-titanium','Corsair','RMX','ATX',1600,'Titanium','CORSAIR AX1600i DIGITAL - 80 PLUS Titanium'),('corsair-cv-450-bronze','Corsair','CV','ATX',450,'Bronze','Corsair CV 450W'),('corsair-cv-550-bronze','Corsair','CV','ATX',550,'Bronze','Corsair CV 550W'),('corsair-cv-650-bronze','Corsair','CV','ATX',650,'Bronze','Corsair CV 650W'),('corsair-cx-550-bronze','Corsair','CX','ATX',550,'Bronze','Corsair CX 550'),('corsair-cxf-550-bronze','Corsair','CXF','ATX',550,'bronze','Corsair CXF 550W'),('corsair-cxf-650-bronze','Corsair','CXF','ATX',650,'bronze','Corsair CXF 650W'),('corsair-cxf-rgb-550-white','Corsair','CX RGB','ATX',550,'White','Corsair CX 550F'),('corsair-cxm-750-bronze','Corsair','CXM','ATX',750,'bronze','Corsair CXM 750W'),('corsair-hx-platinum-1000-platinum','Corsair','HX Platinum','ATX',1000,'platinum','Corsair HX Platinum 1000W'),('corsair-hx-platinum-1200-platinum','Corsair','HX Platinum','ATX',1200,'platinum','Corsair HX Platinum 1200W'),('corsair-hx-platinum-850-platinum','Corsair','HX Platinum','ATX',850,'platinum','Corsair HX Platinum 850W'),('corsair-rm-650-gold','Corsair','RM','ATX',650,'Gold','Corsair RM650 80 Plus Gold'),('corsair-rm-750-gold','Corsair','RM','ATX',750,'Gold','Corsair RM750 80 Plus Gold'),('corsair-rm-850-gold','Corsair','RM','ATX',850,'Gold','Corsair RM850 80 Plus Gold'),('corsair-rmi-1000-gold','Corsair','RMX','ATX',1000,'Gold','Corsair RM1000i 80 PLUS Gold'),('corsair-rmx-650-gold','Corsair','RMX','ATX',650,'Gold','Corsair RM650X 80 Plus Gold'),('corsair-rmx-750-gold','Corsair','RMX','ATX',750,'Gold','Corsair RM750X 80 Plus Gold'),('corsair-rmx-850-gold','Corsair','RMX','ATX',850,'Gold','Corsair RM850X 80 Plus Gold'),('corsair-sf-600-gold','Corsair','SF','SFX',600,'Gold','Corsair SF600 600W - 80Plus Gold'),('corsair-sf-600-platinum','Corsair','SF','SFX',600,'Platinum','Corsair SF600 600W - 80Plus Platinum'),('corsair-sf-750-platinum','Corsair','SF','SFX',750,'Platinum','Corsair SF 750W - 80Plus Platinum'),('corsair-vs-450-white','Corsair','VS','ATX',450,'White','Corsair VS 450W'),('seasonic-focus-1000-gold','Seasonic','FOCUS','ATX',1000,'Gold','Seasonic FOCUS 1000w PLUS GOLD'),('seasonic-m12ii-620-bronze','Seasonic','FOCUS','ATX',620,'Bronze','Seasonic M12II-620 EVO 80 Plus Bronze'),('seasonic-prime-1300-gold','Seasonic','PRIME','ATX',1300,'Gold','Seasonic PRIME 1300PD 80 PLUS Gold'),('seasonic-prime-1300-platinum','Seasonic','PRIME','ATX',1300,'Platinum','Seasonic PRIME 1300PD 80 PLUS PLATINUM'),('seasonic-prime-ultra-1000-platinum','Seasonic','PRIME','ATX',1000,'Platinum','Seasonic Prime Ultra 1000TR 80Plus Titanium'),('silverstone-sst-et650-g-tuf-v1.1-650-gold','Silverstone','SST-ET650-G','ATX',650,'Gold','SilverStone SST-ET650-G ASUS TUF Gaming'),('silverstone-sst-et650-hg-v1.1-650-gold','Silverstone','SST-ET650-HG V1.1','ATX',650,'Gold','SilverStone SST-ET650-HG V1.1'),('silverstone-sst-et750-g-tuf-v1.1-650-gold','Silverstone','SST-ET750-G','ATX',750,'Gold','SilverStone SST-ET750-G ASUS TUF Gaming'),('silverstone-sst-et750-hg-v1.1-750-gold','Silverstone','SST-ET650-HG V1.1','ATX',750,'Gold','SilverStone SST-ET750-HG V1.1'),('silverstone-sst-st50f-es230-v2.0-500-white','Silverstone','SST-ST50F-ES230 V2.0','ATX',500,'White','SilverStone SST-ST50F-ES230 V2.0'),('silverstone-sst-st65f-es230-v2.0-650-white','Silverstone','SST-ST50F-ES230 V2.0','ATX',650,'White','SilverStone SST-ST65F-ES230 V2.0'),('xigmatek-tauro-500-bronze','XIGMATEK','Tauro','ATX',500,'Bronze','Xigmatek Tauro 500W M'),('xigmatek-x-power-ii-500-white','XIGMATEK','X-POWER II','ATX',500,'white','XIGMATEK X-POWER II 550 80PLUS'),('xigmatek-x-power-ii-600-white','XIGMATEK','X-POWER II','ATX',600,'white','XIGMATEK X-POWER II 650 80PLUS'),('xigmatek-x-power-iii-400-white','XIGMATEK','X-POWER III','ATX',400,'white','XIGMATEK X-POWER III 450 80PLUS'),('xigmatek-x-power-iii-450-white','XIGMATEK','X-POWER III','ATX',450,'white','XIGMATEK X-POWER III 500 80PLUS'),('xigmatek-x-power-iii-500-white','XIGMATEK','X-POWER III','ATX',500,'white','XIGMATEK X-POWER III 550 80PLUS'),('xigmatek-x-power-iii-600-white','XIGMATEK','X-POWER III','ATX',600,'white','XIGMATEK X-POWER III 650 80PLUS');
/*!40000 ALTER TABLE `psu` ENABLE KEYS */;
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
