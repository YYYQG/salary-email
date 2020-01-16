/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : salary_email

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 16/01/2020 09:35:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for email_information
-- ----------------------------
DROP TABLE IF EXISTS `email_information`;
CREATE TABLE `email_information`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) NULL DEFAULT NULL,
  `date_of_salary` date NULL DEFAULT NULL,
  `base_salary` decimal(10, 2) NULL DEFAULT NULL,
  `post_salary` decimal(10, 2) NULL DEFAULT NULL,
  `seniority_salary` decimal(10, 2) NULL DEFAULT NULL,
  `performance_and_bonus` decimal(10, 2) NULL DEFAULT NULL,
  `meal_allowance` decimal(10, 2) NULL DEFAULT NULL,
  `other_deduction` decimal(10, 2) NULL DEFAULT NULL,
  `total_salary` decimal(10, 2) NULL DEFAULT NULL,
  `individual_social_security` decimal(10, 2) NULL DEFAULT NULL,
  `individual_provident_fund` decimal(10, 2) NULL DEFAULT NULL,
  `take_home_salary` decimal(10, 2) NULL DEFAULT NULL,
  `individual_income_tax` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 843 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of email_information
-- ----------------------------
INSERT INTO `email_information` VALUES (810, 287, NULL, 1500.00, 13500.00, 100.00, 0.00, 300.00, 0.00, 15400.00, 293.42, 89.00, 14015.82, 1001.76);
INSERT INTO `email_information` VALUES (811, 288, NULL, 1500.00, 3000.00, 100.00, 2800.00, 300.00, 0.00, 7700.00, 293.42, 89.00, 7313.75, 3.83);
INSERT INTO `email_information` VALUES (812, 289, NULL, 1500.00, 4000.00, 100.00, 0.00, 300.00, 0.00, 5900.00, 293.42, 89.00, 5517.58, 0.00);
INSERT INTO `email_information` VALUES (813, 290, NULL, 1500.00, 4200.00, 100.00, 0.00, 300.00, 0.00, 6100.00, 293.42, 89.00, 5717.58, 0.00);
INSERT INTO `email_information` VALUES (814, 293, NULL, 1500.00, 3500.00, 100.00, 2780.00, 300.00, 0.00, 8180.00, 293.42, 89.00, 7713.65, 83.93);
INSERT INTO `email_information` VALUES (815, 294, NULL, 1500.00, 5300.00, 100.00, 3080.00, 300.00, 0.00, 10280.00, 293.42, 89.00, 9762.65, 134.93);
INSERT INTO `email_information` VALUES (816, 295, NULL, 1500.00, 3500.00, 100.00, 6080.00, 300.00, 0.00, 11480.00, 293.42, 89.00, 10914.65, 182.93);
INSERT INTO `email_information` VALUES (817, 297, NULL, 1500.00, 6000.00, 100.00, 1100.00, 300.00, 0.00, 9000.00, 293.42, 89.00, 8551.05, 66.53);
INSERT INTO `email_information` VALUES (818, 298, NULL, 1500.00, 8500.00, 100.00, 0.00, 300.00, -317.60, 10082.40, 293.42, 89.00, 9229.98, 470.00);
INSERT INTO `email_information` VALUES (819, 299, NULL, 1500.00, 2500.00, 100.00, 0.00, 300.00, 0.00, 4400.00, 293.42, 89.00, 4017.58, 0.00);
INSERT INTO `email_information` VALUES (820, 301, NULL, 1500.00, 5500.00, 0.00, 2600.00, 300.00, 0.00, 9900.00, 293.42, 89.00, 9517.58, 0.00);
INSERT INTO `email_information` VALUES (821, 302, NULL, 1500.00, 4500.00, 0.00, 3300.00, 300.00, 0.00, 9600.00, 293.42, 89.00, 9091.05, 126.53);
INSERT INTO `email_information` VALUES (822, 303, NULL, 1500.00, 4500.00, 0.00, 0.00, 300.00, -100.00, 6200.00, 293.42, 89.00, 5817.58, 0.00);
INSERT INTO `email_information` VALUES (823, 304, NULL, 1500.00, 4500.00, 0.00, 0.00, 300.00, 0.00, 6300.00, 293.42, 89.00, 5890.05, 27.53);
INSERT INTO `email_information` VALUES (824, 305, NULL, 1500.00, 10200.00, 0.00, 0.00, 300.00, 0.00, 12000.00, 293.42, 89.00, 10955.82, 661.76);
INSERT INTO `email_information` VALUES (825, 306, NULL, 1500.00, 3700.00, 0.00, 0.00, 300.00, 0.00, 5500.00, 293.42, 89.00, 5114.05, 3.53);
INSERT INTO `email_information` VALUES (826, 307, NULL, 1500.00, 3700.00, 0.00, 0.00, 300.00, 0.00, 5500.00, 293.42, 89.00, 5114.05, 3.53);
INSERT INTO `email_information` VALUES (827, 308, NULL, 1500.00, 4000.00, 0.00, 0.00, 300.00, 0.00, 5800.00, 293.42, 89.00, 5417.58, 0.00);
INSERT INTO `email_information` VALUES (828, 309, NULL, 1500.00, 2500.00, 0.00, 1980.00, 300.00, 0.00, 6280.00, 293.42, 89.00, 5897.58, 0.00);
INSERT INTO `email_information` VALUES (829, 312, NULL, 1000.00, 1500.00, 0.00, 1700.00, 300.00, 0.00, 4500.00, 0.00, 0.00, 4500.00, 0.00);
INSERT INTO `email_information` VALUES (830, 316, NULL, 1500.00, 3500.00, 0.00, 3040.00, 300.00, 0.00, 8340.00, 293.42, 89.00, 7868.85, 88.73);
INSERT INTO `email_information` VALUES (831, 317, NULL, 1500.00, 4700.00, 0.00, 0.00, 300.00, 0.00, 6500.00, 0.00, 89.00, 6411.00, 0.00);
INSERT INTO `email_information` VALUES (832, 318, NULL, 1500.00, 3700.00, 0.00, 0.00, 300.00, 0.00, 5500.00, 293.42, 89.00, 5117.58, 0.00);
INSERT INTO `email_information` VALUES (833, 319, NULL, 1500.00, 3500.00, 0.00, 80.00, 300.00, 0.00, 5380.00, 293.42, 89.00, 4997.58, 0.00);
INSERT INTO `email_information` VALUES (834, 320, NULL, 1500.00, 2000.00, 0.00, 840.00, 300.00, 0.00, 4640.00, 0.00, 0.00, 4640.00, 0.00);
INSERT INTO `email_information` VALUES (835, 321, NULL, 1500.00, 10200.00, 0.00, 8333.33, 300.00, 0.00, 20333.33, 293.42, 89.00, 19502.38, 448.53);
INSERT INTO `email_information` VALUES (836, 322, NULL, 100.00, 1400.00, 0.00, 100.00, 0.00, -100.00, 1500.00, 0.00, 0.00, 1500.00, 0.00);
INSERT INTO `email_information` VALUES (837, 323, NULL, 100.00, 1400.00, 0.00, 0.00, 0.00, 0.00, 1500.00, 0.00, 0.00, 1500.00, 0.00);
INSERT INTO `email_information` VALUES (838, 324, NULL, 100.00, 1400.00, 0.00, 100.00, 0.00, 0.00, 1600.00, 0.00, 0.00, 1600.00, 0.00);
INSERT INTO `email_information` VALUES (839, 325, NULL, 100.00, 1400.00, 0.00, 50.00, 0.00, 0.00, 1550.00, 0.00, 0.00, 1550.00, 0.00);
INSERT INTO `email_information` VALUES (840, 326, NULL, 100.00, 1400.00, 0.00, 50.00, 300.00, 0.00, 1850.00, 0.00, 0.00, 1850.00, 0.00);
INSERT INTO `email_information` VALUES (841, 300, NULL, 100.00, 1700.00, 0.00, 1100.00, 0.00, 0.00, 2900.00, 0.00, 0.00, 2900.00, 0.00);
INSERT INTO `email_information` VALUES (842, 327, NULL, 1000.00, 120.00, 0.00, 0.00, 60.00, 0.00, 1180.00, 0.00, 0.00, 1180.00, 0.00);

