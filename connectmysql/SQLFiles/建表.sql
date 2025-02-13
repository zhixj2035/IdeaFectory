
-- MySQL 版本8，创建学生表
CREATE TABLE
    users
(
    userId      INT NOT NULL AUTO_INCREMENT,
    userName    VARCHAR(50) NOT NULL,
    male        CHAR(5) NOT NULL,
    age         INT,
    address     VARCHAR(100),
    schoolId    VARCHAR(50),
    masterId    INT NOT NULL,
    grade_class VARCHAR(50),
    PRIMARY KEY (userId)
)
    ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 DEFAULT COLLATE=utf8mb3_general_ci COMMENT='学生表';

-- 新增两条数据
INSERT INTO users (userId, userName, male, age, address, schoolId, masterId, grade_class)
VALUES (1001, '张三丰', '男', 99, '武当山', '241101', 9901, '1_001');
INSERT INTO users (userId, userName, male, age, address, schoolId, masterId, grade_class)
VALUES (1002, '陈平安', '男', 32, '落魄山', '999999', 1101, '9_999');
