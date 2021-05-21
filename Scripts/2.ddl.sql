create table MEMBER (
ID int auto_increment primary key,
EMAIL varchar(255),
PASSWORD varchar(100),
NAME varchar(100),
REGDATE datetime,
unique key (EMAIL) 
);

select * from member;

delete from member where id in (39, 40, 41, 42, 43, 44, 45);

