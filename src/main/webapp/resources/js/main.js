'use strict';

// 우선 데이터를 받아야 하는 Record 페이지만 제외하고 모두 Javascript단에서 페이징 처리
// 를 한다 라는 가정하에 Code 작성합니다.

// Menu 클릭 변수
const Menu = document.querySelector('#Navbar');

// 메뉴 클릭시 URL 요청 및 파라미터 전달
function OnClickMenu(item){
	if(item == null){return};
	window.location.href =`Page.do?value=${item.target.dataset.value}`;
}

Menu.addEventListener('click',(event) =>{
	OnClickMenu(event);
});