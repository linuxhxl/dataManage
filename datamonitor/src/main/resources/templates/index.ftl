<!DOCTYPE html>
<html>
<head lang="en">
    <title>FreeMarker</title>
<#include "comm/common.ftl"/>
    <link href="/css/index.css" rel="stylesheet" />

</head>
<body>
<center>
    <h1 id="title">欢饮您:${user.username} 登录成功</h1>
</center>
<center>
    <a type="button" class="btn btn-success" href="/employee/employee">查看公司员工信息</a>
</center>
<center>
    <a type="button" class="btn btn-success" href="/employee/page">分页查看公司员工信息</a>
</center>
<script>
    $(function(){
    })
</script>
</body>
</html>
