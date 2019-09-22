CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  account_id varchar(100) DEFAULT NULL,
  name varchar(50) DEFAULT NULL,
  token char(36) DEFAULT NULL,
  gmt_create datetime DEFAULT NULL,
  gmt_modified datetime DEFAULT NULL,
  bio varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

