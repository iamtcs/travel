$(function () {
    $.get("header.html",function (data) {
        //alert(data);
        $("#header").html(data);
    });
    $.get("footer.html",function (data) {
        $("#footer").html(data);
    });
});