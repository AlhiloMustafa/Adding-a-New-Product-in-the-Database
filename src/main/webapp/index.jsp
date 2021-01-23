<html>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>

	<h3>Search for a product by ID :</h3>
	<div style="width: 40%; height: 100%; margin: 20px;">
		<form class="form-inline" action="getProduct">

			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> 
				<!-- <input type="text" name="pid" class="form-control" placeholder="ID number"> -->
				<input type="number" id="replyNumber" name="pid" min="0" data-bind="value:replyNumber" />
			</div>
			<button type="submit" class="btn btn-primary mb-2">Find</button>
		</form>

	</div>

</body>
</html>


    <input type="number" id="replyNumber" name="pid" min="0" data-bind="value:replyNumber" />
