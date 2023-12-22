let num1=0, num2=0, def=1, met=0, allow=1;

function res() {
    size = document.getElementsByClassName("pri-button");
    for (let i = 0; i < size.length; i++) {
        document.getElementsByClassName("pri-button")[i].removeAttribute("style");
    }
    for (let i = 0; i < 2; i++) {
        document.getElementsByClassName("spe-button-2")[i].removeAttribute("style");
    }
    
}

function num(value) {
    targ = document.getElementById("textview");
    if(def==1 && targ.textContent.indexOf(".") == -1){
        targ.innerHTML = value.toString();
        def=0;
    } else {
        if(targ.innerHTML.length < 12) {
            targ.innerHTML += value.toString();
        }
    }
}

function opr(metin) {
    targ = document.getElementById("textview");
    if(1) {
        res();
        if (parseFloat(targ.textContent) !=0 ) {
            num1 = parseFloat(targ.textContent);
        }
        met = metin;
        def=1;
        allow=1;
        targ.innerHTML = "0";
        if(metin=="+"){
            document.getElementsByClassName("spe-button-2")[0].setAttribute("style", "color: white; background: blue;")
        }
        if(metin=="-"){
            document.getElementsByClassName("pri-button")[3].setAttribute("style", "color: white; background: blue;")
        }
        if(metin=="*"){
            document.getElementsByClassName("pri-button")[2].setAttribute("style", "color: white; background: blue;")
        }
        if(metin=="/"){
            document.getElementsByClassName("pri-button")[1].setAttribute("style", "color: white; background: blue;")
        }
    } 
}

function spe(metin) {
    targ = document.getElementById("textview");
    if(metin=="C") {
        res()
        targ.innerHTML = "0";
        num1=0;
        num2=0;
        def=1;
        met=0;
    }
    else if(metin="P" && ( def == 0  || targ.textContent == "0")) {
        if(targ.innerHTML.indexOf(".") == -1) {
            targ.innerHTML += ".";
        }
    }
}

function trig(met, num1) {
    res();
    targ = document.getElementById("textview");
    if(allow==1){
        if(met=="+") {
            let ans = num1 + parseFloat(targ.textContent);
            targ.innerHTML = ans.toString();
            def=1;
            allow=0;
        }
        if(met=="-") {
            let ans = num1 - parseFloat(targ.textContent);
            targ.innerHTML = ans.toString();
            def=1;
            allow=0;
        }
        if(met=="*") {
            let ans = num1 * parseFloat(targ.textContent);
            targ.innerHTML = ans.toString();
            def=1;
            allow=0;
        }
        if(met=="/") {
            let ans = num1 / parseFloat(targ.textContent);
            targ.innerHTML = ans.toString();
            def=1;
            allow=0;
        }
    }
}
function jhero() {
    targ = document.getElementById("textview");
    if(def==1|| parseFloat(targ) == 0 ){
        targ.innerHTML = "0";
    } else {
        if(targ.innerHTML.length < 12) {
            targ.innerHTML += "0";
        }
    }
}

function bak() {
    targ = document.getElementById("textview");
    if(def==0) {
        if(targ.textContent.length == 1 || targ.textContent.length == 0) {
            targ.innerHTML = "0";
        } else {
            targ = document.getElementById("textview");
            text = targ.textContent;
            targ.innerHTML = text.slice(0, -1);
        }
    }
}   

