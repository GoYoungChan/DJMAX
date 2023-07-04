/* 곡 이름 , 각 난이도별 존재시 난이도 표기 존재 안할 시 -> 0으로 표시. */
/* 값 입력 안했을 시 -> 0으로 자동 설정. */

create table Song (
Song_name varchar2(50),
nm4 number(2) default 0,
hd4 number(2) default 0,
mx4 number(2) default 0,
sc4 number(2) default 0,
nm5 number(2) default 0,
hd5 number(2) default 0,
mx5 number(2) default 0,
sc5 number(2) default 0,
nm6 number(2) default 0,
hd6 number(2) default 0,
mx6 number(2) default 0,
sc6 number(2) default 0,
nm8 number(2) default 0,
hd8 number(2) default 0,
mx8 number(2) default 0,
sc8 number(2) default 0,
constraint Song__PK primary key(Song_name)
)

drop table Song purge;

alter table Song add nm4 number(2)