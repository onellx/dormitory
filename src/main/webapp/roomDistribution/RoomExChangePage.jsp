<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>换寝室</title>
    <meta name="description" content="换寝室">
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
                        <div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> Dormitory <small>换寝室</small></div>
                        <p class="page-header-description">双人互换</p>
                    </div>


                            </div>
                            <form class="am-form tpl-form-line-form" action="${pageContext.request.contextPath}/roomDistribution/roomExChange.action" method="post">
                            <div class="widget-body  am-fr">

                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                        <div class="am-form-group">
                                            <div class="am-btn-toolbar">
                                                <div class="am-btn-group am-btn-group-xs">
                                                    <div class="am-u-sm-9">
                                                    <input type="submit" class="tpl-form-input" value="确定互换">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                <div class="am-u-sm-12">
                                    <table width="100%" class="am-table am-table-striped am-table-bordered am-table-compact " id="example">
                                        <thead>
                                            <tr>
                                                <th>选定</th>
                                                <th>学号</th>
                                                <th>姓名</th>
                                                <th>性别</th>
                                                <th>专业</th>
                                                <th>宿舍楼</th>
                                                <th>宿舍</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach  varStatus="i" var="student" items="${studentList }">
                                            <tr class="gradeX">
                                                <td><input type="checkbox" name="studentIds" value="${student.studentId }"/></td>
                                                <td>${student.studentNo }</td>
                                                <td>${student.studentName }</td>
                                                <td>${student.studentSex }</td>
                                                <td>${student.professionInfo.professionName }</td>
                                                <td>${student.dormInfo.dormName }</td>
                                                <td>${student.dormroomInfo.roomNum }</td>
                                            </tr>
                                            </c:forEach>
                                            <!-- more data -->
                                        </tbody>
                                    </table>
                                </div>

                               <%-- <div class="am-u-lg-12 am-cf">

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
                            </form>
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