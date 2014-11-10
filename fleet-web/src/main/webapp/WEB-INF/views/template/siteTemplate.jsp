<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:url value="/" var="root"/>
<c:set var="titleKey">
    <tiles:insertAttribute name="title" ignore="true"/>
</c:set>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><spring:message code="${titleKey}"/></title>
        <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap.css" rel="stylesheet"/>
        <link type="text/css" href="<%=request.getContextPath() %>/resources/css/style.css" rel="stylesheet"/>
        <script type="application/javascript"
                src="<%=request.getContextPath() %>/resources/js/jquery-2.1.1.min.js"></script>
        <script type="application/javascript" src="<%=request.getContextPath() %>/resources/js/bootstrap.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"
                            aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                    <a class="navbar-brand" href="${root}" target="_self"><spring:message code="app.title"/></a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <!-- Menu Page -->
                        <tiles:insertAttribute name="menu-left"/>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <!-- Menu Page -->
                        <tiles:insertAttribute name="menu-right"/>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </nav>
        <div class="container">
            <!-- Body Page -->
            <tiles:insertAttribute name="body"/>
        </div>
    </body>
</html>