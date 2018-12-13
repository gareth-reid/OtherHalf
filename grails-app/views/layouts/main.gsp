<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
    %{--<asset:javascript src="application.js"/>--}%
   <asset:stylesheet src="main.css"/>
    <asset:javascript src="jquery.js"/>
        <asset:stylesheet src="bootstrap.css"/>
        <asset:javascript src="bootstrap.js"/>
    <asset:stylesheet src="datepicker.css"/>
    <asset:javascript src="bootstrap-datepicker.js"/>
    <asset:stylesheet src="select2.css"/>
    <asset:javascript src="select2.js"/>

		<g:layoutHead/>
	</head>
	<body>
    <div class="container bs-docs-container">
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <a class="navbar-brand" href="#">DashBoard</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><g:link action="index" controller="MiSeq">Home</g:link> </li>

                </ul>
            </div>
        </div>
        </nav>
        <div id="content" class="header">
            <div class="container">
                <h1>Molecular Pathology</h1>
                <p></p>
                <div id="carbonads-container"></div>
            </div>
        </div>
        <g:if test="${messageType != null && messageType != "none"}">
            <div class="alert alert-${messageType}" id="message-global"><i class="glyphicon glyphicon-info-sign">&nbsp;</i>${messageText}</div>
        </g:if>

        <div>
        <g:layoutBody/>
    </div>

    <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
    </div>
    <g:javascript>

    </g:javascript>
	</body>
</html>

