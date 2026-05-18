function hideTotal() {
    document.getElementById('noss').innerHTML = "-";
     document.getElementById('nossT').innerHTML = "-";
     document.getElementById('nossR').innerHTML = "-";
   
}

// function resultsmodal(){
//     document.getElementById('result1').innerHTML = reqnumb();
//     document.getElementById('result2').innerHTML = reqnumb();
//     document.getElementById('result3').innerHTML = reqnumb();
// }

function findall() {
     document.getElementById('coarseaggvv').style.display = "none";
     document.getElementById('watervvu').style.display = "none";
      document.getElementById('bricks23').style.display = "flex";
    document.getElementById('tilesreqd').style.display = "none";
    document.getElementById('cementy').style.display = "flex";
    document.getElementById('sanddf').style.display = "flex";
    findarea();
    findvolume();
    volonebr();
    reqnumb();
    volwimor();
    reqamdm();
    volwnos();
    reqamdry();
    amdcmqntyv();
    cementbag();
    sandqntty();

}

function findarea() {

    var lengthh = document.getElementById('lengthofwall');
    var widthh = document.getElementById('widthhofwall');
    var areaa = document.getElementById('areaofwall');
    if (lengthh.value == "" || widthh.value == "") {
        areaa.value = "";
    }
    else {
        var vvp = lengthh.value * widthh.value;
        areaa.value = vvp + " m²";
       
    return vvp;
}
}
function findvolume() {
    var legthh = document.getElementById('lengthofwall');
    var withh = document.getElementById('widthhofwall');
    var hei = document.getElementById('heightofwall');
    var vol = document.getElementById('volumee');

    if (legthh.value == "" || withh.value == "" || hei.value == "") {
        vol.value = "";
    }
    else {
        var ddlp = legthh.value * withh.value * hei.value;
        vol.value = ddlp + " m³";
    }
return ddlp;
}
function volonebr() {
    var l1 = document.getElementById('lofbri');
    var b1 = document.getElementById('wofbri');
    var h1 = document.getElementById('hofbri');
    var vol1 = document.getElementById('volof1');
    var mor = document.getElementById('mortarthick');



    var iuy = mor.value / 100;


    var asn1 = +l1.value + iuy;
    var asn2 = +b1.value + iuy;
    var asn3 = +h1.value + iuy;

    var vv = asn1  * asn2  * asn3 ;
   
    vol1.value = vv + " m³";
    
    return vv;
}
function reqnumb() {
    var lethh = document.getElementById('lengthofwall');
    var wihh = document.getElementById('widthhofwall');
    var heig = document.getElementById('heightofwall');
    var nobri = document.getElementById('nobrireq');
    var arr = document.getElementById('areaofwall');
    var vol = document.getElementById('volumee');
    var vol11 = document.getElementById('volof1');

    if (vol11.value == "" || arr.value == "" || vol.value=="") {
        nobri.value = "";
    }
    else {
      var iu = findvolume() / volonebr();
        nobri.value = parseInt(iu) + " nos";
    }
    var jh = parseInt(iu);
    document.getElementById('noss').innerHTML = jh;
    document.getElementById('result1').innerHTML = jh +" nos";
    
    return jh;
}

function volwimor() {
    var l2 = document.getElementById('lofbri');
    var b2 = document.getElementById('wofbri');
    var h2 = document.getElementById('hofbri');
    var voml = document.getElementById('volwithmor');
    voml.value = l2.value / 100 * b2.value / 100 * h2.value / 100 +" m³";
    var pp = l2.value / 100 * b2.value / 100 * h2.value / 100;
return pp;

}
function reqamdm(){
    var lgh = document.getElementById('reqamd');
    var area = document.getElementById('volumee');
    
    if(area.value==""){
lgh.value="";
    }
    else{
        var rrk = findvolume() - volwnos();
        lgh.value = rrk + " m³";
    }
    return rrk;
}
function reqamdry(){

    var lg = document.getElementById('reqamdr');
    var area = document.getElementById('volumee');
   
    if (area.value == "") {
        lg.value = "";
    }
    else {
        var anss = findvolume() - volwnos() * 1.33;
        lg.value = anss + " m³"
    }
return anss;
}
function volwnos(){
    var nobri = document.getElementById('nobrireq');
    var nnns = document.getElementById('volwnosss');
    if (nobri.value == "") {
        nnns.value="";
    } else {
        var jki = reqnumb() * volwimor();
        nnns.value = jki + " m³";
    }
    return jki;
}
function amdcmqntyv()
{
    var res = document.getElementById('amdcmqnty');
    
    var r1 = document.getElementById('ratio1');
    var r2 = document.getElementById('ratio2');
    var ratio= r1.value/ r1.value+ +r2.value;
  var jjnm = parseInt(reqamdry() * ratio * 1440);

res.value = jjnm + " kg";
 document.getElementById('result2').innerHTML = jjnm + " kg";
  return jjnm;
}


