/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50146
Source Host           : localhost:3306
Source Database       : zc_admin

Target Server Type    : MYSQL
Target Server Version : 50146
File Encoding         : 65001

Date: 2015-08-10 17:21:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `debt_opt_log`
-- ----------------------------
DROP TABLE IF EXISTS `debt_opt_log`;
CREATE TABLE `debt_opt_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `zone_id` varchar(225) NOT NULL,
  `player_id` varchar(225) NOT NULL,
  `type` int(4) NOT NULL,
  `count` int(11) NOT NULL,
  `reason` varchar(225) NOT NULL,
  `opt_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of debt_opt_log
-- ----------------------------
INSERT INTO `debt_opt_log` VALUES ('4', '1001', '100110001', '3', '10', 'sfsadfsdfa', '2015-01-27 10:35:44');
INSERT INTO `debt_opt_log` VALUES ('7', '1001', '100110011', '3', '22', 'sfsdfsdf', '2015-01-22 14:37:25');
INSERT INTO `debt_opt_log` VALUES ('8', '1002', '100210017', '3', '-1', 'test', '2015-05-19 14:30:28');

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL COMMENT '菜单名',
  `code` varchar(12) NOT NULL DEFAULT '0' COMMENT '菜单代码',
  `url` varchar(100) DEFAULT NULL,
  `right_name` varchar(50) NOT NULL COMMENT '权限资源名',
  `icon` varchar(200) DEFAULT NULL,
  `menu_order` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_code` (`code`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '系统管理', '99', null, 'menu_sys', 'sys_manage.png', '1000');
INSERT INTO `menu` VALUES ('2', '用户管理', '9901', '/WEB-INF/pages/common/sec/userList.zul', 'menu_sys_user', 'user_mange.png', '0');
INSERT INTO `menu` VALUES ('3', '角色管理', '9902', '/WEB-INF/pages/common/sec/roleList.zul', 'menu_sys_role', 'role.png', '0');
INSERT INTO `menu` VALUES ('4', '权限管理', '9903', '/WEB-INF/pages/common/sec/rightList.zul', 'menu_sys_right', 'sec_right.png', '0');
INSERT INTO `menu` VALUES ('5', '用户_角色管理', '9904', '/WEB-INF/pages/common/sec/userRoleList.zul', 'menu_sys_user_role', 'user_role.png', '0');
INSERT INTO `menu` VALUES ('6', '角色_权限管理', '9905', '/WEB-INF/pages/common/sec/roleRightList.zul', 'menu_sys_role_right', 'role_right.png', '0');
INSERT INTO `menu` VALUES ('7', '后台管理', '89', null, 'menu_zc', 'page.png', '0');
INSERT INTO `menu` VALUES ('9', '用户信息 ', '8901', '/WEB-INF/pages/zc/manage/playerList.zul', 'menu_zc_manage_player', 'page.png', '0');
INSERT INTO `menu` VALUES ('10', '债务信息', '8902', '/WEB-INF/pages/zc/manage/debtList.zul', 'menu_zc_manage_debt', 'page.png', '0');
INSERT INTO `menu` VALUES ('11', '用户审批', '8903', '/WEB-INF/pages/zc/manage/validateList.zul', 'menu_zc_manage_users', 'page.png', '0');
INSERT INTO `menu` VALUES ('12', '提现申请', '8904', '/WEB-INF/pages/zc/manage/cashList.zul', 'menu_zc_manage_cash', 'page.png', '0');
INSERT INTO `menu` VALUES ('13', '结单申请', '8905', '/WEB-INF/pages/zc/manage/applyDebtEndList.zul', 'menu_zc_manage_debt_end', 'page.png', '0');

-- ----------------------------
-- Table structure for `opt_log`
-- ----------------------------
DROP TABLE IF EXISTS `opt_log`;
CREATE TABLE `opt_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `game_type` varchar(20) DEFAULT NULL COMMENT '游戏类型',
  `player_id` varchar(40) DEFAULT NULL,
  `log_cmd` varchar(20) DEFAULT NULL COMMENT '命令',
  `log_ps` varchar(20) DEFAULT NULL COMMENT '数值',
  `log_descn` varchar(255) DEFAULT NULL COMMENT '描述',
  `created_at` datetime DEFAULT NULL COMMENT '操作时间',
  `opter` varchar(50) DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of opt_log
-- ----------------------------

-- ----------------------------
-- Table structure for `sec_right`
-- ----------------------------
DROP TABLE IF EXISTS `sec_right`;
CREATE TABLE `sec_right` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(1) NOT NULL DEFAULT '0',
  `module` varchar(50) DEFAULT NULL,
  `name` varchar(50) NOT NULL COMMENT '权限资源名',
  `descn` varchar(100) DEFAULT NULL COMMENT '菜单名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sec_right
