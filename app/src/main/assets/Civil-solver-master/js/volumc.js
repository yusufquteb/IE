function prians(){
    var len = document.getElementById('priL');
    var wid = document.getElementById('priW');
    var hei = document.getElementById('priH');
    var out = document.getElementById('priOut');

    if (len.value==""||wid.value==""||hei.value=="") {
        out.value="";
    } else {
        out.value = len.value * hei.value * wid.value + " m³";
    }
}

function sqrans(){
    var len = document.getElementById('sqrL');
    var out = document.getElementById('sqrOut');
    if (len.value=="") {
        out.value="";
    } else {
        out.value = len.value * len.value * len.value + " m³";
    }
}

function trians() {
    var len = document.getElementById('triL');
    var wid = document.getElementById('triW');
    var hei = document.getElementById('triH');
    var out = document.getElementById('triOut');

    if (len.value == "" || wid.value == "" || hei.value == "") {
        out.value = "";
    } else {

        var ans = 0.5 * wid.value* hei.value;
        out.value = ans * len.value + " m³";
    }
}


function tpians() {
    var len = document.getElementById('tpiL');
    var wid = document.getElementById('tpiW');
    var wwid = document.getElementById('tpiWW');
    var hei = document.getElementById('tpiH');
    var out = document.getElementById('tpiOut');

    if (len.value == "" || wid.value == "" || wwid.value == "" || hei.value == "") {
        out.value = "";
    } else {

        var ans = wid.value + +wwid.value;
        var ans1 = ans / 2;
        out.value = ans1 * len.value * hei.value + " m³";
    }

}


function Hrians() {
    var len = document.getElementById('HriL');
   
    var hei = document.getElementById('HriH');
    var out = document.getElementById('HriOut');

    if (len.value == "" || hei.value == "") {
        out.value = "";
    } else {

        
        out.value = 1.3 * 1.7320508075688772 * len.value * len.value * hei.value + " m³";
    }
}

function spans(){
    var rad = document.getElementById('Rsp');
    var out = document.getElementById('spOut');
    if (rad.value=="") {
        out.value="";
    } else {
        out.value = 4.2076 * rad.value * rad.value * rad.value  + " m³";
    }
}
function sppans(){
    var rad = document.getElementById('Rspp');
    var out = document.getElementById('sppOut');
    if (rad.value == "") {
        out.value = "";
    } else {
        out.value = 2.0933333333333333 * rad.value * rad.value * rad.value + " m³";
    }
}
function penans(){
    var len = document.getElementById('penL');
    var hei = document.getElementById('penHH');
    var basep = document.getElementById('penH');
    var out = document.getElementById('penOut');

    
    if (len.value==""||basep.value=="" || hei.value=="") {
        out.value="";
    } else {
        var ans = 5 * len.value* basep.value;
        out.value = 0.5 * ans * hei.value + " m³" ;
    }
}