package Lesson3a;

import org.junit.Before;

import Lesson3a.utilsClass.autoUtils;

public class lesson3Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strA = "abcd";
		
		publicClass publicClass=new publicClass();
		
		System.out.println(publicClass);

		String strB = new String("abcd");

		if (strA == strB) {
			System.out.println("==");
		}
		if (strA.equals(strB)) {
			System.out.println("equlas");
		}
		
		
		IDbservice dbservice;
		
		String dbType;
		
		if(System.getProperty("DB").equals("MySql")){
			dbservice=new MySqlDbService();
		}
		else if(System.getProperty("DB").equals("MsSql")){
			dbservice=new MsSqlDbService();
		}
		
		

	}

	public boolean asserString(String a, String b) {
		
		autoUtils.calcInts(4, 6);
		
		if (a.equals(b) == false) {
			// Fail test

			return false;
		} else {
			return true;
		}
	}

}