function cementbag(){
    var cem = document.getElementById('cementbagr');
    var aanm = amdcmqntyv() / 50;
    cem.value = parseInt(aanm) +" bags";
}

function sandqntty(){
    var sand = document.getElementById('sandq');
    var r11 = document.getElementById('ratio1');
    var r22 = document.getElementById('ratio2');
    var ratiom = r22.value / r11.value + +r22.value;
    var jrs = parseInt(reqamdry() * ratiom);
    sand.value = jrs + " m³";
 document.getElementById('result3').innerHTML = jrs + " m³";
return jrs;
 
}

//

function findallTank(){
      document.getElementById('coarseaggvv').style.display = "none";
      document.getElementById('watervvu').style.display = "none";
      document.getElementById('bricks23').style.display = "flex";
    document.getElementById('tilesreqd').style.display = "none";
    document.getElementById('cementy').style.display = "flex";
    document.getElementById('sanddf').style.display = "flex";
      areaofCt();
    findvolumeT();
    volonebrT();
    reqnumbT();
    volwimorT();
    volwnosT();
    reqamdmT();
    reqamdryT();
    amdcmqntyvT();
    cementbagT();
    sandqnttyT();
}


function areaofCt(){
    var arCt = document.getElementById('areaoftank');
    var Out = document.getElementById('outD');
    var In = document.getElementById('innD');
    var ddd = Out.value * Out.value/4;
    var ppp = In.value * In.value / 4;
    var tAns= 3.14*ddd-3.14*ppp;
    arCt.value = tAns +" m²" 
    return tAns;
    
}
function findvolumeT(){
    var arCtv = document.getElementById('areaoftank');
    var volwall = document.getElementById('volumeeT');
    var heiT = document.getElementById('heightofTank');
if (heiT.value==""||arCtv.value=="") {
    volwall.value="";
}
else{
    var ammp = areaofCt() * heiT.value;
    volwall.value =ammp +" m³";
}
return ammp;
}
function volonebrT() {
    var l1 = document.getElementById('lofbriT');
    var b1 = document.getElementById('wofbriT');
    var h1 = document.getElementById('hofbriT');
    var vol1 = document.getElementById('volof1T');
    var mor = document.getElementById('mortarthickT');
var iuy = mor.value / 100;


    var asn1 = +l1.value + iuy;
    var asn2 = +b1.value + iuy;
    var asn3 = +h1.value + iuy;

    var vv = asn1  * asn2 * asn3;

    vol1.value = vv + " m³";

    return vv;
}
function reqnumbT() {

   
    var nobri = document.getElementById('nobrireqT');
   
    var vol = document.getElementById('volumeeT');
    var vol11 = document.getElementById('volof1T');

    if (vol11.value == "" || vol.value == "") {
        nobri.value = "";
    }
    else {
        var iu = findvolumeT() / volonebrT();
        nobri.value = parseInt(iu) + " nos";
    }
    var jh = parseInt(iu);
    document.getElementById('nossT').innerHTML = jh;
    document.getElementById('result1').innerHTML = jh + " nos";
    return jh;
}

function volwimorT() {
    var l2 = document.getElementById('lofbriT');
    var b2 = document.getElementById('wofbriT');
    var h2 = document.getElementById('hofbriT');
    var voml = document.getElementById('volwithmorT');
    voml.value = l2.value / 100 * b2.value / 100 * h2.value / 100 + " m³";
    var pp = l2.value / 100 * b2.value / 100 * h2.value / 100;
    return pp;

}
function volwnosT() {
    var nobri = document.getElementById('nobrireqT');
    var nnns = document.getElementById('volwnosssT');
    if (nobri.value == "") {
        nnns.value = "";
    } else {
        var ppoi = reqnumbT() * volwimorT();
        nnns.value = ppoi +" m³";
    }
return ppoi;
}
function reqamdmT() {
    var lgh = document.getElementById('reqamdT');
    var area = document.getElementById('volumeeT');

    if (area.value == "") {
        lgh.value = "";
    }
    else {
        var muio = findvolumeT() - volwnosT();
        lgh.value = parseInt(muio) + " m³";
    }
return muio;
}
function reqamdryT() {

    var lg = document.getElementById('reqamdrT');
    var area = document.getElementById('volumeeT');

    if (area.value == "") {
        lg.value = "";
    }
    else {
        var anss = reqamdmT() * 1.33;
        lg.value = parseInt(anss) + " m³"
    }
    return anss;
}

