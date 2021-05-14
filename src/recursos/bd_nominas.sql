-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: bq7xcggx4wgir1svxet5-mysql.services.clever-cloud.com    Database: bq7xcggx4wgir1svxet5
-- ------------------------------------------------------
-- Server version	8.0.22-13

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
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ 'a05a675a-1414-11e9-9c82-cecd01b08c7e:1-491550428,
a38a16d0-767a-11eb-abe2-cecd029e558e:1-16773307';

--
-- Table structure for table `base_cotizacion`
--

DROP TABLE IF EXISTS `base_cotizacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `base_cotizacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `categorias_profesionales` varchar(200) NOT NULL,
  `base_minima_eurosmes` double NOT NULL,
  `base_maximas_eurosmes` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `base_cotizacion`
--

LOCK TABLES `base_cotizacion` WRITE;
/*!40000 ALTER TABLE `base_cotizacion` DISABLE KEYS */;
INSERT INTO `base_cotizacion` VALUES (1,'Ingenieros y Licenciados.Personal de alta dirección no incluido en el artículo 1.3.c) del Estatuto de los Trabajadores',1466.4,4070.1),(2,'Ingenieros Técnicos, Peritos y Ayudantes Titulados',1215.9,4070.1),(3,'Jefes Administrativos y de Taller',1057.8,4070.1),(4,'Ayudantes no Titulados',1050,4070.1),(5,'Oficiales Administrativos',1050,4070.1),(6,'Subalternos',1050,4070.1),(7,'	Auxiliares Administrativos',1050,4070.1);
/*!40000 ALTER TABLE `base_cotizacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `convenios`
--

DROP TABLE IF EXISTS `convenios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `convenios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `antiguedad` double NOT NULL,
  `precio_hefm` int NOT NULL,
  `precio_her` int NOT NULL,
  `precio_hc` int NOT NULL,
  `porcentaje_fp` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `convenios`
--

LOCK TABLES `convenios` WRITE;
/*!40000 ALTER TABLE `convenios` DISABLE KEYS */;
INSERT INTO `convenios` VALUES (1,50,12,5,6,5);
/*!40000 ALTER TABLE `convenios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deducciones`
--

DROP TABLE IF EXISTS `deducciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `deducciones` (
  `id_deducciones` int NOT NULL AUTO_INCREMENT,
  `porce_hefm` double NOT NULL,
  `porce_her` double NOT NULL,
  `contingencias_com` double NOT NULL,
  `id_convenio` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_deducciones`),
  KEY `deducciones_idx` (`id_convenio`),
  CONSTRAINT `deducciones` FOREIGN KEY (`id_convenio`) REFERENCES `convenios` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deducciones`
--

LOCK TABLES `deducciones` WRITE;
/*!40000 ALTER TABLE `deducciones` DISABLE KEYS */;
INSERT INTO `deducciones` VALUES (1,14,28.3,28.3,1);
/*!40000 ALTER TABLE `deducciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `mail` varchar(150) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `num_ss` varchar(12) NOT NULL,
  `irpf` int DEFAULT '24',
  `fecha_contratacion` date NOT NULL,
  `id_convenio` int NOT NULL,
  `grupo_profesional` varchar(100) NOT NULL,
  `grupo_cotizacion` int NOT NULL,
  `sueldo_base` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_convenio` (`id_convenio`),
  KEY `empleados_ibfk_2_idx` (`grupo_cotizacion`),
  CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`id_convenio`) REFERENCES `convenios` (`id`),
  CONSTRAINT `empleados_ibfk_2` FOREIGN KEY (`grupo_cotizacion`) REFERENCES `base_cotizacion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'45672833Q','Jose Manuel','Perez Castro','jmperezcastro@gmail.com','C/Ave del paraiso n7 1A','154458941257',24,'2021-02-12',1,'Ingeniro en Software',1,1430),(2,'67854867R','Maria','Alvarez Redondo','mar@gmail.com','C/Luis Salvador n45 6A','457842334578',24,'2020-05-12',1,'Jefe de Desarrollo de Software',3,1540),(3,'56781923L','Raul','Gomez Garatea','raulgg@gmail.com','Calle Emilio Darde n3 2C','458647821554',32,'2006-06-23',1,'Ingeniro en Software',1,1430),(4,'85463521A','Juan Manuel','Franco Jimenez','josemanuelfj@gmail.com','C/Sol Naciente n23 3C','351245786524',24,'2020-09-29',1,'Auxiliar Administrativo',7,1190),(5,'84671254E','Francisco','Gonzalez Miro','franfm02@gmail.com','C/Kypro Akraisk n9 3A Bloque1','567531546874',24,'2019-09-09',1,'Auxiliar Administrativo',7,1190),(6,'35468787T','Maria Jesus','Cruz Vidal','mariajesuscv@gmail.com','C/Juan Ramon Tercero n1 4B','483587153355',24,'2017-11-23',1,'Ingeniro en Software',1,1430),(7,'45747471V','Ramon','Soler DelValle','ramonsd70@gmail.com','Calle Vadajoz n8 4A','453127864532',24,'2020-05-16',1,'Jefe de Desarrollo de Software',3,1540),(8,'68797941G','Manuel','Sierra Diaz','manuelsierrradiaz@gmail.com','C/Miquel Pastor n7 1A','986578456847',24,'2012-12-05',1,'Ingeniro en Software',1,1430),(9,'15474547Q','Miquel Angel','Ramos Garzon','miquelangelrg@gmail.com','C/Ave del paraiso n4 2B','456871354855',24,'2011-03-24',1,'Ingeniero Tecnico',2,1350),(10,'68547875K','Jose Manuel','Perez Redondo','josemanuelperezredondo@gmail.com','C/Cristoval Colom n3 3C','512484852345',24,'2018-08-01',1,'Ingeniro en Software',1,1430),(11,'54673456G','Pepe','Viyuela','pepeviyuela98@gmail.com','C/Tozino del señor n7 2A','587325478524',24,'1985-09-12',1,'Ingeniro en Software',1,2460);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresa` (
  `cif` varchar(20) NOT NULL,
  `nombre_empresa` varchar(100) NOT NULL,
  `domicilo` varchar(150) NOT NULL,
  `localidad` varchar(150) NOT NULL,
  `ccc_ss` int NOT NULL,
  PRIMARY KEY (`cif`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES ('A58818501','NominasBalears',' Carrer de Pérez Galdós, 19, Llevant (Palma de Mallorca)','Palma de Mallorca, España',1123456742);
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial_nominas`
--

DROP TABLE IF EXISTS `historial_nominas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historial_nominas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dni_empleado` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(150) NOT NULL,
  `grupo_profesional` varchar(150) NOT NULL,
  `grupo_cotzacion` int NOT NULL,
  `num_ss_empleado` varchar(12) NOT NULL,
  `irpf` double DEFAULT NULL,
  `nombre_empresa` varchar(23) DEFAULT 'NominaBalear',
  `cif` varchar(20) DEFAULT 'A58818501',
  `domicilio` varchar(150) DEFAULT ' Carrer de Pérez Galdós, 19, Llevant',
  `ccc_de_ss` int DEFAULT NULL,
  `localidad` varchar(150) DEFAULT 'Palma de Mallorca, España',
  `fecha_inicio_nomina` date NOT NULL,
  `fecha_final_nomina` date NOT NULL,
  `total_dias` int NOT NULL,
  `salario_bruto` double NOT NULL,
  `horas_extra_fm` double DEFAULT NULL,
  `horas_extra_resto` double DEFAULT NULL,
  `horas_complemetarias` double DEFAULT NULL,
  `antiguedad` double NOT NULL,
  `formacion_porfesional` double NOT NULL,
  `contingencias_comunes` double DEFAULT NULL,
  `total_devengo` double DEFAULT NULL,
  `total_a_deducir` double DEFAULT NULL,
  `total_a_percibir` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial_nominas`
--

LOCK TABLES `historial_nominas` WRITE;
/*!40000 ALTER TABLE `historial_nominas` DISABLE KEYS */;
INSERT INTO `historial_nominas` VALUES (1,'54673456G','Pepe','Viyuela','Ingeniro en Software',1,'587325478524',612,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2021-05-05','2021-06-06',32,2460,120,100,50,1750,127.5,2280,2550,158.3,2391.7),(2,'45672833Q','Jose Manuel','Perez Castro','Ingeniro en Software',1,'154458941257',355.92,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2020-09-01','2021-10-02',396,1430,12,5,5,0,74.15,1461,1483,77.23000000000002,1405.77),(3,'85463521A','Juan Manuel','Franco Jimenez','Auxiliar Administrativo',7,'351245786524',298.32,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2020-12-12','2021-06-01',170,1190,12,5,5,0,62.15,1221,1243,65.23,1177.77),(4,'45672833Q','Jose Manuel','Perez Castro','Ingeniro en Software',1,'154458941257',369.6,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2021-05-05','2021-06-06',32,1430,240,100,100,0,77,1100,1540,138.6,1401.4),(5,'45672833Q','Jose Manuel','Perez Castro','Ingeniro en Software',1,'154458941257',371.04,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2021-11-01','2022-02-03',94,1430,264,110,110,0,77.3,1062,1546,145.06,1400.94),(6,'35468787T','Maria Jesus','Cruz Vidal','Ingeniro en Software',1,'483587153355',355.92,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2020-06-01','2021-05-01',334,1430,12,5,5,150,74.15,1461,1483,77.23000000000002,1405.77),(7,'84671254E','Francisco','Gonzalez Miro','Auxiliar Administrativo',7,'567531546874',305.28,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2021-05-05','2021-06-06',32,1190,120,100,10,50,63.6,1042,1272,83.2,1188.8),(8,'45672833Q','Jose Manuel','Perez Castro','Ingeniro en Software',1,'154458941257',360.24,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2021-05-05','2021-06-06',32,1430,12,50,50,0,75.05,1389,1501,90.73,1410.27),(9,'45672833Q','Jose Manuel','Perez Castro','Ingeniro en Software',1,'154458941257',362.4,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2020-06-01','2021-07-01',395,1430,120,50,50,0,75.5,1290,1510,106.3,1403.7),(10,'35468787T','Maria Jesus','Cruz Vidal','Ingeniro en Software',1,'483587153355',358.08,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2021-05-05','2021-06-06',32,1430,120,0,10,150,74.6,1362,1492,94.19999999999999,1397.8),(11,'45747471V','Ramon','Soler DelValle','Jefe de Desarrollo de Software',3,'453127864532',388.8,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2021-05-05','2021-06-06',32,1540,120,0,100,50,81,1400,1620,125.8,1494.2),(12,'45672833Q','Jose Manuel','Perez Castro','Ingeniro en Software',1,'154458941257',348.48,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2021-01-01','2021-05-05',123,1430,12,5,5,0,72.6,1430,1452,75.68,1376.32),(13,'45672833Q','Jose Manuel','Perez Castro','Ingeniro en Software',1,'154458941257',336.48,'NominaBalear','A58818501',' Carrer de Pérez Galdós, 19, Llevant',1123456742,'Palma de Mallorca, España','2020-01-01','2021-02-01',397,1430,12,5,5,-50,70.1,1380,1402,73.18,1328.82);
/*!40000 ALTER TABLE `historial_nominas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horas`
--

DROP TABLE IF EXISTS `horas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_empleados` int NOT NULL,
  `horas_extr_fuerza_mayor` int DEFAULT NULL,
  `horas_extr_resto` int DEFAULT NULL,
  `horas_complementarias` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_empleados` (`id_empleados`),
  CONSTRAINT `horas_ibfk_1` FOREIGN KEY (`id_empleados`) REFERENCES `empleados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horas`
--

LOCK TABLES `horas` WRITE;
/*!40000 ALTER TABLE `horas` DISABLE KEYS */;
/*!40000 ALTER TABLE `horas` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-14 17:09:31
