CREATE DATABASE DB;

CREATE TABLE DB.my_properties(
id int NOT NULL AUTO_INCREMENT,
application varchar(100),
profile varchar(100),
label varchar(100),
property_key varchar(100),
property_value varchar(100)
PRIMARY KEY ( id )
);
