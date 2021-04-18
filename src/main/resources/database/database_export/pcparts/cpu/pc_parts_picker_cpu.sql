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
-- Table structure for table `cpu`
--

DROP TABLE IF EXISTS `cpu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cpu`
(
    `ID`           varchar(100) NOT NULL,
    `manufacturer` varchar(100) NOT NULL,
    `serieName`    varchar(100) NOT NULL,
    `chipset`      varchar(100) DEFAULT NULL,
    `socket`       varchar(100) NOT NULL,
    `Cores`        int          NOT NULL,
    `Threads`      int          NOT NULL,
    `fullname`     text         NOT NULL,
    PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cpu`
--

LOCK
TABLES `cpu` WRITE;
/*!40000 ALTER TABLE `cpu` DISABLE KEYS */;
INSERT INTO `cpu`
VALUES ('amd-ryzen-3-3100', 'AMD', 'Matisse', 'Ryzen 3', 'AM4', 4, 8, 'AMD Ryzen 3 3100 Desktop Processor'),
       ('amd-ryzen-3-3200g', 'AMD', 'Picasso', 'Ryzen 3', 'AM4', 4, 4, 'AMD Ryzen 3 3200G Desktop Processor'),
       ('amd-ryzen-3-3300x', 'AMD', 'Matisse', 'Ryzen 3', 'AM4', 4, 8, 'AMD Ryzen 3 3300X Desktop Processor'),
       ('amd-ryzen-5-3400g', 'AMD', 'Picasso', 'Ryzen 5', 'AM4', 4, 8, 'AMD Ryzen 5 3400G Desktop Processor'),
       ('amd-ryzen-5-3500', 'AMD', 'Matisse', 'Ryzen 5', 'AM4', 6, 12, 'AMD Ryzen 5 3500 Desktop Processor'),
       ('amd-ryzen-5-3500x', 'AMD', 'Matisse', 'Ryzen 5', 'AM4', 6, 12, 'AMD Ryzen 5 3500X Desktop Processor'),
       ('amd-ryzen-5-3600', 'AMD', 'Matisse', 'Ryzen 5', 'AM4', 6, 12, 'AMD Ryzen 5 3600 Desktop Processor'),
       ('amd-ryzen-5-3600x', 'AMD', 'Matisse', 'Ryzen 5', 'AM4', 6, 12, 'AMD Ryzen 5 3600X Desktop Processor'),
       ('amd-ryzen-5-5600x', 'AMD', 'Vermeer', 'Ryzen 5', 'AM4', 6, 12, 'AMD Ryzen 5 5600X Desktop Processor'),
       ('amd-ryzen-7-3700x', 'AMD', 'Matisse', 'Ryzen 7', 'AM4', 8, 16, 'AMD Ryzen 7 3700X Desktop Processor'),
       ('amd-ryzen-7-3800x', 'AMD', 'Matisse', 'Ryzen 7', 'AM4', 8, 16, 'AMD Ryzen 7 3800X Desktop Processor'),
       ('amd-ryzen-7-3800xt', 'AMD', 'Matisse 2', 'Ryzen 7', 'AM4', 8, 16, 'AMD Ryzen 7 3800XT Desktop Processor'),
       ('amd-ryzen-7-5800x', 'AMD', 'Vermeer', 'Ryzen 7', 'AM4', 8, 16, 'AMD Ryzen 7 5800X Desktop Processor'),
       ('amd-ryzen-9-3900x', 'AMD', 'Matisse', 'Ryzen 9', 'AM4', 12, 24, 'AMD Ryzen 9 3900X Desktop Processor'),
       ('amd-ryzen-9-3900xt', 'AMD', 'Matisse 2', 'Ryzen 9', 'AM4', 12, 24, 'AMD Ryzen 9 3900XT Desktop Processor'),
       ('amd-ryzen-9-3950x', 'AMD', 'Matisse', 'Ryzen 9', 'AM4', 16, 32, 'AMD Ryzen 9 3950X Desktop Processor'),
       ('amd-ryzen-9-5900x', 'AMD', 'Vermeer', 'Ryzen 9', 'AM4', 12, 24, 'AMD Ryzen 9 5900X Desktop Processor'),
       ('amd-ryzen-9-5950x', 'AMD', 'Vermeer', 'Ryzen 9', 'AM4', 16, 32, 'AMD Ryzen 9 5950X Desktop Processor'),
       ('intel-i3-10100', 'Intel', 'Comet Lake', 'Core i3', 'LGA1200', 4, 8, 'Intel Core i3-10100 Processor'),
       ('intel-i3-10100F', 'Intel', 'Comet Lake', 'Core i3', 'LGA1200', 4, 8, 'Intel Core i3-10100F Processor'),
       ('intel-i3-8100', 'Intel', 'Coffee Lake', 'Core i3', 'LGA1151', 4, 4, 'Intel Core i3-8100 Processor'),
       ('intel-i3-9100', 'Intel', 'Coffee Lake', 'Core i3', 'LGA1151', 4, 4, 'Intel Core i3-9100 Processor'),
       ('intel-i3-9100F', 'Intel', 'Coffee Lake', 'Core i3', 'LGA1151', 4, 4, 'Intel Core i3-9100F Processor'),
       ('intel-i5-10400', 'Intel', 'Comet Lake', 'Core i5', 'LGA1200', 6, 12, 'Intel Core i5-10400 Processor'),
       ('intel-i5-10400F', 'Intel', 'Comet Lake', 'Core i5', 'LGA1200', 6, 12, 'Intel Core i5-10400F Processor'),
       ('intel-i5-10500', 'Intel', 'Comet Lake', 'Core i5', 'LGA1200', 6, 12, 'Intel Core i5-10500 Processor'),
       ('intel-i5-10600', 'Intel', 'Comet Lake', 'Core i5', 'LGA1200', 6, 12, 'Intel Core i5-10600 Processor'),
       ('intel-i5-10600K', 'Intel', 'Comet Lake', 'Core i5', 'LGA1200', 6, 12, 'Intel Core i5-10600K Processor'),
       ('intel-i5-10600KF', 'Intel', 'Comet Lake', 'Core i5', 'LGA1200', 6, 12, 'Intel Core i5-10600KF Processor'),
       ('intel-i5-8400', 'Intel', 'Coffee Lake', 'Core i5', 'LGA1151', 6, 6, 'Intel Core i5-8400 Processor'),
       ('intel-i5-8500', 'Intel', 'Coffee Lake', 'Core i5', 'LGA1151', 6, 6, 'Intel Core i5-8500 Processor'),
       ('intel-i5-9400', 'Intel', 'Coffee Lake', 'Core i5', 'LGA1151', 6, 6, 'Intel Core i5-9400 Processor'),
       ('intel-i5-9400F', 'Intel', 'Coffee Lake', 'Core i5', 'LGA1151', 6, 6, 'Intel Core i5-9400F Processor'),
       ('intel-i5-9600K', 'Intel', 'Coffee Lake', 'Core i5', 'LGA1151', 6, 6, 'Intel Core i5-9600K Processor'),
       ('intel-i7-10700', 'Intel', 'Comet Lake', 'Core i7', 'LGA1200', 8, 16, 'Intel Core i7-10700 Processor'),
       ('intel-i7-10700F', 'Intel', 'Comet Lake', 'Core i7', 'LGA1200', 8, 16, 'Intel Core i7-10700F Processor'),
       ('intel-i7-10700K', 'Intel', 'Comet Lake', 'Core i7', 'LGA1200', 8, 16, 'Intel Core i7-10700K Processor'),
       ('intel-i7-10700KF', 'Intel', 'Comet Lake', 'Core i7', 'LGA1200', 8, 16, 'Intel Core i7-10700KF Processor'),
       ('intel-i7-8700', 'Intel', 'Coffee Lake', 'Core i7', 'LGA1151', 6, 12, 'Intel Core i7-8700 Processor'),
       ('intel-i7-8700K', 'Intel', 'Coffee Lake', 'Core i7', 'LGA1151', 6, 12, 'Intel Core i7-8700K Processor'),
       ('intel-i7-9700', 'Intel', 'Coffee Lake', 'Core i7', 'LGA1151', 8, 8, 'Intel Core i7-9700 Processor'),
       ('intel-i7-9700F', 'Intel', 'Coffee Lake', 'Core i7', 'LGA1151', 8, 8, 'Intel Core i7-9700F Processor'),
       ('intel-i7-9700K', 'Intel', 'Coffee Lake', 'Core i7', 'LGA1151', 8, 8, 'Intel Core i7-9700K Processor'),
       ('intel-i7-9700KF', 'Intel', 'Coffee Lake', 'Core i7', 'LGA1151', 8, 8, 'Intel Core i7-9700KF Processor'),
       ('intel-i9-10850K', 'Intel', 'Comet Lake', 'Core i9', 'LGA1200', 10, 20, 'Intel Core i9-10850K Processor'),
       ('intel-i9-10900', 'Intel', 'Comet Lake', 'Core i9', 'LGA1200', 10, 20, 'Intel Core i9-10900 Processor'),
       ('intel-i9-10900F', 'Intel', 'Comet Lake', 'Core i9', 'LGA1200', 10, 20, 'Intel Core i9-10900F Processor'),
       ('intel-i9-10900K', 'Intel', 'Comet Lake', 'Core i9', 'LGA1200', 10, 20, 'Intel Core i9-10900K Processor'),
       ('intel-i9-10900KF', 'Intel', 'Comet Lake', 'Core i9', 'LGA1200', 10, 20, 'Intel Core i9-10900KF Processor');
/*!40000 ALTER TABLE `cpu` ENABLE KEYS */;
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

-- Dump completed on 2021-02-03 14:03:26
