<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<!--  <form action="/restex/" method="post">
	<input type="hidden" name="_method" value="put">
	<button> submit1</button>
</form> -->



 <form action="/restex/123" method="post">
	<input type="text" name="mno" value="45">
	<input type="text" name="firstName" value="최">
	<input type="text" name="lastName" value="지영">
	<button> submit2</button>
</form>


<P>  The time on the server is ${serverTime}. </P>

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<script>

$(document).ready(function(){
	$.ajax({
		type:"post",
		url:"/restex/123",
		headers:{
			"Content-Type":"application/json",
			"X-HTTP-Method-Override":"POST"
		},
		dataType:"text",
		data:JSON.stringify({
			mno:11, firstName:"최", lastName:"지영"
		}),
		success:function(){
			console.log("post success");
		}
	});
	
	$.ajax({
		type:"put",
		url:"/restex/",
		headers:{
			"Content-Type":"application/json",
			"X-HTTP-Method-Override":"put"
		},
		dataType:"text",
		data:JSON.stringify({
			mno:11, firstName:"최", lastName:"지영"
		}),
		success:function(){
			console.log("put success");
		}
	});
	
	$.ajax({
		type:"delete",
		url:"/restex/",
		headers:{
			"Content-Type":"application/json",
			"X-HTTP-Method-Override":"delete"
		},
		dataType:"text",
		data:JSON.stringify({
			mno:11, firstName:"최", lastName:"지영"
		}),
		success:function(){
			console.log("delete success");
		}
	});
	
	//테스트코드!1
/* 	$.ajax({
		type:'put',
		url:'/restex/',
		success:function(data){
			console.log("success");
		}
	
	});
 */	
});

</script>
</body>
</html>
