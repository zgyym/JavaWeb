window.onload=function(){
    var fruitTbl = document.getElementById("table_fruit");
    var rows = fruitTbl.rows;
    for (var i = 0; i < rows.length; i++) {
        var tr = rows[i]
        tr.onmouseover=showBGColor;
        tr.onmouseout=clearBGColor;
        var cells = tr.cells;
        var priceTD = cells[1];
        priceTD.onmouseover = showHand ;
    }
}


function showBGColor() {
    if(event && event.srcElement && event.srcElement.tagName){
        var td = event.srcElement;
        var tr = td.parentElement;
        tr.style.backgroundColor = "navy";
        var tds = tr.cells;
        for (var i = 0; i < tds.length; i++) {
            tds[i].style.color = "white";
        }
    }
}
function clearBGColor(){
    if(event && event.srcElement && event.srcElement.tagName == "TD"){
        var td = event.srcElement;
        var tr = td.parentElement;
        tr.style.backgroundColor = "transparent";
        var tds = tr.cells;
        for (var i = 0; i < tds.length; i++) {
            tds[i].style.color = "threeddarkshadow";
        }
    }
}

function showHand() {
    if(event && event.srcElement && event.srcElement.tagName){
        var td = event.srcElement;
        td.style.cursor = "hand";

    }
}