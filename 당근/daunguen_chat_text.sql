-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: daunguen
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `chat_text`
--

DROP TABLE IF EXISTS `chat_text`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chat_text` (
  `no` int NOT NULL AUTO_INCREMENT,
  `board_no` int NOT NULL,
  `id` varchar(45) NOT NULL,
  `nickname` varchar(50) NOT NULL,
  `message` longtext NOT NULL,
  `now_date` varchar(10) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat_text`
--

LOCK TABLES `chat_text` WRITE;
/*!40000 ALTER TABLE `chat_text` DISABLE KEYS */;
INSERT INTO `chat_text` VALUES (1,1,'67klgg@gmail.com','rinux','안녕','오후 15:21'),(2,1,'67klgg@gmail.com','rinux','반가워','오후 15:21'),(3,1,'67klgg@gmail.com','rinux','반가워요','오후 15:40'),(4,1,'67klgg@gmail.com','rinux','반갑다구','오후 15:40'),(5,1,'67klgg@gmail.com','rinux','반가워요오','오후 15:41'),(6,1,'67klgg@gmail.com','rinux','1111','오후 16:11'),(7,1,'67klgg@gmail.com','rinux','222','오후 16:12'),(8,1,'67klgg@gmail.com','rinux','333','오후 16:12'),(9,1,'67klgg@gmail.com','rinux','444','오후 16:12'),(10,1,'67klgg@gmail.com','rinux','55','오후 16:13'),(11,1,'67klgg@gmail.com','rinux','66','오후 16:13'),(12,1,'67klgg@gmail.com','rinux','77','오후 16:16'),(13,1,'67klgg@gmail.com','rinux','88','오후 16:16'),(14,1,'67klgg@gmail.com','rinux','99','오후 16:19'),(15,1,'67klgg@gmail.com','rinux','1010','오후 16:20'),(16,1,'67klgg@gmail.com','rinux','11111','오후 16:20');
/*!40000 ALTER TABLE `chat_text` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-05 16:48:06
