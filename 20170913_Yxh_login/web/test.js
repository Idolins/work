function submitForm() {
    var form = document.getElementById("form");
    var userType = document.getElementById("userType");
    var index = userType.selectedIndex;
    var typeValue = userType.options[index].value;
    if (typeValue === "管理员") {
        form.action = "adminLogin.action"
    } else if (typeValue === "普通用户") {
        form.action = "userLogin.action"
    } else {
        alert("未知错误")
    }
    form.submit()
}

var img = document.getElementById("imgCode")

img.onclick = function reload() {
    img.src = "verificationCode.action"
}

