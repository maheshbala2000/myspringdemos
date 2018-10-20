/*Table structure for table `users` */

CREATE TABLE `users` (
  `username` varchar(20) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `enabled` int(1) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`username`,`password`,`enabled`) values ('Mahesh','password123',1);

CREATE TABLE `user_roles` (
  `username` varchar(20) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  KEY `username` (`username`),
  CONSTRAINT `user_roles_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_roles` */

insert  into `user_roles`(`username`,`role`) values ('Mahesh','ROLE_USER');