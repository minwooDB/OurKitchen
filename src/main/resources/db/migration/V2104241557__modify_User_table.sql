alter table User drop classification;
alter table User add role ENUM('ROLE_ADMIN', 'ROLE_PARTNER','ROLE_USER');