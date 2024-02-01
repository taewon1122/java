DROP DATABASE IF EXISTS SHOPPINGMALL;
CREATE DATABASE IF NOT EXISTS SHOPPINGMALL;

USE SHOPPINGMALL;

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`me_id`	varchar(13)	NOT NULL,
	`me_pw`	varchar(20) NOT	NULL,
	`me_email`	varchar(30) NOT	NULL,
	`me_phone`	varchar(13) NOT	NULL,
	`me_authority`	varchar(10) NOT NULL DEFAULT "USER",
	`me_try_count`	int NOT NULL default 0
);

DROP TABLE IF EXISTS `certification`;

CREATE TABLE `certifi]\\\\\\` (
	`ce_num`	int	NOT NULL,
	`ce_code`	char(6) NOT	NULL,
	`ce_limit`	datetime NOT,
	`ce_me_id`	varchar(13)	NOT NULL
);

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
	`pr_code`	varchar(15)	NOT NULL,
	`pr_title`	varchar(50) NOT	NULL,
	`pr_content`	text NOT,
	`pr_cost`	int NOT NULL DEFAULT 0
	`pr_ca_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
	`ca_num`	int	NOT NULL,
	`ca_name`	varchar(10) NOT	NULL
);

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
	`or_num`	int	NOT NULL,
	`or_date`	datetime,
	`or_state`	varchar(10) NOT NULL DEFAULT "결제완료",
	`or_amount`	int NOT NULL DEFAULT  0	,
	`or_total_price`	int,
	`or_me_id`	varchar(13)	NOT NULL,
	`or_pr_code`	varchar(15)	NOT NULL
);

DROP TABLE IF EXISTS `basket`;

CREATE TABLE `basket` (
	`ba_num`	int,
	`ba_amount`	int NOT NULL DEFAULT  0,
	`ba_me_id`	varchar(13)	NOT NULL,
	`ba_pr_code`	varchar(15)	NOT NULL
);

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
	`im_num`	char(10) NOT NULL,
	`im_file`	varchar(50),
	`im_pr_code`	varchar(15)	NOT NULL
);

ALTER TABLE `certification` ADD CONSTRAINT `FK_member_TO_certification_1` FOREIGN KEY (
	`ce_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `product` ADD CONSTRAINT `FK_category_TO_product_1` FOREIGN KEY (
	`pr_ca_num`
)
REFERENCES `category` (
	`ca_num`
);

ALTER TABLE `order` ADD CONSTRAINT `FK_member_TO_order_1` FOREIGN KEY (
	`or_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `order` ADD CONSTRAINT `FK_product_TO_order_1` FOREIGN KEY (
	`or_pr_code`
)
REFERENCES `product` (
	`pr_code`
);

ALTER TABLE `basket` ADD CONSTRAINT `FK_member_TO_basket_1` FOREIGN KEY (
	`ba_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `basket` ADD CONSTRAINT `FK_product_TO_basket_1` FOREIGN KEY (
	`ba_pr_code`
)
REFERENCES `product` (
	`pr_code`
);

ALTER TABLE `image` ADD CONSTRAINT `FK_product_TO_image_1` FOREIGN KEY (
	`im_pr_code`
)
REFERENCES `product` (
	`pr_code`
);


