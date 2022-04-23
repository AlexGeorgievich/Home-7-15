# Home-7-15
### В репозитории представлены тесты в соответствии с заданиями :
## Home-7
7. Allure Reports. Артём Ерошенко
1. Практика. Подключение Allure Reports и настройка отчетности о прохождении автотестов.
2. Практика. Построение более информативной отчетности c вложениями:
- Прикладываем скриншоты, файлы, логи и другие вложения в отчет.
3. Теория. Обзор возможностей Allure Reports.
### задание :
Написать тест на проверку названия Issue в репозитории через Web-интерфейс.
Этот тест представить в трех вариантах:
1. Чистый Selenide (с Listener)
2. Лямбда шаги через step (name, () -> {})
3. Шаги с аннотацией @Step
В качестве ответа на задание приложите ссылку на свой репозиторий GitHub в поле ответа

## Home-15
15. Библиотека Owner. Артём Ерошенко
1. Правильно организуем хранение свойств (properties) в проекте с библиотекой Owner
2.Прячем секретные данные в Jenkins
### задание:
Конфигурация API тестов
Сделать пример конфигурации для API тестов:
1. Базовый url
2. Токен
Токен нужно передавать защищенно:
1. Через файл на файловой системе
2. Через системные property
3. 
Конфигурация WEB тестов
Сделать пример конфигурации для WEB тестов:
1. Имя браузера
2. Версия браузера
3. Локальный или удаленный (RemoteWebDriver)
Сделать два вида конфигурационных файлов:
1. Для локального запуска на chrome
2. Для удаленного запуска на selenoid
Сделать возможность с помощью одной системной переменной переключать запуск с локального на удаленный.
В качестве ответа на задание:
Ссылку на репозиторий в Github и  закомиченый конфиг файл

https://github.com/AlexGeorgievich/Home-7-15.git

### порядок запуска тестов:
 smoke-test             ui   -> gradle clean smoke 
 
локальный запуск UI  -> gradle clean ui -Dtype=local

удаленный запуск UI  -> gradle clean ui -Dtype=remote

запуск тест API        -> gradle clean api

все ключевые параметры вынесены в директорию ->  properties/config/ *.properties

