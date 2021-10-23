Запускаем среду разработки IntelliJ IDEA, нажимаем на вкладку File сверху->New->Project from version control->Git

Далее нужно скопировать данную строчку https://github.com/walder86/Storage.git и вставить в поле URL, нажать test и, при успешном выполнении, нажать clone

Должен быть запущен Docker, вбиваем в терминал/командную строку команды:
1) docker pull vldmrvasiliev
2) docker run -d -p 3310:3306 vldmrvasiliev/socksbd

Должен появистся и запуститься контейнер с БД.

Должен быть установлен maven apache.

Далее заходим в терминал в среде и вбиваем в терминал команду: mvn install.

После установки раскрываем справа вкладку Maven Projects, разворачиваем папку Lifecycle и жмём 2 раза на install.

Можно запускать проект и делать запросы, для этого можно использовать Postman.