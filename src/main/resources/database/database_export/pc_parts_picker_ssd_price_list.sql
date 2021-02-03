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
-- Table structure for table `ssd_price_list`
--

DROP TABLE IF EXISTS `ssd_price_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ssd_price_list` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `link` text NOT NULL,
  `img` text NOT NULL,
  `name` text NOT NULL,
  `price` int NOT NULL,
  `logo` text NOT NULL,
  `retailer` varchar(100) NOT NULL,
  `fid` varchar(100) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `fid` (`fid`),
  CONSTRAINT `ssd_price_list_ibfk_1` FOREIGN KEY (`fid`) REFERENCES `ssd` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ssd_price_list`
--

LOCK TABLES `ssd_price_list` WRITE;
/*!40000 ALTER TABLE `ssd_price_list` DISABLE KEYS */;
INSERT INTO `ssd_price_list` VALUES (1,'https://www.anphatpc.com.vn/o-cung-ssd-samsung-870-qvo-1tb-2-5-inch-sata-iii_id34479.html','https://anphat.com.vn/media/product/250_34479_1593755653_534_o_cung_ssd_1tb_samsung_870_qvo_25_inch_sata_iii_6.jpg','Ổ cứng SSD Samsung 870 QVO 1TB 2.5-Inch SATA III',3080000,'https://www.anphatpc.com.vn/template/anphat_2020/images/anphatpc.png','AnPhatPC','samsung-870-qvo-1024-m2-sata'),(2,'https://www.anphatpc.com.vn/o-cung-ssd-samsung-870-qvo-4tb-2-5-inch-sata-iii_id34481.html','https://anphat.com.vn/media/product/250_34481_1593755684_986_o_cung_ssd_2tb_samsung_870_qvo_25_inch_sata_iii_2.jpg','Ổ cứng SSD Samsung 870 QVO 4TB 2.5-Inch SATA III',12240000,'https://www.anphatpc.com.vn/template/anphat_2020/images/anphatpc.png','AnPhatPC','samsung-870-qvo-4096-m2-sata'),(3,'https://www.anphatpc.com.vn/o-cung-ssd-samsung-870-qvo-8tb-2-5-inch-sata-iii_id34482.html','https://anphat.com.vn/media/product/250_34482_1593755729_753_o_cung_ssd_8tb_samsung_870_qvo_25_inch_sata_iii_6.jpg','Ổ cứng SSD Samsung 870 QVO 8TB 2.5-Inch SATA III',22990000,'https://www.anphatpc.com.vn/template/anphat_2020/images/anphatpc.png','AnPhatPC','samsung-870-qvo-8192-m2-sata'),(4,'https://www.anphatpc.com.vn/o-cung-ssd-adata-xpg-spectrix-s40g-rgb-256gb-nvme-m.2-2280-pcie-gen-3.0-x4_id29720.html','https://anphat.com.vn/media/product/250_29720_adata_xpg_spectrix_s40g_rgb_256gb_pcie_m_2_2280_ssd_solid_state_drive_netstorecommy_1906_15_netstorecommy_9.jpg','Ổ cứng SSD ADATA XPG SPECTRIX S40G RGB 256GB NVMe M.2 2280 PCIe Gen 3.0 x4',1399000,'https://www.anphatpc.com.vn/template/anphat_2020/images/anphatpc.png','AnPhatPC','adata-xpg-spectrix-s40g-rgb-256-m2-nvme'),(5,'https://www.anphatpc.com.vn/o-cung-ssd-adata-xpg-spectrix-s40g-rgb-512gb-nvme-m.2-2280-pcie-gen-3.0-x4_id29721.html','https://anphat.com.vn/media/product/250_29721_','Ổ cứng SSD ADATA XPG SPECTRIX S40G RGB 512GB NVMe M.2 2280 PCIe Gen 3.0 x4',2349000,'https://www.anphatpc.com.vn/template/anphat_2020/images/anphatpc.png','AnPhatPC','adata-xpg-spectrix-s40g-rgb-512-m2-nvme'),(6,'https://www.anphatpc.com.vn/o-cung-ssd-samsung-870-qvo-2tb-2-5-inch-sata-iii_id34480.html','https://anphat.com.vn/media/product/250_34480_1593755684_932_o_cung_ssd_2tb_samsung_870_qvo_25_inch_sata_iii_6.jpg','Ổ cứng SSD Samsung 870 QVO 2TB 2.5-Inch SATA III',6060000,'https://www.anphatpc.com.vn/template/anphat_2020/images/anphatpc.png','AnPhatPC','samsung-870-qvo-2048-m2-sata'),(7,'https://gearvn.com/products/ssd-xpg-spectrix-s40g-rgb-led-256gb','https://product.hstatic.net/1000026716/product/ssd_adata_s40g_gearvn00_e12f3019dac0488d988a89fcecb7c517_large.jpg','SSD ADATA XPG SPECTRIX S40G RGB 256GB',1490000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','adata-xpg-spectrix-s40g-rgb-256-m2-nvme'),(8,'https://gearvn.com/products/ssd-adata-xpg-spectrix-s40g-rgb-512gb','https://product.hstatic.net/1000026716/product/ssd_adata_s40g_gearvn00_9c96b977c6cf4a8ca511b1eb5775fa33_large.jpg','SSD ADATA XPG SPECTRIX S40G RGB 512GB',2390000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','adata-xpg-spectrix-s40g-rgb-512-m2-nvme'),(9,'https://gearvn.com/products/ssd-kingston-kc600-256gb-2-5-sata3','https://product.hstatic.net/1000026716/product/gearvn-product-ssd-kc600-1_7d2f9a65e5b14003ac34247a3255407c_large.jpg','SSD Kingston KC600 256GB 2.5\" SATA3',1290000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-kc600-256-m2-sata'),(10,'https://gearvn.com/products/ssd-kingston-kc600-512gb-2-5-sata3','https://product.hstatic.net/1000026716/product/gearvn-product-ssd-kc600-1_def5e519aecb4e0888c066c5bbc37876_large.jpg','SSD Kingston KC600 512GB 2.5\" SATA3',2290000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-kc600-512-m2-sata'),(12,'https://gearvn.com/products/ssd-kingston-a400-120gb-m-2-sata-3','https://product.hstatic.net/1000026716/product/ssd-kingston-a400_1cb57dcbd5024f9da1e8b8f8a3fb9cbc_large.png','SSD KINGSTON A400 120GB M.2 Sata 3',590000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-a400-120-m2-sata'),(13,'https://gearvn.com/products/ssd-kingston-a400-240gb-m-2-sata-3','https://product.hstatic.net/1000026716/product/ssd-kingston-a400_c8d62280cba64e48935410993f606b12_large.png','SSD KINGSTON A400 240GB M.2 Sata 3',890000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-a400-240-m2-sata'),(14,'https://gearvn.com/products/ssd-kingston-a2000-500gb-m-2-nvme-sa2000m8-500g','https://product.hstatic.net/1000026716/product/gearvn.com-ssd-kingston-a2000-3_1500f2de07574538a78886c4ac2e8aa0_large.jpg','SSD KINGSTON A2000 500GB M.2 NVMe - SA2000M8/500G',2190000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-a2000-500-m2-nvme'),(15,'https://gearvn.com/products/ssd-kingston-a2000-250gb-m-2-nvme-sa2000m8-250g','https://product.hstatic.net/1000026716/product/gearvn.com-ssd-kingston-a2000-3_0f0d754eadf1458d813150f1dcd894e5_large.jpg','SSD KINGSTON A2000 250GB M.2 NVMe - SA2000M8/250G',1010000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-a2000-250-m2-nvme'),(16,'https://gearvn.com/products/ssd-kingston-a2000-1tb-m-2-nvme-sa2000m8-1000g','https://product.hstatic.net/1000026716/product/gearvn.com-ssd-kingston-a2000-3_fb9a4fd14a38408a88efed8effb4125e_large.jpg','SSD KINGSTON A2000 1TB M.2 NVMe - SA2000M8/1000G',3290000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-a2000-1024-m2-nvme'),(17,'https://gearvn.com/products/hyperx-ssd-fury-rgb-240gb-2-5-sata-3','https://product.hstatic.net/1000026716/product/ssd_kingston_hyperx_fury_rgb_large.jpg','HyperX SSD Fury RGB 240GB 2.5\" Sata 3',1990000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-hyperx-fury-rgb-240-m2-sata'),(18,'https://gearvn.com/products/hyperx-ssd-fury-rgb-480gb-2-5-sata-3','https://product.hstatic.net/1000026716/product/ssd_kingston_hyperx_fury_rgb_039917d65b514a569c528de3a75111db_large.jpg','HyperX SSD Fury RGB 480GB 2.5\" Sata 3',3350000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-hyperx-fury-rgb-480-m2-sata'),(19,'https://gearvn.com/products/hyperx-ssd-fury-rgb-960gb-2-5-sata-iii','https://product.hstatic.net/1000026716/product/hx-product-ssd-fury-rgb-shfr200-1-zm-lg_6d4fa528a68c47bda9702863383b5f53_large.jpg','HyperX SSD Fury RGB 960GB 2.5\" SATA III',5850000,'https://theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=16422','GearVN','kingston-hyperx-fury-rgb-960-m2-sata');
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

-- Dump completed on 2021-02-03 14:03:23
