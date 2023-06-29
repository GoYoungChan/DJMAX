'use strict';

// 우선 데이터를 받아야 하는 Record 페이지만 제외하고 모두 Javascript단에서 페이징 처리
// 를 한다 라는 가정하에 Code 작성합니다.

// Menu 클릭 변수
const Menu = document.querySelector('#Navbar');

// 접속 방향성.
let Visit = document.querySelector('#Page');

// Page 전환시킬 DIV 값
const Content = document.querySelector('.Content__Container');


// Content에 요청에 따른 Include Value 표시.
function VisiteInclude(item){
	alert(item.target.dataset.value);
	Visit.className(item.target.dataset.value);
}

// 메뉴 클릭시 해당 태그 데이터 추출
function OnClickMenu(item){
	if(item == null){return};
	window.location.href =`Page.do?value=${item.target.dataset.value}`;
}

Menu.addEventListener('click',(event) =>{
	OnClickMenu(event);
});