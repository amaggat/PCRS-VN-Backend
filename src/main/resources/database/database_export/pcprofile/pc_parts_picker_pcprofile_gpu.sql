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
-- Table structure for table `pcprofile_gpu`
--

DROP TABLE IF EXISTS `pcprofile_gpu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pcprofile_gpu`
(
    `PcID`  varchar(100) NOT NULL,
    `GpuID` varchar(100) NOT NULL,
    KEY     `FK27ym360rk3t4ibvxbd7xfg3ly` (`GpuID`),
    KEY     `FK43grct2277fq9rx72til5wyux` (`PcID`),
    CONSTRAINT `FK27ym360rk3t4ibvxbd7xfg3ly` FOREIGN KEY (`GpuID`) REFERENCES `GraphicProcessor` (`ID`),
    CONSTRAINT `FK43grct2277fq9rx72til5wyux` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
    CONSTRAINT `pcprofile_gpu_ibfk_1` FOREIGN KEY (`PcID`) REFERENCES `pcprofile` (`ID`),
    CONSTRAINT `pcprofile_gpu_ibfk_2` FOREIGN KEY (`GpuID`) REFERENCES `GraphicProcessor` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pcprofile_gpu`
--

LOCK
TABLES `pcprofile_gpu` WRITE;
/*!40000 ALTER TABLE `pcprofile_gpu` DISABLE KEYS */;
INSERT INTO `pcprofile_gpu`
VALUES ('entry-level-amd-build', 'gigabyte-radeon-rx-6800-xt-gv-r68xt-16gc-b'),
       ('entry-level-intel-build', 'msi-geforce-rtx-3060-ti-gaming-x-trio'),
       ('high-end-intel-build', 'asus-geforce-rtx-3090-strix-gaming'),
       ('high-end-amd-build', 'gigabyte-radeon-rx-6800-xt-gv-r68xt-16gc-b'),
       ('low-end-intel-build', 'asus-geforce-gtx-1650-super-tuf-gaming'),
       ('low-end-amd-build', 'asus-radeon-rx-570-rog-strix'),
       ('streaming-intel-build', 'msi-geforce-gtx-1050-ti-aero-itx'),
       ('streaming-amd-build', 'msi-geforce-gtx-1650-d6-ventus-xs-oc');
/*!40000 ALTER TABLE `pcprofile_gpu` ENABLE KEYS */;
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
