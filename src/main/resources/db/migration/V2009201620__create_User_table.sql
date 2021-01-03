CREATE TABLE USER (
    id INT NOT NULL auto_increment PRIMARY KEY,
    email VARCHAR(255) NOT NULL default "",
    name VARCHAR(20) NOT NULL default "",
    password VARCHAR(12) NOT NULL,
    phone_num VARCHAR(30),
    classification ENUM('p', 'u'),
    last_login DATETIME,
    active ENUM('C00', 'C01','C02')
)