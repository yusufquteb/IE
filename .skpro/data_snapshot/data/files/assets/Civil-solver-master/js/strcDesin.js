function loadon(){
    var a1 = document.getElementById("alertbox1");
    var a2 = document.getElementById("alertbox2");
    var a3 = document.getElementById("alertbox12");
    var a4 = document.getElementById("alertbox22");
    var a5 = document.getElementById("alertbox13");
    var a6 = document.getElementById("alertbox23");
    var a7 = document.getElementById("alertbox14");
    var a8 = document.getElementById("alertbox24");
    var a9 = document.getElementById("alertbox15");
    var a10 = document.getElementById("alertbox25");
    var a11 = document.getElementById("alertbox16");
    var a12 = document.getElementById("alertbox26");
    var a13 = document.getElementById("alertbox99");
    var a14 = document.getElementById("alertbox98");
    a1.style.display = "none";
    a2.style.display = "none";
    a3.style.display="none";
    a4.style.display = "none";
    a5.style.display = "none";
    a6.style.display = "none";
    a7.style.display = "none";
    a8.style.display = "none";
    a9.style.display = "none";
    a10.style.display = "none";
    a11.style.display = "none";
    a12.style.display = "none";
    a13.style.display = "none";
    a14.style.display = "none";
    
}

function baseradius() {
    var diam = document.getElementById("basediamD");
    var radius = document.getElementById("baseradius");



    radius.value = diam.value / 2;
    thetaval();
    return radius.value;

}

function thetaval() {
    var thete = document.getElementById("thetavall");
    var rad = document.getElementById("radiusD");
    var radius = document.getElementById("baseradius");
    var theter = Math.asin(radius.value / rad.value);
   var ttyk=  theter * 180;
thete.value = ttyk/3.14;

    return theter;
}

function merithrust() {
    var totload = document.getElementById("totalload");
    var rad = document.getElementById("radiusD");
    var thete = document.getElementById("thetavall");
    var mthrust = document.getElementById("merithrustt");
    if (rad.value == "" || totload.value == "" || thete.value == "") {
        mthrust.value = "";
    } else {
        var ans = totload.value * rad.value;
        var ans1 = Math.cos(thetaval()) + 1;
        mthrust.value = ans / ans1;
    }
    return mthrust.value;
}

function meristrss(){
    var mthrust = document.getElementById("merithrustt");
    var mstrss = document.getElementById("merithstrss");
    var tdome = document.getElementById("thickD");
    if (mthrust.value==""||tdome.value=="") {
        mstrss.value="";
    } else {
        var ans = mthrust.value*1000;
        var ans1 = tdome.value * 1000;
    mstrss.value = ans/ans1;
    }
    return mstrss.value;

}

function hoopforce(){
    var totload = document.getElementById("totalload");
    var hpf = document.getElementById("hopfrce");
    var thete = document.getElementById("thetavall");
    var rad = document.getElementById("radiusD");
    if (totload.value==""||thete.value==""||rad.value=="") {
        hpf.value="";
    } else {
        var ans = Math.cos(thetaval()) + 1;
        var ans1 = 1 / ans;
        var ans2 = Math.cos(thetaval()) - ans1;
        var sn = totload.value * rad.value;
        hpf.value = sn * ans2; 
    }
    return hpf.value;
}

function hoopstress(){
    var hpf = document.getElementById("hopfrce");
    var hps = document.getElementById("hopstrs");
    var tdome = document.getElementById("thickD");
    if (hpf.value==""||tdome.value=="") {
        hps.value="";
    } else {
        var ans=  hpf.value* 1000;
        var ans2 = tdome.value*1000;
        hps.value = ans/ans2;
    }
return hps.value;
}

function areaofsteel(){
    var tdome = document.getElementById("thickD");
    var steel = document.getElementById("steelin");
    if (tdome.value=="") {
        steel.value="";
    } else {
        steel.value= 0.003*1000*tdome.value;
    }
    return steel.value;
}
function horizoncom(){
    var mthrust = document.getElementById("merithrustt");
    var hori = document.getElementById("horizoncomp");
    var thete = document.getElementById("thetavall");
    if (thete.value==""||mthrust.value=="") {
        hori.value="";
    } else {
        hori.value = mthrust.value * Math.cos(thetaval());
    }
    return hori.value;
}

function totalhoop(){
    var mthrust = document.getElementById("merithrustt");
    var tothop = document.getElementById("tothop");
    var thete = document.getElementById("thetavall");
    var brad = document.getElementById("baseradius");
    if (brad.value=="") {
        tothop.value="";
    } else {
        tothop.value = mthrust.value * Math.cos(thetaval()) * brad.value;
    }
    return tothop.value;
}

 function reinfor(){
     var brad = document.getElementById("baseradius");
     var rein = document.getElementById("reinbeam");
     if (brad.value=="") {
         rein.value="";
     } else {
         rein.value = totalhoop() * 10;
     }
     return rein.value;
 }

function safeP(){
    var bags = document.getElementById("providenos");
    var bars = document.getElementById("providebars");
    var a1 = document.getElementById("alertbox1");
    var a2 = document.getElementById("alertbox2");
    var rein = document.getElementById("reinbeam");
    var ans = bags.value * 0.785;
    var ans2 = bars.value * bars.value;
    var ast = ans * ans2;
     if (reinfor() < ast) {
            a1.style.display="block";
            a2.style.display = "none";
        } else if (reinfor() > ast) {
            a1.style.display = "none";
            a2.style.display = "block";
        }
  return ast;
}

function modratio(){
    var seleC = document.getElementById("concrD");
    var mr = document.getElementById("morat");

    if (seleC.value=="M-10") {
        var sel = 3;
    } else if (seleC.value == "M-15"){
        sel = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 14.5;
    }
    else  {
        sel = 16;
    }

    var ans = 3 * sel;
    mr.value = 280 / ans;
}

function depthringb(){
    var dep = document.getElementById("depring");
    var wid = document.getElementById("widring");
    var maxt = document.getElementById("maxten");
    var mr = document.getElementById("morat");
    var z = document.getElementById("tothop");
    var prov = document.getElementById("provdd");

    tothop
    if (maxt.value==""||wid.value=="") {
        dep.value="";
    } else {
        var ans = mr.value - 1;
        var ans2 = ans * safeP();
        var ans3 = z.value *1000;
        var ans4 = ans3/maxt.value;
        var ans5 = ans4 - ans2;
        dep.value = Math.abs(ans5 / wid.value);
prov.value = dep.value;
    }
}

function valch(){
    var provi = document.getElementById("provwid");
    var wid = document.getElementById("widring");
    provi.value = wid.value;
}


// type 2

function baseradius2() {
    var diam = document.getElementById("basediamD2");
    var radius = document.getElementById("baseradius2");



    radius.value = diam.value / 2;
    thetaval2();
    return radius.value;

}

function thetaval2() {
    var thete = document.getElementById("thetavall2");
    var rad = document.getElementById("radiusD2");
    var radius = document.getElementById("baseradius2");
    var thetwew = Math.asin(radius.value / rad.value);
    var ttyo = thetwew * 180;
    thete.value = ttyo / 3.14;
    return thetwew;
}

function merithrust2() {
    var totload = document.getElementById("totalload2");
    var rad = document.getElementById("radiusD2");
    var thete = document.getElementById("thetavall2");
    var mthrust = document.getElementById("merithrustt2");
    if (rad.value == "" || totload.value == "" || thete.value == "") {
        mthrust.value = "";
    } else {
        var ans = Math.sin(thetaval2()) * Math.sin(thetaval2());
        var ans1 = 6.28 * rad.value * ans;
        mthrust.value = totload.value / ans1;
    }
    return mthrust.value;
}

function meristrss2() {
    var mthrust = document.getElementById("merithrustt2");
    var mstrss = document.getElementById("merithstrss2");
    var tdome = document.getElementById("thickD2");
    if (mthrust.value == "" || tdome.value == "") {
        mstrss.value = "";
    } else {
        var ans = mthrust.value * 1000;
        var ans1 = tdome.value * 1000;
        mstrss.value = ans / ans1;
    }
    return mstrss.value;

}

function hoopforce2() {
    var totload = document.getElementById("totalload2");
    var hpf = document.getElementById("hopfrce2");
    var mthrust = document.getElementById("merithrustt2");
    var thete = document.getElementById("thetavall2");
    var rad = document.getElementById("radiusD2");
    if (mthrust.value=="") {
        hpf.value = "";
    } else {
        
        hpf.value = - mthrust.value;
    }
    return hpf.value;
}

function hoopstress2() {
    var hpf = document.getElementById("hopfrce2");
    var hps = document.getElementById("hopstrs2");
    var tdome = document.getElementById("thickD2");
    if (hpf.value == "" || tdome.value == "") {
        hps.value = "";
    } else {
        var ans = hpf.value * 1000;
        var ans2 = tdome.value * 1000;
        hps.value = ans / ans2;
    }
    return hps.value;
}

function areaofsteel2() {
    var tdome = document.getElementById("thickD2");
    var steel = document.getElementById("steelin2");
    if (tdome.value == "") {
        steel.value = "";
    } else {
        steel.value = 0.003 * 1000 * tdome.value;
    }
    return steel.value;
}
function horizoncom2() {
    var mthrust = document.getElementById("merithrustt2");
    var hori = document.getElementById("horizoncomp2");
    var thete = document.getElementById("thetavall2");
    if (thete.value == "" || mthrust.value == "") {
        hori.value = "";
    } else {
        hori.value = mthrust.value * Math.cos(thetaval2());
    }
    return hori.value;
}

function totalhoop2() {
    var mthrust = document.getElementById("merithrustt2");
    var tothop = document.getElementById("tothop2");
    var thete = document.getElementById("thetavall2");
    var brad = document.getElementById("baseradius2");
    if (brad.value == "") {
        tothop.value = "";
    } else {
        tothop.value = mthrust.value * Math.cos(thetaval2()) * brad.value;
    }
    return tothop.value;
}

function reinfor2() {
    var brad = document.getElementById("baseradius2");
    var rein = document.getElementById("reinbeam2");
    if (brad.value == "") {
        rein.value = "";
    } else {
        rein.value = totalhoop2() * 10;
    }
    return rein.value;
}

function safeP2() {
    var bags = document.getElementById("providenos2");
    var bars = document.getElementById("providebars2");
    var a1 = document.getElementById("alertbox12");
    var a2 = document.getElementById("alertbox22");
    var rein = document.getElementById("reinbeam2");
    var ans = bags.value * 0.785;
    var ans2 = bars.value * bars.value;
    var ast = ans * ans2;
    if (reinfor2() < ast) {
        a1.style.display = "block";
        a2.style.display = "none";
    } else if (reinfor2() > ast) {
        a1.style.display = "none";
        a2.style.display = "block";
    }
    return ast;
}

function modratio2() {
    var seleC = document.getElementById("concrD2");
    var mr = document.getElementById("morat2");

    if (seleC.value == "M-10") {
        var sel = 3;
    } else if (seleC.value == "M-15") {
        sel = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 14.5;
    }
    else {
        sel = 16;
    }

    var ans = 3 * sel;
    mr.value = 280 / ans;
}

