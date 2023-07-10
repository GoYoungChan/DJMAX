/* 유저명, 키별 난이도 컬럼  */
create table nightmare (
name varchar2(30),
nm4 number(10,2),
hd4 number(10,2),
mx4 number(10,2),
sc4 number(10,2),
nm5 number(10,2),
hd5 number(10,2),
mx5 number(10,2),
sc5 number(10,2),
nm6 number(10,2),
hd6 number(10,2),
mx6 number(10,2),
sc6 number(10,2),
nm8 number(10,2),
hd8 number(10,2),
mx number(10,2),
sc8 number(10,2),
constraint song_pk primary key(name)
)
select * from test;
select * from test123;
commit;