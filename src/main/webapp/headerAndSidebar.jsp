<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
   <!-- logo -->
   <div class="am-fl tpl-header-logo">
       <a href="javascript:;"><span>Dormitory</span></a>
   </div>
   <!-- 右侧内容 -->
   <div class="tpl-header-fluid">
       <!-- 侧边切换 -->
       <div class="am-fl tpl-header-switch-button am-icon-list">
           <span>

       </span>
       </div>
       <!-- 搜索 -->
       <div class="am-fl tpl-header-search">
           <form class="tpl-header-search-form" action="javascript:;">
               <button class="tpl-header-search-btn am-icon-search"></button>
               <input class="tpl-header-search-box" type="text" placeholder="搜索内容...">
           </form>
       </div>
       <!-- 其它功能-->
        <div class="am-fr tpl-header-navbar">
            <ul>
                <!-- 欢迎语 -->
                <li class="am-text-sm tpl-header-navbar-welcome">
                    <a href="javascript:;">欢迎你, <span>${manager.managerName }</span> </a>
                </li>
                <!-- 退出 -->
                <li class="am-text-sm">
                    <a href="javascript:;">
                        <span class="am-icon-sign-out"></span> 退出
                    </a>
                </li>
            </ul>
        </div>
    </div>
</header>
<!-- 风格切换 -->
<div class="tpl-skiner">
    <div class="tpl-skiner-toggle am-icon-cog">
    </div>
    <div class="tpl-skiner-content">
        <div class="tpl-skiner-content-title">
            选择主题
        </div>
        <div class="tpl-skiner-content-bar">
            <span class="skiner-color skiner-white" data-color="theme-white"></span>
            <span class="skiner-color skiner-black" data-color="theme-black"></span>
        </div>
    </div>
</div>
<!-- 侧边导航栏 -->
<div class="left-sidebar">
    <!-- 用户信息 -->
   <!-- div class="tpl-sidebar-user-panel">
       <div class="tpl-user-panel-slide-toggleable">
           <div class="tpl-user-panel-profile-picture">
               <img src="${pageContext.request.contextPath}/assets/img/user04.png" alt="">
           </div>
           <span class="user-panel-logged-in-text">
     <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
	 ${manager.managerName }
	 </span>
           <a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>
       </div>
   </div -->


   <!-- 菜单 -->
    <ul class="sidebar-nav">
        <li class="sidebar-nav-heading">Dormitory <span class="sidebar-nav-heading-info"> 管理</span></li>
        <li class="sidebar-nav-link">
            <a href="${pageContext.request.contextPath}/index.jsp">
                <i class="am-icon-home sidebar-nav-link-logo"></i> 首页
            </a>
        </li>
        <c:forEach varStatus="i" var="moduleClass" items="${moduleForNavList }">
        <li class="sidebar-nav-link">
        <!-- 激活状态class加 active -->
            <a href="javascript:;" class="sidebar-nav-sub-title">
                <i class="am-icon-list sidebar-nav-link-logo"></i> ${moduleClass.moduleClassName }
                <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
            </a>
            <ul class="sidebar-nav sidebar-nav-sub">
            	<c:forEach var="module" items="${moduleClass.moduleList}">
                <li class="sidebar-nav-link">
                    <a href="${pageContext.request.contextPath}${module.moduleUrl}">
                        <span class="am-icon-angle-right sidebar-nav-link-logo"></span> ${module.moduleName }
                    </a>
                </li>
                </c:forEach>
            </ul>
        </li>
        </c:forEach>
    </ul>
</div>