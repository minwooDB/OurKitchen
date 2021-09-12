alter table kitchen_image add org_file_name varchar(255) NOT NULL;
alter table kitchen_image add file_name varchar(255) NOT NULL;
alter table kitchen_image add file_path varchar(255) NOT NULL;
alter table kitchen_image drop column name;