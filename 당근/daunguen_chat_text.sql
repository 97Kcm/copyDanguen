-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: daunguen
-- ------------------------------------------------------
-- Server version	8.4.2

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
  `nickname` varchar(45) DEFAULT NULL,
  `message` longtext NOT NULL,
  `now_date` varchar(10) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat_text`
--

LOCK TABLES `chat_text` WRITE;
/*!40000 ALTER TABLE `chat_text` DISABLE KEYS */;
INSERT INTO `chat_text` VALUES (1,4,'rinux','하이','오후 20:46'),(2,4,'rinux','하이하이','오후 20:48'),(3,4,'rinux','11111','오후 21:08'),(4,4,'rinux','2222','오후 21:15'),(5,4,'rinux','3333','오후 21:22'),(6,4,'rinux','4444','오후 21:32'),(7,4,'rinux','5555','오후 21:36'),(8,4,'rinux','6666','오후 21:37'),(9,4,'rinux','777','오후 21:40'),(10,4,'rinux','888','오후 21:42'),(11,4,'rinux','9999','오후 21:43'),(12,4,'rinux','121212','오후 21:45'),(13,4,'rinux','131313','오후 21:45');
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

-- Dump completed on 2024-08-07 21:46:58
