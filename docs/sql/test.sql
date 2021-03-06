/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
USE recom;

# 查
SELECT *
FROM user;
# SELECT *
# FROM user
# WHERE user.name = '用户1';

# 增
USE recom;
INSERT user(name, pwd, sex, email, tel)
VALUES ('祝永志', '123', 'Woman', '2927962422@qq.com', '13839377962');

# 改
UPDATE user
SET name  = '张三',
    pwd   = '123',
    sex   = 'man',
    email = '12345@qq.com',
    tel   = '12345666666'
WHERE id = 2;

# 删
DELETE
FROM user
WHERE id = 4;


/*==============================================================*/
/* Table: vio_dic                                               */
/*==============================================================*/


# 查
USE recom;
SELECT *
FROM vio_dic;
# SELECT *
# FROM user
# WHERE user.name = '用户1';
SELECT *
FROM vio_dic
WHERE vio_word LIKE '%我%';

# 增
USE recom;
INSERT vio_dic(vio_word)
VALUES ('卧槽'),
       ('我草');

INSERT vio_dic(vio_word)
VALUES ('我日');

# 改
UPDATE vio_dic
SET vio_word = 'hello'
WHERE vio_word = '卧槽';

# 删
DELETE
FROM vio_dic
WHERE vio_word = '卧槽';



/*==============================================================*/
/* Table: broadcast                                               */
/*==============================================================*/


# 查
USE recom;
SELECT *
FROM broadcast;
SELECT *
FROM broadcast
WHERE id = 1;
# SELECT *
# FROM vio_dic
# WHERE vio_word LIKE '%我%';

# 增
USE recom;
INSERT broadcast(id, user_id, content, time)
VALUES ('',1, '内容', CURRENT_TIMESTAMP);

INSERT broadcast(id, user_id, content, time)
VALUES (1, 1, '内容3434', CURRENT_TIMESTAMP);

# 改
UPDATE broadcast
SET user_id = 1,
    content = 'hello dfg',
    time    = CURRENT_TIMESTAMP
WHERE id = 6;

# 删
DELETE
FROM broadcast
WHERE id = 1;



/*==============================================================*/
/* Table: book                                                  */
/*==============================================================*/


# 查
USE recom;
SELECT *
FROM book;
SELECT *
FROM book
WHERE id = 1;
# SELECT *
# FROM vio_dic
# WHERE vio_word LIKE '%我%';
SELECT *
FROM book
WHERE name LIKE '%PHP%';

# 增
# USE recom;
# INSERT broadcast(user_id, content, time)
# VALUES (1, '内容', CURRENT_TIMESTAMP),
#        (1, '内容2', CURRENT_TIMESTAMP);
#
# INSERT broadcast(id, user_id, content, time)
# VALUES (1, 1, '内容3434', CURRENT_TIMESTAMP);


# id        int PRIMARY KEY AUTO_INCREMENT,
# name      varchar(16)                               NULL,
# publish   varchar(16)                               NULL,
# isbn      char(17)                                  NULL,
# writer    varchar(16)                               NULL,
# local_url varchar(64)                               NULL,
# price     float                                     NULL,
# type      char(32)                                  NULL,
# upper     char(6)                                   NULL,
# viewed    int                                       NULL,
# cover     varchar(256) DEFAULT 'images/default.png' NULL,
# status    int          DEFAULT 0

# 改
UPDATE book
SET name      = 'PHP1',
    publish   = '出版社1',
    isbn      = '13253452353453',
    writer    = '作者',
    local_url = 'D:/PHP1.pdf',
    price     = 2.3,
    type      = 'type ahgja',
    upper     = '上传者',
    viewed    = 1,
    cover     = 'images/default1.png',
    status    = 1
WHERE id = 12126;

# 删
DELETE
FROM broadcast
WHERE id = 1;


/*==============================================================*/
/* Table: broad_link                                            */
/*==============================================================*/


# 查
USE recom;
SELECT *
FROM broad_link;
SELECT *
FROM broad_link
WHERE user_id = 1;

# 增
USE recom;
INSERT broad_link(user_id, broadcast_id)
VALUES (1, 3);


# 删
DELETE
FROM broad_link
WHERE user_id = 1
  AND broadcast_id = 1;


/*==============================================================*/
/* Table: book_comment                                          */
/*==============================================================*/


# 查
USE recom;
SELECT *
FROM book_comment;
SELECT *
FROM book_comment
WHERE user_id = 1;

# 增
INSERT book_comment(book_id, user_id, comment_content, comment_date)
VALUES (12124, 1, 'dsadter', CURRENT_TIMESTAMP);
INSERT book_comment(book_id, user_id, comment_content, comment_date)
VALUES (12124, 2, '435345', CURRENT_TIMESTAMP);

UPDATE book_comment
SET book_id         = 12141,
    user_id         = 6,
    comment_content = '书籍评论挖沙的接口',
    comment_date    = CURRENT_TIMESTAMP,
    status          = 1
WHERE comment_id = 1;

DELETE
FROM book_comment
WHERE comment_id = 1;


# 删
DELETE
FROM broad_link
WHERE user_id = 1
  AND broadcast_id = 1;





SELECT * FROM broad_link;