-- ----------------------------
-- Table structure for email_record
-- ----------------------------
DROP TABLE IF EXISTS `email_record`;
CREATE TABLE `email_record`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) NULL DEFAULT NULL,
  `transmit_time` datetime(0) NULL DEFAULT NULL,
  `date_of_salary` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for excel_upload
-- ----------------------------
DROP TABLE IF EXISTS `excel_upload`;
CREATE TABLE `excel_upload`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `entry_datetime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `file_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for month_salary_detail
-- ----------------------------
DROP TABLE IF EXISTS `month_salary_detail`;
CREATE TABLE `month_salary_detail`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_id` int(11) NOT NULL,
  `staff_id` int(11) NOT NULL,
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `pay_scale` decimal(20, 2) NULL DEFAULT NULL,
  `base_pay` decimal(20, 2) NULL DEFAULT NULL,
  `post_wage` decimal(20, 2) NULL DEFAULT NULL,
  `seniority_pay` decimal(20, 2) NULL DEFAULT NULL,
  `meal_allowance` decimal(20, 2) NULL DEFAULT NULL,
  `other` decimal(20, 2) NULL DEFAULT NULL,
  `send_subtotal` decimal(20, 2) NULL DEFAULT NULL,
  `annuity` decimal(20, 2) NULL DEFAULT NULL,
  `medicare` decimal(20, 2) NULL DEFAULT NULL,
  `unemployment_insurance` decimal(20, 2) NULL DEFAULT NULL,
  `accumulation_fund` decimal(20, 2) NULL DEFAULT NULL,
  `social_fund_subtotal` decimal(20, 2) NULL DEFAULT NULL,
  `fill_tax` decimal(20, 2) NULL DEFAULT NULL,
  `actual_quantity` decimal(20, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `id_card` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `education` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `deposit_bank` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `bank_account` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `entry_date` date NULL DEFAULT NULL,
  `telephone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `salary` int(10) NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `update_datetime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 328 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES (286, '魏锴', '总经办', '男', '510704198906283511', NULL, '中国银行双流蛟龙港支行', '6217863100001163789', NULL, '18380308316', NULL, NULL, 'abely@synnex.com', NULL);
INSERT INTO `staff` VALUES (287, '雷嘉辉', '总经办', '男', '510502199605216615', '专科', '中国工商银行四川省支行泸州市江阳区支行', '6212264402079392803', '2018-03-01', '13088315552', 15000, '无试用期', 'abely@synnex.com', '2020-01-06 15:00:48');
INSERT INTO `staff` VALUES (288, '童伟', '培训部', '男', '511524199511243216', '专科', '中国工商银行四川省宜宾市宜宾西郊支行', '6212262314001759896', '2018-03-26', '13550725674', 4500, '试用期5个月', 'abely@synnex.com', '2020-01-14 18:43:24');
INSERT INTO `staff` VALUES (289, '邱娜', '综合部', '女', '51012119910829226X', '专科', '金堂广场支行', '6212264402071634327', '2018-04-08', '13880554701', 5500, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (290, '周年刚', '财务部', '男', '513922198906185539', '本科', '中国工商银行成都春熙成龙大道支行', '6215584402024100299', '2018-04-09', '13683453761', 5700, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (291, '刘勇', '培训部', '男', '411503198511082395', '专科', '中国工商银行绵阳涪城区富乐路支行', '6212262308004941949', '2018-04-09', '18681606696', 6000, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (292, '祁腾飞', '培训部', '男', '220523199002281031', '本科', '金堂广场支行', '6212264402072695947', '2018-04-23', '15526625800', 7500, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (293, '钟尚坤', '培训部', '男', '510502199411162217', '中专', '中国工商银行', '6212264402073929162', '2018-05-02', '15681552211', 5000, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (294, '张平', '培训部', '男', '51112319960920425X', '专科', '中国工商银行四川省成都市成都金堂支行营业室', '6212264402072933215', '2018-05-03', '17602367452', 6800, '无试用期', NULL, NULL);
INSERT INTO `staff` VALUES (295, '邓于', '培训部', '男', '511321199606107612', '专科', '中国工商银行', '6212264402073929154', '2018-05-21', '13540202182', 5000, '试用期6个月，6个月都是3500', NULL, NULL);
INSERT INTO `staff` VALUES (296, '贺杰', '培训部', '男', '131082198212110430', '本科', '中国工商银行北京市市辖区翠微路西四环支行', '6222080200016227939', '2018-06-09', '18510080850', 6800, '6.9入职，试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (297, '陈东', '培训部', '男', '510703199308112219', '大专', '中国工商银行（绵阳南河支行）', '6212262308004336645', '2018-07-19', '18990190159', 7500, '7.19入职，试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (298, '李纯', '总经办', '女', '511524198610260025', '大专', '中国工商银行成都市金堂支行', '6222024402017301874', '2018-09-04', '18980943125', 10000, '9.3入职', NULL, NULL);
INSERT INTO `staff` VALUES (299, '光敏嘉', '综合部', '女', '140724199702270103', '大专', '中国工商银行', '6212264402079240580', NULL, '18035431221', 3000, '实习期', NULL, NULL);
INSERT INTO `staff` VALUES (300, '史君博', '电网事业部', '男', '372323199803032434', '专科', '中国工商银行金堂支行', '6212264402081406328', NULL, '17396230317', 3500, '实习期', NULL, NULL);
INSERT INTO `staff` VALUES (301, '刘洪', '培训部', '男', '513823199103023419', '专科', '中国工商银行', '6212264402010121709', NULL, '18626117136', 7000, '试用期3个月', NULL, NULL);
INSERT INTO `staff` VALUES (302, '崔航', '培训部', '男', '61232619910715391X', '大专', '中国工商银行（成都郫都支行）', '6212264402082715156', NULL, '13186086105', 6000, '试用期3个月', NULL, NULL);
INSERT INTO `staff` VALUES (303, '陈小龙', '电网事业部', '男', '511325199211052616', '高中', '工商银行', '6212264402086616780', '2019-03-04', '18200267036', 6000, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (304, '翟哲', '品牌事业部', '男', '420606198901162011', '本科', '成都金堂支行营业室', '6217234402008131567', '2019-03-25', '13658066326', 6000, '无试用期', NULL, NULL);
INSERT INTO `staff` VALUES (305, '罗海林', '电网事业部', '男', '510122199108180053', NULL, '工商银行', '6212264402086640822', '2019-04-08', '15756300313', 11700, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (306, '朱发章', '电网事业部', '男', '510112199010171818', '大专', '中国工商银行', '6212264402086640830', '2019-04-15', '13808209202', 5200, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (307, '杨靖', '电网事业部', '男', '51390219940408645x', '大专', '中国工商银行', '6212264402086640806', '2019-04-15', '13699093580', 5200, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (308, '罗淼', '综合部', '女', '510922199302265222', '本科', '中国工商银行', '6212264402089083822', '2019-04-17', '13688197597', 5500, '无试用期', NULL, NULL);
INSERT INTO `staff` VALUES (309, '王坤', '培训部', '男', '510121198810095317', '大专', '中国工商银行', '6212264402091563407', '2019-04-23', '18380183688', 4000, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (310, '李胜', '培训部', '男', '511002199805246871', '大专', '中国工商银行', '6212264402089272177', '2019-05-04', '13547913301', 1500, '2019.6.25离职', NULL, NULL);
INSERT INTO `staff` VALUES (311, '熊宇霖', '培训部', '男', '51010719990611177x', '大专', '中国工商银行', '6212264402089182731', '2019-05-04', '15520717061', 1500, '2019.5.4离职', NULL, NULL);
INSERT INTO `staff` VALUES (312, '李正', '培训部', '男', '513021199908282278', '大专', '中国工商银行', '6212264402089272185', '2019-05-04', '13076030197', 1500, '2019.10.14晋升实习教员，薪资2500，餐补300', NULL, NULL);
INSERT INTO `staff` VALUES (313, '沈益冬', '培训部', '男', '510802199712150910', '大专', '中国工商银行', '6212262309006366523', '2019-05-04', '15883553368', 1500, '2019.6.24离职', NULL, NULL);
INSERT INTO `staff` VALUES (314, '李彩云', '培训部', '女', '510923199901116428', '大专', '中国工商银行', '6215582310006074790', '2019-05-04', '18584195284', 1500, '2019.6.19离职', NULL, NULL);
INSERT INTO `staff` VALUES (315, '赵常宏', '培训部', '男', '51052219990509925x', '大专', '中国工商银行', '6212264402089083269', '2019-05-04', '15183095107', 1500, '实习期', NULL, NULL);
INSERT INTO `staff` VALUES (316, '廖江南', '培训部', '男', '53011119850605639x', '自考本科', '中国工商银行', '6222024402063918787', '2019-06-03', '13708806197', 5000, '试用期3个月', NULL, NULL);
INSERT INTO `staff` VALUES (317, '叶澍坤', '培训部', '男', '41130219920616317X', '自考本科', '中国工商银行', '6212264402044780306', '2019-06-12', '15928780106', 6200, '试用期1个月', NULL, NULL);
INSERT INTO `staff` VALUES (318, '陶志浩', '培训部', '男', '513902199607253473', '中专', '中国工商银行', '6212264402091034482', '2019-06-17', '17360069606', 5200, '试用期2个月', NULL, NULL);
INSERT INTO `staff` VALUES (319, '王俊力', '培训部', '男', '510522199411020257', '大专', '中国工商银行', '6212264402061933564', '2019-06-20', '18117975772', 5000, '试用期3个月', NULL, NULL);
INSERT INTO `staff` VALUES (320, '刘晨曦', '培训部', '男', '65280119951217501X', NULL, '中国工商银行', '6212264402091564611', '2019-07-01', '18262622598', 3500, '实习期（未拿到毕业证）', NULL, NULL);
INSERT INTO `staff` VALUES (321, '王周海', '培训部', '男', '510182198705286210', NULL, '中国工商银行', '6215582306000074778', '2019-10-21', '18683365551', 11700, '无试用期', NULL, NULL);
INSERT INTO `staff` VALUES (322, '冶文鑫', '培训部', '男', '630102199708100012', '大专', '中国工商银行', '6212264402096387612', '2019-10-22', '13980571132', 1500, NULL, NULL, NULL);
INSERT INTO `staff` VALUES (323, '王雨锋', '培训部', '男', '430381199908110177', '专科', '中国工商银行', '6212264402096388446', '2019-10-22', '13789319732', 1500, NULL, NULL, NULL);
INSERT INTO `staff` VALUES (324, '詹竞童', '培训部', '男', '510781199903242017', '大专', '中国工商银行', '6212262308008203320', '2019-10-22', '18148405077', 1500, NULL, NULL, NULL);
INSERT INTO `staff` VALUES (325, '冯志文', '培训部', '男', '511325199708204339', '大专', '中国工商银行', '6212264402096388792', '2019-10-22', '15808179237', 1500, NULL, NULL, NULL);
INSERT INTO `staff` VALUES (326, '陈智', '培训部', '男', '510104199407044075', '本科（自考）', '中国工商银行', '6212264402096998020', '2019-10-22', '15208390805', 1800, '试用期1500+300；转正2100', NULL, NULL);
INSERT INTO `staff` VALUES (327, '薛阳', '电网事业部', '男', '510105198710313794', '大专', '中国工商银行', '6222024402061663708', '2019-11-25', '15882299949', 7000, '1800，暂时无餐补', NULL, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `entry_datetime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
