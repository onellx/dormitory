/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : dormitory

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-12-26 13:10:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `back_school_records`
-- ----------------------------
DROP TABLE IF EXISTS `back_school_records`;
CREATE TABLE `back_school_records` (
  `BACK_RECODES_ID` varchar(18) NOT NULL,
  `STUDENT_EXAM_NUM` varchar(14) NOT NULL,
  `BACK_RECODES_TIME` varchar(16) NOT NULL,
  `BACK_RECODES_STATE` varchar(1) NOT NULL,
  PRIMARY KEY (`BACK_RECODES_ID`),
  KEY `PK_BackSchoolRecords_StudentInfo` (`STUDENT_EXAM_NUM`),
  CONSTRAINT `PK_BackSchoolRecords_StudentInfo` FOREIGN KEY (`STUDENT_EXAM_NUM`) REFERENCES `student_info` (`STUDENT_EXAM_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of back_school_records
-- ----------------------------
INSERT INTO `back_school_records` VALUES ('201709181938303808', '2017040500117', '20170918193830', '1');
INSERT INTO `back_school_records` VALUES ('201709181938326598', '2017040500117', '20170918193832', '1');
INSERT INTO `back_school_records` VALUES ('201709191844247570', '2017040500117', '20170919184424', '1');
INSERT INTO `back_school_records` VALUES ('201709191920104319', '2017040500117', '20170919192010', '1');
INSERT INTO `back_school_records` VALUES ('201709192012464760', '2017040500117', '20170919201246', '1');
INSERT INTO `back_school_records` VALUES ('201709192049334614', '2017040500117', '20170919204933', '1');
INSERT INTO `back_school_records` VALUES ('201709192057393687', '2017040500117', '20170919205739', '1');
INSERT INTO `back_school_records` VALUES ('201709251526142189', '2017040500117', '20170925152614', '1');
INSERT INTO `back_school_records` VALUES ('201709252040432882', '2017040500117', '20170925204043', '1');
INSERT INTO `back_school_records` VALUES ('201709252104276761', '2017040500117', '20170925210427', '1');

-- ----------------------------
-- Table structure for `college_info`
-- ----------------------------
DROP TABLE IF EXISTS `college_info`;
CREATE TABLE `college_info` (
  `COLLEGE_ID` varchar(6) NOT NULL,
  `COLLEGE_NAME` varchar(30) NOT NULL,
  `COLLEGE_LINKMAN` varchar(20) NOT NULL,
  `COLLEGE_TEL` varchar(11) NOT NULL,
  `COLLEGE_INTRO` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`COLLEGE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of college_info
-- ----------------------------
INSERT INTO `college_info` VALUES ('081324', '信息工程学院', '小李', '110', null);
INSERT INTO `college_info` VALUES ('082556', '建筑工程学院', '小王', '120', null);

-- ----------------------------
-- Table structure for `college_room_info`
-- ----------------------------
DROP TABLE IF EXISTS `college_room_info`;
CREATE TABLE `college_room_info` (
  `CR_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COLLEGE_ID` varchar(10) NOT NULL,
  `ROOM_ID` varchar(9) NOT NULL,
  PRIMARY KEY (`CR_ID`),
  KEY `ROOM_ID` (`ROOM_ID`),
  KEY `profession_college_info_ibfk_1` (`COLLEGE_ID`),
  CONSTRAINT `college_room_info_ibfk_1` FOREIGN KEY (`COLLEGE_ID`) REFERENCES `college_info` (`COLLEGE_ID`),
  CONSTRAINT `college_room_info_ibfk_2` FOREIGN KEY (`ROOM_ID`) REFERENCES `dormroom_info` (`ROOM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of college_room_info
-- ----------------------------
INSERT INTO `college_room_info` VALUES ('3', '081324', 'A1101834');
INSERT INTO `college_room_info` VALUES ('4', '081324', 'A1102800');
INSERT INTO `college_room_info` VALUES ('5', '081324', 'A1103988');
INSERT INTO `college_room_info` VALUES ('6', '081324', 'A1104891');
INSERT INTO `college_room_info` VALUES ('7', '081324', 'A1105612');
INSERT INTO `college_room_info` VALUES ('8', '081324', 'A1106155');
INSERT INTO `college_room_info` VALUES ('9', '081324', 'A1107572');
INSERT INTO `college_room_info` VALUES ('10', '081324', 'A1108862');
INSERT INTO `college_room_info` VALUES ('11', '082556', 'A1109311');
INSERT INTO `college_room_info` VALUES ('12', '082556', 'A1110493');
INSERT INTO `college_room_info` VALUES ('13', '082556', 'A1111670');
INSERT INTO `college_room_info` VALUES ('14', '082556', 'A1112298');
INSERT INTO `college_room_info` VALUES ('15', '082556', 'A1113891');
INSERT INTO `college_room_info` VALUES ('16', '082556', 'A1114504');
INSERT INTO `college_room_info` VALUES ('17', '082556', 'A1115338');
INSERT INTO `college_room_info` VALUES ('18', '081324', 'A1116936');
INSERT INTO `college_room_info` VALUES ('19', '082556', 'A1117665');
INSERT INTO `college_room_info` VALUES ('20', '081324', 'B2101355');
INSERT INTO `college_room_info` VALUES ('21', '081324', 'B2102262');
INSERT INTO `college_room_info` VALUES ('22', '081324', 'B4105778');
INSERT INTO `college_room_info` VALUES ('23', '081324', 'B4106893');
INSERT INTO `college_room_info` VALUES ('24', '082556', 'A1101834');
INSERT INTO `college_room_info` VALUES ('25', '082556', 'A1101834');

-- ----------------------------
-- Table structure for `dormroom_info`
-- ----------------------------
DROP TABLE IF EXISTS `dormroom_info`;
CREATE TABLE `dormroom_info` (
  `ROOM_ID` varchar(9) NOT NULL,
  `ROOM_NUM` varchar(4) NOT NULL,
  `DORM_ID` varchar(2) NOT NULL,
  `FLOOR_NUM` int(11) NOT NULL,
  `ROOM_BEDS` int(11) NOT NULL,
  `ROOM_ASSIGNBEDS` int(11) NOT NULL,
  `ROOM_HEAD` varchar(30) DEFAULT NULL,
  `ROOM_TEL` varchar(11) DEFAULT NULL,
  `ROOM_CHARGE` int(11) NOT NULL,
  `ROOM_USECONDITION` varchar(2) NOT NULL,
  `ROOM_NOTES` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ROOM_ID`),
  KEY `DORM_ID` (`DORM_ID`),
  CONSTRAINT `dormroom_info_ibfk_1` FOREIGN KEY (`DORM_ID`) REFERENCES `dorm_info` (`DORM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dormroom_info
-- ----------------------------
INSERT INTO `dormroom_info` VALUES ('A1101536', '101', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1101834', '101', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1101912', '101', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1102300', '102', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1102800', '102', 'A1', '1', '4', '3', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1102938', '102', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1103272', '103', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1103920', '103', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1103988', '103', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1104300', '104', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1104604', '104', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1104891', '104', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1105417', '105', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1105612', '105', 'A1', '1', '4', '1', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1105687', '105', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1106155', '106', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1106711', '106', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1106868', '106', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1107109', '107', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1107572', '107', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1107686', '107', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1108294', '108', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1108583', '108', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1108862', '108', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1109311', '109', 'A1', '1', '4', '4', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1109542', '109', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1109720', '109', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1110207', '110', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1110493', '110', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1110649', '110', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1111133', '111', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1111603', '111', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1111670', '111', 'A1', '1', '4', '4', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1112298', '112', 'A1', '1', '4', '4', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1112398', '112', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1112901', '112', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1113273', '113', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1113852', '113', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1113891', '113', 'A1', '1', '4', '3', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1114504', '114', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1114748', '114', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1114879', '114', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1115338', '115', 'A1', '1', '4', '4', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1115494', '115', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1115722', '115', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1116367', '116', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1116891', '116', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1116936', '116', 'A1', '1', '4', '4', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1117434', '117', 'A1', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('A1117665', '117', 'A1', '1', '4', '1', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2101355', '101', 'B2', '1', '4', '4', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2102262', '102', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2103419', '103', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2104767', '104', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2105748', '105', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2106983', '106', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2107327', '107', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2108925', '108', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2109398', '109', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2110429', '110', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2111588', '111', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2112378', '112', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2113472', '113', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2114365', '114', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2115337', '115', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2116829', '116', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2117430', '117', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2118379', '118', 'B2', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2201233', '201', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2202559', '202', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2203114', '203', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2204819', '204', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2205856', '205', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2206509', '206', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2207748', '207', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2208268', '208', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2209607', '209', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2210172', '210', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2211559', '211', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2212726', '212', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2213460', '213', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2214123', '214', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2215299', '215', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2216326', '216', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2217516', '217', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2218665', '218', 'B2', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2301869', '301', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2302158', '302', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2303728', '303', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2304192', '304', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2305415', '305', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2306357', '306', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2307656', '307', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2308407', '308', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2309821', '309', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2310733', '310', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2311231', '311', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2312715', '312', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2313452', '313', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2314522', '314', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2315750', '315', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2316794', '316', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2317124', '317', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2318401', '318', 'B2', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2401411', '401', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2402934', '402', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2403337', '403', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2404502', '404', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2405534', '405', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2406507', '406', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2407185', '407', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2408387', '408', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2409250', '409', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2410723', '410', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2411506', '411', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2412858', '412', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2413192', '413', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2414873', '414', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2415583', '415', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2416810', '416', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2417797', '417', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2418420', '418', 'B2', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2501644', '501', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2502272', '502', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2503782', '503', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2504488', '504', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2505906', '505', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2506783', '506', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2507108', '507', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2508165', '508', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2509376', '509', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2510833', '510', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2511922', '511', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2512459', '512', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2513403', '513', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2514529', '514', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2515778', '515', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2516528', '516', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2517656', '517', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2518137', '518', 'B2', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2601854', '601', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2602848', '602', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2603709', '603', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2604888', '604', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2605858', '605', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2606686', '606', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2607170', '607', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2608156', '608', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2609355', '609', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2610292', '610', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2611511', '611', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2612271', '612', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2613811', '613', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2614931', '614', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2615460', '615', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2616532', '616', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2617980', '617', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B2618441', '618', 'B2', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4101225', '101', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4102362', '102', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4103822', '103', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4104515', '104', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4105778', '105', 'B4', '1', '4', '4', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4106893', '106', 'B4', '1', '4', '3', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4107131', '107', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4108661', '108', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4109160', '109', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4110578', '110', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4111796', '111', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4112233', '112', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4113565', '113', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4114569', '114', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4115960', '115', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4116565', '116', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4117494', '117', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4118186', '118', 'B4', '1', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4201883', '201', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4202830', '202', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4203288', '203', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4204872', '204', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4205694', '205', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4206206', '206', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4207822', '207', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4208476', '208', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4209975', '209', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4210147', '210', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4211812', '211', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4212666', '212', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4213859', '213', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4214958', '214', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4215754', '215', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4216847', '216', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4217188', '217', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4218439', '218', 'B4', '2', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4301178', '301', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4302800', '302', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4303612', '303', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4304847', '304', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4305211', '305', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4306539', '306', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4307727', '307', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4308980', '308', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4309203', '309', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4310551', '310', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4311220', '311', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4312600', '312', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4313729', '313', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4314379', '314', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4315413', '315', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4316374', '316', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4317391', '317', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4318713', '318', 'B4', '3', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4401376', '401', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4402118', '402', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4403873', '403', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4404941', '404', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4405597', '405', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4406671', '406', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4407143', '407', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4408995', '408', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4409669', '409', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4410795', '410', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4411694', '411', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4412657', '412', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4413507', '413', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4414858', '414', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4415204', '415', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4416487', '416', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4417488', '417', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4418866', '418', 'B4', '4', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4501721', '501', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4502751', '502', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4503733', '503', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4504576', '504', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4505450', '505', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4506586', '506', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4507144', '507', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4508711', '508', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4509944', '509', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4510702', '510', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4511629', '511', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4512800', '512', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4513368', '513', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4514677', '514', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4515129', '515', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4516262', '516', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4517906', '517', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4518236', '518', 'B4', '5', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4601732', '601', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4602265', '602', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4603611', '603', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4604385', '604', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4605479', '605', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4606830', '606', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4607397', '607', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4608714', '608', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4609270', '609', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4610890', '610', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4611935', '611', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4612263', '612', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4613520', '613', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4614161', '614', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4615869', '615', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4616900', '616', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4617852', '617', 'B4', '6', '4', '0', null, null, '1000', '1', null);
INSERT INTO `dormroom_info` VALUES ('B4618138', '618', 'B4', '6', '4', '0', null, null, '1000', '1', null);

-- ----------------------------
-- Table structure for `dorm_info`
-- ----------------------------
DROP TABLE IF EXISTS `dorm_info`;
CREATE TABLE `dorm_info` (
  `DORM_ID` varchar(2) NOT NULL,
  `DORM_NAME` varchar(60) NOT NULL,
  `DORM_LIMIT` varchar(2) NOT NULL,
  `DORM_MANAGER` varchar(30) NOT NULL,
  `DORM_MANAGER_TEL` varchar(11) NOT NULL,
  `FLOOR_COUNT` int(11) NOT NULL,
  `ROOM_COUNT` int(11) NOT NULL,
  `BED_COUNT` int(11) NOT NULL,
  `ASSIGN_COUNT` int(11) NOT NULL,
  `USE_CONDITION` varchar(2) NOT NULL,
  `REMARK` varchar(2014) DEFAULT NULL,
  PRIMARY KEY (`DORM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dorm_info
-- ----------------------------
INSERT INTO `dorm_info` VALUES ('A1', 'A1', '男', 'admin', '110', '6', '150', '600', '0', '否', '');
INSERT INTO `dorm_info` VALUES ('B2', 'B2', '男', 'suguan', '18279265280', '6', '110', '440', '0', '否', null);
INSERT INTO `dorm_info` VALUES ('B4', 'B4', '男', 'suguan', '18279265280', '6', '110', '440', '0', '否', null);

-- ----------------------------
-- Table structure for `items_info`
-- ----------------------------
DROP TABLE IF EXISTS `items_info`;
CREATE TABLE `items_info` (
  `ITEMS_INFO_ID` varchar(64) NOT NULL,
  `ITEMS_INFO_NAME` varchar(30) NOT NULL,
  `STUDENT_EXAM_NUM` varchar(14) NOT NULL,
  `ITEMS_INFO_CATEGORY` varchar(1) NOT NULL,
  `COMPUTER_MAC` varchar(12) DEFAULT NULL,
  `ITEMS_INFO_IMAGE` varchar(128) NOT NULL,
  `ITEMS_INFO_DESCRIBE` varchar(100) DEFAULT NULL,
  `ITEMS_REVIEW` varchar(1) NOT NULL,
  `ITEMS_LOCATION` varchar(1) NOT NULL,
  `ITEMS_LOCATION_TIME` varchar(16) DEFAULT NULL,
  `ITEMS_STATE` varchar(1) NOT NULL,
  PRIMARY KEY (`ITEMS_INFO_ID`),
  KEY `PK_items _info_STUDENT_EXAM_NUM` (`STUDENT_EXAM_NUM`),
  CONSTRAINT `PK_items _info_STUDENT_EXAM_NUM` FOREIGN KEY (`STUDENT_EXAM_NUM`) REFERENCES `student_info` (`STUDENT_EXAM_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of items_info
-- ----------------------------
INSERT INTO `items_info` VALUES ('2017092610334958402017040500117', 'thinkpad', '2017040500117', '1', 'dg25h2ui2yg2', 'ItemsPicture/2017092610361343182017092610334958402017040500117.png', '这是电脑', '1', '2', null, '2');
INSERT INTO `items_info` VALUES ('2017092610345196362017040500117', '联想电脑', '2017040500117', '1', 'usb2uab256um', 'ItemsPicture/2017092610345196362017040500117.png', '这是一台联想笔记本', '2', '2', '20170926103951', '1');
INSERT INTO `items_info` VALUES ('2017092610353269082017040500117', '吉他', '2017040500117', '2', null, 'ItemsPicture/2017092610353269082017040500117.png', '这是吉他', '2', '1', '20170926103808', '1');

-- ----------------------------
-- Table structure for `items_out_records`
-- ----------------------------
DROP TABLE IF EXISTS `items_out_records`;
CREATE TABLE `items_out_records` (
  `ITEMS_RECORDS_ID` varchar(18) NOT NULL,
  `ITEMS_INFO_ID` varchar(32) NOT NULL,
  `ITEMS_RECORDS_TIME` varchar(14) NOT NULL,
  `ITEMS_RECORDS_STATE` varchar(1) NOT NULL,
  PRIMARY KEY (`ITEMS_RECORDS_ID`),
  KEY `PK_ITEMS_INFO` (`ITEMS_INFO_ID`),
  CONSTRAINT `PK_ITEMS_INFO` FOREIGN KEY (`ITEMS_INFO_ID`) REFERENCES `items_info` (`ITEMS_INFO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of items_out_records
-- ----------------------------
INSERT INTO `items_out_records` VALUES ('201709261039145739', '2017092610345196362017040500117', '20170926103951', '3');

-- ----------------------------
-- Table structure for `leave_school_records`
-- ----------------------------
DROP TABLE IF EXISTS `leave_school_records`;
CREATE TABLE `leave_school_records` (
  `LEAVE_RECODES_ID` varchar(18) NOT NULL,
  `STUDENT_EXAM_NUM` varchar(32) NOT NULL,
  `LEAVE_RECODES_TIME` varchar(14) NOT NULL,
  `LEAVE_RECODES_STATE` varchar(1) NOT NULL,
  PRIMARY KEY (`LEAVE_RECODES_ID`),
  KEY `PK_leave_school_records` (`STUDENT_EXAM_NUM`),
  CONSTRAINT `PK_leave_school_records` FOREIGN KEY (`STUDENT_EXAM_NUM`) REFERENCES `student_info` (`STUDENT_EXAM_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leave_school_records
-- ----------------------------
INSERT INTO `leave_school_records` VALUES ('201709261039519419', '2017040500117', '20170926103951', '1');
INSERT INTO `leave_school_records` VALUES ('201709261039578551', '2017040500117', '20170926103957', '1');

-- ----------------------------
-- Table structure for `maclass_module_info`
-- ----------------------------
DROP TABLE IF EXISTS `maclass_module_info`;
CREATE TABLE `maclass_module_info` (
  `MM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MANAGER_CLASS_ID` int(11) NOT NULL,
  `MODULE_ID` int(11) NOT NULL,
  PRIMARY KEY (`MM_ID`),
  KEY `MANAGER_CLASS_ID` (`MANAGER_CLASS_ID`),
  KEY `MODULE_ID` (`MODULE_ID`),
  CONSTRAINT `maclass_module_info_ibfk_1` FOREIGN KEY (`MANAGER_CLASS_ID`) REFERENCES `manager_class` (`MANAGER_CLASS_ID`),
  CONSTRAINT `maclass_module_info_ibfk_2` FOREIGN KEY (`MODULE_ID`) REFERENCES `module_info` (`MODULE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of maclass_module_info
-- ----------------------------
INSERT INTO `maclass_module_info` VALUES ('1', '1', '1');
INSERT INTO `maclass_module_info` VALUES ('2', '1', '3');
INSERT INTO `maclass_module_info` VALUES ('4', '2', '12');
INSERT INTO `maclass_module_info` VALUES ('7', '1', '4');
INSERT INTO `maclass_module_info` VALUES ('8', '1', '5');
INSERT INTO `maclass_module_info` VALUES ('9', '1', '6');
INSERT INTO `maclass_module_info` VALUES ('10', '1', '7');
INSERT INTO `maclass_module_info` VALUES ('11', '1', '8');
INSERT INTO `maclass_module_info` VALUES ('12', '1', '9');
INSERT INTO `maclass_module_info` VALUES ('13', '1', '10');
INSERT INTO `maclass_module_info` VALUES ('14', '1', '11');
INSERT INTO `maclass_module_info` VALUES ('15', '1', '12');
INSERT INTO `maclass_module_info` VALUES ('16', '1', '13');
INSERT INTO `maclass_module_info` VALUES ('17', '1', '14');
INSERT INTO `maclass_module_info` VALUES ('18', '1', '15');
INSERT INTO `maclass_module_info` VALUES ('19', '1', '16');
INSERT INTO `maclass_module_info` VALUES ('20', '2', '11');
INSERT INTO `maclass_module_info` VALUES ('21', '3', '4');
INSERT INTO `maclass_module_info` VALUES ('22', '3', '5');
INSERT INTO `maclass_module_info` VALUES ('23', '2', '13');
INSERT INTO `maclass_module_info` VALUES ('24', '2', '14');
INSERT INTO `maclass_module_info` VALUES ('25', '1', '17');
INSERT INTO `maclass_module_info` VALUES ('26', '2', '17');

-- ----------------------------
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `MANAGER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MANAGER_CLASS_ID` int(11) NOT NULL,
  `MANAGER_NAME` varchar(20) NOT NULL,
  `MANAGER_PASSWD` varchar(128) NOT NULL,
  `MANAGER_STATE` int(11) NOT NULL,
  PRIMARY KEY (`MANAGER_ID`),
  KEY `manager_ibfk_1` (`MANAGER_CLASS_ID`),
  CONSTRAINT `manager_ibfk_1` FOREIGN KEY (`MANAGER_CLASS_ID`) REFERENCES `manager_class` (`MANAGER_CLASS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', '1', 'admin', 'admin', '1');
INSERT INTO `manager` VALUES ('2', '2', 'xxgcLi', '123', '1');
INSERT INTO `manager` VALUES ('3', '3', 'suguan', '123', '1');

-- ----------------------------
-- Table structure for `manager_class`
-- ----------------------------
DROP TABLE IF EXISTS `manager_class`;
CREATE TABLE `manager_class` (
  `MANAGER_CLASS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MANAGER_CLASS_NAME` varchar(20) NOT NULL,
  `POWER_INFO` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`MANAGER_CLASS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager_class
-- ----------------------------
INSERT INTO `manager_class` VALUES ('1', '顶级管理员', '最高级管理员');
INSERT INTO `manager_class` VALUES ('2', '院级管理员', '院级管理员');
INSERT INTO `manager_class` VALUES ('3', '宿舍管理员', '宿管');

-- ----------------------------
-- Table structure for `manager_college_info`
-- ----------------------------
DROP TABLE IF EXISTS `manager_college_info`;
CREATE TABLE `manager_college_info` (
  `MC_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MANAGER_ID` int(11) NOT NULL,
  `COLLEGE_ID` varchar(6) NOT NULL,
  PRIMARY KEY (`MC_ID`),
  KEY `MANAGER_ID` (`MANAGER_ID`),
  KEY `COLLEGE_ID` (`COLLEGE_ID`),
  CONSTRAINT `manager_college_info_ibfk_1` FOREIGN KEY (`MANAGER_ID`) REFERENCES `manager` (`MANAGER_ID`),
  CONSTRAINT `manager_college_info_ibfk_2` FOREIGN KEY (`COLLEGE_ID`) REFERENCES `college_info` (`COLLEGE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager_college_info
-- ----------------------------
INSERT INTO `manager_college_info` VALUES ('1', '2', '081324');
INSERT INTO `manager_college_info` VALUES ('3', '1', '081324');
INSERT INTO `manager_college_info` VALUES ('4', '1', '082556');

-- ----------------------------
-- Table structure for `manager_dorm_info`
-- ----------------------------
DROP TABLE IF EXISTS `manager_dorm_info`;
CREATE TABLE `manager_dorm_info` (
  `MD_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MANAGER_ID` int(11) NOT NULL,
  `DORM_ID` varchar(2) NOT NULL,
  PRIMARY KEY (`MD_ID`),
  KEY `MANAGER_ID` (`MANAGER_ID`),
  KEY `DORM_ID` (`DORM_ID`),
  CONSTRAINT `manager_dorm_info_ibfk_1` FOREIGN KEY (`MANAGER_ID`) REFERENCES `manager` (`MANAGER_ID`),
  CONSTRAINT `manager_dorm_info_ibfk_2` FOREIGN KEY (`DORM_ID`) REFERENCES `dorm_info` (`DORM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager_dorm_info
-- ----------------------------
INSERT INTO `manager_dorm_info` VALUES ('1', '3', 'A1');

-- ----------------------------
-- Table structure for `module_class_info`
-- ----------------------------
DROP TABLE IF EXISTS `module_class_info`;
CREATE TABLE `module_class_info` (
  `MODULE_CLASS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MODULE_CLASS_NAME` varchar(20) NOT NULL,
  `MODULE_INTRO` varchar(255) NOT NULL,
  PRIMARY KEY (`MODULE_CLASS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of module_class_info
-- ----------------------------
INSERT INTO `module_class_info` VALUES ('1', '管理员管理', '管理管理员项');
INSERT INTO `module_class_info` VALUES ('2', '学生管理', '管理学生项');
INSERT INTO `module_class_info` VALUES ('3', '宿舍管理', '管理宿舍项');
INSERT INTO `module_class_info` VALUES ('4', '分配寝室', '分配寝室');
INSERT INTO `module_class_info` VALUES ('5', '更换寝室', '跟换寝室');
INSERT INTO `module_class_info` VALUES ('6', '学院管理', '管理学院项');
INSERT INTO `module_class_info` VALUES ('7', '学制管理', '管理学制项');
INSERT INTO `module_class_info` VALUES ('8', '模块管理', '管理模块');

-- ----------------------------
-- Table structure for `module_info`
-- ----------------------------
DROP TABLE IF EXISTS `module_info`;
CREATE TABLE `module_info` (
  `MODULE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MODULE_CLASS_ID` int(11) NOT NULL,
  `MODULE_NAME` varchar(20) NOT NULL,
  `MODULE_URL` varchar(100) NOT NULL,
  `MOSTATE` varchar(2) NOT NULL,
  PRIMARY KEY (`MODULE_ID`),
  KEY `MODULE_CLASS_ID` (`MODULE_CLASS_ID`),
  CONSTRAINT `module_info_ibfk_1` FOREIGN KEY (`MODULE_CLASS_ID`) REFERENCES `module_class_info` (`MODULE_CLASS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of module_info
-- ----------------------------
INSERT INTO `module_info` VALUES ('1', '1', '管理员列表', '/manager/managerList.action', '1');
INSERT INTO `module_info` VALUES ('3', '1', '管理员类列表', '/managerClass/managerClassList.action', '1');
INSERT INTO `module_info` VALUES ('4', '3', '宿舍楼列表', '/dorm/dormList.action.action', '1');
INSERT INTO `module_info` VALUES ('5', '3', '房间列表', '/dormroom/dormroomList.action', '1');
INSERT INTO `module_info` VALUES ('6', '2', '学生列表', '/student/studentList.action', '1');
INSERT INTO `module_info` VALUES ('7', '8', '模块列表', '/module/moduleList.action', '1');
INSERT INTO `module_info` VALUES ('8', '6', '学院列表', '/college/collegeList.action', '1');
INSERT INTO `module_info` VALUES ('9', '6', '专业列表', '/profession/professionList.action', '1');
INSERT INTO `module_info` VALUES ('10', '7', '学制列表', '/systemInfo/systemInfoList.action', '1');
INSERT INTO `module_info` VALUES ('11', '4', '分配房间给学院', '/roomDistribution/roomToCollegePage.action', '1');
INSERT INTO `module_info` VALUES ('12', '4', '给学生安排宿舍', '/roomDistribution/studentToRoomPage.action', '1');
INSERT INTO `module_info` VALUES ('13', '5', '单人换寝', '/roomDistribution/roomChangeOnePage.action', '1');
INSERT INTO `module_info` VALUES ('14', '5', '两人互换', '/roomDistribution/roomExChangePage.action', '1');
INSERT INTO `module_info` VALUES ('15', '8', '管理管理员类别和模块关系', '/managerClass/managerClassModuleList.action', '1');
INSERT INTO `module_info` VALUES ('16', '2', '导入学生信息', '/student/studentSavePage.action', '1');
INSERT INTO `module_info` VALUES ('17', '4', '毕业迁出', '/roomDistribution/StudentEmigrationToRoomPage.action', '1');

-- ----------------------------
-- Table structure for `profession_info`
-- ----------------------------
DROP TABLE IF EXISTS `profession_info`;
CREATE TABLE `profession_info` (
  `PROFESSION_ID` varchar(10) NOT NULL,
  `PROFESSION_NAME` varchar(30) NOT NULL,
  `COLLEGE_ID` varchar(6) NOT NULL,
  `PROFESSION_LINKMAN` varchar(20) DEFAULT NULL,
  `PROFESSION_TEL` varchar(11) DEFAULT NULL,
  `PROFESSION_INTRO` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`PROFESSION_ID`),
  KEY `COLLEGE_ID` (`COLLEGE_ID`),
  CONSTRAINT `profession_info_ibfk_1` FOREIGN KEY (`COLLEGE_ID`) REFERENCES `college_info` (`COLLEGE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of profession_info
-- ----------------------------
INSERT INTO `profession_info` VALUES ('0813241634', '软件技术', '081324', '小王', '120', '软件技术');
INSERT INTO `profession_info` VALUES ('0825546845', '工程造价', '082556', '小李', '119', null);

-- ----------------------------
-- Table structure for `students_app_info`
-- ----------------------------
DROP TABLE IF EXISTS `students_app_info`;
CREATE TABLE `students_app_info` (
  `STUDENTS_APP_ID` varchar(14) NOT NULL,
  `STUDENT_EXAM_NUM` varchar(14) DEFAULT NULL,
  `STUDENT_APP_HEARD` varchar(255) DEFAULT NULL,
  `STUDENT_APP_PASSWD` varchar(32) NOT NULL,
  `STUDENT_APP_PHONE` varchar(11) NOT NULL,
  `STUDENTS_FACE_CODE` varchar(255) DEFAULT NULL,
  `STUDENTS_APP_STATE` varchar(1) NOT NULL,
  `APP_CHANGE_TIME` varchar(14) NOT NULL,
  PRIMARY KEY (`STUDENTS_APP_ID`),
  KEY `STUDENT_EXAM_NUM` (`STUDENT_EXAM_NUM`),
  CONSTRAINT `students_app_info_ibfk_1` FOREIGN KEY (`STUDENT_EXAM_NUM`) REFERENCES `student_info` (`STUDENT_EXAM_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of students_app_info
-- ----------------------------
INSERT INTO `students_app_info` VALUES ('111', '2017040500117', 'Avatar/201704050011720170926103847.png', 'e3ceb5881a0a1fdaad01296d7554868d', '18779273787', '2212', '1', '20170926105853');

-- ----------------------------
-- Table structure for `students_late_records`
-- ----------------------------
DROP TABLE IF EXISTS `students_late_records`;
CREATE TABLE `students_late_records` (
  `LATE_RECORDS_ID` varchar(18) NOT NULL,
  `STUDENT_EXAM_NUM` varchar(32) NOT NULL,
  `ITEMS_RECORDS_TIME` varchar(14) NOT NULL,
  `LATE_RECORDS_STATE` varchar(1) NOT NULL,
  PRIMARY KEY (`LATE_RECORDS_ID`),
  KEY `PK_late_records` (`STUDENT_EXAM_NUM`),
  CONSTRAINT `PK_late_records` FOREIGN KEY (`STUDENT_EXAM_NUM`) REFERENCES `student_info` (`STUDENT_EXAM_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of students_late_records
-- ----------------------------
INSERT INTO `students_late_records` VALUES ('201709192013522359', '2017040500117', '20170919201352', '1');
INSERT INTO `students_late_records` VALUES ('201709261056249323', '2017040500117', '20170926105624', '1');

-- ----------------------------
-- Table structure for `student_info`
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `STUDENT_ID` varchar(20) NOT NULL,
  `STUDENT_NO` varchar(30) NOT NULL,
  `STUDENT_NAME` varchar(30) NOT NULL,
  `PROFESSION_ID` varchar(10) NOT NULL,
  `SYSTEM_ID` int(11) NOT NULL,
  `STUDENT_ENTER_DATE` date NOT NULL,
  `STUDENT_IDCARD_TYPE` varchar(3) NOT NULL,
  `STUDENT_IDCARD` varchar(18) NOT NULL,
  `STUDENT_SEX` varchar(1) NOT NULL,
  `STUDENT_BIRTHDAY` date NOT NULL,
  `STUDENT_NATIVE` varchar(100) DEFAULT NULL,
  `STUDENT_NATION` varchar(50) DEFAULT NULL,
  `STUDENT_TEL` varchar(11) DEFAULT NULL,
  `STUDENT_EMAIL` varchar(64) DEFAULT NULL,
  `STUDENT_ADDRESS` varchar(200) DEFAULT NULL,
  `STUDENT_CODE` varchar(6) NOT NULL,
  `STUDENT_LOCAL` varchar(20) NOT NULL,
  `STUDENT_EXAM_NUM` varchar(14) NOT NULL,
  `ROOM_ID` varchar(9) NOT NULL,
  PRIMARY KEY (`STUDENT_ID`),
  KEY `PROFESSION_ID` (`PROFESSION_ID`),
  KEY `SYSTEM_ID` (`SYSTEM_ID`),
  KEY `ROOM_ID` (`ROOM_ID`),
  KEY `STUDENT_EXAM_NUM` (`STUDENT_EXAM_NUM`),
  CONSTRAINT `student_info_ibfk_1` FOREIGN KEY (`PROFESSION_ID`) REFERENCES `profession_info` (`PROFESSION_ID`),
  CONSTRAINT `student_info_ibfk_2` FOREIGN KEY (`SYSTEM_ID`) REFERENCES `system_info` (`SYSTEM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('1', '2015040201142', '小王', '0813241634', '1', '2015-09-01', '1', '362532199405020513', '1', '2017-09-03', '江西', '汉', '16542585236', '110@cctv.com', '江西', '322000', '江西', '2017040500117', '');
INSERT INTO `student_info` VALUES ('2', '2015040201143', '小李', '0813241634', '1', '2015-09-18', '1', '362532199801010523', '1', '2017-09-18', '江西', '汉', '18265489586', '110@cctv.com', null, '', '', '', 'A1112298');
INSERT INTO `student_info` VALUES ('20170926093500578', '2015040201196', '王二', '0813241634', '1', '2015-09-25', '1', '362532199502049980', '1', '2017-09-25', '江西', '汉', '11245681025', '110@cctv.com', '江西', '322000', '江西', '2017040500120', 'A1112298');
INSERT INTO `student_info` VALUES ('3', '2015040201141', '小刘', '0813241634', '1', '2017-09-21', '1', '362532199506040635', '1', '2017-09-21', '江西', '汉', '13878562586', '110@cctv.com', null, '', '', '', 'A1112298');

-- ----------------------------
-- Table structure for `system_info`
-- ----------------------------
DROP TABLE IF EXISTS `system_info`;
CREATE TABLE `system_info` (
  `SYSTEM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SYSTEM_NAME` varchar(30) NOT NULL,
  `SYSTEM_YEARS` int(11) NOT NULL,
  `SYSTEM_INFO` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`SYSTEM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_info
-- ----------------------------
INSERT INTO `system_info` VALUES ('1', '三年制', '3', '三年');
