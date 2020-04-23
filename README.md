# 专业课程参考书推荐系统

## 上传详情

| 时间       | 详情                                                       | 上传人   |
| ---------- | ---------------------------------------------------------- | -------- |
| 2020-04-01 | 添加部分代码                                               | 17201127 |
| 2020-04-15 | 添加通知的API                                              | 17201127 |
| 2020-04-16 | 添加书籍部分操作                                           | 17201127 |
| 2020-04-17 | 添加评论相关操作                                           | 17201127 |
| 2020-04-18 | 基本完成API部分的任务                                      | 17201127 |
| 2020-04-19 | 新建通知页面功能实现，修改了通知表的id（int --> char(36)）    | 17201127 |
| 2020-04-21 | 修改通知部分的bug                                          | 17201127 |
| 2020-04-21 | 在项目中补齐进度，添加了基本接口和书籍页面                    | 17201104 |
| 2020-04-22 | 添加云端数据库配置， 数据库内容保持一致。                     | 17201104 |
| 2020-04-22 | 添加用户基础数据管理页面的列表                              | 17201104 |
| 2020-04-23 | 添加学校包含的专业内容接口                                  | 17201104 |
| 2020-04-23 | 添加专业包含的课程内容接口                                  | 17201104 |
| **...**    | **...**                                                    | **...**  |

## 远程数据库说明
IP：106.54.231.43
Driver 选择MySQL5.1即可
-u root
-p Nchu1720

## 完成详情

### 1720127负责部分

审核管理，评论管理，违规词管理，广播通知

#### API

- ~~用户的相关操作~~
- ~~违规词的相关操作~~
- ~~通知的相关操作~~
- ~~评论的相关操作~~
- ~~书籍的相关操作~~
- ~~通知连接用户（即发送通知）相关操作~~
- 异常处理
- **...**

#### 页面

- 通知页面
- 新建通知界面
- 违规词操作界面
- 评论审核界面
- 上传书籍审核界面
- **...**



**注：完成用删除线画掉**

### 17201104负责部分

书籍管理，用户管理，学校、专业及课程管理

#### API

- ~~用户增删改查操作~~
- ~~书籍增删改查操作~~
- ~~学校增删改查操作~~
- ~~专业增删改查操作~~
- ~~课程增删改查操作~~
- ~~学校包含的专业编辑~~
- ~~专业包含的课程编辑~~
- 其他

### 页面

- ~~书籍管理页面~~
- 用户管理页面
- 学校管理页面
- 专业管理页面
- 课程管理页面
- 未定




### 其他人相关部分（格式如上）

**...**





## HELP

…or create a new repository on the command line

```bash
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/ynchu/RecommendationBooks.git
git push -u origin master
```

…or push an existing repository from the command line（**推荐使用**）

```bash
git remote add origin https://github.com/ynchu/RecommendationBooks.git
git push -u origin master
```

…or import code from another repository

```txt
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.
```
