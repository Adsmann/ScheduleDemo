<!doctype html>
<html lang="ru">
<#import "spring.ftl" as spring />

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Настраиваемая форма</title>
    <link rel="icon" type="image/x-icon" href="<@spring.url '/public/imgs_touch.png'/>">
    <link rel="stylesheet" href="<@spring.url '/public/custom-form.css'/>">
</head>
<body>
    <div class="des-1">
        <div class="tb_1">
            <img src=href="<@spring.url '/public/imgs_touch.png'/>" alt="Logo" class="logo">
            <div class="nav-links">
                <a class="nav-link" href="/">Расписание</a>
                <div class="admin-section">
                    <a class="nav-link" href="/admin">Админ</a>
                    <div class="sub-links">
                        <div class="column">
                            <a href="/add-group">добавить группу</a>
                            <a href="/add-subject">добавить дисциплину</a>
                        </div>
                        <div class="column">
                            <a href="/add-university">добавить универ</a>
                            <a href="/edit-subject">изменить дисциплину</a>
                        </div>
                    </div>
                </div>
                <a class="nav-link" href="/office">Личный кабинет</a>
            </div>
        </div>
    </div>

    <div class="container">
        <h1>Настраиваемая форма</h1>

        <form class="input-block" action="/admin/subject/${id}/set/1" method="post">
            <label for="teacher">Преподаватель:</label>
            <div class="input-with-button" >
                <input type="text" id="teacher" name="manT" class="input-field" placeholder="${subject.manT}">
                <input type="hidden" name="id" value="${subject.id}">

                <button type="submit" class="edit-btn">Применить</button>
            </div>
        </form>

        <form class="input-block" action="/admin/subject/${id}/set/2" method="post">
            <label for="subject">Название предмета:</label>
            <div class="input-with-button">
                <input type="text" id="subject" name="name" class="input-field" placeholder="${subject.name}">
                <input type="hidden" name="id" value="${subject.id}">

                <button type="submit" class="edit-btn">Применить</button>
            </div>
        </form>

        <form class="input-block" action="/admin/subject/${id}/set/3" method="post">
            <label for="time">Время:</label>
            <div class="input-with-button">
                <input type="text" id="time" name="time" class="input-field" placeholder="${subject.time}">
                <input type="hidden" name="id" value="${subject.id}">
                <button type="submit" class="edit-btn">Применить</button>
            </div>
        </form>

        <form class="input-block" action="/admin/subject/${id}/set/4" method="post">
            <label for="day">День недели:</label>
            <div class="input-with-button">
                <input type="hidden" name="id" value="${subject.id}">

                <select name="day"  id="day" class="input-field">
                    <option name="day" value="${subject.day}">${subject.day}</option>

                    <option name="day" value="Понедельник">Понедельник</option>
                    <option name="day" value="Вторник">Вторник</option>
                    <option name="day" value="Среда">Среда</option>
                    <option name="day" value="Четверг">Четверг</option>
                    <option name="day" value="Пятница">Пятница</option>
                    <option name="day" value="Суббота">Суббота</option>
                    <option name="day" value="Воскресенье">Воскресенье</option>
                </select>
                <button type="submit" class="edit-btn">Применить</button>
            </div>
        </form>

        <form class="input-block" action="/admin/subject/${id}/set/5" method="post">
            <label for="university">Университет:</label>
            <div class="input-with-button">
                <input type="hidden" name="id" value="${subject.id}">

                <select name="uni" id="university" class="input-field">
                    <option name="uni" value="${subject.uni}">${subject.uni}</option>

                    <#list unis as one>
                        <option name="uni" value="${one.name}">${one.name}</option>
                    </#list>
                </select>

                <button type="submit" class="edit-btn">Применить</button>
            </div>
        </form>

        <form class="input-block" action="/admin/subject/${id}/set/6" method="post">
            <label for="group">Группа:</label>
            <div class="input-with-button">
                <input type="hidden" name="id" value="${subject.id}">
                <select name="userG" id="group" class="input-field">
                    <option name="userG" value="${subject.userG}">${subject.userG}</option>
                    <#list userGS as one>
                        <option name="userG" value="${one.name}">${one.name}</option>
                    </#list>

                </select>
                <button type="submit" class="edit-btn">Применить</button>
            </div>
        </form>

        <form class="input-block" action="/admin/subject/${id}/set/7" method="post">
            <label for="auditorium">Аудитория:</label>
            <div class="input-with-button">
                <input type="hidden" name="id" value="${subject.id}">

                <input type="number" name="auditorium" id="auditorium" class="input-field" placeholder="${subject.auditorium}">
                <button type="submit" class="edit-btn">Применить</button>
            </div>
        </form>

<#--        <div class="button-block">-->
<#--            <button type="button" class="delete-btn">Удалить</button>-->
<#--        </div>-->
    </div>
</body>
</html>