function depthringb2() {
    var dep = document.getElementById("depring2");
    var wid = document.getElementById("widring2");
    var maxt = document.getElementById("maxten2");
    var mr = document.getElementById("morat2");
    var z = document.getElementById("tothop2");
    var prov = document.getElementById("provdd2");

    
    if (maxt.value == "" || wid.value == "") {
        dep.value = "";
    } else {
        var ans = mr.value - 1;
        var ans2 = ans * safeP2();
        var ans3 = z.value * 1000;
        var ans4 = ans3 / maxt.value;
        var ans5 = ans4 - ans2;
        dep.value = Math.abs(ans5 / wid.value);
        prov.value = dep.value;
    }
}

function valch2() {
    var provi = document.getElementById("provwid2");
    var wid = document.getElementById("widring2");
    provi.value = wid.value;
}


//

// type 3

function baseradius3() {
    var diam = document.getElementById("basediamD3");
    var radius = document.getElementById("baseradius3");



    radius.value = diam.value / 2;
    thetaval3();
    return radius.value;

}

function thetaval3() {
    var thete = document.getElementById("thetavall3");
    var rad = document.getElementById("radiusD3");
    var radius = document.getElementById("baseradius3");
   var thetwew = Math.asin(radius.value / rad.value);
   var ttyo = thetwew * 180;
   thete.value = ttyo / 3.14;
   return thetwew;
}

function merithrust3() {
    var totload3 = document.getElementById("totalload3");
    var totload = document.getElementById("totalload33");
    var rad = document.getElementById("radiusD3");
    var thete = document.getElementById("thetavall3");
    var mthrust = document.getElementById("merithrustt3");
    if (rad.value == "" || totload.value == "" || thete.value == "") {
        mthrust.value = "";
    } else {
        var ans = Math.sin(thetaval3()) * Math.sin(thete.valuethetaval3());
        var ans1 = 6.28 * rad.value * ans;
       var ans2 = totload.value / ans1;

       var ans4 = Math.cos(thetaval3()) + 1;
       var ans6 = totload3.value * rad.value;
       var ans7 = ans6/ans4;
       mthrust.value = ans2 + ans7; 
    }
    return mthrust.value;
}

function meristrss3() {
    var mthrust = document.getElementById("merithrustt3");
    var mstrss = document.getElementById("merithstrss3");
    var tdome = document.getElementById("thickD3");
    if (mthrust.value == "" || tdome.value == "") {
        mstrss.value = "";
    } else {
        var ans = mthrust.value * 1000;
        var ans1 = tdome.value * 1000;
        mstrss.value = ans / ans1;
    }
    return mstrss.value;

}

function hoopforce3() {
    var totload3 = document.getElementById("totalload3");
    var totload = document.getElementById("totalload33");
    var hpf = document.getElementById("hopfrce3");
    var mthrust = document.getElementById("merithrustt3");
    var thete = document.getElementById("thetavall3");
    var rad = document.getElementById("radiusD3");
    if (mthrust.value == "") {
        hpf.value = "";
    } else {

        var s1 = 1 / 1 + Math.cos(thetaval3());
        var s2 = Math.cos(thete.valuethetaval3()) - s1;
        var s3 = totload3.value * rad.value * s2;
        hpf.value = s3 - mthrust.value; 
    }
    return hpf.value;
}

function hoopstress3() {
    var hpf = document.getElementById("hopfrce3");
    var hps = document.getElementById("hopstrs3");
    var tdome = document.getElementById("thickD3");
    if (hpf.value == "" || tdome.value == "") {
        hps.value = "";
    } else {
        var ans = hpf.value * 1000;
        var ans2 = tdome.value * 1000;
        hps.value = ans / ans2;
    }
    return hps.value;
}

function areaofsteel3() {
    var tdome = document.getElementById("thickD3");
    var steel = document.getElementById("steelin3");
    if (tdome.value == "") {
        steel.value = "";
    } else {
        steel.value = 0.003 * 1000 * tdome.value;
    }
    return steel.value;
}
function horizoncom3() {
    var mthrust = document.getElementById("merithrustt3");
    var hori = document.getElementById("horizoncomp3");
    var thete = document.getElementById("thetavall3");
    if (thete.value == "" || mthrust.value == "") {
        hori.value = "";
    } else {
        hori.value = mthrust.value * Math.cos(thetaval3());
    }
    return hori.value;
}

function totalhoop3() {
    var mthrust = document.getElementById("merithrustt3");
    var tothop = document.getElementById("tothop3");
    var thete = document.getElementById("thetavall3");
    var brad = document.getElementById("baseradius3");
    if (brad.value == "") {
        tothop.value = "";
    } else {
        tothop.value = mthrust.value * Math.cos(thetaval3()) * brad.value;
    }
    return tothop.value;
}

function reinfor3() {
    var brad = document.getElementById("baseradius3");
    var rein = document.getElementById("reinbeam3");
    if (brad.value == "") {
        rein.value = "";
    } else {
        rein.value = totalhoop3() * 10;
    }
    return rein.value;
}

function safeP3() {
    var bags = document.getElementById("providenos3");
    var bars = document.getElementById("providebars3");
    var a1 = document.getElementById("alertbox13");
    var a3 = document.getElementById("alertbox23");
    var rein = document.getElementById("reinbeam3");
    var ans = bags.value * 0.785;
    var ans2 = bars.value * bars.value;
    var ast = ans * ans2;
    if (reinfor3() < ast) {
        a1.style.display = "block";
        a3.style.display = "none";
    } else if (reinfor3() > ast) {
        a1.style.display = "none";
        a3.style.display = "block";
    }
    return ast;
}

function modratio3() {
    var seleC = document.getElementById("concrD3");
    var mr = document.getElementById("morat3");

    if (seleC.value == "M-10") {
        var sel = 3;
    } else if (seleC.value == "M-15") {
        sel = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 14.5;
    }
    else {
        sel = 16;
    }

    var ans = 3 * sel;
    mr.value = 280 / ans;
}

function depthringb3() {
    var dep = document.getElementById("depring3");
    var wid = document.getElementById("widring3");
    var maxt = document.getElementById("maxten3");
    var mr = document.getElementById("morat3");
    var z = document.getElementById("tothop3");
    var prov = document.getElementById("provdd3");


    if (maxt.value == "" || wid.value == "") {
        dep.value = "";
    } else {
        var ans = mr.value - 1;
        var ans2 = ans * safeP3();
        var ans3 = z.value * 1000;
        var ans4 = ans3 / maxt.value;
        var ans5 = ans4 - ans2;
       dep.value = Math.abs(ans5 / wid.value);
        prov.value = dep.value;
    }
}

function valch3() {
    var provi = document.getElementById("provwid3");
    var wid = document.getElementById("widring2");
    provi.value = wid.value;
}


//



// conocal 
// type1

function baseradius4() {
    var diam = document.getElementById("basediamD4");
    var radius = document.getElementById("baseradius4");



    radius.value = diam.value / 2;
    thetaval4();
    return radius.value;

}

function thetaval4() {
    var thete = document.getElementById("thetavall4");
    var rad = document.getElementById("riseD4");
    var radius = document.getElementById("baseradius4");
     var thetwew = Math.atan(radius.value / rad.value);
     var ttyo = thetwew * 180;
     thete.value = ttyo / 3.14;
     return thetwew;
}

function merithrust4() {
    var totload = document.getElementById("totalload4");
    var rad = document.getElementById("riseD4");
    var thete = document.getElementById("thetavall4");
    var mthrust = document.getElementById("merithrustt4");
    if (rad.value == "" || totload.value == "" || thete.value == "") {
        mthrust.value = "";
    } else {
        var ans = totload.value * rad.value;
        var tyu = Math.cos(thetaval4()) * Math.cos(thetaval4());
        var ans1 = 2 * tyu;
        mthrust.value = ans / ans1;
    }
    return mthrust.value;
}

function meristrss4() {
    var mthrust = document.getElementById("merithrustt4");
    var mstrss = document.getElementById("merithstrss4");
    var tdome = document.getElementById("thickD4");
    if (mthrust.value == "" || tdome.value == "") {
        mstrss.value = "";
    } else {
        var ans = mthrust.value * 1000;
        var ans1 = tdome.value * 1000;
        mstrss.value = ans / ans1;
    }
    return mstrss.value;

}

function hoopforce4() {
    var totload = document.getElementById("totalload4");
    var hpf = document.getElementById("hopfrce4");
    var thete = document.getElementById("thetavall4");
    var rad = document.getElementById("riseD4");
    if (totload.value == "" || thete.value == "" || rad.value == "") {
        hpf.value = "";
    } else {
        
        var ans2 = Math.tan(thetaval4()) * Math.tan(thetaval4());
        var sn = totload.value * rad.value;
        hpf.value = sn * ans2;
    }
    return hpf.value;
}

function hoopstress4() {
    var hpf = document.getElementById("hopfrce4");
    var hps = document.getElementById("hopstrs4");
    var tdome = document.getElementById("thickD4");
    if (hpf.value == "" || tdome.value == "") {
        hps.value = "";
    } else {
        var ans = hpf.value * 1000;
        var ans2 = tdome.value * 1000;
        hps.value = ans / ans2;
    }
    return hps.value;
}

function areaofsteel4() {
    var tdome = document.getElementById("thickD4");
    var steel = document.getElementById("steelin4");
    if (tdome.value == "") {
        steel.value = "";
    } else {
        steel.value = 0.003 * 1000 * tdome.value;
    }
    return steel.value;
}
function horizoncom4() {
    var mthrust = document.getElementById("merithrustt4");
    var hori = document.getElementById("horizoncomp4");
    var thete = document.getElementById("thetavall4");
    if (thete.value == "" || mthrust.value == "") {
        hori.value = "";
    } else {
        hori.value = mthrust.value * Math.sin(thetaval4());
    }
    return hori.value;
}

function totalhoop4() {
    var mthrust = document.getElementById("merithrustt4");
    var tothop = document.getElementById("tothop4");
    var thete = document.getElementById("thetavall4");
    var brad = document.getElementById("baseradius4");
    if (brad.value == "") {
        tothop.value = "";
    } else {
        tothop.value = mthrust.value * Math.sin(thetaval4()) * brad.value;
    }
    return tothop.value;
}

function reinfor4() {
    var brad = document.getElementById("baseradius4");
    var rein = document.getElementById("reinbeam4");
    if (brad.value == "") {
        rein.value = "";
    } else {
        rein.value = totalhoop4() * 10;
    }
    return rein.value;
}

function safeP4() {
    var bags = document.getElementById("providenos4");
    var bars = document.getElementById("providebars4");
    var a1 = document.getElementById("alertbox14");
    var a2 = document.getElementById("alertbox24");
    var rein = document.getElementById("reinbeam4");
    var ans = bags.value * 0.785;
    var ans2 = bars.value * bars.value;
    var ast = ans * ans2;
    if (reinfor4() < ast) {
        a1.style.display = "block";
        a2.style.display = "none";
    } else if (reinfor4() > ast) {
        a1.style.display = "none";
        a2.style.display = "block";
    }
    return ast;
}

function modratio4() {
    var seleC = document.getElementById("concrD4");
    var mr = document.getElementById("morat4");

    if (seleC.value == "M-10") {
        var sel = 3;
    } else if (seleC.value == "M-15") {
        sel = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 14.5;
    }
    else {
        sel = 16;
    }

    var ans = 3 * sel;
    mr.value = 280 / ans;
}

