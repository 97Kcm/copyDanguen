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
-- Table structure for table `write_board`
--

DROP TABLE IF EXISTS `write_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `write_board` (
  `no` int NOT NULL AUTO_INCREMENT,
  `id` varchar(50) NOT NULL,
  `title` varchar(100) NOT NULL,
  `address` varchar(20) NOT NULL,
  `extra_address` varchar(45) DEFAULT NULL,
  `price` int NOT NULL,
  `category` varchar(10) NOT NULL,
  `content` varchar(200) DEFAULT NULL,
  `now_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `write_board`
--

LOCK TABLES `write_board` WRITE;
/*!40000 ALTER TABLE `write_board` DISABLE KEYS */;
INSERT INTO `write_board` VALUES (1,'67klgg@naver.com','선풍기 팝니다','서울특별시','은평구 은평터널로',5000,'가구/인테리어','23','2024-07-29 19:38:52'),(2,'67klgg@naver.com',' 한여름엔 에어컨 필수!!','대구광역시','동성로',945023,'생활가전','시원한 에어컨 팝니다','2024-07-29 19:49:31'),(3,'67klgg@naver.com','가볍고 튼튼한 자전거 팔아요','강원특별자치도','인제시',360000,'스포츠/레저','가볍고 튼튼한 자전거입니다\r\n네고 불가\r\n택배 시 착불','2024-07-29 20:13:44'),(4,'67klgg@naver.com','사용한지 일주일 된 소니 미러리스 카메라 판매합니다','세종특별자치도','세종대왕 납시오',5000,'전자기기','사진찍으려고 샀다가 두번정도 사용하고 장롱행인 애물단지입니다.\r\n사용감 아예 없고 거의 새제품이랑 다를 게 없습니다.','2024-07-29 21:33:25');
/*!40000 ALTER TABLE `write_board` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-06 17:53:53
