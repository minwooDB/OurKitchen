CREATE TABLE `preview_info_2` (
	`id` INT(10) NULL DEFAULT NULL,
	`gu_code` INT(10) NULL DEFAULT NULL,
	`gu_name` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`gu_total_resident_pop` INT(10) NULL DEFAULT NULL,
	`gu_total_resident_pop_men` INT(10) NULL DEFAULT NULL,
	`gu_total_resident_pop_women` INT(10) NULL DEFAULT NULL,
	`gu_total_economic_pop` INT(10) NULL DEFAULT NULL,
	`gu_total_economic_pop_men` INT(10) NULL DEFAULT NULL,
	`gu_total_economic_pop_women` INT(10) NULL DEFAULT NULL,
	`gu_total_floating_pop` INT(10) NULL DEFAULT NULL,
	`gu_total_floating_pop_men` INT(10) NULL DEFAULT NULL,
	`gu_total_floating_pop_women` INT(10) NULL DEFAULT NULL
)
COMMENT='gu_standard_info'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;