CREATE DATABASE  IF NOT EXISTS `community`;
USE `community`;

DROP TABLE IF EXISTS `community`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `community` (
  `co_num` int NOT NULL AUTO_INCREMENT,
  `co_name` varchar(10) NOT NULL,
  PRIMARY KEY (`co_num`)
);