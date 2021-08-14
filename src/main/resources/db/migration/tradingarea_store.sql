CREATE TABLE `tradingarea_store` (
	`id` INT(10) NULL DEFAULT NULL,
	`tradingarea_code` INT(10) NULL DEFAULT NULL,
	`tradingarea_name` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`service_code` INT(10) NULL DEFAULT NULL,
	`service_name` CHAR(100) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`store_num` INT(10) NULL DEFAULT NULL,
	`simillar_store_num` INT(10) NULL DEFAULT NULL,
	`store_open_num` INT(10) NULL DEFAULT NULL,
	`store_open_rate` INT(10) NULL DEFAULT NULL,
	`store_close_rate` INT(10) NULL DEFAULT NULL,
	`store_close_num` INT(10) NULL DEFAULT NULL,
	`store_franchise_num` INT(10) NULL DEFAULT NULL
)
COMMENT='상권별 점포 현황'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;