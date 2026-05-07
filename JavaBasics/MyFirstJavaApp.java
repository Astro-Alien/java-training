public class MyFirstJavaApp {
    public void main() {
        Calculator calulatorInstance = new Calculator();
        
        IO.println(calulatorInstance.calculate("add"));
        IO.println(calulatorInstance.calculate("adds"));
        IO.println(calulatorInstance.calculate("sub"));
        IO.println(calulatorInstance.calculate("mul"));
        IO.println(calulatorInstance.calculate("div"));
    }
}