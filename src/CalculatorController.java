import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        // Регистрируем обработчик событий для кнопок операций
        view.addOperationListener(new OperationListener());
    }

    class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = view.getFirstNumber();
                double secondNumber = view.getSecondNumber();
                double result = 0;

                // Проверяем, какая кнопка была нажата и выполняем соответствующую операцию
                if (e.getSource() == view.getAddButton()) {
                    result = model.add(firstNumber, secondNumber);
                } else if (e.getSource() == view.getSubtractButton()) {
                    result = model.subtract(firstNumber, secondNumber);
                } else if (e.getSource() == view.getMultiplyButton()) {
                    result = model.multiply(firstNumber, secondNumber);
                } else if (e.getSource() == view.getDivideButton()) {
                    result = model.divide(firstNumber, secondNumber);
                }

                // Отправляем полученный результат в интерфейс для отображения
                view.setResult(String.valueOf(result));
            } catch (ArithmeticException ex) {
                // Если возникает исключение (например, деление на ноль), выводим сообщение об ошибке
                view.setResult("Ошибка: " + ex.getMessage());
            } catch (NumberFormatException ex) {
                // Если введенные данные не являются числом, выводим сообщение с просьбой о корректном вводе
                view.setResult("введите корректные числа");
            }
        }
    }
}
