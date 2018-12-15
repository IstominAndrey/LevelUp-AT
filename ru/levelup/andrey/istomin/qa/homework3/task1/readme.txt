Добрый день!
Объект для тестирования: https://www.w3schools.com/
Всего реализовано 6 тестов:
1. Открытие https://www.w3schools.com/
   Проверка title

2. Переход в несколько шагов на https://www.w3schools.com/sql/exercise.asp
   Ввод "SELECT" в текстовое поле в упражнении
   Проверка того, что упражнение выполнено верно

3. Переход в несколько шагов на https://www.w3schools.com/xml/xml_http.asp
   В примере XmlHttp реквеста вводим "A" в поле Name
   Проверка результата Suggestions
   !!! В этом тесте мне не удалось реализовать явное ожидание появления элемента, сделал через Thread.sleep.
   Можете помочь?

4. Переход на https://www.w3schools.com/colors/colors_picker.asp
   Вводим цвет цвет в поле Enter a Color и нажимаем ОК
   Проверка цвета
   !!! В этом тесте не работает всего один шаг, а именно нажатие на кнопку OK.
   Не смог разобраться почему так, нужна помощь.

5. Переход в несколько шагов на https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_where_number
   Нажимаем кнопку Run SQL
   Проверка поля ID в результирующей таблице

6. Переход в несколько шагов на https://www.w3schools.com/jsref/jsref_obj_array.asp
   Проверка title