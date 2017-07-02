<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    <a href="http://12.12.13.130:8080/0419sshweb/playsong.html?name=洋葱">sss</a>

    <div id="musiclist">
    </div>
  </body>
</html>
	<script type="text/javascript" src="jquery-3.1.1.js"></script>
	<script type="text/javascript">
	$(function(){
	
		/*  $.ajax({
			type:"post",
			url:"http://12.12.13.130:8080/0419sshweb/user_getMuisc.action",
			
			dataType:"json",
			beforeSend:function(){
				alert("正在请求服务器资源");
			},  
			success:function(data){
				alert(data)
				 $("#musiclist").append("<ul>");
				$.each(data,function(index,value){
					$("#musiclist").append("<li>"+data.mname+"<li>")
				})
				
				$("#musiclist").append("</ul>");
			},  
			error:function(){
				alert("请求服务器资源失败！");
			}
		});
		 */
		 
		 $.ajax({
				type:"post",
				url:"http://12.12.13.130:8080/0419sshweb/user_getMuisc.action",
				/* 手动跨域问题*/
				dataType:"json",
				beforeSend:function(){
					alert("正在请求服务器资源");
				},  
				success:function(data){
					alert(data);
					 $("#musiclist").append("<ul>");
						$.each(data,function(index,value){
							$("#musiclist").append("<li>"+value.mname+"</li>")
						})
						
						$("#musiclist").append("</ul>");
				},  
				error:function(){
					alert("请求服务器资源失败！");
				}
			});
		
			
			
		
			
	});

	
	</script>
