<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<spring:url value="/car/detail" var="url"/>
<spring:url value="/resources/img" var="imgUrl"/>
<div class="row">
    <div class="col-sm-12"><h2>${carModel.brand} ${carModel.name} (${carModel.year.year})</h2></div>
</div>
<div class="row">
    <div class="col-sm-3 col-xs-6">
        <img src="${imgUrl}/car/${carModel.imageUrl}"
             class="img-responsive"/>
        <img src="${imgUrl}/logo/${fn:toLowerCase(carModel.brand)}.png"
             class="img-responsive"/>
    </div>
    <div class="col-sm-8">
        <h2><spring:message code="car.pack.options"/></h2>
        <form:form  commandName="options" method="post" action="${url}" >
            <table class="table">
                <tbody>
                    <c:forEach items="${customOptions}" var="option">
                    <tr>
                        <td>
                        <form:checkbox path="items" value="${option.OPTIONID}" label=" ${option.name} - ${option.price} EUR"/><br/>
                            <c:out value="${option.description}"/>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <spring:message code="actions.order" var="orderBtn"/>
            <input type="submit" value="${orderBtn}" class="btn btn-primary pull-right"/>
        </form:form>
    </div>
</div>