function depthringb4() {
    var dep = document.getElementById("depring4");
    var wid = document.getElementById("widring4");
    var maxt = document.getElementById("maxten4");
    var mr = document.getElementById("morat4");
    var z = document.getElementById("tothop4");
    var prov = document.getElementById("provdd4");

    tothop
    if (maxt.value == "" || wid.value == "") {
        dep.value = "";
    } else {
        var ans = mr.value - 1;
        var ans2 = ans * safeP4();
        var ans3 = z.value * 1000;
        var ans4 = ans3 / maxt.value;
        var ans5 = ans4 - ans2;
        dep.value = Math.abs(ans5 / wid.value);
        prov.value = dep.value;
    }
}

function valch4() {
    var provi = document.getElementById("provwid4");
    var wid = document.getElementById("widring4");
    provi.value = wid.value;
}



// 


// type 2 con
function baseradius5() {
    var diam = document.getElementById("basediamD5");
    var radius = document.getElementById("baseradius5");



    radius.value = diam.value / 2;
    thetaval5();
    return radius.value;

}

function thetaval5() {
    var thete = document.getElementById("thetavall5");
    var rad = document.getElementById("riseD5");
    var radius = document.getElementById("baseradius5");
    var thetwew = Math.atan(radius.value / rad.value);
    var ttyo = thetwew * 180;
    thete.value = ttyo / 3.14;
    return thetwew;
}

function merithrust5() {
    var totload = document.getElementById("totalload5");
    var rad = document.getElementById("riseD5");
    var thete = document.getElementById("thetavall5");
    var mthrust = document.getElementById("merithrustt5");
    if (rad.value == "" || totload.value == "" || thete.value == "") {
        mthrust.value = "";
    } else {
        var ans = Math.sin(thetaval5()) * Math.sin(thetaval5());
        var ans1 = 6.28 * rad.value * ans;
        mthrust.value = totload.value / ans1;
    }
    return mthrust.value;
}

function meristrss5() {
    var mthrust = document.getElementById("merithrustt5");
    var mstrss = document.getElementById("merithstrss5");
    var tdome = document.getElementById("thickD5");
    if (mthrust.value == "" || tdome.value == "") {
        mstrss.value = "";
    } else {
        var ans = mthrust.value * 1000;
        var ans1 = tdome.value * 1000;
        mstrss.value = ans / ans1;
    }
    return mstrss.value;

}



function areaofsteel5() {
    var tdome = document.getElementById("thickD5");
    var steel = document.getElementById("steelin5");
    if (tdome.value == "") {
        steel.value = "";
    } else {
        steel.value = 0.003 * 1000 * tdome.value;
    }
    return steel.value;
}
function horizoncom5() {
    var mthrust = document.getElementById("merithrustt5");
    var hori = document.getElementById("horizoncomp5");
    var thete = document.getElementById("thetavall5");
    if (thete.value == "" || mthrust.value == "") {
        hori.value = "";
    } else {
        hori.value = mthrust.value * Math.cos(thetaval5());
    }
    return hori.value;
}

function totalhoop5() {
    var mthrust = document.getElementById("merithrustt5");
    var tothop = document.getElementById("tothop5");
    var thete = document.getElementById("thetavall5");
    var brad = document.getElementById("baseradius5");
    if (brad.value == "") {
        tothop.value = "";
    } else {
        tothop.value = mthrust.value * Math.cos(thetaval5()) * brad.value;
    }
    return tothop.value;
}

function reinfor5() {
    var brad = document.getElementById("baseradius5");
    var rein = document.getElementById("reinbeam5");
    if (brad.value == "") {
        rein.value = "";
    } else {
        rein.value = totalhoop5() * 10;
    }
    return rein.value;
}

function safeP5() {
    var bags = document.getElementById("providenos5");
    var bars = document.getElementById("providebars5");
    var a1 = document.getElementById("alertbox15");
    var a2 = document.getElementById("alertbox25");
    var rein = document.getElementById("reinbeam5");
    var ans = bags.value * 0.785;
    var ans2 = bars.value * bars.value;
    var ast = ans * ans2;
    if (reinfor5() < ast) {
        a1.style.display = "block";
        a2.style.display = "none";
    } else if (reinfor5() > ast) {
        a1.style.display = "none";
        a2.style.display = "block";
    }
    return ast;
}

function modratio5() {
    var seleC = document.getElementById("concrD5");
    var mr = document.getElementById("morat5");

    if (seleC.value == "M-10") {
        var sel = 3;
    } else if (seleC.value == "M-15") {
        sel = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 14.5;
    }
    else {
        sel = 16;
    }

    var ans = 3 * sel;
    mr.value = 280 / ans;
}

function depthringb5() {
    var dep = document.getElementById("depring5");
    var wid = document.getElementById("widring5");
    var maxt = document.getElementById("maxten5");
    var mr = document.getElementById("morat5");
    var z = document.getElementById("tothop5");
    var prov = document.getElementById("provdd5");


    if (maxt.value == "" || wid.value == "") {
        dep.value = "";
    } else {
        var ans = mr.value - 1;
        var ans2 = ans * safeP5();
        var ans3 = z.value * 1000;
        var ans4 = ans3 / maxt.value;
        var ans5 = ans4 - ans2;
        dep.value = Math.abs(ans5 / wid.value);
        prov.value = dep.value;
    }
}

function valch5() {
    var provi = document.getElementById("provwid5");
    var wid = document.getElementById("widring5");
    provi.value = wid.value;
}


//


// type 3 con


function baseradius6() {
    var diam = document.getElementById("basediamD6");
    var radius = document.getElementById("baseradius6");



    radius.value = diam.value / 2;
    thetaval6();
    return radius.value;

}

function thetaval6() {
    var thete = document.getElementById("thetavall6");
    var rad = document.getElementById("riseD6");
    var radius = document.getElementById("baseradius6");
    var thetwew = Math.atan(radius.value / rad.value);
    var ttyo = thetwew * 180;
    thete.value = ttyo / 3.14;
    return thetwew;
}

function merithrust6() {
    var totload = document.getElementById("totalload6");
    var totload6 = document.getElementById("totalload66");
    var rad = document.getElementById("riseD6");
    var thete = document.getElementById("thetavall6");
    var mthrust = document.getElementById("merithrustt6");
    if (rad.value == "" || totload.value == "" || thete.value == "") {
        mthrust.value = "";
    } else {
        var ans = Math.sin(thetaval6()) * Math.sin(thetaval6());
        var ans1 =2*ans;
        var ans2 = totload.value * rad.value;
        var ans9 = ans2 / ans1;

        var ans4 = 6.28 * rad.value * Math.sin(thetaval6());
        var ans6 = totload6.value / ans4;
       
        mthrust.value = ans9 + ans6;
    }
    return mthrust.value;
}

function meristrss6() {
    var mthrust = document.getElementById("merithrustt6");
    var mstrss = document.getElementById("merithstrss6");
    var tdome = document.getElementById("thickD6");
    if (mthrust.value == "" || tdome.value == "") {
        mstrss.value = "";
    } else {
        var ans = mthrust.value * 1000;
        var ans1 = tdome.value * 1000;
        mstrss.value = ans / ans1;
    }
    return mstrss.value;

}

function hoopforce6() {
    var totload = document.getElementById("totalload6");
    var totload6 = document.getElementById("totalload66");
    var hpf = document.getElementById("hopfrce6");
    var tdome = document.getElementById("thickD6");
    var mthrust = document.getElementById("merithrustt6");
    var thete = document.getElementById("thetavall6");
    var rad = document.getElementById("riseD6");
    if (mthrust.value == "") {
        hpf.value = "";
    } else {

        var s1 = Math.tan(thetaval6()) * Math.tan(thetaval6());
        var s2 =  totload.value * rad.value * s1;
        hpf.value = s2 / tdome.value;
       
    }
    return hpf.value;
}

function hoopstress6() {
    var hpf = document.getElementById("hopfrce6");
    var hps = document.getElementById("hopstrs6");
    var tdome = document.getElementById("thickD6");
    if (hpf.value == "" || tdome.value == "") {
        hps.value = "";
    } else {
        var ans = hpf.value * 1000;
        var ans2 = tdome.value * 1000;
        hps.value = ans / ans2;
    }
    return hps.value;
}

function areaofsteel6() {
    var tdome = document.getElementById("thickD6");
    var steel = document.getElementById("steelin6");
    if (tdome.value == "") {
        steel.value = "";
    } else {
        steel.value = 0.003 * 1000 * tdome.value;
    }
    return steel.value;
}
function horizoncom6() {
    var mthrust = document.getElementById("merithrustt6");
    var hori = document.getElementById("horizoncomp6");
    var thete = document.getElementById("thetavall6");
    if (thete.value == "" || mthrust.value == "") {
        hori.value = "";
    } else {
        hori.value = mthrust.value * Math.cos(thetaval6());
    }
    return hori.value;
}

function totalhoop6() {
    var mthrust = document.getElementById("merithrustt6");
    var tothop = document.getElementById("tothop6");
    var thete = document.getElementById("thetavall6");
    var brad = document.getElementById("baseradius6");
    if (brad.value == "") {
        tothop.value = "";
    } else {
        tothop.value = mthrust.value * Math.cos(thetaval6()) * brad.value;
    }
    return tothop.value;
}

function reinfor6() {
    var brad = document.getElementById("baseradius6");
    var rein = document.getElementById("reinbeam6");
    if (brad.value == "") {
        rein.value = "";
    } else {
        rein.value = totalhoop6() * 10;
    }
    return rein.value;
}

function safeP6() {
    var bags = document.getElementById("providenos6");
    var bars = document.getElementById("providebars6");
    var a1 = document.getElementById("alertbox16");
    var a6 = document.getElementById("alertbox26");
    var rein = document.getElementById("reinbeam6");
    var ans = bags.value * 0.785;
    var ans2 = bars.value * bars.value;
    var ast = ans * ans2;
    if (reinfor6() < ast) {
        a1.style.display = "block";
        a6.style.display = "none";
    } else if (reinfor6() > ast) {
        a1.style.display = "none";
        a6.style.display = "block";
    }
    return ast;
}

function modratio6() {
    var seleC = document.getElementById("concrD6");
    var mr = document.getElementById("morat6");

    if (seleC.value == "M-10") {
        var sel = 3;
    } else if (seleC.value == "M-15") {
        sel = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 14.5;
    }
    else {
        sel = 16;
    }

    var ans = 3 * sel;
    mr.value = 280 / ans;
}

function depthringb6() {
    var dep = document.getElementById("depring6");
    var wid = document.getElementById("widring6");
    var maxt = document.getElementById("maxten6");
    var mr = document.getElementById("morat6");
    var z = document.getElementById("tothop6");
    var prov = document.getElementById("provdd6");


    if (maxt.value == "" || wid.value == "") {
        dep.value = "";
    } else {
        var ans = mr.value - 1;
        var ans2 = ans * safeP6();
        var ans3 = z.value * 1000;
        var ans4 = ans3 / maxt.value;
        var ans5 = ans4 - ans2;
       dep.value = Math.abs(ans5 / wid.value);
        prov.value = dep.value;
    }
}

