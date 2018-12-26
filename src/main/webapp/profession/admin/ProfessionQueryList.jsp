<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>专业列表</title>
    <meta name="description" content="专业列表">
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
            <div class="row-content am-cf">
                <div class="row">
                    <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                        <div class="widget am-cf">
                            <div class="widget-head am-cf">
                               <div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
                        <div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> Dormitory <small>学院</small></div>
                    </div>


                            </div>
                            <div class="widget-body  am-fr">

                                <div class="am-u-sm-12">
                                    <table width="100%" class="am-table am-table-striped am-table-bordered am-table-compact " id="example">
                                        <thead>
                                            <tr>
                                                <th>专业ID</th>
                                                <th>专业名称</th>
                                                <th>所属学院</th>
                                                <th>联系人</th>
                                                <th>编辑</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach  varStatus="i" var="professionCustom" items="${professionList }">
                                            <tr class="gradeX">
                                                <td>${professionCustom.professionId }</td>
                                                <td>${professionCustom.professionName }</td>
                                                <td>${professionCustom.collegeName }</td>
                                                <td>${professionCustom.professionLinkman }</td>
                                                <td>
                                                    <div class="tpl-table-black-operation">
                                                        <a href="${pageContext.request.contextPath}/profession/findProfessionInfo.action?professionId=${professionCustom.professionId }">
                                                            <i class="am-icon-pencil"></i> 详细信息
                                                        </a>
                                                    </div>
                                                </td>
                                            </tr>
                                            </c:forEach>
                                            <!-- more data -->
                                        </tbody>
                                    </table>
                                </div>
                                <%--<div class="am-u-lg-12 am-cf">

                                    <div class="am-fr">
                                        <ul class="am-pagination tpl-pagination">
                                            <li class="am-disabled"><a href="#">«</a></li>
                                            <li class="am-active"><a href="#">1</a></li>
                                            <li><a href="#">2</a></li>
                                            <li><a href="#">3</a></li>
                                            <li><a href="#">4</a></li>
                                            <li><a href="#">5</a></li>
                                            <li><a href="#">»</a></li>
                                        </ul>
                                    </div>
                                </div>--%>
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
<script>
    $(function() {
        $('#example').DataTable();
        $('.am-form-select').css({"background-color": "#000000","color": "#FFFFFF"});
    });
</script>
</body>

</html>