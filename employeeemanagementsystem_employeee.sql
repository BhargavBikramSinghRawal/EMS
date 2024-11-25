-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: employeeemanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `employeee`
--

DROP TABLE IF EXISTS `employeee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeee` (
  `name` varchar(20) DEFAULT NULL,
  `fname` varchar(20) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `salary` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `education` varchar(20) DEFAULT NULL,
  `designation` varchar(30) DEFAULT NULL,
  `nagrita` varchar(25) DEFAULT NULL,
  `empId` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeee`
--

LOCK TABLES `employeee` WRITE;
/*!40000 ALTER TABLE `employeee` DISABLE KEYS */;
INSERT INTO `employeee` VALUES ('bhargav','Ram','Nov 19, 2019','124354','kathmandu','7364544','b@gmail.com','BBA','Student','534544','640664'),('Abishek Pandey','Bi','','','','','','BBA','','','967643'),('sampana','Dev Sudan ','Dec 25, 2003','10000000','Kathmandu','9865384438','sampana123@gmail.com','BCA','Manager','7354845484','311781'),('Swagat Kafle','Binay Raj Kafle','May 8, 2003','10000000','Jhamshikhel','9768400246','swagat123@gmail.com','CSIT','Teacher','96574536565','58634'),('Ram','Hari','Nov 13, 2024','100000','Kathmandu','98765467765','ram123@gmail.com','BCA','Manager','8765432467','47619'),('Kiran','Hari','Nov 12, 2024','10000000','Kathmandu','12345675434','kiran123@gmail.com','CSIT','Manager','987653653257','708909'),('Raj adhikri','Shyam Adhikari','Nov 21, 2024','10000','Gongabu','12345','raj@.com','BBA','Java Developer','534544','842990'),('Laxman','Ram Hari','Aug 6, 1975','100000','Kathmandu','9875326854','laxman123@gmail.com','PHD','Manger','8754735276','990369'),('Ekta kunwar','Hari bahadur kunwar','Jan 9, 1993','100000','Baluwatar','98765346778','ekta123@gmail.com','MBBS','Doctor','123456788966','4289'),('saroj','shishir','Nov 6, 2024','1000','ktm','9123456789','saroj@gmail.com','BBA','Manager','1234512345','319982'),('Sadikshy KC','Hari KC','Sun Nov 21 00:00:00 NPT 2004','1200','Dhapasi','9846098802','kc@gmail.com','BBA','QA','1111111111','846017'),('68688','6897979','Sat Nov 20 00:00:00 NPT 2004','9897979','ktm','9889897999','dgdfgdf@gmail.com','PHD','Manager','3645352534','602274');
/*!40000 ALTER TABLE `employeee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-25 12:44:47