function valch6() {
    var provi = document.getElementById("provwid6");
    var wid = document.getElementById("widring6");
    provi.value = wid.value;
}


//



// 
// 
// 
// water tank


function outp1(){
    var seleC = document.getElementById("grdeofcon");
    var mr = document.getElementById("output1");
    var mr2 = document.getElementById("output3");

    if (seleC.value == "M-10") {
        var sel = 10;
        var sel2 = 3;
    } else if (seleC.value == "M-15") {
        sel = 15;
        sel2 = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
        sel2 = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
        sel2 = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
        sel2 = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
        sel2 = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
        sel2 = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
        sel2 = 14.5;
    }
    else {
        sel = 50;
        sel2 = 16;
    }

    
    mr.value = sel;
    var ans = 3 * sel2;
    mr2.value = parseInt(280 / ans);
}

function outp2(){
    var seleC = document.getElementById("grdeofsteel");
    var mr = document.getElementById("output2");
    if (seleC.value == "Fe-250") {
        var sel = 250;
    } else if (seleC.value == "Fe-415") {
        sel = 415;
    }
    else   {
        sel = 500;
    }
   mr.value= sel;

}
function outp4(){
    var cap = document.getElementById("capoftank");
    var dep = document.getElementById("depofwater");

    var out = document.getElementById("output4");
    if (cap.value==""||dep.value=="") {
        out.value="";
    } else {
        var ans = 4 * cap.value * 10 * 10*10;
        var ans2 = dep.value * 3.14 * 10 * 10 * 10 * 10 * 10 * 10;
        out.value = Math.sqrt(ans/ans2);
        outp9();
    }
    return out.value;

}

function outp5(){
    var denc = document.getElementById("dnctyofwater");
    var dep = document.getElementById("depofwater");
    var free = document.getElementById("freeboard");
    var out = document.getElementById("output5");
    var diam = document.getElementById("output4");
    if (diam.value==""||free.value==""||denc.value=="") {
        out.value="";
    } else {
        var ans = +dep.value + +free.value;
        var ans2 = diam.value / 2;
        out.value = denc.value * ans * ans2;
    }

}
function outp6(){
    var out5 = document.getElementById("output5");
    var steeel = document.getElementById("tenstrsteel");
    var out = document.getElementById("output6");
    if (out5.value==""||steeel.value=="") {
        out.value="";
    } else {
        var ans = out5.value * 10 *10 *10;
        out.value = ans/steeel.value;
    }
}
function outp7(){
    var out = document.getElementById("output7");
    var bars = document.getElementById("diambars");
    var bars2 = document.getElementById("diambars2");
    var bars3 = document.getElementById("diambars3");
    var out6 = document.getElementById("output6");
    if (bars.value==""||out6.value=="") {
        out.value=="";
    } else {
        var ans = 1000 * 0.785 * bars.value * bars.value;
        out.value = ans / out6.value;
    }
    bars3.value = parseInt(out.value);
    bars2.value = bars.value;
    outp8();
}
function outp8(){
    var out = document.getElementById("output8");
    var tstrss = document.getElementById("tensstrconc");
    var hoopt = document.getElementById("output5");
    var modr = document.getElementById("output3");
    var ast = document.getElementById("output6");
    if (ast.value==""||hoopt.value=="") {
        out.value="";
    } else {
        var ans = modr.value - 1 ;
        var ans1 = ans * ast.value;
        
        var ans2 = hoopt.value * 1000;
        var ans3 = ans2/tstrss.value;
        var ans4 = ans3 - ans1;
        out.value = ans4 / 1000;
        steelare();
        
    }
    
}
function outp9(){
    var out = document.getElementById("output9");
    var dep = document.getElementById("depofwater");
    var free = document.getElementById("freeboard");
    if (dep.value==""||free.value=="") {
        out.value ="";
    } else {
        out.value= +dep.value + +free.value;
    }
}
function steelare(){
    var out = document.getElementById("minareasteel");
    var tankw = document.getElementById("output8");
    var arstel = document.getElementById("output11");
    
    if (tankw.value=="") {
        out.value="";
    } else {
        out.value= 0.003 * 1000 * tankw.value;
        arstel.value=  out.value;
        
    }
    outp10();
}
function outp10(){
    var out = document.getElementById("output10");
    var tankw = document.getElementById("output8");
    var diam = document.getElementById("1diambars");
    var diam2 = document.getElementById("1diambars2");
    var diam3 = document.getElementById("1diambars3");
    var astm = document.getElementById("minareasteel");
    if (diam.value==""||tankw.value==""||astm.value=="") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        var ans1 = ans / astm.value;
        var ans2 = 3 * tankw.value;
        var ans3 = 300;
        out.value = Math.min(ans1 , ans2, ans3);   
        diam2.value = diam.value;
        diam3.value = parseInt(out.value);
    }

}
function outp12() {
    var out = document.getElementById("output12");
    
    var diam = document.getElementById("2diambars");
    var diam2 = document.getElementById("2diambars2");
    var diam3 = document.getElementById("2diambars3");
    var astm = document.getElementById("output11");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;
        
        
        diam2.value = diam.value;
        diam3.value = parseInt(out.value);
    }

}
function outp13(){
    var out = document.getElementById("output13");
   
    var slab = document.getElementById("florslabthik");
    var half = document.getElementById("halfrein");
    if (slab.value=="") {
        out.value="";
    } else {
        out.value = 0.003 *1000*slab.value;
        half.value= out.value/2;
    }
}

function outp14() {
    var out = document.getElementById("output14");

    var diam = document.getElementById("3diambars");
    var diam2 = document.getElementById("3diambars2");
    var diam3 = document.getElementById("3diambars3");
    var astm = document.getElementById("halfrein");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);
    }

}


// 
// 
// 

// flexible
function outp11() {
    var seleC = document.getElementById("grdeofcon1");
    var mr = document.getElementById("output111");
    var mr2 = document.getElementById("output31");

    if (seleC.value == "M-10") {
        var sel = 10;
        var sel2 = 3;
    } else if (seleC.value == "M-15") {
        sel = 15;
        sel2 = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
        sel2 = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
        sel2 = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
        sel2 = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
        sel2 = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
        sel2 = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
        sel2 = 14.5;
    }
    else {
        sel = 50;
        sel2 = 16;
    }


    mr.value = sel;
    var ans = 3 * sel2;
    mr2.value = parseInt(280 / ans);
    return sel2;
}

function outp21() {
    var seleC = document.getElementById("grdeofsteel1");
    var mr = document.getElementById("output21");
    if (seleC.value == "Fe-250") {
        var sel = 250;
    } else if (seleC.value == "Fe-415") {
        sel = 415;
    }
    else {
        sel = 500;
    }
    mr.value = sel;

}
function outp41() {
    var cap = document.getElementById("capoftank1");
    var dep = document.getElementById("depofwater1");

    var out = document.getElementById("output41");
    if (cap.value == "" || dep.value == "") {
        out.value = "";
    } else {
        var ans = 4 * cap.value * 10 * 10 * 10;
        var ans2 = dep.value * 3.14 * 10 * 10 * 10 * 10 * 10 * 10;
        out.value = Math.sqrt(ans / ans2);
        outp51();
    }
    return out.value;

}

function outp51() {
    var out = document.getElementById("output51");
    var dep = document.getElementById("depofwater1");
    var free = document.getElementById("freeboard1");
    if (dep.value == "" || free.value == "") {
        out.value = "";
    } else {
        out.value = +dep.value + +free.value;
        maxbmom();
        maxsh();
        maxring();
    }
}

function maxbmom(){
    var out = document.getElementById("maxbendmom");
    var den = document.getElementById("dnctyofwater1");
    var hei = document.getElementById("output51");
    if (den.value==""||hei.value=="") {
        out.value="";
    } else {
        out.value = 0.0122* den.value * hei.value * hei.value * hei.value;
        arstbenm();
    }
}
function maxsh() {
    var out = document.getElementById("maxsheer");
    var den = document.getElementById("dnctyofwater1");
    var hei = document.getElementById("output51");
   
    if (den.value == "" || hei.value == "") {
        out.value = "";
    } else {
        out.value = 0.0158 * den.value * hei.value * hei.value;
        maxshestrs();
    

        
    }
}

function maxring() {
    var out = document.getElementById("maxrint");
    var den = document.getElementById("dnctyofwater1");
    var hei = document.getElementById("output51");
    var diam = document.getElementById("output41");
    var top = document.getElementById("attop");
    if (den.value == "" || hei.value == "" || diam.value=="") {
        out.value = "";
    } else {
        var ans = diam.value / 2;
        out.value = 0.608 * den.value * hei.value * ans;
        top.value = 0.6 * hei.value;
        areast();
        thiktnkw();
    }
}

function findj(){
    var st = document.getElementById("tenstrsteel1");
    var cb = outp11();
    var m = document.getElementById('output31');
    var k1 = m.value * cb;
    var k2 = st.value / k1;
    var k3 = 1 + +k2;
    var k = 1/ k3;

    var  j1 = k/3;
    var j = 1 - j1;
    return j;
}


function maxshestrs() {
    var out = document.getElementById("maxsheerstr");
    var t = document.getElementById("wallbaseslab");
    var sheer = document.getElementById("maxsheer");
    var min = document.getElementById("minverrei");
    var half = document.getElementById("minverreihalf");
    var half2 = document.getElementById("minverreihalf2");
    var min1 = document.getElementById("centbottop");
    
    
    if (t.value == "" || sheer.value == "") {
        out.value = "";
    } else {
        var ans = t.value - 30;
        var ans2 = 1000 * findj() * ans;
        var ans3 = sheer.value * 1000;
        out.value = ans3 / ans2;
        safeP56();
        min.value = 0.003 * 1000 * t.value;
        half.value = min.value / 2;
        min1.value = min.value;
        half2.value = min1.value / 2;
        
        
    }
}
function areast(){
    var out = document.getElementById("areast");
    var st = document.getElementById("tenstrsteel1");
    var x = document.getElementById("maxrint");
    if (st.value ==""||x.value=="") {
        out.value="";
    } else {
        var ans = x.value * 1000;
        out.value = ans / st.value;
    }
}

function outp144() {
    var out = document.getElementById("output144");

    var diam = document.getElementById("3diambars4");
    var diam2 = document.getElementById("3diambars24");
    var diam3 = document.getElementById("3diambars34");
    var astm = document.getElementById("areast");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);
        
    }

}

function thiktnkw(){
    var out = document.getElementById("thicktknww");
    var x = document.getElementById("maxrint");
    var ct = document.getElementById("tensstrconc1");
    var m = document.getElementById("output31");
    var astm = document.getElementById("areast");
    if (x.value==""||ct.value==""||m.value==""||astm.value=="") {
        out.value="";
    } else {
        var ans = x.value * 1000;
        var ans2 = ans / ct.value;

        var ans3 = m.value - 1 ;
        var ans4 = ans3 *astm.value;
        var ans5 = ans2 - ans4;

        out.value = ans5/ 1000;
        safeP56();
    }

}
function safeP56() {
    var ass = document.getElementById("wallbaseslab");
    var ta = document.getElementById("thicktknww");
    var a1 = document.getElementById("alertbox99");
    var a2 = document.getElementById("alertbox98");
    
    if (ass.value < ta.value) {
        a1.style.display = "block";
        a2.style.display = "none";
    } else if (ass.value > ta.value) {
        a1.style.display = "none";
        a2.style.display = "block";
    }
    
}


