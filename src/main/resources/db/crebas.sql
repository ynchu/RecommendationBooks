drop table if exists Book;

drop table if exists Book_Comment;

drop table if exists Book_Course_Con;

drop table if exists Book_Major_Con;

drop table if exists Book_Mark;

drop table if exists Book_Score;

drop table if exists Broadcast;

drop table if exists "Comment";

drop table if exists Major;

drop table if exists Major_Course;

drop table if exists Role;

drop table if exists School;

drop table if exists School_Major;

drop table if exists "User";

drop table if exists User_Favi_Book;

drop table if exists User_Major;

drop table if exists User_Role;

drop table if exists User_School;

drop table if exists Vio_Dic;

drop table if exists course;

/*==============================================================*/
/* Table: Book                                                  */
/*==============================================================*/
create table Book 
(
   book_id              int                            not null auto_increment,
   name                 varchar(16)                    null,
   publish              varchar(16)                    null,
   isbn                 char(17)                       null,
   writer               varchar(16)                    null,
   localurl             varchar(64)                    null,
   price                float                          null,
   type                 char(32)                       null,
   upper                char(16)                       null,
   "view"               int                            null,
   cover                varchar(64)                    null,
   constraint PK_BOOK primary key clustered (book_id)
);

/*==============================================================*/
/* Table: Book_Comment                                          */
/*==============================================================*/
create table Book_Comment 
(
   book_id              int                            not null,
   comment_id           int                            not null,
   user_id              int                            not null,
   constraint PK_BOOK_COMMENT primary key clustered (book_id, comment_id, user_id)
);

/*==============================================================*/
/* Table: Book_Course_Con                                       */
/*==============================================================*/
create table Book_Course_Con 
(
   book_id              int                            not null,
   course_id            int                            not null,
   degree               float                          null,
   constraint PK_BOOK_COURSE_CON primary key clustered (book_id, course_id)
);

/*==============================================================*/
/* Table: Book_Major_Con                                        */
/*==============================================================*/
create table Book_Major_Con 
(
   book_id              int                            not null,
   major_id             int                            not null,
   degree               float                          null,
   constraint PK_BOOK_MAJOR_CON primary key clustered (book_id, major_id)
);

/*==============================================================*/
/* Table: Book_Mark                                             */
/*==============================================================*/
create table Book_Mark 
(
   book_id              int                            not null,
   user_id              int                            not null,
   process              float                          null,
   constraint PK_BOOK_MARK primary key clustered (book_id, user_id)
);

/*==============================================================*/
/* Table: Book_Score                                            */
/*==============================================================*/
create table Book_Score 
(
   book_id              int                            not null,
   user_id              int                            not null,
   score                float                          null,
   constraint PK_BOOK_SCORE primary key clustered (book_id, user_id)
);

/*==============================================================*/
/* Table: Broadcast                                             */
/*==============================================================*/
create table Broadcast 
(
   broadcast_id         int                            not null auto_increment,
   user_id              int                            not null,
   content              varchar(140)                   null,
   "time"               time                           null,
   constraint PK_BROADCAST primary key clustered (broadcast_id, user_id)
);

/*==============================================================*/
/* Table: "Comment"                                             */
/*==============================================================*/
create table "Comment" 
(
   comment_id           int                            not null auto_increment,
   content              varchar(140)                   null,
   isbanned             char(2)                        null,
   constraint PK_COMMENT primary key clustered (comment_id)
);

/*==============================================================*/
/* Table: Major                                                 */
/*==============================================================*/
create table Major 
(
   major_id             int                            not null auto_increment,
   name                 varchar(32)                    null,
   info                 varchar(140)                   null,
   constraint PK_MAJOR primary key clustered (major_id)
);

/*==============================================================*/
/* Table: Major_Course                                          */
/*==============================================================*/
create table Major_Course 
(
   major_id             int                            not null,
   course_id            int                            not null,
   constraint PK_MAJOR_COURSE primary key clustered (major_id, course_id)
);

/*==============================================================*/
/* Table: Role                                                  */
/*==============================================================*/
create table Role 
(
   role_id              int                            not null auto_increment,
   name                 varchar(16)                    null,
   constraint PK_ROLE primary key clustered (role_id)
);

/*==============================================================*/
/* Table: School                                                */
/*==============================================================*/
create table School 
(
   school_id            int                            not null auto_increment,
   name                 varchar(32)                    null,
   address              varchar(64)                    null,
   tel                  char(20)                       null,
   info                 varchar(140)                   null,
   constraint PK_SCHOOL primary key clustered (school_id)
);

/*==============================================================*/
/* Table: School_Major                                          */
/*==============================================================*/
create table School_Major 
(
   school_id            int                            not null,
   major_id             int                            not null,
   constraint PK_SCHOOL_MAJOR primary key clustered (school_id, major_id)
);

/*==============================================================*/
/* Table: "User"                                                */
/*==============================================================*/
create table "User" 
(
   user_id              int                            not null auto_increment,
   user_name            char(20)                       null,
   nick_name            char(16)                       null,
   pwd                  char(16)                       null,
   sex                  char(8)                        null,
   email                char(32)                       null,
   tel                  char(16)                       null,
   constraint PK_USER primary key clustered (user_id)
);

/*==============================================================*/
/* Table: User_Favi_Book                                        */
/*==============================================================*/
create table User_Favi_Book 
(
   user_id              int                            not null,
   book_id              int                            not null,
   constraint PK_USER_FAVI_BOOK primary key clustered (user_id, book_id)
);

