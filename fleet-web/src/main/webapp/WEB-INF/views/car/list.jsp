<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.flowTitle.list"/></h2></div>
</div>
<div class="row">
    <div class="col-md-12">
        <table class="table">
            <tr>
                <th><spring:message code="car.brand"/></th>
                <th><spring:message code="car.model"/></th>
                <th><spring:message code="car.type"/></th>
                <th>&nbsp;</th>
            </tr>
            <tr>
                <td>Audi</td>
                <td>A3</td>
                <td>Hatchback</td>
                <td>
                    <a href="/car/1"><spring:message code="actions.details"/></a>
                </td>
            </tr>
        </table>
    </div>
</div>
<div class="row">
    <form:form>
        <input type="submit" value="Back" name="_eventId_back" class="btn btn-danger"/>
    </form:form>
</div>