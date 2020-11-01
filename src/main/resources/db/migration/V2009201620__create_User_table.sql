CREATE TABLE USER (
    id INT NOT NULL auto_increment PRIMARY KEYNOT NULL,
    email VARCHAR(255) NOT NULL default ""NOT NULL,
    name VARCHAR(20) NOT NULL default ""NOT NULL,
    password VARCHAR(12) NOT NULL NOT NULL,
    phone_num VARCHAR(30)NOT NULL,
    classfication ENUM('p'NOT NULL, 'u')NOT NULL,
    last_login DATETIMENOT NULL,
    is_activate BOOLEAN
)