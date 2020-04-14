USE recom;

INSERT INTO  user(id, name, nick_name, pwd, sex, email, tel) VALUES
INSERT INTO user(nick_name, pwd, sex, email, tel)
VALUES ('管理员1', '123', 'Man', '516942590@qq.com', '18079148395');
INSERT INTO user(nick_name, pwd, sex, email, tel)
VALUES ('用户1', '123', 'Woman', '2927962422@qq.com', '13839377962');
INSERT INTO user(nick_name, pwd, sex, email, tel)
VALUES ('祝永志', '123', 'Woman', '2927962422@qq.com', '13839377962');

INSERT INTO role(role_name)
VALUES ('管理员');
# 默认id从1开始，但是我们规定0表示管理员
# update role set role_id = 0 where role_id = 1;
INSERT INTO role(role_name)
VALUES ('用户');

INSERT INTO user_role(user_id, role_id)
VALUES ('123456', 1);
INSERT INTO user_role(user_id, role_id)
VALUES ('123457', 2);
INSERT INTO user_role(user_id, role_id)
VALUES ('123458', 2);

# insert into course(name)
# VALUES ('php');
# insert into course(name)
# VALUES ('english');
# insert into course(name)
# VALUES ('java');

INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12121, 'PHP从入门到精通', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'PHP',
        '123458', 0, './images/12121.jpg', 1);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12125, 'PHP从入门到精通', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'PHP',
        '123458', 0, './images/12125.jpg', 1);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12126, 'PHP从入门到精通', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'PHP',
        '123458', 0, './images/12126.jpg', 0);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12127, 'PHP从入门到精通', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'PHP',
        '123458', 0, './images/12127.jpg', 0);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12128, 'PHP从入门到精通', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'PHP',
        '123458', 0, './images/12128.jpg', 1);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12131, 'MATLAB从入门到精通', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5,
        'MATLAB', '123458', 0, './images/12131.jpg', 0);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12123, 'java从入门到精通', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5,
        'JAVA', '123458', 0, './images/12123.jpg', 1);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12124, 'SQL从入门到精通', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'SQL',
        '123458', 0, './images/12124.jpg', 1);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12141, '四级语法', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'English',
        '123458', 0, './images/12141.jpg', 0);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12142, '听力专项训练', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5,
        'English', '123458', 0, './images/12142.jpg', 1);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12143, '四级词汇', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'English',
        '123458', 0, './images/12143.jpg', 1);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12144, '四级词汇乱序', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5,
        'English', '123458', 0, './images/12144.jpg', 0);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12145, '英文观止', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'English',
        '123458', 0, './images/12145.jpg', 1);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12146, '词汇突破', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5, 'English',
        '123458', 0, './images/12146.jpg', 0);
INSERT INTO book(book_id, book_name, publish, isbn, writer, local_url, price, type, upper, bookpv, cover, status)
VALUES (12147, '科技英语创新教程', '电子工业出版社', '978-7-302-49105-7', '祝永志', 'http://nishikinowuzhu.cn/ytm/test.pdf', 55.5,
        'English', '123458', 0, './images/12147.jpg', 1);

INSERT INTO Book_Score(book_id, user_id, score)
VALUES (12121, '123457', 5);
INSERT INTO Book_Score(book_id, user_id, score)
VALUES (12121, '123458', 5);
INSERT INTO Book_Score(book_id, user_id, score)
VALUES (12121, '123459', 2);

INSERT INTO User_Favi_Book(book_id, user_id)
VALUES (12121, '123457');
INSERT INTO User_Favi_Book(book_id, user_id)
VALUES (12121, '123458');
INSERT INTO User_Favi_Book(book_id, user_id)
VALUES (12121, '123459');

INSERT INTO book_comment(book_id, user_id, comment_content, comment_date, status)
VALUES (12121, '123457', 'dsabvhjbcnbxbxjfhjcbbvuiv zcjxzjgybxvut', CURRENT_TIMESTAMP, 1);
INSERT INTO book_comment(book_id, user_id, comment_content, comment_date, status)
VALUES (12121, '123458', 'dsabvhjbcnbxdfththdhghghbvuiv zcjxzjgybxvut', CURRENT_TIMESTAMP, 1);
INSERT INTO book_comment(book_id, user_id, comment_content, comment_date, status)
VALUES (12121, '123456', 'dgggdgfjryansbtgbnttxbxjfhjcbbvuiv zcjxzjgybxvut', CURRENT_TIMESTAMP, 1);


