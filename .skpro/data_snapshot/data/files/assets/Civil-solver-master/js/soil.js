
function prians(){
    var m1 = document.getElementById('soilm1');
    var v1 = document.getElementById('soilv1');
    var g = document.getElementById('soilg');
    var m2 = document.getElementById('soilm2');
    var out = document.getElementById('massw');
    var out2 = document.getElementById('watcont');
    var out3 = document.getElementById('bilkden');
    var out4 = document.getElementById('dryden');
    var out5 = document.getElementById('voidrat');
    var out6 = document.getElementById('porosity');
    var out7 = document.getElementById('degsat');
    if (m1.value==""||m2.value=="" ||v1.value=="" || g.value=="") {
        out.value=="";
        out2.value == "";
        out3.value == "";
        out4.value == "";
        out5.value == "";
    }
     else {
        out.value = m1.value-m2.value;
        out2.value = out.value / m2.value;
        out3.value = m1.value / v1.value;
        out4.value = m2.value / v1.value;
        var gg= g.value*1000;
        var gg1 = gg/out4.value;
        out5.value = gg1 - 1;
        var ee= +1 + +out5.value;
        var e2 = out5.value / ee;
        out6.value = e2 * 100;
        var deg = out2.value * g.value;
        out7.value = deg / out5.value;

    }
   
}
function angl(){
    var m1 = document.getElementById('distor');
    var v1 = document.getElementById('span');
    var out = document.getElementById('settlmnt');
    var note = document.getElementById('notee');
    if (m1.value == "" || v1.value == "" ) {
        out.value == "";
}
else{
out.value = m1.value* v1.value * 10*10*10;
note.style.display = "Block";

}
}