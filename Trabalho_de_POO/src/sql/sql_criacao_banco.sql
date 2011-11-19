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
  `ID_CLIENTE` int(10) unsigned NOT NULL auto_increment,
  `NOME` varchar(45) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `TELEFONE` varchar(10) default NULL,
  `ID_ENDERECO` int(10) unsigned default NULL,
  PRIMARY KEY  (`ID_CLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientes`
--

/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


--
-- Definition of table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
CREATE TABLE `endereco` (
  `ID_ENDERECO` int(10) unsigned NOT NULL auto_increment,
  `RUA` varchar(45) default NULL,
  `NUMERO` int(10) unsigned default NULL,
  `COMPLEMENTO` varchar(10) default NULL,
  `BAIRRO` varchar(45) default NULL,
  `CIDADE` varchar(45) default NULL,
  `UF` varchar(2) default NULL,
  `CEP` varchar(7) default NULL,
  PRIMARY KEY  (`ID_ENDERECO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `endereco`
--

/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;


--
-- Definition of table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
CREATE TABLE `funcionarios` (
  `ID_FUNCIONARIO` int(10) unsigned NOT NULL auto_increment,
  `NOME` varchar(45) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `TELEFONE` varchar(10) default NULL,
  `ID_ENDERECO` int(10) unsigned default NULL,
  `CARGO` varchar(45) NOT NULL,
  `USUARIO` varchar(45) NOT NULL,
  `SENHA` varchar(100) NOT NULL,
  PRIMARY KEY  (`ID_FUNCIONARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `funcionarios`
--

/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;


--
-- Definition of table `locacao`
--

DROP TABLE IF EXISTS `locacao`;
CREATE TABLE `locacao` (
  `ID_LOCACAO` int(10) unsigned NOT NULL auto_increment,
  `KM_SAIDA` int(10) unsigned NOT NULL,
  `KM_CHEGADA` int(10) unsigned NOT NULL,
  `TIPO_VEICULO` varchar(45) NOT NULL,
  `VALOR` float(8,2) unsigned default NULL,
  `DATA_SAIDA` date NOT NULL,
  `DATA_CHEGADA` date default NULL,
  `PREVISAO` int(10) unsigned default NULL,
  `ABERTA` varchar(3) NOT NULL,
  `TIPO_LOCACAO` int(10) unsigned NOT NULL,
  `CPF_CLIENTE` varchar(11) NOT NULL,
  `CPF_MOTORISTA` varchar(11) NOT NULL,
  `ID_VEICULO` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`ID_LOCACAO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `locacao`
--

/*!40000 ALTER TABLE `locacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `locacao` ENABLE KEYS */;


--
-- Definition of table `marca`
--

DROP TABLE IF EXISTS `marca`;
CREATE TABLE `marca` (
  `ID_MARCA` int(10) unsigned NOT NULL auto_increment,
  `MARCA` varchar(45) NOT NULL,
  PRIMARY KEY  (`ID_MARCA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marca`
--

/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;


--
-- Definition of table `modelo_veiculo`
--

DROP TABLE IF EXISTS `modelo_veiculo`;
CREATE TABLE `modelo_veiculo` (
  `ID_MODELO_VEICULO` int(10) unsigned NOT NULL auto_increment,
  `MODELO` varchar(45) NOT NULL,
  PRIMARY KEY  (`ID_MODELO_VEICULO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `modelo_veiculo`
--

/*!40000 ALTER TABLE `modelo_veiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `modelo_veiculo` ENABLE KEYS */;


--
-- Definition of table `motorista`
--

DROP TABLE IF EXISTS `motorista`;
CREATE TABLE `motorista` (
  `ID_MOTORISTA` int(10) unsigned NOT NULL auto_increment,
  `NOME` varchar(45) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `TELEFONE` varchar(10) default NULL,
  `ID_ENDERECO` int(10) unsigned default NULL,
  `CNH` varchar(10) NOT NULL,
  PRIMARY KEY  (`ID_MOTORISTA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `motorista`
--

/*!40000 ALTER TABLE `motorista` DISABLE KEYS */;
/*!40000 ALTER TABLE `motorista` ENABLE KEYS */;


--
-- Definition of table `tipo_locacao`
--

DROP TABLE IF EXISTS `tipo_locacao`;
CREATE TABLE `tipo_locacao` (
  `ID_TIPO_LOCACAO` int(10) unsigned NOT NULL auto_increment,
  `ID_TIPO_VEICULO` int(10) unsigned NOT NULL,
  `TAXA_DIARIAS` float(8,2) unsigned NOT NULL,
  `TAXA_POR_KM` float(8,2) unsigned NOT NULL,
  `PRECO_POR_KM` float(8,2) unsigned NOT NULL,
  PRIMARY KEY  (`ID_TIPO_LOCACAO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipo_locacao`
--

/*!40000 ALTER TABLE `tipo_locacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_locacao` ENABLE KEYS */;


--
-- Definition of table `tipo_veiculos`
--

DROP TABLE IF EXISTS `tipo_veiculos`;
CREATE TABLE `tipo_veiculos` (
  `ID_TIPO_VEICULO` int(10) unsigned NOT NULL auto_increment,
  `TIPO_VEICULO` varchar(45) NOT NULL,
  PRIMARY KEY  (`ID_TIPO_VEICULO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipo_veiculos`
--

/*!40000 ALTER TABLE `tipo_veiculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_veiculos` ENABLE KEYS */;


--
-- Definition of table `veiculos`
--

DROP TABLE IF EXISTS `veiculos`;
CREATE TABLE `veiculos` (
  `ID_VEICULO` int(10) unsigned NOT NULL auto_increment,
  `PLACA` varchar(7) NOT NULL,
  `COR` varchar(20) default NULL,
  `ANO` int(10) unsigned default NULL,
  `OPCIONAIS` varchar(100) default NULL,
  `OBSERVACAO` varchar(100) default NULL,
  `ID_TIPO_VEICULO` int(10) unsigned NOT NULL,
  `ID_MARCA` int(10) unsigned NOT NULL,
  `ID_MODELO` int(10) unsigned NOT NULL,
  `TOTAL_LOCACAO` int(10) unsigned NOT NULL,
  `VALOR_TOTAL_LOCACAO` float(8,2) unsigned NOT NULL,
  PRIMARY KEY  (`ID_VEICULO`)
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
