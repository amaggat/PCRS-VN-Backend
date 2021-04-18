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
-- Table structure for table `gpu`
--

DROP TABLE IF EXISTS `gpu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gpu`
(
    `ID`           varchar(100) NOT NULL,
    `manufacturer` varchar(100) NOT NULL,
    `serieName`    varchar(100) NOT NULL,
    `chipset`      varchar(100) NOT NULL,
    `VRam`         int          NOT NULL,
    `fullname`     text         NOT NULL,
    PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gpu`
--

LOCK
TABLES `gpu` WRITE;
/*!40000 ALTER TABLE `gpu` DISABLE KEYS */;
INSERT INTO `gpu`
VALUES ('asus-geforce-gt-710-gt710-sl-2gd5', 'Asus', 'GT710-SL-2GD5', 'GT 710', 2, 'Asus GeForce GT 710 GT710-SL-2GD5'),
       ('asus-geforce-gtx-1060-6gb-strix-oc', 'Asus', 'STRIX OC', 'GTX 1060 6GB', 6,
        'Asus GeForce GTX 1060 6GB STRIX OC'),
       ('asus-geforce-gtx-1650-dual-oc', 'Asus', 'DUAL OC', 'GTX 1650', 4, 'Asus GeForce GTX 1650 DUAL OC'),
       ('asus-geforce-gtx-1650-phoenix-oc', 'Asus', 'Phoenix OC', 'GTX 1650', 4, 'Asus GeForce GTX 1650 Phoenix OC'),
       ('asus-geforce-gtx-1650-super-strix-gaming-oc', 'Asus', 'STRIX GAMING OC', 'GTX 1650 SUPER', 4,
        'Asus GeForce GTX 1650 SUPER STRIX GAMING OC'),
       ('asus-geforce-gtx-1650-super-tuf-gaming', 'Asus', 'TUF GAMING', 'GTX 1650 SUPER', 4,
        'Asus GeForce GTX 1650 SUPER TUF GAMING'),
       ('asus-geforce-gtx-1650-super-tuf-gaming-oc', 'Asus', 'TUF GAMING OC', 'GTX 1650 SUPER', 4,
        'Asus GeForce GTX 1650 SUPER TUF GAMING OC'),
       ('asus-geforce-gtx-1660-super-tuf-gaming-x3-oc', 'Asus', 'TUF Gaming X3 OC', 'GTX 1660 SUPER', 6,
        'Asus GeForce GTX 1660 SUPER TUF Gaming X3 OC'),
       ('asus-geforce-rtx-2060-dual-mini-oc', 'Asus', 'DUAL MINI OC', 'RTX 2060', 6,
        'Asus GeForce RTX 2060 DUAL MINI OC'),
       ('asus-geforce-rtx-2070-dual-evo-oc-v2', 'Asus', 'DUAL EVO OC V2', 'RTX 2070', 8,
        'Asus GeForce RTX 2070 DUAL EVO OC V2'),
       ('asus-geforce-rtx-2080-ti-matrix', 'Asus', 'MATRIX', 'RTX 2080 Ti', 11, 'Asus GeForce RTX 2080 Ti MATRIX'),
       ('asus-geforce-rtx-3060-ti-dual-oc', 'Asus', 'DUAL OC', 'RTX 3060 Ti', 8, 'Asus GeForce RTX 3060 Ti DUAL OC'),
       ('asus-geforce-rtx-3060-ti-rog-strix-gaming-oc', 'Asus', 'ROG STRIX GAMING OC', 'RTX 3060 Ti', 8,
        'Asus GeForce RTX 3060 Ti ROG STRIX GAMING OC'),
       ('asus-geforce-rtx-3060-ti-tuf-gaming-oc', 'Asus', 'TUF GAMING OC', 'RTX 3060 Ti', 8,
        'Asus GeForce RTX 3060 Ti TUF GAMING OC'),
       ('asus-geforce-rtx-3070-dual', 'Asus', 'DUAL', 'RTX 3070', 8, 'Asus GeForce RTX 3070 DUAL'),
       ('asus-geforce-rtx-3070-dual-oc', 'Asus', 'DUAL OC', 'RTX 3070', 8, 'Asus GeForce RTX 3070 DUAL OC'),
       ('asus-geforce-rtx-3070-ko-gaming-oc', 'Asus', 'KO Gaming OC', 'RTX 3070', 8,
        'Asus GeForce RTX 3070 KO Gaming OC'),
       ('asus-geforce-rtx-3070-strix-gaming', 'Asus', 'STRIX GAMING', 'RTX 3070', 8,
        'Asus GeForce RTX 3070 STRIX GAMING'),
       ('asus-geforce-rtx-3070-tuf-gaming-oc', 'Asus', 'TUF GAMING OC', 'RTX 3070', 8,
        'Asus GeForce RTX 3070 TUF GAMING OC'),
       ('asus-geforce-rtx-3080-strix-gaming', 'Asus', 'STRIX GAMING', 'RTX 3080', 10,
        'Asus GeForce RTX 3080 STRIX GAMING'),
       ('asus-geforce-rtx-3080-strix-gaming-oc', 'Asus', 'STRIX GAMING OC', 'RTX 3080', 10,
        'Asus GeForce RTX 3080 STRIX GAMING OC'),
       ('asus-geforce-rtx-3080-tuf-gaming', 'Asus', 'TUF GAMING', 'RTX 3080', 10, 'Asus GeForce RTX 3080 TUF GAMING'),
       ('asus-geforce-rtx-3080-tuf-gaming-oc', 'Asus', 'TUF GAMING OC', 'RTX 3080', 10,
        'Asus GeForce RTX 3080 TUF GAMING OC'),
       ('asus-geforce-rtx-3090-strix-gaming', 'Asus', 'STRIX GAMING', 'RTX 3090', 24,
        'Asus GeForce RTX 3090 STRIX GAMING'),
       ('asus-geforce-rtx-3090-strix-gaming-oc', 'Asus', 'STRIX GAMING OC', 'RTX 3090', 24,
        'Asus GeForce RTX 3090 STRIX GAMING OC'),
       ('asus-geforce-rtx-3090-tuf-gaming', 'Asus', 'TUF GAMING', 'RTX 3090', 24, 'Asus GeForce RTX 3090 TUF GAMING'),
       ('asus-geforce-rtx-3090-tuf-gaming-oc', 'Asus', 'TUF GAMING OC', 'RTX 3090', 24,
        'Asus GeForce RTX 3090 TUF GAMING OC'),
       ('asus-radeon-rx-550---512-rx550-4g', 'Asus', 'RX550-4G', 'RX 550 - 512', 4,
        'Asus Radeon RX 550 - 512 RX550-4G'),
       ('asus-radeon-rx-5600-xt-strix-gaming-oc', 'Asus', 'STRIX GAMING OC', 'RX 5600 XT', 6,
        'Asus Radeon RX 5600 XT STRIX GAMING OC'),
       ('asus-radeon-rx-5600-xt-tuf-gaming-x3-evo-oc', 'Asus', 'TUF Gaming X3 EVO OC', 'RX 5600 XT', 6,
        'Asus Radeon RX 5600 XT TUF Gaming X3 EVO OC'),
       ('asus-radeon-rx-570-rog-strix', 'Asus', 'ROG STRIX', 'RX 570', 4, 'Asus Radeon RX 570 ROG STRIX'),
       ('gigabyte-geforce-gt-1030-gv-n1030oc-2gi', 'Gigabyte', 'GV-N1030OC-2GI', 'GT 1030', 2,
        'Gigabyte GeForce GT 1030 GV-N1030OC-2GI'),
       ('gigabyte-geforce-gt-710-gv-n710d3-1gl-1.0', 'Gigabyte', 'GV-N710D3-1GL 1.0', 'GT 710', 1,
        'Gigabyte GeForce GT 710 GV-N710D3-1GL 1.0'),
       ('gigabyte-geforce-gt-710-gv-n710sl-2gl', 'Gigabyte', 'GV-N710SL-2GL', 'GT 710', 2,
        'Gigabyte GeForce GT 710 GV-N710SL-2GL'),
       ('gigabyte-geforce-gtx-1650-super-windforce-oc', 'Gigabyte', 'WINDFORCE OC', 'GTX 1650 SUPER', 4,
        'Gigabyte GeForce GTX 1650 SUPER WINDFORCE OC'),
       ('gigabyte-geforce-gtx-1650-windforce-oc', 'Gigabyte', 'WINDFORCE OC', 'GTX 1650', 4,
        'Gigabyte GeForce GTX 1650 WINDFORCE OC'),
       ('gigabyte-geforce-gtx-1660-super-gaming', 'Gigabyte', 'GAMING', 'GTX 1660 SUPER', 6,
        'Gigabyte GeForce GTX 1660 SUPER GAMING'),
       ('gigabyte-geforce-rtx-2060-super-windforce-oc', 'Gigabyte', 'WINDFORCE OC', 'RTX 2060 SUPER', 8,
        'Gigabyte GeForce RTX 2060 SUPER WINDFORCE OC'),
       ('gigabyte-geforce-rtx-2070-aorus', 'Gigabyte', 'AORUS', 'RTX 2070', 8, 'Gigabyte GeForce RTX 2070 AORUS'),
       ('gigabyte-geforce-rtx-2070-gaming-8g', 'Gigabyte', 'GAMING 8G', 'RTX 2070', 8,
        'Gigabyte GeForce RTX 2070 GAMING 8G'),
       ('gigabyte-geforce-rtx-2070-super-gaming-oc-3x', 'Gigabyte', 'GAMING OC 3X', 'RTX 2070 SUPER', 8,
        'Gigabyte GeForce RTX 2070 SUPER GAMING OC 3X'),
       ('gigabyte-geforce-rtx-2070-super-windforce-oc', 'Gigabyte', 'WINDFORCE OC', 'RTX 2070 SUPER', 8,
        'Gigabyte GeForce RTX 2070 SUPER WINDFORCE OC'),
       ('gigabyte-geforce-rtx-2070-super-windforce-oc-3x', 'Gigabyte', 'WINDFORCE OC 3X', 'RTX 2070 SUPER', 8,
        'Gigabyte GeForce RTX 2070 SUPER WINDFORCE OC 3X'),
       ('gigabyte-geforce-rtx-2070-windforce', 'Gigabyte', 'WINDFORCE', 'RTX 2070', 8,
        'Gigabyte GeForce RTX 2070 WINDFORCE'),
       ('gigabyte-geforce-rtx-2070-windforce-2x', 'Gigabyte', 'WINDFORCE 2X', 'RTX 2070', 8,
        'Gigabyte GeForce RTX 2070 WINDFORCE 2X'),
       ('gigabyte-geforce-rtx-2080-aorus', 'Gigabyte', 'AORUS', 'RTX 2080', 8, 'Gigabyte GeForce RTX 2080 AORUS'),
       ('gigabyte-geforce-rtx-2080-aorus-xtreme', 'Gigabyte', 'AORUS XTREME', 'RTX 2080', 8,
        'Gigabyte GeForce RTX 2080 AORUS XTREME'),
       ('gigabyte-geforce-rtx-2080-aorus-xtreme-waterforce', 'Gigabyte', 'AORUS XTREME WATERFORCE', 'RTX 2080', 8,
        'Gigabyte GeForce RTX 2080 AORUS XTREME WATERFORCE'),
       ('gigabyte-geforce-rtx-2080-ti-aorus-xtreme-waterforce', 'Gigabyte', 'AORUS XTREME WATERFORCE', 'RTX 2080 Ti',
        11, 'Gigabyte GeForce RTX 2080 Ti AORUS XTREME WATERFORCE'),
       ('gigabyte-geforce-rtx-3060-ti-aorus-master', 'Gigabyte', 'AORUS MASTER', 'RTX 3060 Ti', 8,
        'Gigabyte GeForce RTX 3060 Ti AORUS MASTER'),
       ('gigabyte-geforce-rtx-3060-ti-eagle', 'Gigabyte', 'EAGLE', 'RTX 3060 Ti', 8,
        'Gigabyte GeForce RTX 3060 Ti EAGLE'),
       ('gigabyte-geforce-rtx-3060-ti-eagle-oc', 'Gigabyte', 'EAGLE OC', 'RTX 3060 Ti', 8,
        'Gigabyte GeForce RTX 3060 Ti EAGLE OC'),
       ('gigabyte-geforce-rtx-3060-ti-gaming-oc', 'Gigabyte', 'GAMING OC', 'RTX 3060 Ti', 8,
        'Gigabyte GeForce RTX 3060 Ti GAMING OC'),
       ('gigabyte-geforce-rtx-3060-ti-gaming-oc-pro', 'Gigabyte', 'GAMING OC PRO', 'RTX 3060 Ti', 8,
        'Gigabyte GeForce RTX 3060 Ti GAMING OC PRO'),
       ('gigabyte-geforce-rtx-3070-aorus-master', 'Gigabyte', 'AORUS MASTER', 'RTX 3070', 8,
        'Gigabyte GeForce RTX 3070 AORUS MASTER'),
       ('gigabyte-geforce-rtx-3070-eagle', 'Gigabyte', 'EAGLE', 'RTX 3070', 8, 'Gigabyte GeForce RTX 3070 EAGLE'),
       ('gigabyte-geforce-rtx-3070-eagle-oc', 'Gigabyte', 'EAGLE OC', 'RTX 3070', 8,
        'Gigabyte GeForce RTX 3070 EAGLE OC'),
       ('gigabyte-geforce-rtx-3070-gaming-oc', 'Gigabyte', 'GAMING OC', 'RTX 3070', 8,
        'Gigabyte GeForce RTX 3070 GAMING OC'),
       ('gigabyte-geforce-rtx-3070-vision-oc', 'Gigabyte', 'Vision OC', 'RTX 3070', 8,
        'Gigabyte GeForce RTX 3070 Vision OC'),
       ('gigabyte-geforce-rtx-3080-aorus-master', 'Gigabyte', 'AORUS MASTER', 'RTX 3080', 10,
        'Gigabyte GeForce RTX 3080 AORUS MASTER'),
       ('gigabyte-geforce-rtx-3080-eagle-oc', 'Gigabyte', 'EAGLE OC', 'RTX 3080', 10,
        'Gigabyte GeForce RTX 3080 EAGLE OC'),
       ('gigabyte-geforce-rtx-3080-vision-oc', 'Gigabyte', 'Vision OC', 'RTX 3080', 10,
        'Gigabyte GeForce RTX 3080 Vision OC'),
       ('gigabyte-geforce-rtx-3090-aorus-master', 'Gigabyte', 'AORUS MASTER', 'RTX 3090', 24,
        'Gigabyte GeForce RTX 3090 AORUS MASTER'),
       ('gigabyte-geforce-rtx-3090-aorus-xtreme', 'Gigabyte', 'AORUS XTREME', 'RTX 3090', 24,
        'Gigabyte GeForce RTX 3090 AORUS XTREME'),
       ('gigabyte-geforce-rtx-3090-gv-n3090gaming-oc-24gd', 'Gigabyte', 'GV-N3090GAMING OC-24GD', 'RTX 3090', 24,
        'Gigabyte GeForce RTX 3090 GV-N3090GAMING OC-24GD'),
       ('gigabyte-geforce-rtx-3090-turbo', 'Gigabyte', 'TURBO', 'RTX 3090', 24, 'Gigabyte GeForce RTX 3090 TURBO'),
       ('gigabyte-radeon-rx-5600-xt-gaming-oc', 'Gigabyte', 'GAMING OC', 'RX 5600 XT', 6,
        'Gigabyte Radeon RX 5600 XT GAMING OC'),
       ('gigabyte-radeon-rx-6800-xt-gv-r68xt-16gc-b', 'Gigabyte', 'GV-R68XT-16GC-B', 'RX 6800 XT', 16,
        'Gigabyte Radeon RX 6800 XT GV-R68XT-16GC-B'),
       ('msi-geforce-gt-1030-aero-itx-oc', 'MSI', 'AERO ITX OC', 'GT 1030', 2, 'MSI GeForce GT 1030 AERO ITX OC'),
       ('msi-geforce-gtx-1050-ti-aero-itx', 'MSI', 'AERO ITX', 'GTX 1050 Ti', 4, 'MSI GeForce GTX 1050 Ti AERO ITX'),
       ('msi-geforce-gtx-1650-d6-aero-itx-oc', 'MSI', 'D6 AERO ITX OC', 'GTX 1650', 4,
        'MSI GeForce GTX 1650 D6 AERO ITX OC'),
       ('msi-geforce-gtx-1650-d6-ventus-xs-oc', 'MSI', 'D6 VENTUS XS OC', 'GTX 1650', 4,
        'MSI GeForce GTX 1650 D6 VENTUS XS OC'),
       ('msi-geforce-gtx-1650-super-gaming-x', 'MSI', 'GAMING X', 'GTX 1650 SUPER', 4,
        'MSI GeForce GTX 1650 SUPER GAMING X'),
       ('msi-geforce-gtx-1650-super-ventus-xs-oc', 'MSI', 'VENTUS XS OC', 'GTX 1650 SUPER', 4,
        'MSI GeForce GTX 1650 SUPER VENTUS XS OC'),
       ('msi-geforce-gtx-1650-ventus-xs-oc', 'MSI', 'VENTUS XS OC', 'GTX 1650', 4, 'MSI GeForce GTX 1650 VENTUS XS OC'),
       ('msi-geforce-gtx-1660-super-gaming-x', 'MSI', 'GAMING X', 'GTX 1660 SUPER', 6,
        'MSI GeForce GTX 1660 SUPER GAMING X'),
       ('msi-geforce-gtx-1660-super-ventus-xs-oc', 'MSI', 'VENTUS XS OC', 'GTX 1660 SUPER', 6,
        'MSI GeForce GTX 1660 SUPER VENTUS XS OC'),
       ('msi-geforce-gtx-1660-ti-ventus-xs-oc', 'MSI', 'VENTUS XS OC', 'GTX 1660 Ti', 6,
        'MSI GeForce GTX 1660 Ti VENTUS XS OC'),
       ('msi-geforce-gtx-1660-ventus-xs-oc', 'MSI', 'VENTUS XS OC', 'GTX 1660', 6, 'MSI GeForce GTX 1660 VENTUS XS OC'),
       ('msi-geforce-rtx-2060-gaming-z', 'MSI', 'GAMING Z', 'RTX 2060', 6, 'MSI GeForce RTX 2060 GAMING Z'),
       ('msi-geforce-rtx-2060-super-armor-oc', 'MSI', 'ARMOR OC', 'RTX 2060 SUPER', 8,
        'MSI GeForce RTX 2060 SUPER ARMOR OC'),
       ('msi-geforce-rtx-2060-super-gaming-x', 'MSI', 'GAMING X', 'RTX 2060 SUPER', 8,
        'MSI GeForce RTX 2060 SUPER GAMING X'),
       ('msi-geforce-rtx-2060-super-ventus-oc', 'MSI', 'VENTUS OC', 'RTX 2060 SUPER', 8,
        'MSI GeForce RTX 2060 SUPER VENTUS OC'),
       ('msi-geforce-rtx-2060-ventus-xs-oc', 'MSI', 'VENTUS XS OC', 'RTX 2060', 6, 'MSI GeForce RTX 2060 VENTUS XS OC'),
       ('msi-geforce-rtx-2070-armor', 'MSI', 'ARMOR', 'RTX 2070', 8, 'MSI GeForce RTX 2070 ARMOR'),
       ('msi-geforce-rtx-2070-gaming-z', 'MSI', 'GAMING Z', 'RTX 2070', 8, 'MSI GeForce RTX 2070 GAMING Z'),
       ('msi-geforce-rtx-2070-super-gaming-x-trio', 'MSI', 'GAMING X TRIO', 'RTX 2070 SUPER', 8,
        'MSI GeForce RTX 2070 SUPER GAMING X TRIO'),
       ('msi-geforce-rtx-2070-super-ventus-gp-oc', 'MSI', 'VENTUS GP OC', 'RTX 2070 SUPER', 8,
        'MSI GeForce RTX 2070 SUPER VENTUS GP OC'),
       ('msi-geforce-rtx-2080-duke', 'MSI', 'DUKE', 'RTX 2080', 8, 'MSI GeForce RTX 2080 DUKE'),
       ('msi-geforce-rtx-2080-gaming-x-trio', 'MSI', 'GAMING X TRIO', 'RTX 2080', 8,
        'MSI GeForce RTX 2080 GAMING X TRIO'),
       ('msi-geforce-rtx-2080-sea-hawk-x', 'MSI', 'SEA HAWK X', 'RTX 2080', 8, 'MSI GeForce RTX 2080 SEA HAWK X'),
       ('msi-geforce-rtx-2080-super-gaming-x-trio', 'MSI', 'GAMING X TRIO', 'RTX 2080 SUPER', 8,
        'MSI GeForce RTX 2080 SUPER GAMING X TRIO'),
       ('msi-geforce-rtx-2080-ti-aero', 'MSI', 'AERO', 'RTX 2080 Ti', 11, 'MSI GeForce RTX 2080 Ti AERO'),
       ('msi-geforce-rtx-2080-ti-duke', 'MSI', 'DUKE', 'RTX 2080 Ti', 11, 'MSI GeForce RTX 2080 Ti DUKE'),
       ('msi-geforce-rtx-2080-ti-gaming-x-trio', 'MSI', 'GAMING X TRIO', 'RTX 2080 Ti', 11,
        'MSI GeForce RTX 2080 Ti GAMING X TRIO'),
       ('msi-geforce-rtx-2080-ti-lightning-z', 'MSI', 'LIGHTNING Z', 'RTX 2080 Ti', 11,
        'MSI GeForce RTX 2080 Ti LIGHTNING Z'),
       ('msi-geforce-rtx-2080-ti-sea-hawk-x', 'MSI', 'SEA HAWK X', 'RTX 2080 Ti', 11,
        'MSI GeForce RTX 2080 Ti SEA HAWK X'),
       ('msi-geforce-rtx-3060-ti-gaming-x-trio', 'MSI', 'GAMING X TRIO', 'RTX 3060 Ti', 8,
        'MSI GeForce RTX 3060 Ti GAMING X TRIO'),
       ('msi-geforce-rtx-3060-ti-ventus-2x-oc', 'MSI', 'VENTUS 2X OC', 'RTX 3060 Ti', 8,
        'MSI GeForce RTX 3060 Ti VENTUS 2X OC'),
       ('msi-geforce-rtx-3070-gaming-x-trio', 'MSI', 'GAMING X TRIO', 'RTX 3070', 8,
        'MSI GeForce RTX 3070 GAMING X TRIO'),
       ('msi-geforce-rtx-3070-suprim-x', 'MSI', 'SUPRIM X', 'RTX 3070', 8, 'MSI GeForce RTX 3070 SUPRIM X'),
       ('msi-geforce-rtx-3070-ventus-2x-oc', 'MSI', 'VENTUS 2X OC', 'RTX 3070', 8, 'MSI GeForce RTX 3070 VENTUS 2X OC'),
       ('msi-geforce-rtx-3070-ventus-3x-oc', 'MSI', 'VENTUS 3X OC', 'RTX 3070', 8, 'MSI GeForce RTX 3070 VENTUS 3X OC'),
       ('msi-geforce-rtx-3080-gaming-x-trio', 'MSI', 'GAMING X TRIO', 'RTX 3080', 10,
        'MSI GeForce RTX 3080 GAMING X TRIO'),
       ('msi-geforce-rtx-3080-suprim-x', 'MSI', 'SUPRIM X', 'RTX 3080', 10, 'MSI GeForce RTX 3080 SUPRIM X'),
       ('msi-geforce-rtx-3080-ventus-3x-oc', 'MSI', 'VENTUS 3X OC', 'RTX 3080', 10,
        'MSI GeForce RTX 3080 VENTUS 3X OC'),
       ('msi-geforce-rtx-3090-gaming-trio', 'MSI', 'GAMING TRIO', 'RTX 3090', 24, 'MSI GeForce RTX 3090 GAMING TRIO'),
       ('msi-geforce-rtx-3090-gaming-x-trio', 'MSI', 'GAMING X TRIO', 'RTX 3090', 24,
        'MSI GeForce RTX 3090 GAMING X TRIO'),
       ('msi-geforce-rtx-3090-ventus-3x-oc', 'MSI', 'VENTUS 3X OC', 'RTX 3090', 24,
        'MSI GeForce RTX 3090 VENTUS 3X OC'),
       ('msi-radeon-rx-5600-xt-gaming-x', 'MSI', 'GAMING X', 'RX 5600 XT', 6, 'MSI Radeon RX 5600 XT GAMING X'),
       ('msi-radeon-rx-5600-xt-mech-oc', 'MSI', 'MECH OC', 'RX 5600 XT', 6, 'MSI Radeon RX 5600 XT MECH OC');
/*!40000 ALTER TABLE `gpu` ENABLE KEYS */;
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
