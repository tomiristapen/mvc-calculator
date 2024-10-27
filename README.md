Калькулятор

⚙️ Функции
Калькулятор обладает следующими возможностями:
Сложение: Позволяет складывать два числа.
Вычитание: Вычитает второе число из первого.
Умножение: Умножает два числа между собой.
Деление: Делит первое число на второе (с обработкой деления на ноль).
Интуитивно понятный интерфейс: Простое и понятное представление, позволяющее пользователям быстро ориентироваться в функционале.

**Инструкция по запуску**
Скопируйте проект:
Скачайте и распакуйте проект на ваш компьютер.
Используйте вашу IDE (например, IntelliJ IDEA) для открытия проекта и запуска его.




✨ Как пользоваться?
Введите первое число в поле "Первое число".
Введите второе число в поле "Второе число".
Выберите нужную операцию.
Нажмите кнопку и наблюдайте за результатом! 🎊

Как работает MVC в этом калькуляторе
1.Model (Модель)
CalculatorModel:
Содержит логику для выполнения математических операций.
Методы, такие как add(), subtract(), multiply(), и divide(), принимают данные (числа) и возвращают результат.
Роль: Управляет данными и бизнес-логикой, не взаимодействуя напрямую с интерфейсом пользователя.
2. View (Представление)
CalculatorView:
Отвечает за отображение интерфейса пользователя, включая кнопки, текстовые поля и метки.
Методы, такие как getFirstNumber(), getSecondNumber(), и setResult(), управляют отображением и получением данных от пользователя.
Роль: Предоставляет пользователю интерфейс для взаимодействия с приложением, но не обрабатывает логику.
3. Controller (Контроллер)
CalculatorController:
Связывает модель и представление.
Обрабатывает действия пользователя (например, нажатия кнопок) и вызывает соответствующие методы модели для выполнения операций.
После выполнения операции обновляет представление, чтобы отобразить результаты.
Роль: Управляет потоком данных между моделью и view, обрабатывает события и выполняет логику приложения.
Пример взаимодействия:
Пользователь вводит числа в текстовые поля (View).
Пользователь нажимает кнопку, например, "Сложить" (View).
Контроллер принимает это событие и вызывает метод add() в Модели, передавая введённые числа.
Модель выполняет операцию и возвращает результат.
Контроллер получает результат и вызывает метод setResult() в Представлении, чтобы обновить метку с результатом.