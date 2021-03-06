<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url value="/" var="homeUrl" htmlEscape="true"/>
<h2><spring:message code="error.title"/></h2>

<div class="row">
    <div class="col-md-6">
        <p><spring:message code="error.message"/> <a href="${homeUrl}"><spring:message code="error.link"/></a>...</p>
    </div>
    <div class="col-md-6">
        <p><img src="<%=request.getContextPath() %>/resources/img/other/flintstone.jpg" class="img-responsive"
                alt="flintstones!"/>
    </div>
</div>