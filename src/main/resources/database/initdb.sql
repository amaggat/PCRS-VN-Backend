CREATE DATABASE IF NOT EXISTS pc_parts_picker;

ALTER DATABASE pc_parts_picker
    DEFAULT CHARACTER SET utf8
    DEFAULT COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`user` (
    `ID` INT NOT NULL,
    `Username` VARCHAR(100) NOT NULL,
    `password` VARCHAR(100) NOT NULL,
    `mail` VARCHAR(100) NOT NULL,
    `UserType` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`ID`)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`psu` (
    `ID` VARCHAR(100) NOT NULL,
    `manufacturer` VARCHAR(100) NOT NULL,
    `serieName` VARCHAR(100) NOT NULL,
    `chipset` VARCHAR(100) NULL,
    `power` INT NOT NULL,
    `standard_80` VARCHAR(100) NOT NULL,
    `fullname` TEXT NOT NULL,
    PRIMARY KEY (`ID`)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`cpu` (
    `ID` VARCHAR(100) NOT NULL,
    `manufacturer` VARCHAR(100) NOT NULL,
    `serieName` VARCHAR(100) NOT NULL,
    `chipset` VARCHAR(100) NULL,
    `socket` VARCHAR(100) NOT NULL,
    `Cores` INT NOT NULL,
    `Threads` INT NOT NULL,
    `fullname` TEXT NOT NULL,
    PRIMARY KEY (`ID`)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`mainboard` (
    `ID` VARCHAR(100) NOT NULL,
    `manufacturer` VARCHAR(100) NOT NULL,
    `serieName` VARCHAR(100) NOT NULL,
    `chipset` VARCHAR(100) NOT NULL,
    `socket` VARCHAR(100) NOT NULL,
    `size` VARCHAR(100) NOT NULL,
    `fullname` TEXT NOT NULL,
    PRIMARY KEY (`ID`)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`ram` (
    `ID` VARCHAR(100) NOT NULL,
    `manufacturer` VARCHAR(100) NOT NULL,
    `serieName` VARCHAR(100) NOT NULL,
    `sizeOfRam` INT NOT NULL,
    `chipset` VARCHAR(100) NOT NULL,
    `clockSpeed` INT NOT NULL,
    `fullname` TEXT NOT NULL,
    PRIMARY KEY (`ID`)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`ssd` (
    `ID` VARCHAR(100) NOT NULL,
    `manufacturer` VARCHAR(100) NOT NULL,
    `serieName` VARCHAR(100) NOT NULL,
    `size` VARCHAR(1000) NOT NULL,
    `chipset` VARCHAR(100) NOT NULL,
    `fullname` TEXT NOT NULL,
    PRIMARY KEY (`ID`)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`gpu` (
    `ID` VARCHAR(100) NOT NULL,
    `manufacturer` VARCHAR(100) NOT NULL,
    `serieName` VARCHAR(100) NOT NULL,
    `chipset` VARCHAR(100) NOT NULL,
    `VRam` INT NOT NULL,
    `fullname` TEXT NOT NULL,
    PRIMARY KEY (`ID`)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`hdd` (
    `ID` VARCHAR(100) NOT NULL,
    `manufacturer` VARCHAR(100) NOT NULL,
    `serieName` VARCHAR(100) NOT NULL,
    `size` VARCHAR(100) NOT NULL,
    `chipset` VARCHAR(100) NULL,
    `fullname` TEXT NOT NULL,
    PRIMARY KEY (`ID`)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`pcprofile` (
    `ID` VARCHAR(100) NOT NULL,
    `UserID` INT NOT NULL,
    `PcName` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`ID`),
    FOREIGN KEY (`UserID`) REFERENCES user(ID)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`pcprofile_ram`
(
    `PcID` VARCHAR(100) NOT NULL,
    `RamID` VARCHAR(100) NOT NULL,

    FOREIGN KEY (`PcID`) REFERENCES pcprofile(ID),
    FOREIGN KEY (`RamID`) REFERENCES ram(ID)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`pcprofile_cpu`
(
    `PcID` VARCHAR(100) NOT NULL,
    `CpuID` VARCHAR(100) NOT NULL,

    FOREIGN KEY (`PcID`) REFERENCES pcprofile(ID),
    FOREIGN KEY (`CpuID`) REFERENCES cpu(ID)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`pcprofile_mainboard`
(
    `PcID` VARCHAR(100) NOT NULL,
    `MainID` VARCHAR(100) NOT NULL,

    FOREIGN KEY (`PcID`) REFERENCES pcprofile(ID),
    FOREIGN KEY (`MainID`) REFERENCES mainboard(ID)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`pcprofile_gpu`
(
    `PcID` VARCHAR(100) NOT NULL,
    `GpuID` VARCHAR(100) NOT NULL,

    FOREIGN KEY (`PcID`) REFERENCES pcprofile(ID),
    FOREIGN KEY (`GpuID`) REFERENCES gpu(ID)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`pcprofile_psu`
(
    `PcID` VARCHAR(100) NOT NULL,
    `PsuID` VARCHAR(100) NOT NULL,

    FOREIGN KEY (`PcID`) REFERENCES pcprofile(ID),
    FOREIGN KEY (`PsuID`) REFERENCES psu(ID)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`pcprofile_ssd`
(
    `PcID` VARCHAR(100) NOT NULL,
    `SsdID` VARCHAR(100) NOT NULL,

    FOREIGN KEY (`PcID`) REFERENCES pcprofile(ID),
    FOREIGN KEY (`SsdID`) REFERENCES ssd(ID)
);

CREATE TABLE IF NOT EXISTS `pc_parts_picker`.`pcprofile_hdd`
(
    `PcID` VARCHAR(100) NOT NULL,
    `HddID` VARCHAR(100) NOT NULL,

    FOREIGN KEY (`PcID`) REFERENCES pcprofile(ID),
    FOREIGN KEY (`HddID`) REFERENCES hdd(ID)
);

