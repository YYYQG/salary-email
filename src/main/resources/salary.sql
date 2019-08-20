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

 Date: 20/08/2019 17:29:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for salary
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary`  (
  `id` int(11) NOT NULL,
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
  `actual_quantity` decimal(20, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
