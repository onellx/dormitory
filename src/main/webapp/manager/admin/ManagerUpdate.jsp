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
                        <p class="page-header-description">修改信息</p>
                    </div>
                </div>

            </div>

            <div class="row-content am-cf">


                <div class="row">

                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                        <div class="widget am-cf">
                            <div class="widget-head am-cf">
                                <div class="widget-title am-fl">修改信息</div>
                                <div class="widget-function am-fr">
                                    <a href="javascript:;" class="am-icon-cog"></a>
                                </div>
                            </div>
                            <div class="widget-body am-fr">

                                <form class="am-form tpl-form-border-form tpl-form-border-br" action="${pageContext.request.contextPath}/manager/managerUpdate.action" method="post">

									<div class="am-form-group">
                                        <label for="user-name" class="am-u-sm-3 am-form-label">编号 <span class="tpl-form-line-small-title">Id</span></label>
                                        <div class="am-u-sm-9">
                                            <input type="hidden" name="managerId" value="${managerCustom.managerId }">
                                            <small>${managerCustom.managerId }</small>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="user-name" class="am-u-sm-3 am-form-label">姓名 <span class="tpl-form-line-small-title">Name</span></label>
                                        <div class="am-u-sm-9">
                                            <input type="text" class="tpl-form-input" id="user-name" name="managerName" value="${managerCustom.managerName }">
                                            <small>请填写账号姓名5-20字左右。</small>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="user-phone" class="am-u-sm-3 am-form-label">类别 <span class="tpl-form-line-small-title">Class</span></label>
                                        <div class="am-u-sm-9">
                                            <select data-am-selected="{searchBox: 1}" style="display: none;" name="managerClassId">
											  <c:forEach  varStatus="i" var="ManagerClass" items="${managerClassList }">
											  	<c:choose>
											  		<c:when test="${managerCustom.managerClassId == ManagerClass.managerClassId }">
											  			<option selected="selected" value="${ManagerClass.managerClassId }">${ManagerClass.managerClassName }</option>
											  		</c:when>
											  		<c:otherwise>
											  			<option value="${ManagerClass.managerClassId }">${ManagerClass.managerClassName }</option>
											  		</c:otherwise>
											  	</c:choose>
											  </c:forEach>
											</select>
                                        </div>
                                    </div>

                                    <div class="am-form-group">
                                        <label for="user-name" class="am-u-sm-3 am-form-label">状态 <span class="tpl-form-line-small-title">State</span></label>
                                        <div class="am-u-sm-9">
                                            <select data-am-selected="{searchBox: 1}" style="display: none;" name="managerState">
                                            	<c:choose>
                                            		<c:when test="${managerCustom.managerState == 1 }">
                                            			<option selected="selected" value="1">可用</option>
                                            			<option value="0">不可用</option>
                                            		</c:when>
                                            		<c:otherwise>
                                            			<option value="1">可用</option>
                                            			<option selected="selected" value="0">不可用</option>
                                            		</c:otherwise>
                                            	</c:choose>
											  
											  
											</select>
                                        </div>
                                    </div>
                                    

                                    <div class="am-form-group">
                                        <div class="am-u-sm-9 am-u-sm-push-3">
                                            <input type="submit" class="am-btn am-btn-primary tpl-btn-bg-color-success " value="提交" />
                                        </div>
                                    </div>
                                </form>
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