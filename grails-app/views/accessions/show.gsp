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
    <h4>${acc.accNum1}.${acc.accNum2}.${acc.accNum3}: ${acc.accTitle}</h4>
    
    <p><strong>Extent (MB)</strong><br />${acc.accMb}</p>
    
    <p><strong>Processing Plan</strong><br />${acc.accProcessingPlan}</p>

    <p><strong>Processing Status</strong><br />${acc.accProcessingStatus}</p>
    
    <p><strong>Extent</strong><br />${acc.accExtentNumber} ${acc.accExtentType}</p>
    
    <p><strong>Container Summary</strong><br />${acc.accContainerSummary}</p>
    
    
    
    <table>
      <thead>
      <tr>
        <th>External References</th>
      </tr>
      </thead>
      <tbody>
      <g:each in="${refs}" var="ref">
        
        <tr>
          <td><a href="${ref.href}">${ref.title}</a></td>
         
        </tr>
      </g:each>
      </tbody>
    </table>

    <br />
    <table>
      <thead>
      <tr>
        <th>Locations</th>
      </tr>
      </thead>
      <tbody>
      <g:each in="${locations}" var="loc">
        <tr>
          <td>${loc}</td>
         
        </tr>
      </g:each>
      </tbody>
    </table>
    
    
  </body>
</html>



<!--

·         All Locations
·         All External Documents links
·         Extent and Container Summary concatenated
 
->