function sqrans(){
    var sidde = document.getElementById('sqrIn');
    var ans = document.getElementById('sqrOut');
    if (sidde.value=="") {
        ans.value="";
    } else {
        ans.value = sidde.value * sidde.value + " m²";
    }
}
function recans(){
    var len = document.getElementById('recSo');
    var bre = document.getElementById('recSb');
    var ans = document.getElementById('recOut');
    if (len.value == "" || bre.value == "") {
        ans.value = "";
    } else {
        ans.value = len.value * bre.value + " m²";
    }
}
function parans(){
    var bre = document.getElementById('breP');
    var hei = document.getElementById('heiP');
    var ans = document.getElementById('parOut');
    if (bre.value == "" || hei.value == "") {
        ans.value = "";
    } else {
        ans.value = bre.value * hei.value + " m²";
    }
}

function traans(){
    var bre1 = document.getElementById('breT');
    var bre2 = document.getElementById('breTT');
    var hei = document.getElementById('heiT');
    var ans = document.getElementById('traOut');
    if (bre1.value == "" || bre2.value == "" || hei.value == "") {
        ans.value = "";
    } else {
        var dsp = hei.value/2;
        var dsa = bre1.value + +bre2.value;
        ans.value = dsp * dsa + " m²";
    }
}

function cirans(){
    var rad = document.getElementById('cirR');
    var ans = document.getElementById('cirOut');
    if (rad.value=="") {
        ans.value="";
    } else {
        ans.value = 3.14 * rad.value * rad.value + " m²";
    }
}

function ellans(){
    var rad = document.getElementById('elR1');
    var radd = document.getElementById('elR2');
    var ans = document.getElementById('ellOut');
    if (rad.value == "" || radd.value == "") {
        ans.value = "";
    } else {
        ans.value = 3.14 * rad.value * radd.value + " m²";
    }
}


function trglans(){
    var rad = document.getElementById('breTrg');
    var radd = document.getElementById('heiTrg');
    var ans = document.getElementById('trglOut');
    if (rad.value == "" || radd.value == "") {
        ans.value = "";
    } else {
        var ghy = rad.value * radd.value;
        ans.value = 1/2 * ghy + " m²";
    }
}

function Etrglans() {
    var rad = document.getElementById('sidTrg');
    
    var ans = document.getElementById('EtrglOut');
    if (rad.value == "") {
        ans.value = "";
    } else {
        var ghy = 1.7320508075688772 / 4;
        ans.value = parseInt(ghy * rad.value * rad.value) + " m²";
    }
}