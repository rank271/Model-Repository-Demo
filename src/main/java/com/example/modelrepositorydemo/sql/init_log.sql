DROP TABLE IF EXISTS `log`;
SET
character_set_client = utf8mb4 ;
CREATE TABLE `log`
(
    `log_id`      varchar(50) AUTO_INCREMENT,
    `creator`     varchar(50) NOT NULL,
    `operation`   varchar(50) NOT NULL,
    `release_id`  bigint(20) DEFAULT NULL,
    `release_no`  varchar(50) DEFAULT NULL,
    `version_id`  bigint(20) NOT NULL,
    `artifact_id` bigint(20) NOT NULL,
    `model_uuid`  varchar(50) DEFAULT NULL,
    `gmt_create`  datetime    NOT NULL,
    PRIMARY KEY (`log_id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- insert into `log`
-- values ()