CREATE TABLE KITCHEN_INFO (
    id INT NOT NULL auto_increment PRIMARY KEY,
    name VARCHAR(20) NOT NULL default "",
    address VARCHAR(255) NOT NULL ,
    certification VARCHAR(20) NOT NULL,
    lat float NOT NULL,
    lng float NOT NULL,
    capacity INT NOT NULL,
    user_id INT NOT NULL,
    FOREIGN KEY(user_id) REFERENCES USER(id)
)