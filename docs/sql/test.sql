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