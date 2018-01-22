<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<div class="container">
	<div class="row">
		<!-- To Display SideBar -->
		<div class="col-md-3"></div>
		<%@include file="./shared/sidebar.jsp"%>
	</div>

	<!-- To Display Actual Products -->
	<div class="col-md-9">

		<!-- Adding BreadCrum -->
		<div class="row">
			<div class="cal-lg-12">
				<c:if test="${userClickAllProducts == true}">
					<ol class="breadcrum">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Products</li>
					</ol>
				</c:if>

				<c:if test="${userClickCategoryProducts == true}">
					<ol class="breadcrum">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
					</ol>
				</c:if>
			</div>
		</div>
	</div>
</div>