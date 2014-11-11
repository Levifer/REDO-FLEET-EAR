<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<spring:url value="/car/detail" var="url"/>
<div class="row">
    <div class="col-sm-12"><h2>${carModel.brand} ${carModel.name} (${carModel.year.year}")</h2></div>
</div>
<div class="row">
    <div class="col-sm-3 col-xs-6">
        <img src="<%=request.getContextPath() %>/resources/img/logo/${fn:toLowerCase(carModel.brand)}.png"
             class="img-responsive"/>
    </div>
    <div class="col-sm-5">
        <h2>Options</h2>
        <form:form  commandName="options" method="post" action="${url}" >
            <table class="table">
                <tbody>
                    <c:forEach items="${carModel.pack.options.option}" var="option">
                    <tr>
                        <td>
                        <form:checkbox path="items" value="${option.OPTIONID}" label="${option.name}"/><br/>
                            <c:out value="${option.description}"/>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="col-sm-3 col-sm-offset-1">


            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="submit" value="Order now!" class="btn btn-primary"/>
            </div>
        </form:form>

    </div>


</div>