function amdcmqntyvT() {
    var res = document.getElementById('amdcmqntyT');

    var r1 = document.getElementById('ratio1T');
    var r2 = document.getElementById('ratio2T');
    var ratio = r1.value / r1.value + +r2.value;
    var jjnm = parseInt(reqamdryT() * ratio * 1440);

    res.value = jjnm + " kg";
    document.getElementById('result2').innerHTML = jjnm + " kg";
    return jjnm;
}


function cementbagT() {
    var cem = document.getElementById('cementbagrT');
    var aanm = amdcmqntyvT() / 50;
    cem.value = parseInt(aanm) + " bags";
}

function sandqnttyT() {
    var sand = document.getElementById('sandqT');
    var r11 = document.getElementById('ratio1T');
    var r22 = document.getElementById('ratio2T');
    var ratiom = r22.value / r11.value + +r22.value;
    var jrs = parseInt(reqamdryT() * ratiom);
    sand.value = jrs + " m³";
    document.getElementById('result3').innerHTML = jrs + " m³";
    return jrs;
    
}





// RECTANGULAR TANK



function findallTankR() {
      document.getElementById('coarseaggvv').style.display = "none";
      document.getElementById('watervvu').style.display = "none";
      document.getElementById('bricks23').style.display = "flex";
    document.getElementById('tilesreqd').style.display = "none";
    document.getElementById('cementy').style.display = "flex";
    document.getElementById('sanddf').style.display = "flex";
      areaofCtR();
    findvolumeR();
    volonebrR();
    reqnumbR();
    volwimorR();
    volwnosR();
    reqamdmR();
    reqamdryR();
    amdcmqntyvR();
    cementbagR();
    sandqnttyR();
}

function areaofCtR() {
    var arCt = document.getElementById('areaoftankR');
    var Out = document.getElementById('outDR');
    var In = document.getElementById('innDR');
    var Out1 = document.getElementById('outDR1');
    var In1 = document.getElementById('innDR1');
    var ddd = Out.value* In.value;
    var ppp = Out1.value * In1.value;
    var tAns = ddd-ppp;
    arCt.value = tAns + " m²"
    return tAns;

}
function findvolumeR() {
    var arCtv = document.getElementById('areaoftankR');
    var volwall = document.getElementById('volumeeR');
    var heiT = document.getElementById('heightofTankR');
    if (heiT.value == "" || arCtv.value == "") {
        volwall.value = "";
    }
    else {
        var ammp = areaofCtR() * heiT.value;
        volwall.value = ammp + " m³";
    }
    return ammp;
}
function volonebrR() {
    var l1 = document.getElementById('lofbriR');
    var b1 = document.getElementById('wofbriR');
    var h1 = document.getElementById('hofbriR');
    var vol1 = document.getElementById('volof1R');
    var mor = document.getElementById('mortarthickR');



    var iuy = mor.value / 100;


    var asn1 = +l1.value + iuy;
    var asn2 = +b1.value + iuy;
    var asn3 = +h1.value + iuy;

    var vv = asn1 * asn2 * asn3 ;

    vol1.value = vv + " m³";

    return vv;
}
function reqnumbR() {


    var nobri = document.getElementById('nobrireqR');

    var vol = document.getElementById('volumeeR');
    var vol11 = document.getElementById('volof1R');

    if (vol11.value == "" || vol.value == "") {
        nobri.value = "";
    }
    else {
        var iu = findvolumeR() / volonebrR();
        nobri.value = parseInt(iu) + " nos";
    }
    var jh = parseInt(iu);
    document.getElementById('nossR').innerHTML = jh;
     document.getElementById('result1').innerHTML = jh + " nos";
    return jh;
}

