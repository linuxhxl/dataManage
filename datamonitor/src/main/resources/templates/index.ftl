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

<script>
    $(function(){
        $('#title').click(function(){
            alert('点击了');
        });
    })
</script>
</body>
</html>