/*==============================================================*/
/* Table: User_Major                                            */
/*==============================================================*/
create table User_Major 
(
   user_id              int                            not null,
   major_id             int                            not null,
   constraint PK_USER_MAJOR primary key clustered (user_id, major_id)
);

/*==============================================================*/
/* Table: User_Role                                             */
/*==============================================================*/
create table User_Role 
(
   user_id              int                            not null,
   role_id              int                            not null,
   constraint PK_USER_ROLE primary key clustered (user_id, role_id)
);

/*==============================================================*/
/* Table: User_School                                           */
/*==============================================================*/
create table User_School 
(
   user_id              int                            not null,
   school_id            int                            not null,
   constraint PK_USER_SCHOOL primary key clustered (user_id, school_id)
);

/*==============================================================*/
/* Table: Vio_Dic                                               */
/*==============================================================*/
create table Vio_Dic 
(
   VioWord              varchar(16)                    not null,
   constraint PK_VIO_DIC primary key clustered (VioWord)
);

/*==============================================================*/
/* Table: course                                                */
/*==============================================================*/
create table course 
(
   courseid             int                            not null auto_increment,
   name                 varchar(48)                    null,
   info                 varchar(140)                   null,
   constraint PK_COURSE primary key clustered (courseid)
);

alter table Book_Comment
   add constraint FK_BOOK_COM_REFERENCE_USER foreign key (user_id)
      references "User" (user_id)
      on update restrict
      on delete restrict;

alter table Book_Comment
   add constraint FK_BOOK_COM_REFERENCE_COMMENT foreign key (comment_id)
      references "Comment" (comment_id)
      on update restrict
      on delete restrict;

alter table Book_Comment
   add constraint FK_BOOK_COM_REFERENCE_BOOK foreign key (book_id)
      references Book (book_id)
      on update restrict
      on delete restrict;

alter table Book_Course_Con
   add constraint FK_BOOK_COU_REFERENCE_BOOK foreign key (book_id)
      references Book (book_id)
      on update restrict
      on delete restrict;

alter table Book_Course_Con
   add constraint FK_BOOK_COU_REFERENCE_COURSE foreign key (course_id)
      references course (courseid)
      on update restrict
      on delete restrict;

alter table Book_Major_Con
   add constraint FK_BOOK_MAJ_REFERENCE_BOOK foreign key (book_id)
      references Book (book_id)
      on update restrict
      on delete restrict;

alter table Book_Major_Con
   add constraint FK_BOOK_MAJ_REFERENCE_MAJOR foreign key (major_id)
      references Major (major_id)
      on update restrict
      on delete restrict;

alter table Book_Mark
   add constraint FK_BOOK_MAR_REFERENCE_USER foreign key (user_id)
      references "User" (user_id)
      on update restrict
      on delete restrict;

alter table Book_Mark
   add constraint FK_BOOK_MAR_REFERENCE_BOOK foreign key (book_id)
      references Book (book_id)
      on update restrict
      on delete restrict;

alter table Book_Score
   add constraint FK_BOOK_SCO_REFERENCE_BOOK foreign key (book_id)
      references Book (book_id)
      on update restrict
      on delete restrict;

alter table Book_Score
   add constraint FK_BOOK_SCO_REFERENCE_USER foreign key (user_id)
      references "User" (user_id)
      on update restrict
      on delete restrict;

alter table Broadcast
   add constraint FK_BROADCAS_REFERENCE_USER foreign key (user_id)
      references "User" (user_id)
      on update restrict
      on delete restrict;

alter table Major_Course
   add constraint FK_MAJOR_CO_REFERENCE_MAJOR foreign key (major_id)
      references Major (major_id)
      on update restrict
      on delete restrict;

alter table Major_Course
   add constraint FK_MAJOR_CO_REFERENCE_COURSE foreign key (course_id)
      references course (courseid)
      on update restrict
      on delete restrict;

alter table School_Major
   add constraint FK_SCHOOL_M_REFERENCE_MAJOR foreign key (major_id)
      references Major (major_id)
      on update restrict
      on delete restrict;

alter table School_Major
   add constraint FK_SCHOOL_M_REFERENCE_SCHOOL foreign key (school_id)
      references School (school_id)
      on update restrict
      on delete restrict;

alter table User_Favi_Book
   add constraint FK_USER_FAV_REFERENCE_USER foreign key (user_id)
      references "User" (user_id)
      on update restrict
      on delete restrict;

alter table User_Favi_Book
   add constraint FK_USER_FAV_REFERENCE_BOOK foreign key (book_id)
      references Book (book_id)
      on update restrict
      on delete restrict;

alter table User_Major
   add constraint FK_USER_MAJ_REFERENCE_MAJOR foreign key (major_id)
      references Major (major_id)
      on update restrict
      on delete restrict;

alter table User_Major
   add constraint FK_USER_MAJ_REFERENCE_USER foreign key (user_id)
      references "User" (user_id)
      on update restrict
      on delete restrict;

alter table User_Role
   add constraint FK_USER_ROL_REFERENCE_ROLE foreign key (role_id)
      references Role (role_id)
      on update restrict
      on delete restrict;

alter table User_Role
   add constraint FK_USER_ROL_REFERENCE_USER foreign key (user_id)
      references "User" (user_id)
      on update restrict
      on delete restrict;

alter table User_School
   add constraint FK_USER_SCH_REFERENCE_USER foreign key (user_id)
      references "User" (user_id)
      on update restrict
      on delete restrict;

alter table User_School
   add constraint FK_USER_SCH_REFERENCE_SCHOOL foreign key (school_id)
      references School (school_id)
      on update restrict
      on delete restrict;