function volwimorR() {
    var l2 = document.getElementById('lofbriR');
    var b2 = document.getElementById('wofbriR');
    var h2 = document.getElementById('hofbriR');
    var voml = document.getElementById('volwithmorR');
    voml.value = l2.value / 100 * b2.value / 100 * h2.value / 100 + " m³";
    var pp = l2.value / 100 * b2.value / 100 * h2.value / 100;
    return pp;

}
function volwnosR() {
    var nobri = document.getElementById('nobrireqR');
    var nnns = document.getElementById('volwnosssR');
    if (nobri.value == "") {
        nnns.value = "";
    } else {
        var ppoi = reqnumbR() * volwimorR();
        nnns.value = ppoi + " m³";
    }
    return ppoi;
}
function reqamdmR() {
    var lgh = document.getElementById('reqamdR');
    var area = document.getElementById('volumeeR');

    if (area.value == "") {
        lgh.value = "";
    }
    else {
        var muio = findvolumeR() - volwnosR();
        lgh.value = muio + " m³";
    }
    return muio;
}
function reqamdryR() {

    var lg = document.getElementById('reqamdrR');
    var area = document.getElementById('volumeeR');

    if (area.value == "") {
        lg.value = "";
    }
    else {
        var anss = reqamdmR() * 1.33;
        lg.value = anss + " m³"
    }
    return anss;
}

function amdcmqntyvR() {
    var res = document.getElementById('amdcmqntyR');

    var r1 = document.getElementById('ratio1R');
    var r2 = document.getElementById('ratio2R');
    var ratio = r1.value / r1.value + +r2.value;
    var jjnm = parseInt(reqamdryR() * ratio * 1440);

    res.value = jjnm + " kg";
    document.getElementById('result2').innerHTML = jjnm + " kg";
    return jjnm;
}


function cementbagR() {
    var cem = document.getElementById('cementbagrR');
    var aanm = amdcmqntyvR() / 50;
    cem.value = parseInt(aanm) + " bags";
}

function sandqnttyR() {
    var sand = document.getElementById('sandqR');
    var r11 = document.getElementById('ratio1R');
    var r22 = document.getElementById('ratio2R');
    var ratiom = r22.value / r11.value+ +r22.value;
    var jrs = parseInt(reqamdryR() * ratiom);
    sand.value = jrs + " m³";
    document.getElementById('result3').innerHTML = jrs + " m³";
    return jrs;
}

// tile

function findroomarea() {
    var len = document.getElementById('lengthofroom');
    var wid = document.getElementById('widthhofroom');

    var areaofroom = document.getElementById('areaofrr');
    var myarea = len.value * wid.value;
    areaofroom.value = myarea + " m²";
    return myarea;

}


function periofthroom() {
    var door = document.getElementById('lengthofdoor');
    var lenn = document.getElementById('lengthofroom');
    var widd = document.getElementById('widthhofroom');
    var myp = document.getElementById('periofroom');

    var peri = +lenn.value + +widd.value + +lenn.value + +widd.value;
    var pofr = peri - door.value;
    myp.value = pofr + " m";
    return pofr;


}

function aktilearea() {
    var tilearea = document.getElementById('skrtile');
    var theight = document.getElementById('skirtuingt');
    var hhh = theight.value / 39.370;
    var tilee =periofthroom() * hhh;
    tilearea.value = tilee + " m²";
    return tilee;
}

function areatoLaaid(){
    var laid = document.getElementById('areatoLaid');
    var anss = findroomarea() + aktilearea();
    laid.value = anss + " m²";
    return anss;

}
function findtilearea(){
    var tarea = document.getElementById('areaoftilee');
     var tlen = document.getElementById('lengthoftile');
      var twid = document.getElementById('widthhoftile');
      var tarr =tlen.value * twid.value;
      tarea.value = tarr + " m²";
      return tarr;
}
function Reqtilred(){
    var tarea = document.getElementById('areaoftilee');
    var wast = document.getElementById('wastageT');
    var req = document.getElementById('Reqtiles');
    
     var laid = document.getElementById('areatoLaid');
   
    if (tarea.value == "" || laid.value==""|| wast.value=="") {
        req.value="";
    } else {
        var as1 = areatoLaaid() / findtilearea();
        var asn2= as1 * wast.value/100;
        var ans3 = parseInt(as1 + +asn2);
        document.getElementById('result2.5').innerHTML= ans3 + " nos";
        
        
        
    }
    req.value = ans3 + " nos";
}


function findallTile() {
    document.getElementById('coarseaggvv').style.display = "none";
    document.getElementById('watervvu').style.display = "none";
    document.getElementById('cementy').style.display = "none";
    document.getElementById('sanddf').style.display = "none";
    document.getElementById('bricks23').style.display = "none";
    document.getElementById('tilesreqd').style.display = "flex";
    
    findroomarea();
    periofthroom();
    aktilearea();
    areatoLaaid();
    findtilearea();
    Reqtilred()
}

