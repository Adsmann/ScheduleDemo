<!doctype html>
<html lang="ru">
<#import "spring.ftl" as spring />
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Админ</title>
    <link rel="icon" type="image/x-icon" href="<@spring.url '/public/imgs_touch.png'/>">
    <link rel="stylesheet" href="<@spring.url '/public/admin.css'/>">
    <link rel="stylesheet" href="<@spring.url '/public/profile.css'/>">
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
        <h1>Создать предмет</h1>
        
        <form class="schedule-form" action="/admin/subject/create" method="post">
            <div class="input-block">
                <label for="day">День недели:</label>
                <select name="day" id="day" class="input-field">
                    <option name="day" value="Понедельник">Понедельник</option>
                    <option name="day" value="Вторник">Вторник</option>
                    <option name="day" value="Среда">Среда</option>
                    <option name="day" value="Четверг">Четверг</option>
                    <option name="day" value="Пятница">Пятница</option>
                    <option name="day" value="Суббота">Суббота</option>
                </select>
            </div>

            <div class="input-block">
                <label for="subject">Предмет:</label>
                <input name="name" type="text" id="subject" class="input-field" placeholder="Введите название предмета">
            </div>

            <div class="input-block">
                <label for="teacher">Имя преподавателя:</label>
                <input name="manT" type="text" id="teacher" class="input-field" placeholder="Введите имя преподавателя">
            </div>

            <div class="input-block">
                <label for="time">Время:</label>
                <input name="time" type="text" id="time" class="input-field" placeholder="Введите время начала и время конца">
            </div>

            <div class="input-block">
                <label for="room">Аудитория:</label>
                <input name="auditorium" type="number" id="room" class="input-field" placeholder="Введите номер аудитории">
            </div>

            <div class="input-block">
                <label for="university">Университет:</label>
                <select name="uni" id="university" class="input-field">
                    <#list unis as one>
                    <option name="uni" value="${one.name}">${one.name}</option>
                    </#list>
                </select>
            </div>

            <div class="input-block">
                <label for="group">Группа:</label>
                <select name="userG" id="group" class="input-field">
                    <#list userGS as one>
                    <option name="userG" value="${one.name}">${one.name}</option>
                    </#list>
                </select>
            </div>

            <div class="button-block">
                <button type="submit" class="edit-btn">Создать</button>
            </div>
        </form>

        <a href="/edit-subject"><h1>Редактировать расписание</h1></a>
    </div>
</body>

</html>
