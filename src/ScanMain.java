import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ScanMain {

	public static void main(String[] args) {
		/*
		Field[] fields = DateTimeFormatter.class.getDeclaredFields();
		
		for (Field field : fields) {
			if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
				//System.out.println(field);
				System.out.println(field.getName());
			}
		}
		*/
		
		Method[] methods = ArrayList.class.getDeclaredMethods();
		for (Method method : methods) {
			if (Modifier.isPublic(method.getModifiers())) {
				//System.out.println(method.getName());
			}
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list.size());
		
		list.add(list.size(), "C");
		list.add(list.size(), "D");
		list.add("E");
		list.add("E");
		list.add("E");
		list.add(null);
		list.add(null);
		list.remove("E");
		list.remove(null);
		
		list.clear();
		
		new ArrayList(0);
		
		
		for (String string : list) {
			System.out.println(string);
		}
		
		/*
		ArrayList<String> list = new ArrayList<>();
		if (list.add("A")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		list.add(1,"B");
		
		
		
		list.remove(0);
		list.remove(0);
		
		for (String string : list) {
			System.out.println(string);
		}*/
	}

}
