import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("duplicate");
		list.add("2");
		list.add("duplicate");
		list.add("3");
		list.add("duplicate");
		list.add("4");
		list.add("duplicate");
		list.add("5");
		list.add("duplicate");
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			 
			for (int x = i + 1; x < list.size(); x++) {
				
				if (list.get(i).equals(list.get(x))) {
					list.remove(x);
					x--;
				}
			}
		}
		
		System.out.println(list);

	}

}
