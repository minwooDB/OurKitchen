CREATE TABLE `tradingarea_change_dong` (
	`id` INT(10) NULL DEFAULT NULL,
	`dong_code` INT(10) NULL DEFAULT NULL,
	`dong_name` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`change_index` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`change_index_name` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`run_average_month` INT(10) NULL DEFAULT NULL,
	`close_average_month` INT(10) NULL DEFAULT NULL,
	`run_average_month_seoul` INT(10) NULL DEFAULT NULL,
	`close_average_month_seoul` INT(10) NULL DEFAULT NULL
)
COMMENT='상권 변화 지표 동 기준'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;