CREATE TABLE RESIDENT_POP (
	rdnm VARCHAR(20) PRIMARY KEY,
	dong VARCHAR(20) NOT NULL,
	all_total INT NOT NULL,
	man_total INT NOT NULL,
	women_total INT NOT NULL,
	total_20s INT NOT NULL,
	total_30s INT NOT NULL,
	total_40s INT NOT NULL,
	total_50s INT NOT NULL,
	total_60s INT NOT NULL,
	men_20s INT NOT NULL,
	men_30s INT NOT NULL,
	men_40s	INT NOT NULL,
	men_50s INT NOT NULL,
	men_60s	INT NOT NULL,
	women_20s INT NOT NULL,
	women_30s INT NOT NULL,
	women_40s INT NOT NULL,
	women_50s INT NOT NULL,
	women_60s INT NOT NULL
)