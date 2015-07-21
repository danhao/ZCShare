/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50146
Source Host           : localhost:3306
Source Database       : zc_res

Target Server Type    : MYSQL
Target Server Version : 50146
File Encoding         : 65001

Date: 2015-05-21 13:12:09
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
