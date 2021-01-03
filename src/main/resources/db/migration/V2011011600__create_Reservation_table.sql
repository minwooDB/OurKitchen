CREATE TABLE RESERVATION (
	id INT NOT NULL auto_increment PRIMARY KEY,
	kitchen_id INT NOT NULL,
	user_id	INT NOT NULL,
	start_date DATETIME NOT NULL,
	end_date DATETIME NOT NULL,
	time ENUM('M', 'L','D'),
	category VARCHAR(2)
	status ENUM('C00', 'C01','C02'),
	FOREIGN KEY(kitchen_id) REFERENCES KITCHEN_INFO(id),
	FOREIGN KEY(user_id) REFERENCES USER(id)
)