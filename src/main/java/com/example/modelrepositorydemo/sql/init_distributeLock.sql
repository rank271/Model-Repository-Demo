DROP TABLE IF EXISTS `distribute_lock`;
SET
character_set_client = utf8mb4 ;
CREATE TABLE `distribute_lock`
(
    `id`            bigint(20) AUTO_INCREMENT,
    `business_code` varchar(50) NOT NULL,
    `business_name` varchar(50) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `distribute_lock`(business_code, business_name)
values ('rollback', 'rollback')