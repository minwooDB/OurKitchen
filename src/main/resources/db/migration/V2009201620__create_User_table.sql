CREATE TABLE USER (
    id INT NOT NULL auto_increment PRIMARY KEY,
    email VARCHAR(255) NOT NULL default "",
    name VARCHAR(20) NOT NULL default "",
    password VARCHAR(12) NOT NULL,
    phone_num VARCHAR(30),
    classfication ENUM('p', 'u'),
    last_login DATETIME,
    is_activate BOOLEAN
)