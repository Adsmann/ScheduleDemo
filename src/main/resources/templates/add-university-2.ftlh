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
            <input type="text" name="name" id="university-name" class="input-field" placeholder="Введите название университета">


        <h1>Добавить время</h1>

            <label for="time1">Время 1:</label>
            <input type="text" name="l1" id="time1" class="input-field" placeholder="Введите время">


            <label for="time2">Время 2:</label>
            <input type="text" name="l2" id="time2" class="input-field" placeholder="Введите время">


            <label for="time3">Время 3:</label>
            <input type="text" name="l3" id="time3" class="input-field" placeholder="Введите время">


            <label for="time4">Время 4:</label>
            <input type="text" name="l4" id="time4" class="input-field" placeholder="Введите время">

            <label for="time5">Время 5:</label>
            <input type="text" name="l5" id="time5" class="input-field" placeholder="Введите время">

            <label for="time6">Время 6:</label>
            <input type="text" name="l6" id="time6" class="input-field" placeholder="Введите время">

            <label for="time7">Время 7:</label>
            <input type="text" name="l7" id="time7" class="input-field" placeholder="Введите время">

            <label for="time8">Время 8:</label>
            <input type="text" name="l8" id="time8" class="input-field" placeholder="Введите время">


        <button type="submit" class="edit-btn">Применить</button>
        </form>
    </div>
</body>
</html>
