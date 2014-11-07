<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%-- Variables --%>
<spring:url value="/" var="root"/>

<%-- Page --%>
<li class="active"><a href="${root}"><spring:message code="menu.home"/></a></li>
<li><a href="${root}car"><spring:message code="menu.browse"/></a></li>