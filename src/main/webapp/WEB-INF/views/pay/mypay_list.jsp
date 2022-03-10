<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var='root' value="${pageContext.request.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>미니 프로젝트</title>
<!-- Bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<style type="text/css">
.card-title {
  padding-top: 10.5rem;
  padding-bottom: 6rem;
  text-align: center;
  color: #fff;
  background-image: url('${root }image/어둡.jpg');
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center center;
  background-size : cover;
  vertical-align : middle;
  text-align : center;
  font-size: 4rem;
  font-weight: 700;
  height: 400px;
  width: 100%;
  
}
@font-face{
font-family:"onb"; 
src:url("${root}font/ONB.ttf") format("truetype");
}
@font-face{
font-family:"onl"; 
src:url("${root}font/ONL.ttf") format("truetype");
}
.user{
text-align : center;
/* background-color: #f2f2f2; */
margin-left: 40%;
margin-right: 40%;
height: 100px;
width: 330px;
/* border-radius:2rem;
background-color: rgba( 255, 255, 255, 0.7 ); */
color: white;
text-shadow: 5px 5px 5px gray;
font-family: onb;
}
.card-body{
border: 1px solid  gray;
border-radius: 1rem;

}
.page-item.active .page-link {
color: black;
background-color: white;
border: 0px;
font-weight: bold;
}
.page-link {
border: 0px;
color: black;

}
button{
background-color: white;
border: 1px solid gray;
border-radius: 0.3rem;
}
</style>
</head>
<body>


<div class="card-title" style="font-family: onb;"><div class="user">결제내역</div></div>
<!-- 게시글 리스트 -->
<div class="container" style="font-size:20px; font-family: onb; margin-top:1.3%">
	<div class="card shadow">
		<div class="card-body" style="font-family: onb;" >

			<table class="table table-hover" id='board_list'>
				<thead>
					<tr>
						<th class="text-center d-none d-md-table-cell">결제일자</th>
						<!-- <th class="w-50">제목</th> -->
						<th class="text-center d-none d-md-table-cell">결제방식</th><!-- 확인용으로 넣어둔것  -->
						<th class="text-center d-none d-md-table-cell">결제수량</th>
						<th class="text-center d-none d-md-table-cell">결제금액</th>
						
					</tr>
				</thead>
				<tbody>
				<c:forEach var="pay" items="${payList}">
					<tr>
						<td class="text-center d-none d-md-table-cell">${pay.pay_date} </td>
						<td class="text-center d-none d-md-table-cell">${pay.pay_method}</td>
						<td class="text-center d-none d-md-table-cell">${pay.pay_amount}</td>
						<td class="text-center d-none d-md-table-cell">${pay.pay_sum}</td>
			
					</tr>
				</c:forEach>
				</tbody>
			</table>
			
			
		</div>
	</div>
</div>



</body>
</html>






