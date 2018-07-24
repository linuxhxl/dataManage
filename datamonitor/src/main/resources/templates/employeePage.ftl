<!DOCTYPE html>
<html>
<head lang="en">
    <title>FreeMarker</title>
<#include "comm/common.ftl"/>
    <link href="/css/index.css" rel="stylesheet" />

</head>
<body>
<center>
    <h1 id="title">员工列表页面</h1>
</center>

<div class="panel panel-default" style="margin-top: 20px;">
    <div class="panel-heading">
        员工信息
    </div>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>员工id</th>
            <th>员工姓名</th>
        </tr>
        </thead>
        <tbody>
        <#list pageInfo.list as item>
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
        </tr>
        </#list>
        </tbody>
    </table>
    <div style="text-align: center;">
        <span>当前页:${pageInfo.pageNum}&nbsp;&nbsp;</span><span>每页显示:${pageInfo.pageSize}&nbsp;&nbsp;</span>
        <span>尾页:${pageInfo.lastPage}&nbsp;&nbsp;</span><span>总记录:${pageInfo.total}&nbsp;&nbsp;</span>
    </div>
</div>

<script>
</script>
</body>
</html>
