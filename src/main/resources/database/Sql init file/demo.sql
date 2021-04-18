INSERT
IGNORE INTO `pc_parts_picker`.cpu VALUES ('id', 'manufacturer', 'serie', 'chipset', 'socket', '1', '2', 'fullname');
INSERT
IGNORE INTO `pc_parts_picker`.cpu VALUES ('intel-i7-10700', 'Intel', 'Core i7', 'Comet Lake', 'LGA1200', '8', '16', 'Intel Core i7-10700 Processor');
INSERT
IGNORE INTO `pc_parts_picker`.cpu VALUES ('intel-i5-10400', 'Intel', 'Core i5', 'Comet Lake', 'LGA1200', '6', '12', 'Intel Core i5-10400 Processor');
INSERT
IGNORE INTO `pc_parts_picker`.cpu VALUES ('intel-i3-10100', 'Intel', 'Core i3', 'Comet Lake', 'LGA1200', '4', '8', 'Intel Core i3-10100 Processor');
INSERT
IGNORE INTO `pc_parts_picker`.cpu VALUES ('amd-ryzen-5-5600x', 'AMD', 'Ryzen', 'Vermeer', 'FGAAM4', '6', '12', 'AMD Ryzen 5 5600X Desktop Processors');
INSERT
IGNORE INTO `pc_parts_picker`.cpu VALUES ('amd-ryzen-3-3300x', 'AMD', 'Ryzen', 'Matisse', 'FGAAM4', '4', '8', 'AMD Ryzen 3 3300X Desktop Processor');
INSERT
IGNORE INTO `pc_parts_picker`.cpu VALUES ('amd-ryzen-3-3100', 'AMD', 'Ryzen', 'Matisse', 'FGAAM4', '4', '8', 'AMD Ryzen 3 3100 Desktop Processor');


INSERT
IGNORE INTO `pc_parts_picker`.mainboard VALUES ('id', 'manufacturer', 'serie', 'chipset', 'socket', 'size', 'fullname');
INSERT
IGNORE INTO `pc_parts_picker`.mainboard VALUES ('asus-b460f-rog-strix', 'Asus', 'Rog Strix', 'B460', 'LGA1200', 'ATX', 'ASUS ROG STRIX B460-F');
INSERT
IGNORE INTO `pc_parts_picker`.mainboard VALUES ('asrock-b450m-steel-legend', 'Asrock', 'Steel Legend', 'B450', 'AM4', 'M-ATX', 'ASROCK B450M STEEL LEGEND');
INSERT
IGNORE INTO `pc_parts_picker`.mainboard VALUES ('msi-h410m-pro', 'MSI', 'PRO', 'H410', 'LGA1200', 'M-ATX', 'MSI H410M PRO');
INSERT
IGNORE INTO `pc_parts_picker`.mainboard VALUES ('gigabyte-z490-aorus-mapsu_price_listster', 'Gigabyte', 'Aorus Master', 'Z490', 'LGA1200', 'ATX', 'GIGABYTE Z490 AORUS MASTER');
INSERT
IGNORE INTO `pc_parts_picker`.mainboard VALUES ('gigabyte-b550i-aorus-pro-ax', 'Gigabyte', 'Aorus Pro', 'B550', 'AM4', 'ITX', 'GIGABYTE B550I AORUS PRO AX');
INSERT
IGNORE INTO `pc_parts_picker`.mainboard VALUES ('asrock-a420-hdvp', 'Asrock', 'HDVP', 'A520', 'AM4', 'M-ATX', 'ASROCK A520M-HDVP');


INSERT
IGNORE INTO `pc_parts_picker`.ram VALUES ('id', 'manufacturer', 'serie', 'size', 'chipset', 'clockSpeed', 'fullname');
INSERT
IGNORE INTO `pc_parts_picker`.ram VALUES ('gskill-tridentz-2x8-gddr4-3600', 'G.Skill', 'Trident', '16', 'GDDR4', '3600', 'RAM G.Skill TRIDENT Z RGB 16GB (2x8GB)');
INSERT
IGNORE INTO `pc_parts_picker`.ram VALUES ('corsair-vengeance-1x8-gddr4-2666', 'Corsair', 'Vengeance', '8', 'GDDR4', '2666', 'RAM Corsair Vengeance LPX 8GB (1x8GB)');
INSERT
IGNORE INTO `pc_parts_picker`.ram VALUES ('kingston-hyperx-1x4-gddr4-2400', 'Kingston', 'HyperX', '4', 'GDDR4', '2400', 'RAM Kingston HyperX Fury 4GB (1x4GB)');
INSERT
IGNORE INTO `pc_parts_picker`.ram VALUES ('adata-xpg-gammix-1x8-gddr4-2400', 'Adata', 'XPG', '8', 'GDDR4', '2400', 'RAM ADATA XPG GAMMIX D10 8GB (1x8GB)');
INSERT
IGNORE INTO `pc_parts_picker`.ram VALUES ('apacer-panther-2x4-gddr4-2666', 'Apacer', 'Panther', '8', 'GDDR4', '2666', 'RAM Apacer Panther 8GB (2x4GB)');