INSERT INTO course(course_id, name)
VALUES (1, 'php');
INSERT INTO course(course_id, name)
VALUES (2, 'english');
INSERT INTO course(course_id, name)
VALUES (3, 'java');
INSERT INTO course(course_id, name)
VALUES (4, '离散数学');
INSERT INTO course(course_id, name)
VALUES (5, '概率论与数理统计');
INSERT INTO course(course_id, name)
VALUES (6, '面向对象程序设计');
INSERT INTO course(course_id, name)
VALUES (7, '数据结构');
INSERT INTO course(course_id, name)
VALUES (8, '操作系统');
INSERT INTO course(course_id, name)
VALUES (9, '计算机组成原理');
INSERT INTO course(course_id, name)
VALUES (10, '计算机导论');
INSERT INTO course(course_id, name)
VALUES (11, '计算机网络');
INSERT INTO course(course_id, name)
VALUES (12, '软件工程');
INSERT INTO course(course_id, name)
VALUES (13, '软件测试方法和技术');
INSERT INTO course(course_id, name)
VALUES (14, '移动终端编程');
INSERT INTO course(course_id, name)
VALUES (15, 'WEB初级编程');
INSERT INTO course(course_id, name)
VALUES (16, 'WEB高级编程');
INSERT INTO course(course_id, name)
VALUES (17, '军事理论');
INSERT INTO course(course_id, name)
VALUES (18, '职业生涯规划');
INSERT INTO course(course_id, name)
VALUES (19, '心理健康教育');
INSERT INTO course(course_id, name)
VALUES (20, '中国近代史纲要');
INSERT INTO course(course_id, name)
VALUES (21, '毛泽东思想和中国特色社会主义理论体系概论');
INSERT INTO course(course_id, name)
VALUES (22, 'Linux基础');

INSERT INTO location(loca_id, province, city)
VALUES (1, '北京', '背景');
INSERT INTO location(loca_id, province, city)
VALUES (2, '上海', '上海');
INSERT INTO location(loca_id, province, city)
VALUES (3, '江西', '南昌');
INSERT INTO location(loca_id, province, city)
VALUES (4, '江西', '景德镇');
INSERT INTO location(loca_id, province, city)
VALUES (5, '江西', '九江');
INSERT INTO location(loca_id, province, city)
VALUES (6, '广东', '广州');
INSERT INTO location(loca_id, province, city)
VALUES (7, '广东', '深圳');
INSERT INTO location(loca_id, province, city)
VALUES (8, '湖北', '武汉');
INSERT INTO location(loca_id, province, city)
VALUES (9, '江苏', '南京');
INSERT INTO location(loca_id, province, city)
VALUES (10, '河南', '郑州');
INSERT INTO location(loca_id, province, city)
VALUES (11, '河南', '开封');
INSERT INTO location(loca_id, province, city)
VALUES (12, '河南', '焦作');
INSERT INTO location(loca_id, province, city)
VALUES (13, '河南', '洛阳');
INSERT INTO location(loca_id, province, city)
VALUES (14, '河南', '南阳');
INSERT INTO location(loca_id, province, city)
VALUES (15, '河南', '濮阳');

