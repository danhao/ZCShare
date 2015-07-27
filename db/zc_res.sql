/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost
 Source Database       : zc_res

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : utf-8

 Date: 07/27/2015 21:35:27 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `config_city`
-- ----------------------------
DROP TABLE IF EXISTS `config_city`;
CREATE TABLE `config_city` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `config_city`
-- ----------------------------
BEGIN;
INSERT INTO `config_city` VALUES ('1', '北京'), ('2', '深圳');
COMMIT;

-- ----------------------------
--  Table structure for `config_vip`
-- ----------------------------
DROP TABLE IF EXISTS `config_vip`;
CREATE TABLE `config_vip` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level` int(11) NOT NULL,
  `bid_limit` int(11) NOT NULL,
  `bid_limit_co` int(11) NOT NULL DEFAULT '0',
  `cost` int(11) NOT NULL,
  `cost_co` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `level` (`level`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `config_vip`
-- ----------------------------
BEGIN;
INSERT INTO `config_vip` VALUES ('1', '0', '5', '5', '0', '0'), ('2', '1', '10', '2000', '500', '20000');
COMMIT;