INSERT
IGNORE INTO `pc_parts_picker`.ssd VALUES ('id', 'manufacturer', 'serie', 'size', 'chipset', 'fullname');
INSERT
IGNORE INTO `pc_parts_picker`.ssd VALUES ('samsung-evo970-512-m2nvme', 'Samsung', 'EVO 970', '512 GB', 'M.2 NVMe', ' SSD Samsung 970 PRO 512GB');
INSERT
IGNORE INTO `pc_parts_picker`.ssd VALUES ('pny-cs2040-120-m2sata', 'PNY', 'CS2040', '120 GB', 'M.2 SATA', 'SSD PNY CS900 120GB');
INSERT
IGNORE INTO `pc_parts_picker`.ssd VALUES ('wd-black-1024-m2nvme', 'Western Digital', 'Black', '1 TB', 'M.2 NVMe', 'SSD Western Digital Black SN750 PCIe Gen3 x4 NVMe M.2 1TB');
INSERT
IGNORE INTO `pc_parts_picker`.ssd VALUES ('kioxia-exceria-480-2.5sata', 'KIOXIA', 'Exceria', '480 GB', '2.5 SATA', 'SSD Kioxia (TOSHIBA) Exceria 3D NAND 2.5-Inch SATA III BiCS FLASH 480GB');
INSERT
IGNORE INTO `pc_parts_picker`.ssd VALUES ('wd-green-120-m2sata', 'Western Digital', 'Green', '120 GB', 'M.2 SATA', 'SSD WD Green 120GB M.2 2280');
INSERT
IGNORE INTO `pc_parts_picker`.ssd VALUES ('kingston-a400-240-m2sata', 'Kingston', 'A400', '240 GB', 'M.2 SATA', 'SSD Kingston A400 240GB');

INSERT
IGNORE INTO `pc_parts_picker`.hdd VALUES ('id', 'manufacturer', 'serie', 'size', 'chipset', 'fullname');
INSERT
IGNORE INTO `pc_parts_picker`.hdd VALUES ('wd-green-1024-3.5sata', 'Western Digital', 'Green', '1 TB', '3.5 SATA', 'HDD WD Green 1TB');
INSERT
IGNORE INTO `pc_parts_picker`.hdd VALUES ('seagate-barracuda-2048-3.5sata', 'Seagate', 'Barracuda', '1 TB', '3.5 SATA', 'HDD Seagate Barracuda 2TB');

INSERT
IGNORE INTO `pc_parts_picker`.gpu VALUES ('id', 'manufacturer', 'serie', 'chipset', 'Vram', 'fullname');
INSERT
IGNORE INTO `pc_parts_picker`.gpu VALUES ('asus-kogaming-rtx3060ti', 'Asus', 'NVIDIA', 'RTX 3060 ti', '6', 'VGA ASUS RTX 3060 Ti 8GB KO GAMING');
INSERT
IGNORE INTO `pc_parts_picker`.gpu VALUES ('galax-exgamerwhite-rtx3070', 'GALAX', 'NVIDIA', 'RTX 3070', '8', 'GALAX GeForce RTX™ 3070 EX Gamer White (1-Click OC)');
INSERT
IGNORE INTO `pc_parts_picker`.gpu VALUES ('msi-gamingx-rx5600xt', 'MSI', 'AMD', 'RX5600XT', '8', 'MSI RX 5600 XT GAMING X');
INSERT
IGNORE INTO `pc_parts_picker`.gpu VALUES ('zotac-amp!edition-gtx1060', 'Zotac', 'NVIDIA', 'GTX 1060', '6', 'ZOTAC GeForce GTX 1060 AMP! Edition');
INSERT
IGNORE INTO `pc_parts_picker`.gpu VALUES ('evga-koultragaming-rtx2060', 'EVGA', 'NVIDIA', 'RTX 2060', '6', 'EVGA GeForce RTX 2060 KO ULTRA GAMING');
INSERT
IGNORE INTO `pc_parts_picker`.gpu VALUES ('gigabyte-radeon-rx6800xt', 'Gigabyte', 'AMD', 'RX6800XT', '16', 'Gigabyte Radeon RX 6800 XT 16G');


INSERT
IGNORE INTO `pc_parts_picker`.psu VALUES ('id', 'manufacturer', 'serie', 'chipset', 'Vram', 'fullname');
INSERT
IGNORE INTO `pc_parts_picker`.psu VALUES ('corsair-cx550-bronze', 'Corsair', 'CX', 'ATX', '550', 'bronze', 'Corsair CX550 - 80 Plus Bronze');
INSERT
IGNORE INTO `pc_parts_picker`.psu VALUES ('cm-elitev3-700-none', 'Cooler Master', 'Elite V3', 'ATX', '700', 'none', 'Cooler Master Elite V3 230V PC700');
INSERT
IGNORE INTO `pc_parts_picker`.psu VALUES ('xigmatek-cerberus-550-bronze', 'Xigmatek', 'Cerberus', 'ATX', '650', 'bronze', 'XIGMATEK CERBERUS S550');
INSERT
IGNORE INTO `pc_parts_picker`.psu VALUES ('silverstone-st50fes230-500-white', 'SilverStone', 'ST50F', 'ATX', '500', 'white', 'SilverStone ST50F-ES230');
INSERT
IGNORE INTO `pc_parts_picker`.psu VALUES ('evga-100bv0500k1-500-bronze', 'EVGA', '100-BV-0500-K1', 'ATX', '500', 'bronze', 'PSU EVGA 100-BV-0500-K1 500W');