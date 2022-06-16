/*
Учет воинского состава. Создать родительский класс "военный состав" (фамилия, рота, звание, дата рождения, дата поступления на  воинскую службу, часть) и дочерние классы:
- "органы военного управления" (название округа, должность выслуга лет, сумма надбавки);
- "военная служба по контракту" (период договора, дата договора, номер протокола, сумма зарплаты);
- "награжденные" (название награды, премия, сумма надбавки)

реализовать класс для хранения списка военных с методом добавления нового военного и методом печати списка военных.
*/
package praktika4;

public class Awarded extends Personnel{
	private String nameOfTheAward;
	private String premium;
	private String allowanceAmount;
	
	public Awarded(String surname, int company, String rank, String DateOfBirth, String dateOfEntry, String unit, String nameOfTheAward, String premium, String allowanceAmount) {
		super(surname, company, rank, DateOfBirth, dateOfEntry, unit);
		this.nameOfTheAward = nameOfTheAward;
		this.premium = premium;
		this.allowanceAmount = allowanceAmount;
	}
	
	public void setnameOfTheAward(String nameOfTheAward) {
		this.nameOfTheAward = nameOfTheAward;
	}
	public String getnameOfTheAward() {
		return nameOfTheAward;
	}
	
	public void setpremium(String premium) {
		this.premium = premium;
	}
	public String getpremium() {
		return premium;
	}
	
	public void setallowanceAmount(String allowanceAmount) {
		this.allowanceAmount = allowanceAmount;
	}
	public String getallowanceAmount() {
		return allowanceAmount;
	}
	
	public String toString()
    {
        return super.toString() + "\nnazvanie nagradi- " + nameOfTheAward + "\npremiya - " + premium + "\nsumma nadbavki - " + allowanceAmount;
    }
}
