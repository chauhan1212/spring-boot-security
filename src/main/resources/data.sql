INSERT INTO my_users (userid, pwd, enabled) 
	values('dinesh', 'pass', true);
INSERT INTO my_users (userid, pwd, enabled) 
	values('jayesh', 'pass', true);
	
INSERT INTO my_authorities (userid, authority) 
	values('dinesh', 'ROLE_USER');	
INSERT INTO my_authorities (userid, authority) 
	values('jayesh', 'ROLE_ADMIN');