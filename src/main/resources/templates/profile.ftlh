<!doctype html>
<html lang="ru">
<#import "spring.ftl" as spring />

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Личный кабинет</title>
    <link rel="icon" type="image/x-icon" href="<@spring.url '/public/imgs_touch.png'/>">
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
        <div class="info-block">
            <span>Имя:</span>
            <span class="info-text">${user.username}</span>
        </div>
        
        <div class="info-block">
            <span>Почта:</span>
            <span class="info-text">${user.email}</span>
        </div>
        
        <div class="input-block">
            <form action="/office/uni/${user.id}" method="post">
            <label for="university">Вуз:</label>
            <div class="input-with-button">
                <select name="uni" id="university" class="input-field">
                    <option name="uni" value="${info.uni}">${info.uni}</option>
                    <#list unis as uni>
                        <option name="uni" value="${uni.name}">${uni.name}</option>
                    </#list>
                </select>
                <button type="submit" class="edit-btn">Изменить</button>
            </div>
            </form>
        </div>
        
        <div class="input-block">
            <form action="/office/group/${user.id}" method="post">
            <label for="group">Группа:</label>
            <div class="input-with-button">

                <select name="userG" id="group" class="input-field">
                    <option name="userG" value="${info.userG}">${info.userG}</option>
                    <#list userGs as one>
                        <option name="userG" value="${one.name}">${one.name}</option>
                    </#list>
                </select>
                <button type="submit" class="edit-btn">Изменить</button>
            </div>
            </form>
        </div>
    </div>
</body>
</html>
