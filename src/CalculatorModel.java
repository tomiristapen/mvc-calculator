// Модель калькулятора, содержащая основные арифметические операции.
// Методы выполняют базовые вычисления: сложение, вычитание, умножение и деление.
// Данный класс используется контроллером для выполнения расчетов, а представление
// отображает результат. При делении на ноль метод генерирует исключение.
public class CalculatorModel {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("нельзя делаить на ноль");
        }
        return a / b;
    }
}