function arstbenm(){
    var out = document.getElementById("arstbenmom");
    var s = document.getElementById("maxbendmom");
    var st = document.getElementById("tenstrsteel1");
    var t = document.getElementById("wallbaseslab");
    if (s.value==""||st.value == "") {
        out.value="";
    } else {
        var dc = t.value - 30;
        var ans = s.value * 1000000;
        var ans2 = st.value * findj() * dc;
        out.value = ans / ans2;
    }
}


function outp145() {
    var out = document.getElementById("output145");

    var diam = document.getElementById("3diambars5");
    var diam2 = document.getElementById("3diambars25");
    var diam3 = document.getElementById("3diambars35");
    var astm = document.getElementById("arstbenmom");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);

    }

}

function outp146() {
    var out = document.getElementById("output146");

    var diam = document.getElementById("3diambars6");
    var diam2 = document.getElementById("3diambars26");
    var diam3 = document.getElementById("3diambars36");
    var astm = document.getElementById("minverreihalf");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);

    }

}
function outp147() {
    var out = document.getElementById("output147");

    var diam = document.getElementById("3diambars7");
    var diam2 = document.getElementById("3diambars27");
    var diam3 = document.getElementById("3diambars37");
    var astm = document.getElementById("minverreihalf2");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);

    }

}





// 
// hinged base

function outp11q() {
    var seleC = document.getElementById("grdeofcon1q");
    var mr = document.getElementById("output111q");
    var mr2 = document.getElementById("output31q");

    if (seleC.value == "M-10") {
        var sel = 10;
        var sel2 = 3;
    } else if (seleC.value == "M-15") {
        sel = 15;
        sel2 = 5;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
        sel2 = 7;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
        sel2 = 8.5;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
        sel2 = 10;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
        sel2 = 11.5;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
        sel2 = 13;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
        sel2 = 14.5;
    }
    else {
        sel = 50;
        sel2 = 16;
    }


    mr.value = sel;
    var ans = 3 * sel2;
    mr2.value = parseInt(280 / ans);
    return sel2;
}

function outp21q() {
    var seleC = document.getElementById("grdeofsteel1q");
    var mr = document.getElementById("output21q");
    if (seleC.value == "Fe-250") {
        var sel = 250;
    } else if (seleC.value == "Fe-415") {
        sel = 415;
    }
    else {
        sel = 500;
    }
    mr.value = sel;

}
function outp41q() {
    var cap = document.getElementById("capoftank1q");
    var dep = document.getElementById("depofwater1q");

    var out = document.getElementById("output41q");
    if (cap.value == "" || dep.value == "") {
        out.value = "";
    } else {
        var ans = 4 * cap.value * 10 * 10 * 10;
        var ans2 = dep.value * 3.14 * 10 * 10 * 10 * 10 * 10 * 10;
        out.value = Math.sqrt(ans / ans2);
        outp51q();
    }
    return out.value;

}

function outp51q() {
    var out = document.getElementById("output51q");
    var dep = document.getElementById("depofwater1q");
    var free = document.getElementById("freeboard1q");
    if (dep.value == "" || free.value == "") {
        out.value = "";
    } else {
        out.value = +dep.value + +free.value;
        maxbmomq();
        maxshq();
        maxringq();
    }
}

function maxbmomq() {
    var out = document.getElementById("maxbendmomq");
    var den = document.getElementById("dnctyofwater1q");
    var hei = document.getElementById("output51q");
    if (den.value == "" || hei.value == "") {
        out.value = "";
    } else {
        out.value = 0.0122 * den.value * hei.value * hei.value * hei.value;
        arstbenmq();
    }
}
function maxshq() {
    var out = document.getElementById("maxsheerq");
    var den = document.getElementById("dnctyofwater1q");
    var hei = document.getElementById("output51q");

    if (den.value == "" || hei.value == "") {
        out.value = "";
    } else {
        out.value = 0.0158 * den.value * hei.value * hei.value;
        maxshestrsq();



    }
}

function maxringq() {
    var out = document.getElementById("maxrintq");
    var den = document.getElementById("dnctyofwater1q");
    var hei = document.getElementById("output51q");
    var diam = document.getElementById("output41q");
    var top = document.getElementById("attopq");
    if (den.value == "" || hei.value == "" || diam.value == "") {
        out.value = "";
    } else {
        var ans = diam.value / 2;
        out.value = 0.608 * den.value * hei.value * ans;
        top.value = 0.6 * hei.value;
        areastq();
        thiktnkwq();
    }
}

function findjq() {
    var st = document.getElementById("tenstrsteel1q");
    var cb = outp11q();
    var m = document.getElementById("output31q");
    var k1 = m.value * cb;
    var k2 = st.value / k1;
    var k3 = 1 + +k2;
    var k = 1 / k3;

    var j1 = k / 3;
    var j = 1 - j1;
    return j;
}


function maxshestrsq() {
    var out = document.getElementById("maxsheerstrq");
    var t = document.getElementById("wallbaseslabq");
    var sheer = document.getElementById("maxsheerq");
    var min = document.getElementById("minverreiq");
    var half = document.getElementById("minverreihalfq");
    var half2 = document.getElementById("minverreihalf2q");
    var min1 = document.getElementById("centbottopq");


    if (t.value == "" || sheer.value == "") {
        out.value = "";
    } else {
        var ans = t.value - 30;
        var ans2 = 1000 * findjq() * ans;
        var ans3 = sheer.value * 1000;
        out.value = ans3 / ans2;
        safeP56q();
        min.value = 0.003 * 1000 * t.value;
        half.value = min.value / 2;
        min1.value = min.value;
        half2.value = min1.value / 2;


    }
}
function areastq() {
    var out = document.getElementById("areastq");
    var st = document.getElementById("tenstrsteel1q");
    var x = document.getElementById("maxrintq");
    if (st.value == "" || x.value == "") {
        out.value = "";
    } else {
        var ans = x.value * 1000;
        out.value = ans / st.value;
    }
}

function outp144q() {
    var out = document.getElementById("output144q");

    var diam = document.getElementById("3diambars4q");
    var diam2 = document.getElementById("3diambars24q");
    var diam3 = document.getElementById("3diambars34q");
    var astm = document.getElementById("areastq");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);

    }

}

function thiktnkwq() {
    var out = document.getElementById("thicktknwwq");
    var x = document.getElementById("maxrintq");
    var ct = document.getElementById("tensstrconc1q");
    var m = document.getElementById("output31q");
    var astm = document.getElementById("areastq");
    if (x.value == "" || ct.value == "" || m.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = x.value * 1000;
        var ans2 = ans / ct.value;

        var ans3 = m.value - 1;
        var ans4 = ans3 * astm.value;
        var ans5 = ans2 - ans4;

        out.value = ans5 / 1000;
        safeP56q();
    }

}
function safeP56q() {
    var ass = document.getElementById("wallbaseslabq");
    var ta = document.getElementById("thicktknwwq");
    var a1 = document.getElementById("alertbox99q");
    var a2 = document.getElementById("alertbox98q");

    if (ass.value < ta.value) {
        a1.style.display = "block";
        a2.style.display = "none";
    } else if (ass.value > ta.value) {
        a1.style.display = "none";
        a2.style.display = "block";
    }

}


function arstbenmq() {
    var out = document.getElementById("arstbenmomq");
    var s = document.getElementById("maxbendmomq");
    var st = document.getElementById("tenstrsteel1q");
    var t = document.getElementById("wallbaseslabq");
    if (s.value == "" || st.value == "") {
        out.value = "";
    } else {
        var dc = t.value - 30;
        var ans = s.value * 1000000;
        var ans2 = st.value * findjq() * dc;
        out.value = ans / ans2;
    }
}


function outp145q() {
    var out = document.getElementById("output145q");

    var diam = document.getElementById("3diambars5q");
    var diam2 = document.getElementById("3diambars25q");
    var diam3 = document.getElementById("3diambars35q");
    var astm = document.getElementById("arstbenmomq");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);

    }

}

function outp146q() {
    var out = document.getElementById("output146q");

    var diam = document.getElementById("3diambars6q");
    var diam2 = document.getElementById("3diambars26q");
    var diam3 = document.getElementById("3diambars36q");
    var astm = document.getElementById("minverreihalfq");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);

    }

}
function outp147q() {
    var out = document.getElementById("output147q");

    var diam = document.getElementById("3diambars7q");
    var diam2 = document.getElementById("3diambars27q");
    var diam3 = document.getElementById("3diambars37q");
    var astm = document.getElementById("minverreihalf2q");
    if (diam.value == "" || astm.value == "") {
        out.value = "";
    } else {
        var ans = 1000 * 0.785 * diam.value * diam.value;
        out.value = ans / astm.value;


        diam2.value = diam.value;
        diam3.value = parseInt(out.value);

    }

}





// 

// beammm
function beamans1(){
    var out = document.getElementById("effdepth");
    var out2 = document.getElementById("effbredth");
    var b1 = document.getElementById("clearspan");
    var effc = document.getElementById("effcorn");
    var b2 = document.getElementById("widofsupp");
    var out3 = document.getElementById("totdepfg");
    if (b1.value == "" || b2.value == "") {
        out.value = "";
    }
    // else if (effc.value == "" ) {
    //     out3.value = "";
    // }
    else  {
        var ans = +b1.value + +b2.value; 
       var ans2 = ans*1000;
       out.value = ans2/12;
out2.value = out.value /2;
       out3.value = +out.value + +effc.value;
       
    }
return ans;

}
function beamans11() {
    var out = document.getElementById("effdepth1");
    var out2 = document.getElementById("effbredth1");
    var b1 = document.getElementById("clearspan1");
    var spann = document.getElementById("effspan");
    var effc = document.getElementById("effcorn1");
    var b2 = document.getElementById("widofsupp1");
    var out3 = document.getElementById("totdepfg1");
    if (b1.value == "" || b2.value == "") {
        out.value = "";
    }
    // else if (effc.value == "" ) {
    //     out3.value = "";
    // }
    else {
        spann.value = +b1.value + +b2.value;
        var ans2 = b1.value * 1000;
        out.value = ans2 / 12;
        out2.value = out.value / 2;
        out3.value = +out.value + +effc.value;

    }
    return spann.value;

}



