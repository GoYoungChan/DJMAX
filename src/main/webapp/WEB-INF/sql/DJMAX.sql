create table DjmaxUser(
id varchar2(15) primary key,
password varchar2(14) not null,
name varchar2(20) not null,
nickname varchar2(30) unique
)

alter table DjmaxUser Drop Column nickname;

select * from DjmaxUser;
drop table DjmaxUser purge;
create table Level_15 (

)
insert into test1 values('a1',1,2);
insert into test1 values('a2',2,3);
insert into test1 values('a3',3,4);
insert into test1 values('a4',3,4);

insert into test2 values('a1',10,20);
insert into test2 values('a2',20,30);
insert into test2 values('a3',30,40);

create table test1 (
	name varchar2(20),
	num1 number(5),
	num2 number(5),
	constraint test1_pk primary key(name)
)
/* nightmare 라는 곡의 테이블 생성 및 구조 -> 첫 컬럼 : 유저명 , 그 이후로는 모든 Key의 난이도를 생성. */
create table nightmare (
name varchar2(30),
nm4 number(10,2),
hd4 number(10,2),
constraint song_pk primary key(name)
)

drop table nightmare;

select * from nightmare;
delete nightmare;
create table test2 (
	name varchar2(20),
	num1 number(5),
	num2 number(5),
	constraint test2_pk primary key(name)
)

alter table test2 rename column num1 to column1;
alter table test2 rename column num2 to column2;

select * from test1;
select test2.* from test2 , test1 where test2.name = test1.name;