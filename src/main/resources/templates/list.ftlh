<#import "spring.ftl" as spring />
<#list list as one>
    <a href="/admin/subject/${one.id}">${one.name} </a>
</#list>