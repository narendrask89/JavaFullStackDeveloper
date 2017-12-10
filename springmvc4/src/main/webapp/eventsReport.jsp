<!DOCTYPE html>
<html ng-app>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Angular Client</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script src="events.js"></script>
</head>
<body>
	<div ng-controller="Events">
		I have {{events.length}} Events!
		<ul>
			<li ng-repeat="event in events" ng-bind="event.name"></li>
		</ul>
	</div>
</body>
</html>