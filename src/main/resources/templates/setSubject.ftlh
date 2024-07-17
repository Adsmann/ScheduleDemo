<#import "spring.ftl" as spring />
<form action="/admin/subject/${id}/set/1" method="post">
    ManT: <input type="text" name="manT" placeholder="${subject.manT}">
    <input type="hidden" name="id" value="${subject.id}">
    <input type="submit" value="Go">
</form>
<form action="/admin/subject/${id}/set/2" method="post">
    name: <input type="text" name="name" placeholder="${subject.name}">
    <input type="hidden" name="id" value="${subject.id}">
    <input type="submit" value="Go">
</form>
<form action="/admin/subject/${id}/set/3" method="post">
    time: <input type="text" name="time" placeholder="${subject.time}">
    <input type="hidden" name="id" value="${subject.id}">
    <input type="submit" value="Go">
</form>
<form action="/admin/subject/${id}/set/4" method="post">
    day: <input type="text" name="day" placeholder="${subject.day}">
    <input type="hidden" name="id" value="${subject.id}">
    <input type="submit" value="Go">
</form>
<form action="/admin/subject/${id}/set/5" method="post">
    uni: <input type="text" name="uni" placeholder="${subject.uni}">
    <input type="hidden" name="id" value="${subject.id}">
    <input type="submit" value="Go">
</form>
<form action="/admin/subject/${id}/set/6" method="post">
    userG: <input type="text" name="userG" placeholder="${subject.userG}">
    <input type="hidden" name="id" value="${subject.id}">
    <input type="submit" value="Go">
</form>
<form action="/admin/subject/${id}/set/7" method="post">
    auditorium: <input type="number" name="auditorium" placeholder="${subject.auditorium}">
    <input type="hidden" name="id" value="${subject.id}">
    <input type="submit" value="Go">
</form>