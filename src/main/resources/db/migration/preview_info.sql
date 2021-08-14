CREATE TABLE `preview_info` (
	`id` INT(10) NULL DEFAULT NULL,
	`resident_pop_most` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`economic_pop_most` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`floating_pop_most` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`apartment_area_most` INT(10) NULL DEFAULT NULL,
	`apartment_area_avg` INT(10) NULL DEFAULT NULL,
	`apartment_price_most` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`apartment_price_avg` INT(10) NULL DEFAULT NULL,
	`facilities_most` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci'
)
COMMENT='business_info_preview'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;