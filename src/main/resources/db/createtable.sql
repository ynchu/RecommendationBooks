
# 建表
DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id        int primary key not null auto_increment,
    name      char(14) unique NOT NULL,
    nick_name char(16)        NULL,
    pwd       char(16)        NULL,
    sex       char(8)         NULL,
    email     char(32)        NULL,
    tel       char(16)        NULL
);


DROP TABLE IF EXISTS role;
CREATE TABLE role
(
    id   int AUTO_INCREMENT PRIMARY KEY,
    name varchar(16) NOT NULL
);


DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role
(
    user_id int NULL,
    role_id int NULL,
    CONSTRAINT user_role_user_use_rid_fk
        UNIQUE (user_id),
    CONSTRAINT user_role_role_role_id_fk
        FOREIGN KEY (role_id) REFERENCES role (id)
            ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT user_role_user_user_id_fk
        FOREIGN KEY (user_id) REFERENCES users (id)
            ON UPDATE CASCADE ON DELETE CASCADE
);


DROP TABLE IF EXISTS major;
CREATE TABLE major
(
    id   int AUTO_INCREMENT PRIMARY KEY,
    name varchar(32) NOT NULL
);


DROP TABLE IF EXISTS user_major;
CREATE TABLE user_major
(
    user_id  int NULL,
    major_id int NULL,
    CONSTRAINT user_major_user_user_id_fk
        UNIQUE (user_id),
    CONSTRAINT user_major_major_major_id_fk
        FOREIGN KEY (major_id) REFERENCES major (id)
            ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT user_major_user_user_id_fk
        FOREIGN KEY (user_id) REFERENCES users (id)
            ON UPDATE CASCADE ON DELETE CASCADE
);


DROP TABLE IF EXISTS course;
CREATE TABLE course
(
    id   int AUTO_INCREMENT PRIMARY KEY,
    name varchar(48)  NOT NULL,
    info varchar(140) null
);


DROP TABLE IF EXISTS major_course;
CREATE TABLE major_course
(
    major_id  int NULL,
    course_id int NULL,
    CONSTRAINT major_course_course_course_id_fk
        FOREIGN KEY (course_id) REFERENCES course (id)
            ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT major_course_major_major_id_fk
        FOREIGN KEY (major_id) REFERENCES major (id)
            ON UPDATE CASCADE ON DELETE CASCADE
);


DROP TABLE IF EXISTS school;
CREATE TABLE school
(
    id      int AUTO_INCREMENT PRIMARY KEY,
    name    varchar(32)  NOT NULL,
    address varchar(64)  NULL,
    tel     char(20)     NULL,
    info    varchar(140) null
);


DROP TABLE IF EXISTS school_major;
CREATE TABLE school_major
(
    school_id int NULL,
    major_id  int NULL,
    CONSTRAINT school_major_major_major_id_fk
        FOREIGN KEY (major_id) REFERENCES major (id)
            ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT school_major_school_school_id_fk
        FOREIGN KEY (school_id) REFERENCES school (id)
            ON UPDATE CASCADE ON DELETE CASCADE
);


DROP TABLE IF EXISTS user_school;
CREATE TABLE user_school
(
    user_id   int NULL,
    school_id int NULL,
    CONSTRAINT user_school_user_user_id_fk
        UNIQUE (user_id),
    CONSTRAINT user_school_school_school_id_fk
        FOREIGN KEY (school_id) REFERENCES school (id)
            ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT user_school_user_user_id_fk
        FOREIGN KEY (user_id) REFERENCES users (id)
            ON UPDATE CASCADE ON DELETE CASCADE
);


DROP TABLE IF EXISTS book;
CREATE TABLE book
(
    id        int PRIMARY KEY AUTO_INCREMENT,
    name      varchar(16)                               NULL,
    publish   varchar(16)                               NULL,
    isbn      char(17)                                  NULL,
    writer    varchar(16)                               NULL,
    local_url varchar(64)                               NULL,
    price     float                                     NULL,
    type      char(32)                                  NULL,
    upper     char(6)                                   NULL,
    viewed    int                                       NULL,
    cover     varchar(256) DEFAULT 'images/default.png' NULL,
    status    int          DEFAULT 0
);


DROP TABLE IF EXISTS book_score;
CREATE TABLE book_score
(
    id      int primary key auto_increment not null,
    book_id int,
    user_id int,
    score   float,
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (book_id) REFERENCES book (id)
);

DROP TABLE IF EXISTS book_comment;
CREATE TABLE book_comment
(
    comment_id      int PRIMARY KEY AUTO_INCREMENT,
    book_id         int       NULL,
    user_id         int       NULL,
    comment_content text      NULL,
    comment_date    timestamp NULL,
    status          int DEFAULT 0,
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (book_id) REFERENCES book (id)
);


DROP TABLE IF EXISTS timetable;
CREATE TABLE timetable
(
    book_id int NOT NULL,
    time_id int PRIMARY KEY AUTO_INCREMENT,
    user_id int NOT NULL,
    year    int NOT NULL,
    month   int NOT NULL,
    day     int NOT NULL,
    hour    int NOT NULL,
    minute  int NOT NULL
);


DROP TABLE IF EXISTS user_favi_book;
CREATE TABLE user_favi_book
(
    id      int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    book_id int,
    user_id int,
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (book_id) REFERENCES book (id)
);


DROP TABLE IF EXISTS broadcast;
CREATE TABLE broadcast
(
    id      int PRIMARY KEY not null auto_increment,
    user_id int             NOT NULL,
    content varchar(1024)   NULL,
    time    timestamp       NULL,
    FOREIGN KEY (user_id) REFERENCES users (id)
);


DROP TABLE IF EXISTS broad_link;
CREATE TABLE broad_link
(
    user_id      char(6)  NOT NULL,
    broadcast_id char(36) NOT NULL,
    PRIMARY KEY (user_id, broadcast_id),
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (broadcast_id) REFERENCES broadcast (id)
);


DROP TABLE IF EXISTS vio_dic;
CREATE TABLE vio_dic
(
    vio_word varchar(36) PRIMARY KEY
);


DROP TABLE IF EXISTS user_book;
CREATE TABLE user_book
(
    user_id int NOT NULL,
    book_id int NOT NULL,
    PRIMARY KEY (user_id, book_id),
    KEY book_id (book_id),
    CONSTRAINT book_id FOREIGN KEY (book_id) REFERENCES book (id),
    CONSTRAINT user_id FOREIGN KEY (user_id) REFERENCES users (id)
) ENGINE = innodb
  DEFAULT CHARSET = utf8;


DROP TABLE IF EXISTS comment_comment;
CREATE TABLE comment_comment
(
    id              int PRIMARY KEY AUTO_INCREMENT,
    comment_id      int          NOT NULL,
    user_id         char(6)      NULL,
    comment_content varchar(225) NULL,
    comment_date    timestamp    NULL,
    status          int DEFAULT 0,
    FOREIGN KEY (user_id) REFERENCES users (id)
);
