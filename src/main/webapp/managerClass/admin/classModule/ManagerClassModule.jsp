<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>管理员类别模块管理</title>
    <meta name="description" content="管理员类别模块管理">
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
                        <div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> Dormitory <small>管理员类</small></div>
                        <p class="page-header-description">${managerClass.managerClassName } 可以使用的模块</p>
                    </div>


                            </div>
                            <div class="widget-body  am-fr">
                                <form class="am-form tpl-form-line-form" action="${pageContext.request.contextPath}/managerClass/saveClassModule.action" method="post" id="changeForm">
                                <input name="managerClassId" type="hidden" value="${managerClass.managerClassId }" />
                                <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                    <div class="am-form-group">
                                        <div class="am-btn-toolbar">
                                            <div class="am-btn-group am-btn-group-xs">
                                                <label for="user-name" class="am-u-sm-3 am-form-label">添加</label>
                                                <div class="am-u-sm-9">
                                                    <select data-am-selected="{searchBox: 1}" style="display: none;" name="moduleId">
                                                      <c:forEach var="module" items="${moduleList }">
                                                            <option value="${module.moduleId }">${module.moduleName }</option>
                                                        </c:forEach>
                                                    </select>
                                                    <input type="submit" value="添加">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                </form>

                                <div class="am-u-sm-12">
                                    <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
                                        <thead>
                                            <tr>
                                                <th>模块名</th>
                                                <th>编辑</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach  varStatus="i" var="maclassModuleCustom" items="${maclassModuleCustomList }">
                                            <tr class="gradeX">
                                                <td>${maclassModuleCustom.moduleName }</td>
                                                <td>
                                                    <div class="tpl-table-black-operation">
                                                        <a href="${pageContext.request.contextPath}/managerClass/removeClassModule.action?mmId=${maclassModuleCustom.mmId }">
                                                            <i class="am-icon-pencil"></i> 删除
                                                        </a>
                                                    </div>
                                                </td>
                                            </tr>
                                            </c:forEach>
                                            <!-- more data -->
                                        </tbody>
                                    </table>
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