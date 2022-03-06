//当鼠标悬浮时，显示背景颜色
function showBGColor(){
    //alert(event.srcElement);    ---->[object HTMLTableCellElement]
    //alert(event.srcElement.tagName); ---->TD
    if(event && event.srcElement && event.srcElement.tagName == "TD"){
        var td = event.srcElement;
        var tr = td.parentElement;
        tr.style.background = "navy";
        var tds = tr.cells;
        for(var i = 0;i < tds.length;i++){
            tds[i].style.color = "white";
        }
    }
}
//当鼠标离开时，恢复原始样式
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
//当鼠标悬浮在单价单元格时，显示手势
function hand() {
    if(event && event.srcElement && event.srcElement.tagName == "TD"){
        var td = event.srcElement;
        //cursor : 光标
        td.style.cursor = "hand";
    }
}