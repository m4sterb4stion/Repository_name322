/* Написать программу получающую на вход в качестве аргумента несколько параметров. В программе вывести "Вы ввели" + N
(количество параметров) + "параметров". Если параметры не передвавались, вывести "Вы не передавали параметров". */
public class pr1_2 {
	 public static void main(String[] args) {
	        if (args.length != 0) {
	            System.out.print("Вы ввели "+ args.length +" параметров");
	        }
	        else {
	            System.out.print("Вы не передавали параметров");
	        }
	    }
}