function maxbbbm(){
    var out = document.getElementById("maxbendmomnt");
  var rates = document.getElementById('radoo').value;
   
    var sw = document.getElementById("totalloadb");
    var bw = document.getElementById("totalload3b");
    if (sw.value == "" || bw.value == "") {
        out.value = "";
    } else {

        if (document.getElementById('r1').checked) {
            var anss = 1.5 * sw.value * beamans1();
            var asnn2 = anss * beamans1();
            var anm1 = asnn2 / 8;

            var and = 1.5 * bw.value * beamans1();
            var anm2= and /4;
            out.value = anm1 + anm2;
        } else {
            var anssr = 1.5 * sw.value * beamans1();
            var asnnb = anssr * beamans1();
            var anmb = asnnb / 2;

            var andb = 1.5 * bw.value * beamans1();
           
            out.value = anmb + andb;
            
        }
    }
    reqefdepbeam();
}
function maxbbbm1() {
    var out = document.getElementById("maxbendmomnt1");
    var rates = document.getElementById('radoo1').value;

    var sw = document.getElementById("totalloadb1");
    var bw = document.getElementById("totalload3b1");
    if (sw.value == "" || bw.value == "") {
        out.value = "";
    } else {

        if (document.getElementById('r11').checked) {
            var anss = 1.5 * sw.value * beamans11();
            var asnn2 = anss * beamans11();
            var anm1 = asnn2 / 8;

            var and = 1.5 * bw.value * beamans11();
            var anm2 = and / 4;
            out.value = anm1 + anm2;
        } else {
            var anssr = 1.5 * sw.value * beamans11();
            var asnnb = anssr * beamans11();
            var anmb = asnnb / 2;

            var andb = 1.5 * bw.value * beamans11();

            out.value = anmb + andb;

        }
    }
    reqefdepbeam1();
}

function selbeamcon() {
    var seleC = document.getElementById("grdeofconbeam");
   

    if (seleC.value == "M-10") {
        var sel = 10;
    } else if (seleC.value == "M-15") {
        sel = 15;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
    }
    else {
        sel = 50;
    }
    
    return sel;
    reqefdepbeam();
}

function selbeamcon1() {
    var seleC = document.getElementById("grdeofconbeam1");


    if (seleC.value == "M-10") {
        var sel = 10;
    } else if (seleC.value == "M-15") {
        sel = 15;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
    }
    else {
        sel = 50;
    }

    return sel;
    reqefdepbeam1();
}

function febeam(){
    var seleste = document.getElementById("grdeofsteel");
    if (seleste.value == "Fe-250") {
        var sel = 0.53;
        
    } else if (seleste.value == "Fe-415") {
        sel = 0.48;
    }
    else {
        sel = 0.46;
    }
    
    return sel;
    febeam2();
    
}
function febeam1() {
    var seleste = document.getElementById("grdeofsteel1");
    if (seleste.value == "Fe-250") {
        var sel = 0.53;

    } else if (seleste.value == "Fe-415") {
        sel = 0.48;
    }
    else {
        sel = 0.46;
    }

    return sel;
    febeam21();

}
function febeam2() {
    var seleste = document.getElementById("grdeofsteel");
    if (seleste.value == "Fe-250") {
        var sel = 250;

    } else if (seleste.value == "Fe-415") {
        sel = 415;
    }
    else {
        sel = 500;
    }

    return sel;
    reqefdepbeam();
}
function febeam21() {
    var seleste = document.getElementById("grdeofsteel1");
    if (seleste.value == "Fe-250") {
        var sel = 250;

    } else if (seleste.value == "Fe-415") {
        sel = 415;
    }
    else {
        sel = 500;
    }

    return sel;
    reqefdepbeam1();
}
function reqefdepbeam(){
    var out = document.getElementById("reqefdepbem");
    var astt = document.getElementById("arestelbem");
    var note = document.getElementById("calsnot");
    var d = document.getElementById("effdepth");
    var mbm = document.getElementById("maxbendmomnt");
    var bre = document.getElementById("effbredth");
    if (bre.value == "" || mbm.value == "") {
        out.value = "";
    }
    else{
        
        var a = mbm.value * 10*10*10*10*10*10;
        var b = 0.36 * selbeamcon();
        
        var c = 0.58 *  selbeamcon();
        var x = b * c * bre.value * febeam();
        out.value = a / x;
        
       
        
        var a1 = 4.6 * a;
        var aa2 = febeam() * bre.value * d.value * d.value;
        var a2 = a1/aa2; 
       var aaa = Math.abs(1-a2);
        var a3 = 1- Math.sqrt(aaa);
        

        var a5 = 0.5 * febeam() * bre.value * d.value;
        var a6 = a5 / febeam2();
        astt.value = a6 * a3 ;
        

 
        
        if (d.value>out.value) {
        note.style.display="block";
        
            
        } else {
            note.style.display = "none";
        }
         assumeeba();
        
    }
    
}


function reqefdepbeam1() {
    var out = document.getElementById("reqefdepbem1");
    var mulim = document.getElementById("mulim");
    var astt = document.getElementById("arestelbem1");
    var note = document.getElementById("calsnot1");
    var note1 = document.getElementById("calsnot11");
    var note12 = document.getElementById("calsnot112");
    var d = document.getElementById("effdepth1");
    var d1 = document.getElementById("effcorn1");
    var asc = document.getElementById("ascrei");
    var mbm = document.getElementById("maxbendmomnt1");
    var bre = document.getElementById("effbredth1");
    if (bre.value == "" || mbm.value == "") {
        out.value = "";
    }
    else {

        var a = mbm.value * 10 * 10 * 10 * 10 * 10 * 10;
        var b = 0.36 * selbeamcon1();

        var c = 0.58 * selbeamcon1();
        var x = b * c * bre.value * febeam1();
        mulim.value = b * c * bre.value * d.value *d.value* febeam1();
        out.value = a / x;



        var a1 = 4.6 * mulim.value;
        var aa2 = febeam1() * bre.value * d.value * d.value;
        var a2 = a1 / aa2;
        var aaa = Math.abs(1 - a2);
        var a3 = 1 - Math.sqrt(aaa);


        var a5 = 0.5 * febeam1() * bre.value * d.value;
        var a6 = a5 / febeam21();
        astt.value = a6 * a3;

        var s = a - mulim.value;
        var ss= d.value - d1.value;
        var sss = 0.87 * febeam21();
        var sd = sss * ss;
        asc.value = s /sd; 



        if (mbm.value > mulim.value) {
            note1.style.display = "block";
            note12.style.display = "none";


        } else {
            note1.style.display = "none";
            note12.style.display = "block";
        }

        if (d.value > out.value) {
            note.style.display = "block";


        } else {
            note.style.display = "none";
        }
        assumeeba1();

    }

}

function assumeeba(){
    var out = document.getElementById("noofbarsast");
    var ass = document.getElementById("assumba");
    var ast = document.getElementById("arestelbem");
    var astp = document.getElementById("areastelprobem");
    var spac = document.getElementById("spacbetbarbem");
    var bre = document.getElementById("effbredth");
    if (ass.value == "" || ast.value == "") {
        out.value = "";
    }
    else {
        var a1 = 0.786 * ass.value * ass.value;
        out.value = ast.value / a1;
        astp.value = out.value * 0.786 * ass.value * ass.value;

        var a1 = +out.value + +1;
        var a2 = out.value * ass.value ;
        var a3 = bre.value - a2;
        spac.value = a3 / a1;


    }



}

function assumeeba1() {
    var out = document.getElementById("noofbarsast1");
    var out2 = document.getElementById("noofbarsast12");
    var ass = document.getElementById("assumba1");
    var ass2 = document.getElementById("assumba12");
    var ast = document.getElementById("arestelbem1");
    var ast2 = document.getElementById("arestelbem12");
    var asc = document.getElementById("ascrei");

    var aspp = document.getElementById("areastelprobem1");
    var note = document.getElementById("endnote");

    var x = document.getElementById("xword");
    var y = document.getElementById("yword");
    var a = document.getElementById("aword");
    var b = document.getElementById("bword");

    
    var totst = document.getElementById("totastten");
    
    
    if (ass.value == "" || ast.value == "" || asc.value == "") {
        out.value == "";
    }
    else {
        
        var a1 = 0.786 * ass.value * ass.value;
        out.value = asc.value / a1;
        aspp.value = out.value * a1;

        var df = aspp.value * 0.87 * febeam21();
        var ty = 0.87 * febeam21();
        ast2.value = df / ty;

        totst.value = +ast.value + +ast2.value;


        var a12 = 0.786 * ass2.value * ass2.value;
        out2.value = totst.value / a12;
        
        // astp.value = 

        

        
        note.style.display = "block";
        y.innerHTML= out.value;
        x.innerHTML = ass.value;
        a.innerHTML = ass2.value;
        b.innerHTML = out2.value;

        

    }



}


// rcc
function dimfind(){
    var out = document.getElementById("facload");
    var out2 = document.getElementById("grarecol");
    var minlp = document.getElementById("minlongpro");
    var maxlp = document.getElementById("maxlongpro");
    var asc = document.getElementById("ascload");
    
    var x = document.getElementById("dimx");
    var y = document.getElementById("dimy");
    var axload = document.getElementById("axialload");
    if (x.value == "" || y.value == "" || axload.value == "") {
        out.value == "";
        out2.value=="";
    }
    else {
        out.value = 1.5 * axload.value;
        out2.value =  x.value * y.value;

        // asload
        var a = out.value * 10 *10*10;
        var b = 0.4 * fckfind() * out2.value;
        var c = a - b;

        var d = 0.67 * fyfind();
        var e = 0.4 * fckfind();
        var f = d - e;
         asc.value =Math.abs(c / f);

         minlp.value = 0.008 * out2.value;
         maxlp.value = 0.06 * out2.value;
        
        findprx();
    }
}

function fyfind() {
    var seleste = document.getElementById("grdstelrcc");
    if (seleste.value == "Fe-250") {
        var sel = 250;

    } else if (seleste.value == "Fe-415") {
        sel = 415;
    }
    else {
        sel = 500;
    }

    return sel;
    dimfind();
}

function fckfind() {
    var seleC = document.getElementById("grconrcc");


    if (seleC.value == "M-10") {
        var sel = 10;
    } else if (seleC.value == "M-15") {
        sel = 15;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
    }
    else {
        sel = 50;
    }

    return sel;
    dimfind();
}

function findprx(){
    var asc = document.getElementById("ascload");
    var prx = document.getElementById("providex");
    var lprx = document.getElementById("longpro");
   
    var minlp = document.getElementById("minlongpro");
    var maxnlp = document.getElementById("maxlongpro");
    var bars = document.getElementById("nobarsrcc");
    if (prx.value == "") {
        bars.value == "";
       
    }
    else {
        var x = 0.786 * prx.value * prx.value;
        

        var bgh = Math.round(asc.value / x);
        if(bgh < 4){
            bars.value = 4;
        }
        else{
            bars.value = bgh;
        }

        // lprx
        lprx.value = bars.value * 0.786 * prx.value * prx.value;

        
       

       


}
    noteget1();
    
}
function noteget1(){
    var lprx = document.getElementById("longpro");
    var note1 = document.getElementById("disp1");
    var note2 = document.getElementById("disp2");
    var minlp = document.getElementById("minlongpro");
    var maxnlp = document.getElementById("maxlongpro");

    if (lprx.value < minlp.value) {
        note1.style.display = "block";

        note1.innerHTML = "Here longitudinal reinforcement provided is greater than minimum longitudianl reinforcement.Hence safe..!";
    } else if (lprx.value > minlp.value) {
        note1.style.display = "block";

        note1.innerHTML = "Here longitudinal reinforcement provided is less than minimum longitudianl reinforcement.Hence not safe..!"

    }
    noteget2();
}
function noteget2(){
    var lprx = document.getElementById("longpro");
    var note1 = document.getElementById("disp1");
    var note2 = document.getElementById("disp2");
    var minlp = document.getElementById("minlongpro");
    var maxnlp = document.getElementById("maxlongpro");
    if (lprx.value < maxnlp.value) {
        note2.style.display = "block";

        note2.innerHTML = "Here longitudinal reinforcement provided is less than maximum longitudianl reinforcement.Hence safe..!";
    } else  {
        note2.style.display = "block";

        note2.innerHTML = "Here longitudinal reinforcement provided is greater than maximum longitudianl reinforcement.Hence not safe..!"

    };
}
function lastfun(){
    var out = document.getElementById("spacinlat");
    var note = document.getElementById("naty");
    var prx = document.getElementById("providex");
    var x = document.getElementById("dimx");
    var y = document.getElementById("dimy");
    var pro = document.getElementById("proylat");
    var yy = document.getElementById("notyy");
    var ss = document.getElementById("notss");

    var x= Math.min(x.value,y.value);
    var y = 16 * prx.value;
    var z =300;
    out.value = Math.min(x, y, z);
    yy.innerHTML = pro.value;
    ss.innerHTML = out.value;
note.style.display="block";
}


