/* User -> 로그인에 필요한 ID,Password, 유저별 데이터 받아올 Name, 로그인 했을 때 표기할 닉네임 컬럼 표시 */
create table DjmaxUser(
id varchar2(15) primary key,
password varchar2(14) not null,
name varchar2(20) not null,
nickname varchar2(30) unique
)

alter table DjmaxUser Drop Column nickname;

select * from DjmaxUser;

alter table test2 rename column num1 to column1;
alter table test2 rename column num2 to column2;