-- ----------------------------
INSERT INTO `sec_right` VALUES ('1', '0', 'sec', 'menu_sys', '系统管理');
INSERT INTO `sec_right` VALUES ('2', '0', 'sec', 'menu_sys_user', '用户管理');
INSERT INTO `sec_right` VALUES ('3', '0', 'sec', 'menu_sys_role', '角色管理');
INSERT INTO `sec_right` VALUES ('4', '0', 'sec', 'menu_sys_right', '权限管理');
INSERT INTO `sec_right` VALUES ('5', '0', 'sec', 'menu_sys_user_role', '用户_角色管理');
INSERT INTO `sec_right` VALUES ('6', '0', 'sec', 'menu_sys_role_right', '角色_权限管理');
INSERT INTO `sec_right` VALUES ('7', '1', 'sec', 'btn_right_new', '权限资源_新建');
INSERT INTO `sec_right` VALUES ('8', '1', 'sec', 'btn_right_del', '权限资源_删除');
INSERT INTO `sec_right` VALUES ('9', '1', 'sec', 'btn_user_new', '用户_新增');
INSERT INTO `sec_right` VALUES ('10', '1', 'sec', 'btn_user_del', '用户_删除');
INSERT INTO `sec_right` VALUES ('11', '1', 'sec', 'btn_role_new', '角色_新增');
INSERT INTO `sec_right` VALUES ('12', '1', 'sec', 'btn_role_del', '角色_删除');
INSERT INTO `sec_right` VALUES ('13', '1', 'sec', 'btn_role_right_save', '角色_权限_保存');
INSERT INTO `sec_right` VALUES ('14', '1', 'sec', 'btn_user_role_save', '用户_角色_保存');
INSERT INTO `sec_right` VALUES ('15', '1', 'sec', 'btn_user_save', '用户_保存');
INSERT INTO `sec_right` VALUES ('16', '1', 'sec', 'btn_role_save', '角色_保存');
INSERT INTO `sec_right` VALUES ('17', '1', 'sec', 'btn_right_save', '权限资源_保存');
INSERT INTO `sec_right` VALUES ('18', '0', 'sec', 'menu_zc', '后台管理');
INSERT INTO `sec_right` VALUES ('20', '0', 'sec', 'menu_zc_manage_player', '用户信息 ');
INSERT INTO `sec_right` VALUES ('21', '0', 'sec', 'menu_zc_manage_debt', '后台管理-债务管理');
INSERT INTO `sec_right` VALUES ('22', '0', 'sec', 'menu_zc_manage_users', '后台管理-用户审批');
INSERT INTO `sec_right` VALUES ('23', '0', 'sec', 'menu_zc_manage_cash', '后台管理-提现申请');
INSERT INTO `sec_right` VALUES ('24', '0', 'sec', 'menu_zc_manage_debt_end', '后台管理-结单申请');

-- ----------------------------
-- Table structure for `sec_role`
-- ----------------------------
DROP TABLE IF EXISTS `sec_role`;
CREATE TABLE `sec_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `descn` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sec_role
-- ----------------------------
INSERT INTO `sec_role` VALUES ('1', 'ROLE_ADMIN', '管理员');

-- ----------------------------
-- Table structure for `sec_role_right`
-- ----------------------------
DROP TABLE IF EXISTS `sec_role_right`;
CREATE TABLE `sec_role_right` (
  `role_id` int(11) NOT NULL,
  `right_id` int(11) NOT NULL,
  PRIMARY KEY (`right_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sec_role_right
-- ----------------------------
INSERT INTO `sec_role_right` VALUES ('1', '1');
INSERT INTO `sec_role_right` VALUES ('1', '2');
INSERT INTO `sec_role_right` VALUES ('1', '3');
INSERT INTO `sec_role_right` VALUES ('1', '4');
INSERT INTO `sec_role_right` VALUES ('1', '5');
INSERT INTO `sec_role_right` VALUES ('1', '6');
INSERT INTO `sec_role_right` VALUES ('1', '7');
INSERT INTO `sec_role_right` VALUES ('1', '8');
INSERT INTO `sec_role_right` VALUES ('1', '9');
INSERT INTO `sec_role_right` VALUES ('1', '10');
INSERT INTO `sec_role_right` VALUES ('1', '11');
INSERT INTO `sec_role_right` VALUES ('1', '12');
INSERT INTO `sec_role_right` VALUES ('1', '13');
INSERT INTO `sec_role_right` VALUES ('1', '14');
INSERT INTO `sec_role_right` VALUES ('1', '15');
INSERT INTO `sec_role_right` VALUES ('1', '16');
INSERT INTO `sec_role_right` VALUES ('1', '17');
INSERT INTO `sec_role_right` VALUES ('1', '18');
INSERT INTO `sec_role_right` VALUES ('1', '20');
INSERT INTO `sec_role_right` VALUES ('1', '21');
INSERT INTO `sec_role_right` VALUES ('1', '22');
INSERT INTO `sec_role_right` VALUES ('1', '23');
INSERT INTO `sec_role_right` VALUES ('1', '24');

-- ----------------------------
-- Table structure for `sec_user`
-- ----------------------------
DROP TABLE IF EXISTS `sec_user`;
CREATE TABLE `sec_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `password` varchar(64) NOT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT '0',
  `accountnonexpired` tinyint(1) DEFAULT '1',
  `credentialsnonexpired` tinyint(1) DEFAULT '1',
  `accountnonlocked` tinyint(1) DEFAULT '1',
  `descn` varchar(200) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sec_user
-- ----------------------------
INSERT INTO `sec_user` VALUES ('1', 'admin', '123', '1', '1', '1', '1', '管理员', '2010-04-02 15:17:46');

-- ----------------------------
-- Table structure for `sec_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sec_user_role`;
CREATE TABLE `sec_user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sec_user_role
-- ----------------------------
INSERT INTO `sec_user_role` VALUES ('1', '1');
