package praktika4;

import java.util.ArrayList;
public class Variations {
	private ArrayList<Personnel> m;
	
	public Variations() {
		m = new ArrayList<Personnel>();
	}
	
	public void Add(Personnel auto) {
		m.add(auto);
	}
	
	public String toString() {
		String str = "";
		for (int i=0; i<m.size(); i++) {
			str+=m.get(i);
			str+="\n\n";
		}
		return str;
	}

}