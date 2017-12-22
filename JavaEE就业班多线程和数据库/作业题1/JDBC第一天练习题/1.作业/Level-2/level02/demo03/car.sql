/*
Navicat MySQL Data Transfer

Source Server         : mybatis
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : bbwork

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-12-09 11:47:19
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `car`
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `cid` int(10) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) DEFAULT NULL,
  `company` varchar(20) DEFAULT NULL,
  `grade` varchar(20) DEFAULT NULL,
  `price` double(20,2) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES ('1', '马自达cx-4', '马自达', '紧凑型suv', '14.08');
INSERT INTO `car` VALUES ('2', '宝马x1', '宝马', '紧凑型suv', '28.60');
INSERT INTO `car` VALUES ('3', '哈弗H6', '长城', '紧凑型suv', '8.88');
INSERT INTO `car` VALUES ('4', '奔驰GLC', '奔驰', '中型SUV', '39.60');