// circular

function circumain(){
    var out = document.getElementById("facloadc");
    var out2 = document.getElementById("grarecolcc");
    var bars = document.getElementById("nobarscir");
    var ass = document.getElementById("diamcirbar");
    var asc = document.getElementById("asccir");
    var dg = document.getElementById("diamcolcir");

    
    var axload = document.getElementById("axialcir");
    if ( axload.value == "") {
        out.value == "";
        out2.value == "";
    }
    else {
        out.value = 1.5 * axload.value;
        

        // asload
        var a = out.value * 10 * 10 * 10;
        var b = 0.4 * fckfindc();
        var c = b/100;
        var o = 0.67 * fyfindc();
        var ot= o/100;


        var d = b-c+ot;
        out2.value = a / d;
        
        var ty = out2.value *4;

        var yu = ty/Math.PI;
        var bb = Math.abs(yu);

        dg.value = Math.sqrt(bb);

        asc.value = out2.value /100;

        var pl = 0.786 * ass.value * ass.value ;
        bars.value = Math.round(asc.value / pl);


        findprxlc();
    }

}
function findprxlc(){
    var out = document.getElementById("spacirdd");
    var note = document.getElementById("naty1");
    var diam = document.getElementById("diamcolcir");
    var pro = document.getElementById("procirtw");
    var x = document.getElementById("diamcirbar");
    
    
    var yy = document.getElementById("notyy1");
    var ss = document.getElementById("notss1");

    var xx = diam.value;
    var y = 16 * x.value;
    var z = 300;
    out.value = Math.min(xx, y, z);
    yy.innerHTML = pro.value;
    ss.innerHTML = out.value;
    note.style.display = "block";
}



function fyfindc() {
    var seleste = document.getElementById("grdstelrccc");
    if (seleste.value == "Fe-250") {
        var sel = 250;

    } else if (seleste.value == "Fe-415") {
        sel = 415;
    }
    else {
        sel = 500;
    }

    return sel;
    circumain();
}

function fckfindc() {
    var seleC = document.getElementById("grconrccc");


    if (seleC.value == "M-10") {
        var sel = 10;
    } else if (seleC.value == "M-15") {
        sel = 15;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
    }
    else {
        sel = 50;
    }

    return sel;
    circumain();
}



// helllical
function circumainh() {
    var out = document.getElementById("facloadh");
    var out2 = document.getElementById("grarecolch");
    var eff = document.getElementById("effcorhell");
    var vol = document.getElementById("volhelrei");
    var ass = document.getElementById("diamhelbar");
    var asc = document.getElementById("aschel");
    var acc = document.getElementById("acchel");
    var dg = document.getElementById("diamcolhel");
    var dc = document.getElementById("thedchel");


    var axload = document.getElementById("axialhel");
    if (axload.value == ""||eff.value=="") {
        out.value == "";
        out2.value == "";
    }
    else {
        var asd = 1.5 * axload.value;
        out.value = asd/1.05;


        // asload
        var a = out.value * 10 * 10 * 10;
        var b = 0.4 * fckfindh();
        var c = b / 100;
        var o = 0.67 * fyfindh();
        var ot = o / 100;


        var d = b - c + ot;
        out2.value = a / d;

        var ty = out2.value * 4;
        var yu = ty / Math.PI;
        var bb = Math.abs(yu);
        dg.value = Math.sqrt(bb);

        // dc
        var ghi = 2* eff.value;
        dc.value = dg.value - ghi;

        // asc
        asc.value = 0.786 * dg.value * dg.value * 0.01;

        // area of concrete
        var con = 0.786 * dc.value * dc.value;
        acc.value = con - asc.value;


var lk = dc.value -ass.value;
        var pl = 0.786 * ass.value * ass.value * 3.14 * lk;
        vol.value = pl;


        findprxlh();
    }

}
function findprxlh() {
    var out = document.getElementById("spaheldd");
    var note = document.getElementById("naty9");
    var diam = document.getElementById("diamhelbar");
    var thex = document.getElementById("diamcolhel");
    var yy = document.getElementById("notyy9");
    var ss = document.getElementById("notss9");

    var xx =75;
    var y = 0.167 * thex.value;
    var z = 3 * diam.value;
    out.value = Math.min(xx, y, z);
    yy.innerHTML = thex.value;
    ss.innerHTML = out.value;
    note.style.display = "block";
}



function fyfindh() {
    var seleste = document.getElementById("grdstelrcch");
    if (seleste.value == "Fe-250") {
        var sel = 250;

    } else if (seleste.value == "Fe-415") {
        sel = 415;
    }
    else {
        sel = 500;
    }

    return sel;
    circumainh();
}

function fckfindh() {
    var seleC = document.getElementById("grconrcch");


    if (seleC.value == "M-10") {
        var sel = 10;
    } else if (seleC.value == "M-15") {
        sel = 15;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
    }
    else {
        sel = 50;
    }

    return sel;
    circumainh();
}

// slab
function fyfindslab() {
    var seleste = document.getElementById("grconslab");
    if (seleste.value == "Fe-250") {
        var sel = 0.53;

    }
    else {
        sel = 0.48;
    }

    return sel;
    fyfindslab2();
    
}
function fyfindslab2() {
    var seleste = document.getElementById("grconslab");
    if (seleste.value == "Fe-250") {
        var sel = 250;

    }
    else {
        sel = 415;
    }

    return sel;
    slabdim();
}
function fckfindslab() {
    var seleC = document.getElementById("grconslab");


    if (seleC.value == "M-10") {
        var sel = 10;
    } else if (seleC.value == "M-15") {
        sel = 15;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
    }
    else {
        sel = 50;
    }

    return sel;
    slabdim();
}



function getdimsl(){
 var x = document.getElementById("slabx");
 var y = document.getElementById("slaby");
 var pp = y.value/ x.value;
 if (pp == 1.0) {
     var xx = 0.062;
     
 } else if (pp == 1.1) {
      xx = 0.074;
      
 }
 else if (pp == 1.2) {
      xx = 0.084;
     
 }
 else if (pp == 1.3) {
      xx = 0.093;
     
 }
 else if (pp == 1.4) {
      xx = 0.099;
     
 }
 else if (pp == 1.5) {
      xx = 0.104;
       
 }
 else if (pp == 1.75) {
       xx = 0.113;
      
 }
 else if (pp == 2.0) {
       xx = 0.118;
      
 }
 else if (pp == 2.5) {
       xx = 0.112;
       
 }
 else if (pp == 3.0) {
       xx = 0.124;
       
 }
 else{


    // change must need
     xx = pp;
     
 }
 return xx;
}
function getdimsl2() {
    var x = document.getElementById("slabx");
    var y = document.getElementById("slaby");
    var pp = y.value / x.value;
    if (pp == 1.0) {
        
        var yy = 0.062;
    } else if (pp == 1.1) {
        
        yy = 0.061;
    } else if (pp == 1.2) {
       
        yy = 0.059;
    } else if (pp == 1.3) {
       
        yy = 0.055;
    } else if (pp == 1.4) {
        
        yy = 0.051;
    } else if (pp == 1.5) {
        
        yy = 0.046;
    } else if (pp == 1.75) {
        
        yy = 0.037;
    } else if (pp == 2.0) {
        
        yy = 0.029;
    } else if (pp == 2.5) {
        
        yy = 0.020;
    } else if (pp == 3.0) {
        
        yy = 0.014;
    } else {


        // change must need
        
        yy = pp;
    }
    return yy;
}


