function submitForm() {
    var form = document.getElementById("form");
    var userType = document.getElementById("userType");
    var index = userType.selectedIndex;
    var typeValue = userType.options[index].value;
    if (typeValue === "管理员") {
        form.action = "admin/login.action"
    } else if (typeValue === "普通用户") {
        form.action = "user/login.action"
    } else {
        alert("未知错误")
    }
    form.submit()
}