INSERT INTO major(major_id, name)
VALUES (1, '软件工程');
INSERT INTO major(major_id, name)
VALUES (2, '物联网工程');
INSERT INTO major(major_id, name)
VALUES (3, '数据科学与大数据技术');
INSERT INTO major(major_id, name)
VALUES (4, '通信工程');
INSERT INTO major(major_id, name)
VALUES (5, '网络工程');
INSERT INTO major(major_id, name)
VALUES (6, '无机非金属材料工程');
INSERT INTO major(major_id, name)
VALUES (7, '计算机科学与技术');
INSERT INTO major(major_id, name)
VALUES (8, '金属材料工程');
INSERT INTO major(major_id, name)
VALUES (9, '高分子材料工程');
INSERT INTO major(major_id, name)
VALUES (10, '复合材料工程');
INSERT INTO major(major_id, name)
VALUES (11, '应用化学');
INSERT INTO major(major_id, name)
VALUES (12, '材料化学');
INSERT INTO major(major_id, name)
VALUES (13, '电气工程及其自动化');
INSERT INTO major(major_id, name)
VALUES (14, '飞行器设计与工程');
INSERT INTO major(major_id, name)
VALUES (15, '飞行器制造工程');
INSERT INTO major(major_id, name)
VALUES (16, '焊接技术与工程');
INSERT INTO major(major_id, name)
VALUES (17, '信息与计算科学');
INSERT INTO major(major_id, name)
VALUES (18, '数学与应用数学');
INSERT INTO major(major_id, name)
VALUES (19, '光电信息科学与工程');
INSERT INTO major(major_id, name)
VALUES (20, '生物医学工程');
INSERT INTO major(major_id, name)
VALUES (21, '经济学');
INSERT INTO major(major_id, name)
VALUES (22, '工商管理');
INSERT INTO major(major_id, name)
VALUES (23, '会计学');
INSERT INTO major(major_id, name)
VALUES (24, '电子商务');
INSERT INTO major(major_id, name)
VALUES (25, '土木工程');
INSERT INTO major(major_id, name)
VALUES (26, '交通工程');
INSERT INTO major(major_id, name)
VALUES (27, '工业设计');
INSERT INTO major(major_id, name)
VALUES (28, '动画');
INSERT INTO major(major_id, name)
VALUES (29, '视觉传达设计');
INSERT INTO major(major_id, name)
VALUES (30, '环境设计');
INSERT INTO major(major_id, name)
VALUES (31, '服装与服饰设计');
INSERT INTO major(major_id, name)
VALUES (32, '法学');
INSERT INTO major(major_id, name)
VALUES (33, '新闻学');
INSERT INTO major(major_id, name)
VALUES (34, '播音与主持艺术');
INSERT INTO major(major_id, name)
VALUES (35, '音乐学');
INSERT INTO major(major_id, name)
VALUES (36, '舞蹈学');
INSERT INTO major(major_id, name)
VALUES (37, '表演');
INSERT INTO major(major_id, name)
VALUES (38, '英语');
INSERT INTO major(major_id, name)
VALUES (39, '电子信息工程');

INSERT INTO major_course(major_id, course_id)
VALUES (1, 3);
INSERT INTO major_course(major_id, course_id)
VALUES (1, 4);
INSERT INTO major_course(major_id, course_id)
VALUES (1, 5);
INSERT INTO major_course(major_id, course_id)
VALUES (1, 6);
INSERT INTO major_course(major_id, course_id)
VALUES (1, 4);


INSERT INTO school(school_id, name, address, tel)
VALUES (1, '清华大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (2, '北京大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (3, '中国人民大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (4, '上海大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (5, '上海第二工业大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (6, '上海轻工业大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (7, '上海应用技术大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (8, '南昌大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (9, '南昌航空大学', '丰和南大道696号', 'null');
INSERT INTO school(school_id, name, address, tel)
VALUES (10, '江西财经大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (11, '华东交通大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (12, '九江学院', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (13, '华南理工大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (14, '广州大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (15, '中山大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (16, '深圳大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (17, '武汉大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (18, '南京大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (19, '河海大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (20, '郑州大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (21, '河南大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (22, '河南理工大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (23, '河南科技大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (24, '南阳理工大学', NULL, NULL);
INSERT INTO school(school_id, name, address, tel)
VALUES (25, '濮阳工学院', NULL, NULL);

INSERT INTO school_major(school_id, major_id)
VALUES (1, 1);
INSERT INTO school_major(school_id, major_id)
VALUES (1, 2);
INSERT INTO school_major(school_id, major_id)
VALUES (1, 3);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 1);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 2);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 3);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 4);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 5);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 6);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 7);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 8);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 9);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 10);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 11);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 12);
INSERT INTO school_major(school_id, major_id)
VALUES (9, 2);
