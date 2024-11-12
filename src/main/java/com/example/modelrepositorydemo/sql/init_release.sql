DROP TABLE IF EXISTS `release`;
SET
character_set_client = utf8mb4 ;
CREATE TABLE `release`
(
    `release_id`   bigint(20) AUTO_INCREMENT,
    `release_no`   varchar(50) DEFAULT NULL,
    `version_id`   bigint(20) NOT NULL,
    `artifact_id`  bigint(20) NOT NULL,
    `model_uuid`   varchar(50) DEFAULT NULL,
    `rollback`     int(1) DEFAULT NULL,
    `creator`      varchar(50) DEFAULT NULL,
    `gmt_create`   datetime NOT NULL,
    `gmt_modified` datetime NOT NULL,
    PRIMARY KEY (`release_id`),
    UNIQUE KEY (`model_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `release` values (12345,'release123',54321,34521,'uuid123456789',0,'li',now(),now())