/*
Учет воинского состава. Создать родительский класс "военный состав" (фамилия, рота, звание, дата рождения, дата поступления на  воинскую службу, часть) и дочерние классы:
- "органы военного управления" (название округа, должность выслуга лет, сумма надбавки);
- "военная служба по контракту" (период договора, дата договора, номер протокола, сумма зарплаты);
- "награжденные" (название награды, премия, сумма надбавки)

реализовать класс для хранения списка военных с методом добавления нового военного и методом печати списка военных.
*/
package praktika4;

public class test {
	public static void main(String[] args) {
		Variations variations = new Variations();
		variations.Add(new Awarded("ivanov", 9 , "serjant" , "01.01.1990","01.01.1998", "tankovaya", "orden za sluzhby", "20000rub", "10000rub"));
		variations.Add(new Contract("sidorov", 10, "leitenant", "01.01.1987", "01.01.1995", "morskaya", "3 goda", "01.01.1996",765432, 40000));
		variations.Add(new Administration("kuznetsov", 11, "podpolkovnik", "01.01.1975", "01.01.1984", "injenernaya", "tsentralnii", "nachalnik shtaba", 30, 20000));
		
		System.out.println(variations);
	}
}
