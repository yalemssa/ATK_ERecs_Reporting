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
    <div class="mainList">
      <g:each in="${accYears}" var="year">
        
        <table>
          <thead>
          <tr>
            <th style="font-size: 115%">${year.getKey()}</th><th>[${mb.getAt(year.getKey()).round(2).toString().trim()} MB]</th><th />
          </tr>
          <tr>  
            <th>Accession #</th>
            <th>Accession Title</th>
            <th>Accession Extent (MB)</th>
          </tr>
          </thead>
          <tbody>
            <g:each in="${year.getValue()}" var="acc">
              <tr>
                <td width="15%">
                  <g:link action="show" id="${acc.id}">
                  ${acc.accNum1}.${acc.accNum2}.${acc.accNum3}
                  </g:link>
                </td>
                <td width="60%">${acc.accTitle}</td>
                <td width="25%">${acc.accMb}</td>
              </tr>
            </g:each>
          </tbody>
        </table>
        <br />
      </g:each>
    </div>
  </body>
</html>
