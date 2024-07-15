<#import "spring.ftl" as spring />
<form action="/admin/subject/create" method="post">
    NAME: <input type="text" name="name">
    ManT: <input type="text" name="manT">
    TIME: <input type="text" name="time">
    AUD: <input type="number" name="auditorium">
    UNI: <input type="text" name="uni">
    day: <input type="text" name="day">
    Group: <input type="text" name="userG">
    <input type="submit" value="Go">
</form>

