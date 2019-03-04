<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${GROUP_ALIAS} - ${SITE_NAME}</title>
    <meta name="keywords" content="${SITE_KEYS}"/>
    <meta name="description" content="${SITE_DESCRIPTION}"/>
    <meta name="author" content="Lina"/>
    <link href="${basePath}/res/common/css/zui.min.css" rel="stylesheet">
    <link href="${basePath}/res/front/css/app.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="${basePath}/res/common/js/html5shiv.min.js"></script>
    <script src="${basePath}/res/common/js/respond.min.js"></script>
    <![endif]-->
    <script src="${basePath}/res/common/js/jquery-2.1.1.min.js"></script>
    <script src="${basePath}/res/common/js/zui.min.js"></script>
    <script src="${basePath}/res/plugins/layer/layer.js"></script>
    <script src="${basePath}/res/common/js/jquery.form.js"></script>
    <script src="${basePath}/res/common/js/jeesns.js?v1.4"></script>
    <script src="${basePath}/res/common/js/extendPagination.js"></script>
</head>
<body class="gray-bg">
<#include "/${frontTemplate}/common/header.ftl"/>

<div class="container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-8 col-xs-12">
                <div class="items white-bg">
                    <#list model.data as article>
                        <div class="item">
                            <div class="item-content article">
                                <div class="item-heading">
                                    <h3><a class="title" href="${basePath}/article/detail/${article.id}">${article.title}</a></h3>
                                </div>
                                <div class="text word-break">
                                    ${article.description}
                                </div>
                                <div class="item-footer">
                                    <i class="icon-eye-open"></i> ${article.viewCount} &nbsp;
                                    <span class="text-muted">${article.publishedAt}</span>
                                    <a href="${basePath}/article/list?cid=${article.articleCate.id}">
                                        <div class="pull-right label label-success">
                                            ${article.articleCate.name}
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </#list>
                    <ul class="pager pagination pagination-sm no-margin pull-right">
                        url="${basePath}/article/list?key="
                        currentPage="${model.page.pageNo}"
                        pageCount="${model.page.totalPage}">
                    </ul>
                </div>
            </div>

        <#--搜索功能-->
            <div class="col-sm-4 col-xs-12">
                <form action="/group/list" method="get">
                    <div class="input-group">
                        <input type="text" class="form-control" name="key">
                        <span class="input-group-btn">
                            <button class="btn btn-success" type="submit"><i class="icon-search"></i></button>
                        </span>
                    </div>
                </form>
            </div>

        </div>
        <#--<div class="col-sm-12 col-xs-12">-->
            <#--<@group_type_list>-->
                <#--<#list groupTypeList as groupType>-->
            <#--<div class="row white-bg group-list">-->
                <#--<div class="panel-heading" style="margin-bottom: 30px">-->
                    <#--${groupType.name}-->
                    <#--<#if groupType_index == 0>-->
                        <#--<span class="pull-right">-->
                            <#--<a class="btn btn-primary right-btn m-t-n4" href="${groupPath}/apply">申请群组</a>-->
                        <#--</span>-->
                    <#--</#if>-->
                <#--</div>-->
                <#--<#list list as group>-->
                <#--<#if group.typeId == groupType.id>-->
                <#--<div class="col-sm-3 col-xs-12">-->
                    <#--<div class="group-detail">-->
                        <#--<div class="group-logo">-->
                            <#--<a href="${groupPath}/detail/${group.id}">-->
                                <#--<img class="img-rounded" src="${basePath}${group.logo}" width="100px" height="100px">-->
                            <#--</a>-->
                        <#--</div>-->
                        <#--<div class="group-info">-->
                            <#--<h4><strong><a href="${groupPath}/detail/${group.id}">-->
                                <#--${group.name} ${(group.followPay == 0)?string('','<span class="label label-danger">付费</span>')}-->
                            <#--</a></strong></h4>-->
                            <#--<p class="text-muted" title="${group.introduce}">-->
                                <#--<#if group.introduce?length &gt; 50>-->
                                    <#--${group.introduce?substring(0,50)}...-->
                                <#--<#else>-->
                                    <#--${group.introduce}-->
                                <#--</#if>-->
                            <#--</p>-->
                            <#--<small class="text-muted">${group.topicCount}篇文章 · ${group.fansCount}人加入</small>-->
                        <#--</div>-->
                    <#--</div>-->
                <#--</div>-->
                <#--</#if>-->
                <#--</#list>-->
            <#--</div>-->
            <#--</#list>-->
            <#--</@group_type_list>-->
        <#--</div>-->
    </div>
</div>
<#include "/${frontTemplate}/common/footer.ftl"/>
<script type="text/javascript">
    $(function () {
        $(".pagination").jeesns_page("jeesnsPageForm");
    });
</script>
</body>
</html>