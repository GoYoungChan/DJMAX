'use strict';


const clickOne = document.querySelector(`.Login`);

clickOne.addEventListener('click',() => {
	test();
})


function test(){
	console.log(location.href);
}