function slabdim(){
    var effc = document.getElementById("effcorsl");
    var out = document.getElementById("ratioslab");
    var out3 = document.getElementById("effspansl");
    var out2 = document.getElementById("totslbdep");
    var effd = document.getElementById("effdepsl");


    var selfw = document.getElementById("selfweisl");
    var totl = document.getElementById("totalloadsl");
    var totlipo = document.getElementById("totalloadsljio");
    var wu = document.getElementById("ultmlosl");
    var mu = document.getElementById("bendmomslab");

    var ed1 = document.getElementById("effdepsl1");
    var ed2 = document.getElementById("effdepsl2");

    var req = document.getElementById("reqefslb");
    var mrf = document.getElementById("minrepslb");

    var ast = document.getElementById("astslab");
    var prox = document.getElementById("providexslb");
    var spacos = document.getElementById("spacslabrei");



     var x = document.getElementById("slabx");
     var y = document.getElementById("slaby");

    var note = document.getElementById("slabnote");
    var notetit = document.getElementById("notetit");
    var noter = document.getElementById("noterr");
    var noter1 = document.getElementById("noterr1");
    var notg = document.getElementById("notedg");
    var fe = document.getElementById("minrepfrsl");

    var spanno = document.getElementById("spannotesl");
    var xpanx = document.getElementById("xpan");
    var sxpanx = document.getElementById("sxpan");

    var spanno1 = document.getElementById("spannotesl1");
    var xpanx1 = document.getElementById("xpan1");
    var sxpanx1 = document.getElementById("sxpan1");

    var allsp = document.getElementById("allspan");
    var mrf2 = document.getElementById("minrepslb2");
    var fe2 = document.getElementById("minrepfrsl2");

    var laspan = document.getElementById("getprospansl");
    var asty = document.getElementById("astslaby");
    var div1 = document.getElementById("enddiv");
    var div2 = document.getElementById("enddiv2");

    var pr3 = document.getElementById("providexslb33");
    var pr4 = document.getElementById("providexslb44");

    var sp3 = document.getElementById("spacslabrei33");
    var sp4 = document.getElementById("spacslabrei44");

    var show = document.getElementById("allshowsl");
    var mids = document.getElementById("middstrsl");
    var pr6 = document.getElementById("providexslb66");
    var sp6 = document.getElementById("spaclastsl");
    var pr7 = document.getElementById("providexslb88");
    var sp7 = document.getElementById("spaclastsl1");
    var edge = document.getElementById("edsrsl");

    var mids1 = document.getElementById("middstrsl1");
    var pr9 = document.getElementById("providexslb99");
    var sp9 = document.getElementById("spaclastsl45");
    var pr1 = document.getElementById("providexslb88");
    var sp1 = document.getElementById("spaclastsl18");
    var edge1 = document.getElementById("edsrsl1");




    
    if (x.value==""||y.value=="") {
        out.value=="";
    } else {
        out.value=y.value/x.value;
        out2.value = +effc.value + +effd.value;
        var cc = effd.value / 1000;
        out3.value = +x.value + +cc;
        if (out.value>2) {
            note.style.display="block";
            note.innerHTML = "ly/lx is greater than 2. So it is a One-way slab.";
            notetit.style.display = "block";
            notetit.innerHTML = "One way slab";

            // 
            var ds = out2.value / 1000;
            selfw.value = ds * 25;
            totl.value = +selfw.value + +totlipo.value;
            wu.value = 1.5 * totl.value ;

            var ty = wu.value * out3.value * out3.value;
            mu.value = ty / 8;

            var jk = 0.36 * fckfindslab() * 1000 * fyfindslab();
            var  we = 1- 0.42 * fyfindslab();
            var re = jk * we;
            var qw = mu.value * 10 * 10 * 10 * 10 * 10 * 10 ;
            ed1.value = qw / re;

            var mmo = out3.value *10*10*10;
            var uu = fckfindslab() / fyfindslab2();
            var mio = 0.414 * uu * fyfindslab() *100;
            var asg= 20 * mio;
            ed2.value = mmo/ asg;

            req.value = Math.max(ed1.value, ed2.value);

            if (effd.value > req.value ) {
                noter.style.display = "block";
                noter1.style.display = "none";
                noter.innerHTML = "Provided depth is greater than required depth. Hence SAFE";
            } else {
                noter.style.display = "none";
                noter1.style.display = "block";
                notg.innerHTML = req.value;
            }
            
            if (fyfindslab2() ==250) {
                fe.innerHTML="Fe250";
                mrf.value = 1.5 * out2.value;
            } else if (fyfindslab2() == 415) {
                fe.innerHTML = "Fe415";
                mrf.value = 1.2 * out2.value;
            }

            var sd  = 1000 * 0.786 * prox.value * prox.value;
            var xc = sd / ast.value;
            var tv  = 300;
            var ft = 3* effd.value;
            spacos.value = Math.min(xc,tv,ft);

            if (fyfindslab2() == 250) {
                allsp.innerHTML = "Area of distribution bars";
                fe2.innerHTML = "Fe250";
                mrf2.value = 1.5 * out2.value;
            } else if (fyfindslab2() == 415) {
                allsp.innerHTML = "Area of distribution bars";
                fe2.innerHTML = "Fe415";
                mrf2.value = 1.2 * out2.value;
            }

            laspan.style.display = "none";
            div1.style.display ="block";
            div2.style.display = "none";
            var sd1 = 1000 * 0.786 * pr3.value * pr3.value;
            var xc1 = sd1 / mrf2.value;
            var tv1 = 450;
            var ft1 = 5 * effd.value;
            sp3.value = Math.min(xc1, tv1, ft1);


show.style.display="none";






        } else {
            note.style.display = "block";
            note.innerHTML = "ly/lx is less than 2. So it is a Two-way slab.";
            notetit.style.display = "block";
            notetit.innerHTML = "Two way slab.";

             // 
             var ds = out2.value / 1000;
             selfw.value = ds * 25;
           
            totl.value = +selfw.value + +totlipo.value;
             
             wu.value = 1.5 * totl.value;
             
             
            var io = out3.value * out3.value ;
             var mxx = getdimsl() * wu.value *io;
            var myy = getdimsl2() * wu.value * io;
            mu.value = Math.max(mxx,myy);

            var jkk = 0.36 * fckfindslab() * 1000 * fyfindslab();
            var wee = 1 - 0.42 * fyfindslab();
            var ree = jkk * wee;
            var qww = mu.value * 10 * 10 * 10 * 10 * 10 * 10;
            ed1.value = qww / ree;

            var mmoo = out3.value * 10 * 10 * 10;
            var uuu = fckfindslab() / fyfindslab2();
            var mioo = 0.414 * uuu * fyfindslab() * 100;
            var asgg = 35 * mioo;
            ed2.value = mmoo / asgg;

            req.value = Math.max(ed1.value, ed2.value);
            if (effd.value > req.value) {
                noter.style.display = "block";
                noter1.style.display = "none";
                noter.innerHTML = "Provided depth is greater than required depth. Hence SAFE";
            } else {
                noter1.style.display = "block";
                noter.style.display = "none";
                notg.innerHTML = req.value;
            }
            if (fyfindslab2() == 250) {
                fe.innerHTML = "Fe250";
                mrf.value = 1.5 * out2.value;
            } else if (fyfindslab2() == 415){
                fe.innerHTML = "Fe415";
                mrf.value = 1.2 * out2.value;
            }

            var sdd = 1000 * 0.786 * prox.value * prox.value;
            var xcc = sdd / ast.value;
            var tvv = 300;
            var ftt = 3 * effd.value;
            spacos.value = Math.min(xcc, tvv, ftt);

            spanno.style.display = "block";
            xpanx.innerHTML = prox.value;
            sxpanx.innerHTML = spacos.value;



            if (fyfindslab2() == 250) {
                allsp.innerHTML = "Minimum reinforcement for";
                fe2.innerHTML = "Fe250";
                mrf2.value = 1.5 * out2.value;
            } else if (fyfindslab2() == 415) {
                allsp.innerHTML = "Minimum reinforcement for";
                fe2.innerHTML = "Fe415";
                mrf2.value = 1.2 * out2.value;
            }

            laspan.style.display="block";
            div1.style.display = "none";
            div2.style.display = "block";
            var sd11 = 1000 * 0.786 * pr4.value * pr4.value;
            var xc11 = sd11 / asty.value;
            var tv11 = 300;
            var ft11 = 3 * effd.value;
            sp4.value = Math.min(xc11, tv11, ft11);

            spanno1.style.display = "block";
            xpanx1.innerHTML = pr4.value;
            sxpanx1.innerHTML = sp4.value;

            show.style.display = "block";
            var dx1 = prox.value /2;
            var dx = out2.value - effc.value - dx1 - prox.value;
            var ly1 = dx/1000;
            var Ly = +y.value + +ly1;
            mids.value = 0.75 * Ly;

            var hp = 1000 * 0.786 * pr6.value *pr6.value;
            sp6.value = hp/asty.value;
            
            edge.value = Ly/8;

            var hp1 = 1000 * 0.786 * pr7.value * pr7.value;
            sp7.value = hp1 / asty.value;

            //long spn
            var lx1 =  effd.value/1000;
            var Lx = +lx1 + +x.value;
             mids1.value = 0.75 * Lx;

             var hp6 = 1000 * 0.786 * pr9.value * pr9.value;
             var qa = hp6 / asty.value;
             var spo = 3 * effd.value;
             var zz = 300;

             sp9.value = Math.min(qa, spo,zz);
             edge1.value = Lx / 8;

             var hp12 = 1000 * 0.786 * pr1.value * pr1.value;
             sp1.value = hp12 / asty.value;





        }
        
    }

}


// cantilexar slab



function cantslab(){
    var len = document.getElementById("sllenc");
    var wid = document.getElementById("widswal");
    var deps = document.getElementById("dslsup");
    var depf = document.getElementById("dslfree");
    var totl2 = document.getElementById("totalloadcn");
    var effc = document.getElementById("effcorcn");

    // out
    var atsup = document.getElementById("effdepslsupcn");
    var espan = document.getElementById("effspancn");
    var slf = document.getElementById("selfwcnt");
    var wu = document.getElementById("ultlodcn");
    var mu = document.getElementById("bendmomcnt");

    var ed1 = document.getElementById("effdcnt1");
    var ed2 = document.getElementById("effdcnt2");

    var hen = document.getElementById("effdepthcnt");
    var dts = document.getElementById("totslsupcnt");

    var ast = document.getElementById("minrearecn");
    
    var pro1 = document.getElementById("diambarcnt");
    var spa1 = document.getElementById("spacbarscnt");
    var pro2 = document.getElementById("diambarcnt2");
    var spa2 = document.getElementById("spacbarscnt2");

    var note = document.getElementById("cantnote");
    var note1 = document.getElementById("spanxcnt");
    var note2 = document.getElementById("spans1cnt");
    var note3 = document.getElementById("spanycnt");
    var note4 = document.getElementById("spans2cnt");




    if (len.value == "" || wid.value == "" ||deps.value  == "") {
        atsup.value == "";
    } else {
        atsup.value = deps.value - effc.value;
        var sd = atsup.value/1000;
        espan.value = +len.value + sd;

        var sw1 = +deps.value + +depf.value;
        var sw = sw1/2000;
        slf.value = sw * 25;
        totl2.value = +slf.value + +totl2.value;
        wu.value = 1.5 * totl2.value;

        var ty = wu.value * espan.value * espan.value;
        mu.value = ty / 2;

        var jk = 0.36 * fckfindcant() * 1000 * fyfindcant();
        var we = 1 - 0.42 * fyfindcant();
        var re = jk * we;
        var qw = mu.value * 10 * 10 * 10 * 10 * 10 * 10;
        ed1.value = qw / re;

        var mmo = espan.value * 10 * 10 * 10;
        var uu = fckfindcant() / fyfindcnt2();
        var mio = 0.414 * uu * fyfindcant() * 100;
        var asg = 7 * mio;
        ed2.value = mmo / asg;

        hen.value  = Math.max(ed1.value , ed2.value);
        dts.value = +hen.value + +effc.value; 

        ast.value = 0.0012 * 1000 *dts.value;

       var as11 =  1000 * 0.786 * pro1.value * pro1.value;
       var as1 = as11/ast.value;
       var bs1 = 300;
       var cs1 = 3 * hen.value;
       spa1.value = Math.min(as1,bs1,cs1);

        var qs11 = 1000 * 0.786 * pro2.value * pro2.value;
        var qs1 = qs11 / ast.value;
        var ws1 = 450;
        var es1 = 5 * hen.value;
        spa2.value = Math.min(qs1, ws1, es1);

        note.style.display ="block";
        note1.innerHTML= pro1.value;
        note2.innerHTML= spa1.value;
        note3.innerHTML = pro2.value;
        note4.innerHTML = spa2.value;



}
}

function fckfindcant() {
    var seleC = document.getElementById("grconcant");


    if (seleC.value == "M-10") {
        var sel = 10;
    } else if (seleC.value == "M-15") {
        sel = 15;
    }
    else if (seleC.value == "M-20") {
        sel = 20;
    }
    else if (seleC.value == "M-25") {
        sel = 25;
    }
    else if (seleC.value == "M-30") {
        sel = 30;
    }
    else if (seleC.value == "M-35") {
        sel = 35;
    }
    else if (seleC.value == "M-40") {
        sel = 40;
    }
    else if (seleC.value == "M-45") {
        sel = 45;
    }
    else {
        sel = 50;
    }

    return sel;
    cantslab();
}
function fyfindcant() {
    var seleste = document.getElementById("grdstelcant");
    if (seleste.value == "Fe-250") {
        var sel = 0.53;

    }
    else if (seleste.value == "Fe-415") {
        sel = 0.48;
    }
    else{
      sel=  0.48;
    }

    return sel;
    fyfindcnt2();

}
function fyfindcnt2() {
    var seleste = document.getElementById("grdstelcant");
    if (seleste.value == "Fe-250") {
        var sel = 250;
    }

    else if (seleste.value == "Fe-415") {
            sel = 415;
        }
        else {
            sel = 500;
        }

    return sel;
    cantslab();
}