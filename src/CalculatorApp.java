public class CalculatorApp {
    public static void main(String[] args) {
        // Создается модель, которая выполняет расчеты.
        CalculatorModel model = new CalculatorModel();

        //создается (View) для отображения интерфейса.
        CalculatorView view = new CalculatorView();

        // Создаетя контроллер, который связывает модель и view, обрабатывая взаимодействия.
        new CalculatorController(model, view);

        // Делаем окно калькулятора видимым.
        view.setVisible(true);
    }
}


