/*
Navicat MySQL Data Transfer

Source Server         : mybatis
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : bbwork

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-12-09 10:06:00
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '小明', '北京市昌平区');
INSERT INTO `student` VALUES ('2', '小天', '北京市东城区');
INSERT INTO `student` VALUES ('3', '小花', '北京市西城区');