//




// concrete


function volofconck(){
    var len = document.getElementById('lenofconc');
    var wid = document.getElementById('widofconc');
    var heir = document.getElementById('heiofconc');
    var volofc = document.getElementById('volofconc');
    if (len.value==""||wid.value==""||heir.value=="") {
        volofc.value="";
    } else {
        var asnss= len.value*wid.value*heir.value;
        volofc.value = asnss + " m³";
    }
    return asnss;
}



function ratiomix(){

var select = document.getElementById('ratiosel');
var one = document.getElementById('ratioOne');
var two = document.getElementById('ratioTwo');
var three = document.getElementById('ratioThree');

    if (select.value=="M-5") {
        one.value=1;
        two.value=5;
        three.value=10;
    }
    else if (select.value=="M-7.5") {
 one.value = 1;
 two.value = 4;
 three.value = 8;
     }
      else if (select.value == "M-10") {
          one.value = 1;
          two.value = 3;
          three.value = 6;
      }
      else if (select.value == "M-15") {
          one.value = 1;
          two.value = 2;
          three.value = 4;
      }
      else if (select.value == "M-20") {
          one.value = 1;
          two.value = 1.5;
          three.value = 3;
      }
        else if (select.value == "M-25") {
            one.value = 1;
            two.value = 1;
            three.value = 2;
        } else {
        one.value="";
        one.placeholder="Enter";
        two.value = "";
        two.placeholder = "your";
        three.value = "";
        three.placeholder = "ratio";
    }
}

function ratiofind(){
    var one = document.getElementById('ratioOne');
    var two = document.getElementById('ratioTwo');
    var three = document.getElementById('ratioThree');
    
    var finder = +one.value + +two.value + +three.value;

    return finder;
}


function cementquntty(){
var cementq = document.getElementById('ratioOne');
var qqq = document.getElementById('cemntqnty');
var volofc = document.getElementById('volofconc');

if (volofc.value=="" ) {
    qqq.value="";
} else {
    var qwe = cementq.value / ratiofind();
    var oiu = qwe * volofc.value;
    qqq.value = parseInt(oiu) + " m³";
    
    

}
return oiu;
}


function cementbagy(){
    var cemetbreq = document.getElementById('cemntbag');
    var qnyu = document.getElementById('cemntqnty');
    if (qnyu.value=="") {
        cemetbreq.value="";
    } else {
        var qntyans = cementquntty()*1440;
        var asns3 = parseInt(qntyans / 50);
        cemetbreq.value= asns3 + " nos";
        document.getElementById('result2').innerHTML = asns3 + " nos";

    }

}


function sandqntyuio(){
var sandtq = document.getElementById('ratioTwo');
var sa = document.getElementById('sandqntyu');
var volofc = document.getElementById('volofconc');
if (volofc.value=="") {
    sa.value="";
} else {
    var wer = parseInt(sandtq.value / ratiofind() * volofc.value);
    sa.value = wer + " m³";
    document.getElementById('result3').innerHTML = wer + " m³";

}
return wer;
}

function qrseaggrigate(){
    var sandtq = document.getElementById('ratioThree');
    var sa = document.getElementById('qrseagg');
    var volofc = document.getElementById('volofconc');
    if (volofc.value == "") {
        sa.value = "";
    } else {
        var wer = parseInt(sandtq.value / ratiofind() * volofc.value);
        sa.value = wer + " m³";
            document.getElementById('result4').innerHTML = wer + " m³";

    }
    return wer;
}



function wateramd(){
    
    var wateramm = document.getElementById('wateramount');
    var watre = document.getElementById('waterratio');
    var cemm = document.getElementById('ratioOne');

    if (watre.value=="") {
        wateramm.value="";
    } else {
        var snkj = watre.value / cemm.value * cementquntty();
        var sdfg = parseInt(snkj * 1000);
        wateramm.value= sdfg + " litres";
         document.getElementById('result5').innerHTML = sdfg + " litres";
    }
}

function findallconc(){
    document.getElementById('bricks23').style.display = "none";
    document.getElementById('tilesreqd').style.display = "none";
    document.getElementById('coarseaggvv').style.display = "flex";
    document.getElementById('watervvu').style.display = "flex";
    document.getElementById('cementy').style.display = "flex";
    document.getElementById('sanddf').style.display = "flex";

ratiofind();
cementquntty();
 cementbagy();
 sandqntyuio();
 qrseaggrigate();
 
 wateramd();
 
 
 
}


// 

