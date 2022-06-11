/* Передавать в качестве параметров два целочисленных числа. Вывести на экран как сами значение, так и их сумму ("3 +
2 = 5"). Если количество параметров не равно 2, вывести сообщение "Неверное количество параметров"*/
public class pr1_3 {
	public static void main(String[] args) {
        if (args.length == 2) {
            System.out.print(args[0] +" + "+ args[1] +" = "+ (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
        }
        else {
            System.out.print("Неверное количество параметров");
        }
    }
}
