<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>AggregationNews后台管理首页 - ${SITE_NAME} - AggregationNews后台管理系统</title>
    <meta name="keywords" content="${SITE_KEYS}"/>
    <meta name="description" content="${SITE_DESCRIPTION}"/>
    <meta name="author" content="Lina"/>
    <link href="${basePath}/res/common/css/bootstrap.min.css" rel="stylesheet">
    <link href="${basePath}/res/common/css/font-awesome.min.css" rel="stylesheet">
    <link href="${basePath}/res/manage/css/AdminLTE.css" rel="stylesheet">
    <link href="${basePath}/res/manage/css/skins/_all-skins.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="${basePath}/res/common/js/html5shiv.min.js"></script>
    <script src="${basePath}/res/common/js/respond.min.js"></script>
    <![endif]-->
    <script src="${basePath}/res/common/js/jquery-2.1.1.min.js"></script>
    <script src="${basePath}/res/common/js/bootstrap.min.js"></script>
    <script src="${basePath}/res/plugins/layer/layer.js"></script>
    <script src="${basePath}/res/manage/js/app.js"></script>
    <script src="${basePath}/res/common/js/jeesns.js?v1.4"></script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
<#include "/manage/common/header.ftl"/>
    <div class="content-wrapper">
        <section class="content">
            <div class="box-body">
                <div class="row">
                    <div class="alert alert-info alert-dismissible">
                        感谢您使用AggreationNews新闻聚合
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="box box-primary">
                        <div class="box-body">
                            <p>
                                感谢您使用AggreationNews新闻聚合。
                            </p>
                            <p>

                            </p>
                        </div>
                    </div>
                </div>

            </div>
            <div class="row">
                <div class="col-md-8">
                    <div class="box box-primary">
                        <div class="box-body">
                            <div class="col-sm-6">
                                <p>JAVA版本:${javaVersion}</p>
                                <p>MYSQL版本:${mysqlVersion}</p>
                                <p>WEB服务器:${webVersion}</p>
                                <p>CPU个数:${cpu}</p>
                                <p>虚拟机内存总量:${totalMemory}</p>
                                <p>虚拟机空闲内存量:${freeMemory}</p>
                                <p>虚拟机使用的最大内存量:${maxMemory}</p>
                            </div>
                            <div class="col-sm-6">
                                <p>客户端IP:${clientIP}</p>
                                <p>服务器IP:${serverIP}</p>
                                <p>操作系统:${osName}</p>
                                <p>用户主目录:${userHome}</p>
                                <p>工作目录:${userDir}</p>
                                <p>系统目录:${webRootPath}</p>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </section>
    </div>
<#include "/manage/common/footer.ftl"/>
</div>
<script>
    $(document).ready(function () {
        $.getJSON("http://www.jeesns.cn/newVersion?callback=?", function(result){
            $(".lastSystemVersion").html(result.LAST_SYSTEM_VERSION);
            $(".lastSystemUpdateTime").html(result.LAST_SYSTEM_UPDATE_TIME);
        });
    });
</script>
</body>
</html>
