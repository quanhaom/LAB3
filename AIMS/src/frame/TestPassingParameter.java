package frame;

import model.DVD;

public class TestPassingParameter {

	public static void Main(String[] args) {
		DVD jungleDVD = new DVD(null,"Jungle", null, null, 0, 0);
		DVD cinderellaDVD = new DVD (null,"Cinderella", null, null, 0, 0);

		swap(jungleDVD,cinderellaDVD);
		System.out.println("Swap:");
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cindrella dvd title: " + cinderellaDVD.getTitle());
	
		
		changeTitle(jungleDVD,cinderellaDVD.getTitle());	
		System.out.println("changeTitle:");
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1=o2;
		o2=tmp;
	}
	public static void changeTitle(DVD dvd,String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DVD(null,oldTitle, null, null, 0, 0);
	}
}
