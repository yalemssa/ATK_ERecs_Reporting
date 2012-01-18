<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="layout" content="main"/>
    <title>Sample title</title>
  </head>
  <body>
    <h4>Accessions with Electronic records</h4>
    <table>
      <thead>
      <tr>
        <th>Accession #</th><th>Accession Title</th>
      </tr>
      </thead>
      <tbody>
        <g:each in="${accs}" var="acc">
          <tr>
            <td width="15%">${acc.accNum1}.${acc.accNum2}.${acc.accNum3}</td>
            <td>${acc.accTitle}</td>
          </tr>
        </g:each>
      </tbody>
    </table>
  </body>
</html>
