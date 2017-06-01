$(function(){
	//登录按钮点击
	$("#loginbtn").click(function(){
		
		var username = $("#username").val();
		var userpwd = $("#userpwd").val();
		alert(username);
		//发起ajax请求
		$.ajax({
			type:"post",
			url:"http://192.168.43.152:8080/shy_struts/user_login.action",
			data:{"name":username,"pwd":userpwd},
			dataType:"json",
			beforeSend:function(){
				alert("正在请求服务器资源");
			},
			success:function(data){
				alert(data);
				alert(data.loginflag);
				if(data.loginflag=="loginsuccess")
				{
					window.location.href="user_main.html";
				}else{
					alert("登录失败！");
				}
			},
			error:function(XMLHttpRequest,textStatus,errorThrown){
				alert(XMLHttpRequest.status);
				alert(XMLHttpRequest.readyState);
				alert("请求服务器出现异常！");
				alert(textStatus);
			}
			
		
		});
	});
	
	
});