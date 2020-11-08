CREATE TABLE SALES (
	id INT NOT NULL auto_increment PRIMARY KEY,
	rdnm VARCHAR(20) NOT NULL,
	dong VARCHAR(20) NOT NULL default "",
	store_code VARCHAR(20) NOT NULL,
	mon_sales INT NOT NULL,
	mon_sales_count INT NOT NULL,
	weekdays_sales_rate INT NOT NULL,
	weekend_sales_rate INT NOT NULL,
	weekdays_sales_count INT NOT NULL,
	weekend_sales_count INT NOT NULL,
	breakfast_sales INT NOT NULL,
	lunch_sales INT NOT NULL,
	dinner_sales INT NOT NULL,
	men_sales_rate INT NOT NULL,
	women_sales_rate INT NOT NULL
)