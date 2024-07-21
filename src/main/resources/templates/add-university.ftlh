<!doctype html>
<html lang="ru">
<#import "spring.ftl" as spring />
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Добавить университет</title>
    <link rel="icon" type="image/x-icon" href="<@spring.url '/public/imgs_touch.png'/>">
    <link rel="stylesheet" href="<@spring.url '/public/add-university.css'/>">
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
        <h1>Добавить университет</h1>

        <form class="input-block" action="/admin/uni/create" method="post">
            <label for="university-name">Название университета:</label>
            <input name="name" type="text" id="university-name" class="input-field" placeholder="Введите название университета">
            <button type="submit" class="edit-btn">Применить</button>
        </form>
    </div>
</body>
</html>
