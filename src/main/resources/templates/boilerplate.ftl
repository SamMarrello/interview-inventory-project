<#include 'footer.ftl'>
<#include 'static/styles.css'>
<#include 'static/script.js'>

<#macro boilerplate>
    <!DOCTYPE html>
    <head>
        <title>${title}</title>
        <link rel="stylesheet" href="static/styles.css">
        <script src="static/script.js"></script>
    </head>
    <body>
    <#nested>
    <@footer></@footer>
    </body>
</#macro>