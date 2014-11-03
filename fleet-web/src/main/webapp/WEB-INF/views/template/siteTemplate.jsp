<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="root"/>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title" /></title>
        <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap.css" rel="stylesheet"/>
        <link type="text/css" href="<%=request.getContextPath() %>/resources/css/style.css" rel="stylesheet"/>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
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
                        <tiles:insertAttribute name="menu-left" />
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <!-- Menu Page -->
                        <tiles:insertAttribute name="menu-right" />
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <div class="container">
            <!-- Body Page -->
            <tiles:insertAttribute name="body" />
        </div>
        <!--<script type="application/javascript" src="<%=request.getContextPath() %>/resources/js/jquery-2.1.1.min.js"></script>
        <script type="application/javascript" src="<%=request.getContextPath() %>/resources/js/bootstrap.js"></script>-->
    </body>
</html>