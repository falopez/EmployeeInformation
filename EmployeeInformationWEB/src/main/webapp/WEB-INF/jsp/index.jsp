<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="header.jsp"></jsp:include>

<div>
<h3>List of products</h3>
<br>
<table class="table table-hover">

	<thead>
		<tr>
			<th><b>Id Product</b></th>
			<th><b>Name</b></th>
			<th><b>Price</b></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${products}" var="product">
			<tr>
				<td><c:out value="${product.id}" /></td>
				<td><c:out value="${product.name}" /></td>
				<td><c:out value="${product.price}" /></td>
			</tr>

		</c:forEach>
	</tbody>
</table>
</div>

<jsp:include page="footer.jsp"></jsp:include>