/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50146
Source Host           : localhost:3306
Source Database       : zc_res

Target Server Type    : MYSQL
Target Server Version : 50146
File Encoding         : 65001

Date: 2015-07-24 11:06:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `config_city`
-- ----------------------------
DROP TABLE IF EXISTS `config_city`;
CREATE TABLE `config_city` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_city
-- ----------------------------
INSERT INTO `config_city` VALUES ('1', '北京');
INSERT INTO `config_city` VALUES ('2', '深圳');

-- ----------------------------
-- Table structure for `config_vip`
-- ----------------------------
DROP TABLE IF EXISTS `config_vip`;
CREATE TABLE `config_vip` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level` int(11) NOT NULL,
  `bid_limit` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `level` (`level`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_vip
-- ----------------------------
INSERT INTO `config_vip` VALUES ('1', '0', '5');
INSERT INTO `config_vip` VALUES ('2', '1', '10');
INSERT INTO `config_vip` VALUES ('3', '2', '15');
