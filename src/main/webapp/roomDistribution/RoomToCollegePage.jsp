<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>分配寝室给学院</title>
    <meta name="description" content="分配寝室给学院">
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
                            <form class="am-form tpl-form-line-form" action="${pageContext.request.contextPath}/roomDistribution/roomToCollege.action" method="post" id="queryform">
                            <div class="widget-body  am-fr">

                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                    <div class="am-form-group">
                                        <div class="am-btn-toolbar">
                                            <div class="am-btn-group am-btn-group-xs">
                                                <label for="user-name" class="am-u-sm-3 am-form-label">分配给</label>
                                                <div class="am-u-sm-9">
                                                    <select data-am-selected="{searchBox: 1}" style="display: none;" name="collegeId" id="collegeId">
                                                        <c:forEach var="college" items="${collegeList }">
                                                        <option value="${college.collegeId }">${college.collegeName }</option>
                                                        </c:forEach>
                                                    </select>
                                                    <input type="submit" class="am-btn am-btn-primary tpl-btn-bg-color-success " value="分配"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%--这里是新加的--%>
                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                    <div class="am-form-group">
                                        <div class="am-btn-toolbar">
                                            <div class="am-btn-group am-btn-group-xs">
                                                <label for="user-name" class="am-u-sm-3 am-form-label">宿舍楼</label>
                                                <div class="am-u-sm-9">
                                                    <select data-am-selected="{searchBox: 1}" style="display: none;" name="dormId" id="dormId" onchange="selectOnchang(this);">
                                                        <c:if test="${dromId eq '0'}">
                                                            <option value="0" selected>全部分类</option>
                                                        </c:if>
                                                        <c:if test="${dromId ne '0'}">
                                                            <option value="0">全部分类</option>
                                                        </c:if>
                                                        <c:forEach var="drom" items="${dormList }">
                                                            <c:if test="${dromId eq drom.dormId}">
                                                            <option value="${drom.dormId }" selected>${drom.dormName }</option>
                                                             </c:if>
                                                            <c:if test="${dromId ne drom.dormId}">
                                                                <option value="${drom.dormId }">${drom.dormName }</option>
                                                            </c:if>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%--这里结束--%>
                                <div class="am-u-sm-12">
                                    <table width="100%" class="am-table am-table-striped am-table-bordered am-table-compact " id="example">
                                        <thead>
                                            <tr>
                                                <th>选定</th>
                                                <th>房间号</th>
                                                <th>床位总数</th>
                                                <th>已分配床位数</th>
                                                <th>所属学院（为空代表未分配）</th>

                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach  varStatus="i" var="dormroom" items="${dormCustom.dormRoomList }">
                                            <tr>
                                                <td><input type="checkbox" name="roomIds" value="${dormroom.roomId }"/></td>
                                                <td>${dormroom.roomNum }</td>
                                                <td>${dormroom.roomBeds }</td>
                                                <td>${dormroom.roomAssignbeds }</td>
                                                <td>
                                                <c:forEach var="college" items="${dormroom.collegeList }">
                                                ${college.collegeName }
                                                </c:forEach>
                                                </td>
                                            </tr>
                                            </c:forEach>

                                            <!-- more data -->
                                        </tbody>
                                    </table>
                                </div>

                               
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
    <%--这里开始--%>
    <script type="text/javascript">

        function selectOnchang(obj){
            var value = obj.options[obj.selectedIndex].value;
            $.ajax({
                type: 'GET',
                url: '../roomDistribution/roomToCollegePage.action?dromId='+value,
                success: function(data){
                    window.location.href="../roomDistribution/roomToCollegePage.action?dromId="+value;
                },
                error:function(data) {
                    console.log(data.msg);
                }
            });
        }
    </script>
    <%--这里结束--%>
</body>

</html>