<!doctype html>
<html lang="ru">
<#import "spring.ftl" as spring />

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Таблица</title>
    <link rel="icon" type="image/x-icon" href="<@spring.url '/public/imgs_touch.png'/>">
    <link rel="stylesheet" href="<@spring.url '/public/table-view.css'/>">

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
        <h1>Таблица данных</h1>
        <table>
            <thead>
                <tr>
                    <th>Преподаватель</th>
                    <th>Название предмета</th>
                    <th>Время</th>
                    <th>День недели</th>
                    <th>Университет</th>
                    <th>Группа</th>
                    <th>Аудитория</th>
                </tr>
            </thead>
            <tbody>
            <#list list as one>
                <tr>
                    <td><a href="/admin/subject/${one.id}">${one.manT}</a></td>
                    <td><a href="/admin/subject/${one.id}">${one.name}</a></td>
                    <td><a href="/admin/subject/${one.id}">${one.time}</a></td>
                    <td><a href="/admin/subject/${one.id}">${one.day}</a></td>
                    <td><a href="/admin/subject/${one.id}">${one.uni}</a></td>
                    <td><a href="/admin/subject/${one.id}">${one.userG}</a></td>
                    <td><a href="/admin/subject/${one.id}">${one.auditorium}</a></td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</body>
</html>
