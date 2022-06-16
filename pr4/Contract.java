/*
Учет воинского состава. Создать родительский класс "военный состав" (фамилия, рота, звание, дата рождения, дата поступления на  воинскую службу, часть) и дочерние классы:
- "органы военного управления" (название округа, должность выслуга лет, сумма надбавки);
- "военная служба по контракту" (период договора, дата договора, номер протокола, сумма зарплаты);
- "награжденные" (название награды, премия, сумма надбавки)

реализовать класс для хранения списка военных с методом добавления нового военного и методом печати списка военных.
*/
package praktika4;

public class Contract extends Personnel{
	private String contractPeriod;
	private String AgreementDate;
	private int ProtocolNumber;
	private int AmountOfSalary;
	
	public Contract(String surname, int company, String rank, String DateOfBirth, String dateOfEntry, String unit, String contractPeriod, String AgreementDate, int ProtocolNumber, int AmountOfSalary) {
		super(surname, company, rank, DateOfBirth, dateOfEntry, unit);
		this.contractPeriod = contractPeriod;
		this.AgreementDate = AgreementDate;
		this.ProtocolNumber = ProtocolNumber;
		this.AmountOfSalary = AmountOfSalary;
	}
	
	public void contractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	public String getAcceleration() {
		return contractPeriod;
	}
	
	public void AgreementDate(String AgreementDate) {
		this.AgreementDate = AgreementDate;
	}
	public String getAgreementDate() {
		return AgreementDate;
	}
	
	public void setProtocolNumber(int ProtocolNumber) {
		this.ProtocolNumber = ProtocolNumber;
	}
	public int getProtocolNumber() {
		return ProtocolNumber;
	}
	public void setAmountOfSalary(int AmountOfSalary) {
		this.AmountOfSalary = AmountOfSalary;
	}
	public int getAmountOfSalary() {
		return AmountOfSalary;
	}
	
	public String toString()
    {
        return super.toString() + "\nperiod dogovora - " + contractPeriod + "\ndata dogovora - " + AgreementDate + "\nomer protokola - " + ProtocolNumber + "\nsumma zarplati - " + AmountOfSalary;
    }

}
