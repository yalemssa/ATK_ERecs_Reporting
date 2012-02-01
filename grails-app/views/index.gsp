<html>
    <head>
        <title>Welcome to Grails</title>
        <meta name="layout" content="main" />

    </head>
    <body>
      <h3>Available Controllers:</h3>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
                    </g:each>
                </ul>
    </body>
</html>
