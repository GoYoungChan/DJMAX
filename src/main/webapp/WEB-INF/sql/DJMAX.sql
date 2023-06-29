create table DjmaxUser(
id varchar2(15) primary key,
password varchar2(14) not null,
name varchar2(20) not null,
nickname varchar2(30) unique
)