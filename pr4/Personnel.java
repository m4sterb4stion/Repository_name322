/*
Учет воинского состава. Создать родительский класс "военный состав" (фамилия, рота, звание, дата рождения, дата поступления на  воинскую службу, часть) и дочерние классы:
- "органы военного управления" (название округа, должность выслуга лет, сумма надбавки);
- "военная служба по контракту" (период договора, дата договора, номер протокола, сумма зарплаты);
- "награжденные" (название награды, премия, сумма надбавки)

реализовать класс для хранения списка военных с методом добавления нового военного и методом печати списка военных.
*/
package praktika4;

public class Personnel {
	private String surname;
	private int company;
	private String rank;
	private String DateOfBirth;
	private String dateOfEntry;
	private String unit;
	
	
	public Personnel(String surname, int company, String rank, String DateOfBirth, String dateOfEntry, String unit ) {
		this.surname = surname;
		this.company = company;
		this.rank = rank;
		this.DateOfBirth = DateOfBirth;
		this.dateOfEntry = dateOfEntry;
		this.unit = unit;		
	}
	
	public void setsurname(String surname) {
		this.surname = surname;
	}
	public String getsurname() {
		return surname;
	}
	
	public void setcompany(int company) {
		this.company = company;
	}
	public int getcompany(){
		return company;
	}
	
	public void setrank(String rank) {
		this.rank = rank;
	}
	public String getrank() {
		return rank;
	}
	
	public void setDateOfBirth(String DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	
	public void setdateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
	public String getdateOfEntry() {
		return dateOfEntry;
	}
	
	public void setunit(String unit) {
		this.unit = unit;
	}
	public String getunit() {
		return unit;
	}
	

	
	public String toString() {
		return "voenniy sostav:\n" + "familya - " + surname + "\nrota - " + company + "\nzvanie - " + rank + "\ndata rozhdenia - " + DateOfBirth + "\ndata postuplenia na sluzhby - " + dateOfEntry + "\nchast` - " + unit;     
	}
}
