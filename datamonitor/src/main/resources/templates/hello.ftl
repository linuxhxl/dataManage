<!DOCTYPE html>
<html>
<head lang="en">
	<title>FreeMarker</title>
	
	<link href="/css/index.css" rel="stylesheet" />
	
</head>
<body>
	<center>
		<h1 id="title">${title}</h1>
	</center>
	<h2>haha</h2>
	<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
	
	<script>
		$(function(){
			$('#title').click(function(){
				alert('点击了');
			});
		})
	</script>
</body>
</html>
