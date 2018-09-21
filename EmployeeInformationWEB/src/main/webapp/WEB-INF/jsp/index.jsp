<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="header.jsp"></jsp:include>

<h3>Employee Information</h3>
<br>
<form action='/index/get' method='post'>

	<table class='table table-hover table-responsive table-bordered'>

		<tr>
			<td><b>Id Employee</b></td>
			<td><input type='text' name='idEmployee' class='form-control' /></td>
		</tr>

		<tr>
			<td></td>
			<td>
				<button type="submit" class="btn btn-primary">Get Employee</button>
			</td>
		</tr>

	</table>
	<b><c:out value="${danger}"></c:out></b>
</form>



<h3>List Of Employees</h3>
<br>
<table class="table table-hover">

	<thead>
		<tr>
			<th><b>Id Employee</b></th>
			<th><b>Name</b></th>
			<th><b>Contract Type Name</b></th>
			<th><b>Role Id</b></th>
			<th><b>Role Name</b></th>
			<th><b>Role Description</b></th>
			<th><b>Hourly Salary</b></th>
			<th><b>Monthly Salary</b></th>
			<th><b>Annual Salary</b></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}" /></td>
				<td><c:out value="${employee.name}" /></td>
				<td><c:out value="${employee.contractTypeName}" /></td>
				<td><c:out value="${employee.roleId}" /></td>
				<td><c:out value="${employee.roleName}" /></td>
				<td><c:out value="${employee.roleDescription}" /></td>
				<td><c:out value="${employee.hourlySalary}" /></td>
				<td><c:out value="${employee.monthlySalary}" /></td>
				<td><c:out value="${employee.annualSalary}" /></td>
			</tr>

		</c:forEach>
	</tbody>
</table>
</div>

<jsp:include page="footer.jsp"></jsp:include>