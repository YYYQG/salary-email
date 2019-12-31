/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : salaryemail

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 13/12/2019 17:40:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for email_infomation
-- ----------------------------
DROP TABLE IF EXISTS `email_infomation`;
CREATE TABLE `email_infomation`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` int(11) NULL DEFAULT NULL,
  `date_of_salary` date NULL DEFAULT NULL,
  `base_salary` decimal(10, 2) NULL DEFAULT NULL,
  `post_salary` decimal(10, 2) NULL DEFAULT NULL,
  `seniority_salary` decimal(10, 2) NULL DEFAULT NULL,
  `performance_and_bonus` decimal(10, 0) NULL DEFAULT NULL,
  `meal_allowance` decimal(10, 0) NULL DEFAULT NULL,
  `other_deduction` decimal(10, 0) NULL DEFAULT NULL,
  `total_salary` decimal(10, 2) NULL DEFAULT NULL,
  `individual_social_security` decimal(10, 0) NULL DEFAULT NULL,
  `individual_provident_fund` decimal(10, 0) NULL DEFAULT NULL,
  `take_home_salary` decimal(10, 2) NULL DEFAULT NULL,
  ` individual_income_tax` decimal(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

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
  `entry_data` datetime(0) NULL DEFAULT NULL,
  `telephone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `salary` int(10) NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `update_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
