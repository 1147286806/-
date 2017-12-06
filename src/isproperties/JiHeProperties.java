package isproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class JiHeProperties {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.put("name", "zhangsan");
		Hashtable hashtable = new Hashtable();
		hashtable.put("name", "zhangsan");

		Properties properties = new Properties();
		// properties.put(key, value);
		properties.setProperty("name", "zhangsan");
		properties.setProperty("age", "20");

		System.out.println(properties);

		// 遍历集合
		Set<String> keys = properties.stringPropertyNames();// 类似于Map接口中的ketSet
		for (String key : keys) {
			// 通过键 找值
			String value = properties.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
	
	@Test
	public void test1() {
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("Jihepro");
			properties.load(fileInputStream);
			System.out.println(properties);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void test2() {
		Properties properties = new Properties();
		properties.setProperty("name", "zhangsan");
		properties.setProperty("age", "20");	
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("Jihepro");
			properties.store(fileWriter, "what's this");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
