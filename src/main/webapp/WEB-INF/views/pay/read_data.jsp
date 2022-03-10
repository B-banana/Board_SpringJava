<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var='obj' items='${list }'>
			<h3>아이디 : ${obj.pay_id }</h3>
			<h3>결제일: ${obj.pay_date }</h3><br>
			<h3>결제방식 : ${obj.pay_method }</h3><br>
            <h3>카드사 : ${obj.pay_company }</h3><br> 
            <h3>카드번호 : ${obj.pay_number }</h3><br>
            <h3>구매수량 : ${obj.pay_amount }</h3><br>
            <h3>총 금액 : ${obj.pay_sum }</h3><br>
   </c:forEach>

</body>
</html>