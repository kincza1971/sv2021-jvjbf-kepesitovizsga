CREATE TABLE `recorder` (
                            `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
                            `date_of_birth` DATE NOT NULL,
                            `name` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb3_hungarian_ci',
                            PRIMARY KEY (`id`) USING BTREE
)
    COLLATE='utf8mb3_hungarian_ci'
ENGINE=InnoDB
AUTO_INCREMENT=4
;
