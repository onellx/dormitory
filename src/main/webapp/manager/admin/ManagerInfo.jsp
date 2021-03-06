<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>账号信息</title>
    <meta name="description" content="账号信息">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/assets/i/app-icon72x72@2x.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/app.css">
    <script src="${pageContext.request.contextPath}/assets/js/echarts.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
</head>

<body data-type="widgets">
    <script src="${pageContext.request.contextPath}/assets/js/theme.js"></script>
    <div class="am-g tpl-g">
        <!-- 头部 -->
        <jsp:include page="/headerAndSidebar.jsp" />
        <!-- 内容区域 -->
        <div class="tpl-content-wrapper">
        	<div class="container-fluid am-cf">
                <div class="row">
                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
                        <div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> Dormitory <small>管理员</small></div>
                        <p class="page-header-description">管理员信息</p>
                    </div>
                </div>

            </div>
            
            <div class="row-content am-cf">

                <div class="row">

                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                        <div class="widget am-cf">
                            <div class="widget-head am-cf">
                                <div class="widget-title am-fl">帐号信息</div>
                                <div class="widget-function am-fr">
                                    <a href="javascript:;" class="am-icon-cog"></a>
                                </div>
                            </div>
                            <div class="widget-body am-fr">

								<div class="am-form tpl-form-line-form">
					
	                                <div class="am-form-group">
	                                    <label class="am-u-sm-3 am-form-label">管理员编号 <span class="tpl-form-line-small-title">ID</span></label>
	                                    <div class="am-u-sm-9">
	                                     <small>${managerCustom.managerId }</small>
	                                    </div>
	                                </div>
	
	                                <div class="am-form-group">
	                                    <label class="am-u-sm-3 am-form-label">管理员姓名 <span class="tpl-form-line-small-title">Name</span></label>
	                                    <div class="am-u-sm-9">
	                                        <small>${managerCustom.managerName }</small>
	                                    </div>
	                                </div>
	
	                                <div class="am-form-group">
	                                    <label class="am-u-sm-3 am-form-label">管理员类别 <span class="tpl-form-line-small-title">Class</span></label>
	                                    <div class="am-u-sm-9">
	                                        <small>${managerCustom.managerClass.managerClassName }</small>
	                                    </div>
	                                </div>
	
	                                <!-- div class="am-form-group">
	                                    <label class="am-u-sm-3 am-form-label">管理项 <span class="tpl-form-line-small-title">Option</span></label>
	                                    <div class="am-u-sm-9">
	                                        <small></small>
	                                    </div>
	                                </div -->
	
	                                <div class="am-form-group">
	                                    <label class="am-u-sm-3 am-form-label">账号状态 <span class="tpl-form-line-small-title">State</span></label>
	                                    <div class="am-u-sm-9">
	                                        <small>${managerCustom.managerState }</small>
	                                    </div>
	                                </div>
	
	                                <div class="am-form-group">
	                                    <div class="am-u-sm-9 am-u-sm-push-3">
	                                        <button type="button" class="am-btn am-btn-primary tpl-btn-bg-color-success " onclick="javascript:window.location='${pageContext.request.contextPath}/manager/infoToUpdate.action?managerId=${managerCustom.managerId }'">修改</button>
	                                    </div>
	                                </div>
	                            </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/amazeui.datatables.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/dataTables.responsive.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/app.js"></script>
    
</body>

</html>