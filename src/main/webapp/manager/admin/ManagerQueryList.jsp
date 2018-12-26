<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>管理员列表</title>
    <meta name="description" content="管理员列表">
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
                        <div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> Dormitory <small>管理员列表</small></div>
                        <p class="page-header-description">在这里你可以管理其他管理员</p>
                    </div>


                            </div>
                            <div class="widget-body  am-fr">

                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                    <div class="am-form-group">
                                        <div class="am-btn-toolbar">
                                            <div class="am-btn-group am-btn-group-xs">
                                                <button type="button" class="am-btn am-btn-default am-btn-success" onclick="javascript:window.location='${pageContext.request.contextPath}/manager/managerToSave.action'"><span class="am-icon-plus"></span> 新增</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                    <div class="am-form-group tpl-table-list-select">
	                                    <form id="queryForm" action="${pageContext.request.contextPath}/manager/managerList.action" method="post">
	                                    	<select data-am-selected="{btnSize: 'sm'}" name="managerClass.managerClassId" id="managerClassId">
									           <option value="0">所有类别</option>
									           <c:forEach var="managerClass" items="${managerClasslist }">
									           <c:choose>
									               <c:when test="${managerQueryVo.managerClass.managerClassId == managerClass.managerClassId }">
									                   <option selected="selected" value="${managerClass.managerClassId }">${managerClass.managerClassName }</option>
									               </c:when>
									               <c:otherwise>
									                   <option value="${managerClass.managerClassId }">${managerClass.managerClassName }</option>
									               </c:otherwise>
									           </c:choose>
									           </c:forEach>
									        </select>
	                                    </form>
                                    </div>
                                </div>
                                <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                    <div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
                                        <input type="text" class="am-form-field ">
                                        <span class="am-input-group-btn">
            <button class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search" type="button"></button>
          </span>
                                    </div>
                                </div>

                                <div class="am-u-sm-12">
                                    <table width="100%" class="am-table am-table-striped am-table-bordered am-table-compact" id="example">
                                        <thead>
                                            <tr>
                                                <th>管理员ID</th>
                                                <th>管理员名</th>
                                                <th>管理员类别</th>
                                                <th>管理员状态</th>
                                                <th>操作</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach  varStatus="i" var="ManagerCustom" items="${Managerlist }">
                                            <tr class="gradeX">
                                                <td>${ManagerCustom.managerId }</td>
                                                <td>${ManagerCustom.managerName }</td>
                                                <td>${ManagerCustom.managerClass.managerClassName }</td>
                                                <td>${ManagerCustom.managerState }</td>
                                                <td>
                                                    <div class="tpl-table-black-operation">
                                                        <a href="${pageContext.request.contextPath}/manager/findManagerInfo.action?managerId=${ManagerCustom.managerId }">
                                                            <i class="am-icon-pencil"></i> 详细信息
                                                        </a>
                                                        <a href="javascript:;" class="tpl-table-black-operation-del">
                                                            <i class="am-icon-trash"></i> 删除
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
    
    <script type="text/javascript">
        $(function() {
            $('#example').DataTable();
            $('.am-form-select').css({"background-color": "#000000","color": "#FFFFFF"});
        });
	$("#managerClassId").change(function() {
		$("#queryForm").submit();
	});
	
    </script>

</body>

</html>