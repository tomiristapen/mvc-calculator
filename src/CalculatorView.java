import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumberField = new JTextField(10);
    private JTextField secondNumberField = new JTextField(10);
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    private JLabel resultLabel = new JLabel("Результат:");

    public CalculatorView() {
        // темный фон для калькулятора
        this.getContentPane().setBackground(new Color(45, 45, 45));

        firstNumberField.setPreferredSize(new Dimension(150, 30));
        secondNumberField.setPreferredSize(new Dimension(150, 30));
        customizeTextField(firstNumberField);
        customizeTextField(secondNumberField);

        customizeButton(addButton);
        customizeButton(subtractButton);
        customizeButton(multiplyButton);
        customizeButton(divideButton);

        // панель для ввода чисел
        JPanel panel = new JPanel();
        panel.setBackground(new Color(45, 45, 45));
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        panel.add(new JLabel("Первое число:")).setForeground(Color.WHITE);
        panel.add(firstNumberField);
        panel.add(new JLabel("Второе число:")).setForeground(Color.WHITE);
        panel.add(secondNumberField);

        // панель для кнопок
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(new Color(45, 45, 45));
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);

        //label, отображающий результат
        resultLabel.setForeground(Color.WHITE);
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        // панель для отображения результата
        JPanel resultPanel = new JPanel();
        resultPanel.setBackground(new Color(45, 45, 45));
        resultPanel.add(resultLabel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Завершение программы при закрытии окна
        this.setSize(300, 250);// Устанавливаем размеры окна
        this.setLayout(new BorderLayout(10, 10));
        this.add(panel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
        this.add(resultPanel, BorderLayout.SOUTH);
    }

    // Метод для настройки текстового поля
    private void customizeTextField(JTextField textField) {
        textField.setBackground(new Color(60, 60, 60));
        textField.setForeground(Color.WHITE);
        textField.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 1));
        textField.setHorizontalAlignment(JTextField.CENTER);
    }

    // Метод для настройки кнопки
    private void customizeButton(JButton button) {
        button.setPreferredSize(new Dimension(50, 30));
        button.setBackground(new Color(100, 100, 100));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 1));
    }

    // Получаем значения из текстовых полей первого и второго числа, преобразовывая их в тип double
    public double getFirstNumber() {
        return Double.parseDouble(firstNumberField.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumberField.getText());
    }


    // Этот метод обновляет текст результата на экране.
    // Он принимает строку с результатом и показывает ее в поле результата resultLabel.
    public void setResult(String result) {
        resultLabel.setText("Результат: " + result);
    }



    // Метод добавляет ActionListener ко всем кнопкам калькулятора для обработки нажатий.
    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
    }


    // Эти методы являются геттерами, которые предоставляют доступ к кнопкам калькулятора
    // (сложение, вычитание, умножение, деление) из других классов, таких как контроллер,
    // чтобы они могли назначить обработчики событий на эти кнопки для выполнения соответствующих операций.
    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubtractButton() {
        return subtractButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }
}
