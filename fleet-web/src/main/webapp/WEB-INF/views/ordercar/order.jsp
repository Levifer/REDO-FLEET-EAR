<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Variables --%>
<spring:url value="/resources/img" var="imgUrl"/>
<spring:url value="/" var="rootUrl"/>

<div class="row">
    <div class="col-md-12"><h2><spring:message code="title.car.order.confirm"/></h2></div>
</div>
<div class="row">
    <div class="col-md-6">
        <img src="${imgUrl}/car/${car.model.imageUrl}" class="img-responsive"/>
    </div>
    <div class="col-md-6">
        <h3>${car.model.brand} ${car.model.name} (${car.model.type})</h3>
        <table class="table">
            <tbody>
                <c:forEach items="${optionList}" var="option">
                    <tr>
                        <td>
                            <c:out value="${option.name}"/>
                        </td>
                        <td>
                            &euro;<c:out value="${option.price}"/>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td><strong><spring:message code="car.pack.price"/></strong></td>
                    <td><strong>&euro;${totalPrice}</strong></td>
                </tr>
            </tbody>
        </table>
        <form:form>
            <a href="${rootUrl}" class="btn btn-danger"><spring:message code="actions.backToIndex" /></a>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </input>
            <spring:message code="actions.confirm" var="confirm"/>
            <input type="submit" value="${confirm}" name="_e ventId_finish"
                   class="btn btn-success pull-right"/>
        </form:form>
    </div>
</div>