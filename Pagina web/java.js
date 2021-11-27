const slider = document.querySelector("#slider");
let sliderSection = document.querySelectorAll(".slider_section");
let sliderSectionLast = sliderSection[sliderSection.length-1];

const btnleft = document.querySelector("#btn_left");
const btnright = document.querySelector("#btn_right");

slider.insertAdjacentElement('afterbegin', sliderSectionLast);

function Next(){
let sliderSectionFirst = document.querySelectorAll(".slider_section")[0];
slider.style.marginleft = "-200%";
slider.style.transition = "all 0.5s";
setTimeout(function(){
    slider.style.transition = "none";
    slider.insertAdjacentElement('beforeend', sliderSectionFirst);
    slider.style.marginleft = "-100%";
},500);
}
function Prev(){
    let sliderSection = document.querySelectorAll(".slider_section");
let sliderSectionLast = sliderSection[sliderSection.length-1];
    slider.style.marginleft = "0";
    slider.style.transition = "all 0.5s";
    setTimeout(function(){
        slider.style.transition = "none";
        slider.insertAdjacentElement('afterbegin', sliderSectionLast);
        slider.style.marginleft = "-100%";
    },500);
    }
btnright.addEventListener('click',function(){
    Next();
});
btnleft.addEventListener('click',function(){
    Prev();
});

setInterval(function(){
    Next();
},5000);