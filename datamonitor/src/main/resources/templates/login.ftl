<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <#include "comm/common.ftl"/>
    <meta charset="UTF-8">
    <title>登录</title>
    <style>
        html, body {
            height: 100%;
        }
        /*背景渐变*/
        body {
            background: -webkit-linear-gradient(left top, tomato, blue);
            background: -o-linear-gradient(bottom right, tomato, blue);
            background: -moz-linear-gradient(bottom right, tomato, blue);
            background: linear-gradient(to bottom right, tomato, blue);
        }
    </style>
</head>
<body>
<div class="container">
    <div class="col-md-4 col-md-offset-4" style="margin-top: 15%;">
        <h2 class="text-center" style="color: white"><strong>Pre - Processor</strong></h2>
        <br>
        <form action="${basePath}/login"  method="post" >
            <div class="input-group  input-group-lg">
                <span class="input-group-addon"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></span>
                <input type="text" class="form-control" name="username" placeholder="Username" onkeyup="value=value.replace(/[\W]/g,'')" maxlength="12" required value="admin">
            </div>
            <br>
            <div class="input-group  input-group-lg">
                <span class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true"></span></span>
                <input type="password" class="form-control" name="password" placeholder="Password" onkeyup="value=value.replace(/[\W]/g,'')" maxlength="18" required value="123456">
            </div>
            <br>
            <div>
                <button type="submit" class="btn btn-primary btn-lg btn-block">登&nbsp;&nbsp;入</button>
            </div>
        </form>
        <br>
        <br>
        <p class="text-center" style="color: white">Copyright &copy; 2018 云南能管科技有限公司</p>
    </div>
</div>

</body>
</html>