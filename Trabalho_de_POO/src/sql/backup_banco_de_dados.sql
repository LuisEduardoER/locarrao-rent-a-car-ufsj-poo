-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema locarrao
--

CREATE DATABASE IF NOT EXISTS locarrao;
USE locarrao;

--
-- Definition of table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `ID_CLIENTE` int(11) NOT NULL,
  PRIMARY KEY  (`ID_CLIENTE`),
  KEY `FK64CB29B968424AE6` (`ID_CLIENTE`),
  CONSTRAINT `FK64CB29B968424AE6` FOREIGN KEY (`ID_CLIENTE`) REFERENCES `pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientes`
--

/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`ID_CLIENTE`) VALUES 
 (1),
 (2),
 (3),
 (4),
 (5);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


--
-- Definition of table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
CREATE TABLE `endereco` (
  `ID_ENDERECO` bigint(20) NOT NULL auto_increment,
  `bairro` varchar(45) default NULL,
  `cep` varchar(9) default NULL,
  `cidade` varchar(45) default NULL,
  `complemento` varchar(10) default NULL,
  `numero` int(11) default NULL,
  `rua` varchar(45) default NULL,
  `uf` varchar(2) default NULL,
  PRIMARY KEY  (`ID_ENDERECO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `endereco`
--

/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` (`ID_ENDERECO`,`bairro`,`cep`,`cidade`,`complemento`,`numero`,`rua`,`uf`) VALUES 
 (1,'asdalsdjalksdjalsdj','898989','alsjdalsdjalsjdalsdjask','fa',10,'askajsdasd','MG'),
 (2,'asdasda','23456','asdasdasdada','ad',10,'asdasd','MG');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;


--
-- Definition of table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
CREATE TABLE `funcionarios` (
  `cargo` varchar(45) default NULL,
  `senha` varchar(100) default NULL,
  `usuario` varchar(45) default NULL,
  `ID_FUNCIONARIO` int(11) NOT NULL,
  PRIMARY KEY  (`ID_FUNCIONARIO`),
  KEY `FK41E285F885DF14C7` (`ID_FUNCIONARIO`),
  CONSTRAINT `FK41E285F885DF14C7` FOREIGN KEY (`ID_FUNCIONARIO`) REFERENCES `pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `funcionarios`
--

/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
INSERT INTO `funcionarios` (`cargo`,`senha`,`usuario`,`ID_FUNCIONARIO`) VALUES 
 (NULL,NULL,NULL,6),
 (NULL,NULL,NULL,7);
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;


--
-- Definition of table `locacao`
--

DROP TABLE IF EXISTS `locacao`;
CREATE TABLE `locacao` (
  `ID_LOCACAO` bigint(20) NOT NULL auto_increment,
  `DATA_CHEGADA` date default NULL,
  `DATA_SAIDA` date default NULL,
  `ABERTA` bit(1) default NULL,
  `previsao` int(11) default NULL,
  `KM_CHEGADA` bigint(20) default NULL,
  `KM_SAIDA` bigint(20) default NULL,
  `TIPO_VEICULO` varchar(45) default NULL,
  `valor` double default NULL,
  `ID_CLIENTE` int(11) default NULL,
  `ID_MOTORISTA` int(11) default NULL,
  `ID_TIPO_LOCACAO` bigint(20) default NULL,
  `ID_VEICULO` bigint(20) default NULL,
  `MODO_DE_LOCACAO` varchar(45) default NULL,
  PRIMARY KEY  (`ID_LOCACAO`),
  KEY `FK776432F080A18C1C` (`ID_TIPO_LOCACAO`),
  KEY `FK776432F0C37C6EEB` (`ID_MOTORISTA`),
  KEY `FK776432F0F5174158` (`ID_VEICULO`),
  KEY `FK776432F0D0A1FEB8` (`ID_CLIENTE`),
  CONSTRAINT `FK776432F080A18C1C` FOREIGN KEY (`ID_TIPO_LOCACAO`) REFERENCES `tipo_locacao` (`ID_TIPO_LOCACAO`),
  CONSTRAINT `FK776432F0C37C6EEB` FOREIGN KEY (`ID_MOTORISTA`) REFERENCES `motorista` (`ID_MOTORISTA`),
  CONSTRAINT `FK776432F0D0A1FEB8` FOREIGN KEY (`ID_CLIENTE`) REFERENCES `clientes` (`ID_CLIENTE`),
  CONSTRAINT `FK776432F0F5174158` FOREIGN KEY (`ID_VEICULO`) REFERENCES `veiculos` (`ID_VEICULO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `locacao`
--

/*!40000 ALTER TABLE `locacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `locacao` ENABLE KEYS */;


--
-- Definition of table `marca_veiculo`
--

DROP TABLE IF EXISTS `marca_veiculo`;
CREATE TABLE `marca_veiculo` (
  `ID_MARCA` bigint(20) NOT NULL auto_increment,
  `marca` varchar(45) default NULL,
  PRIMARY KEY  (`ID_MARCA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marca_veiculo`
--

/*!40000 ALTER TABLE `marca_veiculo` DISABLE KEYS */;
INSERT INTO `marca_veiculo` (`ID_MARCA`,`marca`) VALUES 
 (1,'MARCA TESTE');
/*!40000 ALTER TABLE `marca_veiculo` ENABLE KEYS */;


--
-- Definition of table `modelo_veiculo`
--

DROP TABLE IF EXISTS `modelo_veiculo`;
CREATE TABLE `modelo_veiculo` (
  `ID_MODELO` bigint(20) NOT NULL auto_increment,
  `modelo` varchar(45) default NULL,
  PRIMARY KEY  (`ID_MODELO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `modelo_veiculo`
--

/*!40000 ALTER TABLE `modelo_veiculo` DISABLE KEYS */;
INSERT INTO `modelo_veiculo` (`ID_MODELO`,`modelo`) VALUES 
 (1,'marca teste');
/*!40000 ALTER TABLE `modelo_veiculo` ENABLE KEYS */;


--
-- Definition of table `motorista`
--

DROP TABLE IF EXISTS `motorista`;
CREATE TABLE `motorista` (
  `cnh` varchar(10) default NULL,
  `ID_MOTORISTA` int(11) NOT NULL,
  PRIMARY KEY  (`ID_MOTORISTA`),
  KEY `FK8E127EEC6BFA6CF8` (`ID_MOTORISTA`),
  CONSTRAINT `FK8E127EEC6BFA6CF8` FOREIGN KEY (`ID_MOTORISTA`) REFERENCES `pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `motorista`
--

/*!40000 ALTER TABLE `motorista` DISABLE KEYS */;
INSERT INTO `motorista` (`cnh`,`ID_MOTORISTA`) VALUES 
 ('32323232',8);
/*!40000 ALTER TABLE `motorista` ENABLE KEYS */;


--
-- Definition of table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
CREATE TABLE `pessoa` (
  `ID_PESSOA` int(11) NOT NULL auto_increment,
  `cpf` varchar(11) default NULL,
  `nome` varchar(45) default NULL,
  `tefefone` varchar(10) default NULL,
  `ID_ENDERECO` bigint(20) default NULL,
  PRIMARY KEY  (`ID_PESSOA`),
  KEY `FK8C7703A71004585F` (`ID_ENDERECO`),
  CONSTRAINT `FK8C7703A71004585F` FOREIGN KEY (`ID_ENDERECO`) REFERENCES `endereco` (`ID_ENDERECO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pessoa`
--

/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` (`ID_PESSOA`,`cpf`,`nome`,`tefefone`,`ID_ENDERECO`) VALUES 
 (1,'3434','asdasdasd','343434',2),
 (2,'909320','asjdalksdj','09230239',NULL),
 (3,'09090','aljsdalkd','0909090',NULL),
 (4,'093323','João Victor','322323',NULL),
 (5,'434343','daskldjajks','',NULL),
 (6,'232323232','ajsdakjdalkdjask','',NULL),
 (7,'3434343','asadad','',NULL),
 (8,'3232','asdasda','',NULL);
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;


--
-- Definition of table `tipo_locacao`
--

DROP TABLE IF EXISTS `tipo_locacao`;
CREATE TABLE `tipo_locacao` (
  `ID_TIPO_LOCACAO` bigint(20) NOT NULL auto_increment,
  `PRECO_POR_KM` double default NULL,
  `TAXA_DIARIAS` double default NULL,
  `TAXA_POR_KM` double default NULL,
  `ID_TIPO_VEICULO` bigint(20) default NULL,
  PRIMARY KEY  (`ID_TIPO_LOCACAO`),
  KEY `FKDF19A4E58128B61A` (`ID_TIPO_VEICULO`),
  CONSTRAINT `FKDF19A4E58128B61A` FOREIGN KEY (`ID_TIPO_VEICULO`) REFERENCES `tipo_veiculo` (`ID_TIPO_VEICULO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipo_locacao`
--

/*!40000 ALTER TABLE `tipo_locacao` DISABLE KEYS */;
INSERT INTO `tipo_locacao` (`ID_TIPO_LOCACAO`,`PRECO_POR_KM`,`TAXA_DIARIAS`,`TAXA_POR_KM`,`ID_TIPO_VEICULO`) VALUES 
 (2,100,100,100,1);
/*!40000 ALTER TABLE `tipo_locacao` ENABLE KEYS */;


--
-- Definition of table `tipo_veiculo`
--

DROP TABLE IF EXISTS `tipo_veiculo`;
CREATE TABLE `tipo_veiculo` (
  `ID_TIPO_VEICULO` bigint(20) NOT NULL auto_increment,
  `tipo` varchar(45) default NULL,
  PRIMARY KEY  (`ID_TIPO_VEICULO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipo_veiculo`
--

/*!40000 ALTER TABLE `tipo_veiculo` DISABLE KEYS */;
INSERT INTO `tipo_veiculo` (`ID_TIPO_VEICULO`,`tipo`) VALUES 
 (1,'Padrão'),
 (2,'tipo teste');
/*!40000 ALTER TABLE `tipo_veiculo` ENABLE KEYS */;


--
-- Definition of table `veiculos`
--

DROP TABLE IF EXISTS `veiculos`;
CREATE TABLE `veiculos` (
  `ID_VEICULO` bigint(20) NOT NULL auto_increment,
  `ano` int(11) default NULL,
  `cor` varchar(20) default NULL,
  `observacao` varchar(100) default NULL,
  `opcionais` varchar(100) default NULL,
  `placa` varchar(7) default NULL,
  `totalLocacoes` int(11) default NULL,
  `valorTotalLocacoes` double default NULL,
  `ID_MARCA` bigint(20) default NULL,
  `ID_MODELO` bigint(20) default NULL,
  `ID_TIPO_VEICULO` bigint(20) default NULL,
  `TOTAL_LOCACOES` int(11) default NULL,
  `VALOR_TOTAL_LOCACOES` double default NULL,
  PRIMARY KEY  (`ID_VEICULO`),
  KEY `FK7D5136648128B61A` (`ID_TIPO_VEICULO`),
  KEY `FK7D513664A411104A` (`ID_MODELO`),
  KEY `FK7D513664C6B295F4` (`ID_MARCA`),
  CONSTRAINT `FK7D5136648128B61A` FOREIGN KEY (`ID_TIPO_VEICULO`) REFERENCES `tipo_veiculo` (`ID_TIPO_VEICULO`),
  CONSTRAINT `FK7D513664A411104A` FOREIGN KEY (`ID_MODELO`) REFERENCES `modelo_veiculo` (`ID_MODELO`),
  CONSTRAINT `FK7D513664C6B295F4` FOREIGN KEY (`ID_MARCA`) REFERENCES `marca_veiculo` (`ID_MARCA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `veiculos`
--

/*!40000 ALTER TABLE `veiculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `veiculos` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
