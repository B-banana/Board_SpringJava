<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
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
  background-image: url('/A_T_Turtle/image/메인상단_어둡.jpg');
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
src:url("/A_T_Turtle/font/ONB.ttf") format("truetype");
}
@font-face{
font-family:"onl"; 
src:url("/A_T_Turtle/font/ONL.ttf") format("truetype");
}
.pay{
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
.wrap {
	/* position: absolute; */
	/* top: 50%; */
	/*  left: 50%;  */
	/* margin-top: -2%; */
	/* margin-left: 5%; */
	 margin-bottom: 5%; 
	text-align: center;
}
a {
	-webkit-transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	-moz-transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	-ms-transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	-o-transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	display: block;
/* 	margin: 20px auto; */
	max-width: 180px;
	text-decoration: none;
	border-radius: 4px;
	padding: 20px 30px;
}  
a.button {
	color: rgba(0, 0, 0, 100);
	box-shadow: rgba(0, 0, 0, 100) 0 0px 0px 2px inset;
}

a.button:hover {
	color: rgba(255, 255, 255, 0.85);
	box-shadow: rgba(96,58,0,100) 0 0px 0px 40px inset;
}

a.button2 {
	color:rgba(0, 0, 0, 100);
	box-shadow: rgba(0, 0, 0, 100) 0 0px 0px 2px inset;
}

a.button2:hover {
	color: rgba(255, 255, 255, 0.85);
	box-shadow: rgba(96,58,0,100) 0 80px 0px 2px inset;
}

a.button3 {
	color: rgba(0, 0, 0, 100);
	box-shadow: rgba(0, 0, 0, 100) 0 0px 0px 2px inset;
}

a.button3:hover {
	color: rgba(255, 255, 255, 0.85);
	box-shadow: rgba(96,58,0,100) 0 80px 0px 2px inset;
}

</style>
<body>


<div class="card-title" ><div class="pay" >상품 구매</div></div> -->
<div class="container" >
		<div class="card-body" style="margin-top:-2%; font-size:21px; font-family:onb;">
		<div align="center">
		<h3 style="margin-top:20px; margin-bottom: 3%;">결제방식을 선택해주세요</h3>
  		<a href="input_card" class="button" style="margin-bottom: 2%;">카드결제</a>
  		<a href="input_cash" class="button2" style="margin-bottom: 2%;">무통장 입금</a>
  		<a href="kakaopay" class="button3" style="margin-bottom: 2%;">Kakao Pay</a>
		</div>

</div>
</div>
</body>
</html>