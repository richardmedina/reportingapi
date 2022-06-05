CREATE DATABASE IF NOT EXISTS `reportsdb`;
USE `reportsdb`;

DROP TABLE IF EXISTS `user_accounts`;

CREATE TABLE `user_accounts` (
	`id` INT NOT NULL AUTO_INCREMENT,
    `user_name` varchar(1024) DEFAULT '',
    `password` varchar(1024) NOT NULL,
    `first_name` varchar(1024) DEFAULT '',
    `last_name` varchar(1024) DEFAULT '',
	PRIMARY KEY(`id`)
);

INSERT INTO `user_accounts` (`user_name`, `password`, `first_name`, `last_name`) 
	VALUES ('admin', 'admin', 'Administrator', 'Admin')

