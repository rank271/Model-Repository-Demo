DROP TABLE IF EXISTS `artifact`;
SET
character_set_client = utf8mb4 ;
CREATE TABLE `artifact`
(
    `artifact_id`  bigint(20) AUTO_INCREMENT,
    `group_id`     bigint(20) NOT NULL,
    `group_name`   varchar(50) DEFAULT NULL,
    `name`         varchar(50) DEFAULT NULL,
    `creator`      varchar(50) DEFAULT NULL,
    `gmt_create`   datetime NOT NULL,
    `gmt_modified` datetime NOT NULL,
    PRIMARY KEY (`artifact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `artifact`
values (34521, 6789, 'group123', 'artifact123', 'li', now(), now())