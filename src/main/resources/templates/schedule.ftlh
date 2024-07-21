<!doctype html>
<html lang="ru">
<#import "spring.ftl" as spring />

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Расписание</title>
    <link rel="icon" type="image/x-icon" href="<@spring.url '/public/imgs_touch.png'/>">
    <link rel="stylesheet" href="<@spring.url '/public/schedule.css'/>">

</head>
<body>
    <div class="des-1">
        <div class="tb_1">
            <img src=href="<@spring.url '/public/imgs_touch.png'/>" alt="Logo" class="logo">
            <div class="nav-links">
                <a class="nav-link" href="/static">Расписание</a>
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
        <h1>Расписание</h1>
        <#if listM?has_content>
            <div class="day">
            <h2>Понедельник</h2>
            <div class="schedule-grid">
                <#list listM as one>
                    <#if one?? && one.name??>
                            <div class="schedule-item">
                                <div>${one.time}</div>
                                <div>${one.name}</div>
                                <div>${one.manT}</div>
                                <div>${one.auditorium}</div>
                                <div>${one.uni}</div>
                                <div>${one.userG}</div>
                            </div>
                        </#if>
                </#list>
            </div>
        </div>
        </#if>
        <#if listTu?has_content>
        <div class="day">
            <h2>Вторник</h2>
            <div class="schedule-grid">
                <#list listTu as one>
                    <#if one?? && one.name??>
                        <div class="schedule-item">
                            <div>${one.time}</div>
                            <div>${one.name}</div>
                            <div>${one.manT}</div>
                            <div>${one.auditorium}</div>
                            <div>${one.uni}</div>
                            <div>${one.userG}</div>
                        </div>
                    </#if>
                </#list>
            </div>
        </div>
        </#if>
        <#if listW?has_content>
        <div class="day">
            <h2>Среда</h2>
            <div class="schedule-grid">
                <#list listW as one>
                    <#if one?? && one.name??>
                        <div class="schedule-item">
                            <div>${one.time}</div>
                            <div>${one.name}</div>
                            <div>${one.manT}</div>
                            <div>${one.auditorium}</div>
                            <div>${one.uni}</div>
                            <div>${one.userG}</div>
                        </div>
                    </#if>
                </#list>
            </div>
        </div>
        </#if>
        <#if listTh?has_content>
        <div class="day">
            <h2>Четверг</h2>
            <div class="schedule-grid">
                <#list listTh as one>
                    <#if one?? && one.name??>
                        <div class="schedule-item">
                            <div>${one.time}</div>
                            <div>${one.name}</div>
                            <div>${one.manT}</div>
                            <div>${one.auditorium}</div>
                            <div>${one.uni}</div>
                            <div>${one.userG}</div>
                        </div>
                    </#if>
                </#list>
            </div>
        </div>
        </#if>
        <#if listF?has_content>
        <div class="day">
            <h2>Пятница</h2>
            <div class="schedule-grid">
                <#list listF as one>
                    <#if one?? && one.name??>
                        <div class="schedule-item">
                            <div>${one.time}</div>
                            <div>${one.name}</div>
                            <div>${one.manT}</div>
                            <div>${one.auditorium}</div>
                            <div>${one.uni}</div>
                            <div>${one.userG}</div>
                        </div>
                    </#if>
                </#list>
            </div>
        </div>
        </#if>
        <#if listSa?has_content>
        <div class="day">
            <h2>Суббота</h2>
            <div class="schedule-grid">
                <#list listSa as one>
                    <#if one?? && one.name??>
                        <div class="schedule-item">
                            <div>${one.time}</div>
                            <div>${one.name}</div>
                            <div>${one.manT}</div>
                            <div>${one.auditorium}</div>
                            <div>${one.uni}</div>
                            <div>${one.userG}</div>
                        </div>
                    </#if>
                </#list>
                </div>
            </div>
        </#if>
        </div>
</body>
</html>
