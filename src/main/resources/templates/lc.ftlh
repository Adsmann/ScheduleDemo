<#import "spring.ftl" as spring />
<h4>${user.username}</h4>
    <h4>${user.email}</h4>
<h4></h4>
<form action="/office/uni/${user.id}" method="post">
    <h4>
        <input name="uni" type="text" placeholder="${info.uni}">
    </h4>
    <input type="submit" value="Go">
</form>



<form action="/office/group/${user.id}" method="post">
    <h4>
        <input name="userG" type="text" placeholder="${info.userG}">
    </h4>
    <input type="submit" value="Go">
</form>