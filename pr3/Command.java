/*
Coздaть пpoгpaммy нa яsыкe Java для oпpeдeлeния клacca в нeкoтopoй пpeдмeтнoй 
oблacти. 
Oпиcaть cвoйcтвa, кoнcтpyктop, мeтoды гeттepы/ceттepы, пepeкpыть мeтoд 
toString() для вывoдa пoлнoй инфopмaции oб oбъeктe в oтфopмaтиpoвaннoм видe:
Вариант 9). Военный состав
Command:
Свойства:
-фамилия
-рота
-звание
-дата рождения
-дата поступления на службу
-часть
*/

package prktika3;

public class Command {
	private String surname;
    private int company;
    private String rank;
    private String dateOfBirth;
    private String dateOfHire;
    private int part;


    public Command(String surname, int company, String rank, String dateOfBirth, String dateOfHire, int part) {
        this.surname = surname;
        this.company = company;
        this.rank = rank;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
        this.part = part;

    }

    public String getsurname() 
    {
        return surname;
    }

    public void setsurname(String surname) 
    {
        this.surname = surname;
    }

    public int getcompany() 
    {
        return company;
    }

    public void setcompany(int company) 
    {
        this.company = company;
    }

    public String getrank() 
    {
        return rank;
    }

    public void setrank(String numberPeople) 
    {
        this.rank = numberPeople;
    }

    public String getdateOfBirth() 
    {
        return dateOfBirth;
    }

    public void setdateOfBirth(String dateOfBirth) 
    {
        this.dateOfBirth = dateOfBirth;
    }
    public String getdateOfHire() 
    {
        return dateOfHire;
    }

    public void setdateOfHire(String dateOfHire) 
    {
        this.dateOfHire = dateOfHire;
    }
    public int getpart()
    {
        return part;
    }
    public void setpart(int part)
    {
        this.part=part;
    }
    public String tostring()
    {
        return "Фамилия - " + surname +
                "\n рота - " + company +
                "\n звание - " + rank +
                "\n дата рождения - " + dateOfBirth +
                "\n дата поступления на службу" + dateOfHire +
                "\n часть - " + part ;


    }

}
