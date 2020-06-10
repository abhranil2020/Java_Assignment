package assignment.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDatafrmJSON {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser	JSONParser =new JSONParser();
		FileReader reader = new FileReader(".\\Test data\\testdata.json");
		Object Obj	= JSONParser.parse(reader);
		
		JSONObject userlogobj=(JSONObject) Obj;		
		JSONArray userlogArray= (JSONArray) userlogobj.get("userlogins");
		
		String arr[]= new String[userlogArray.size()];
		for(int i=0;i<userlogArray.size();i++)
		
		{			
			JSONObject users= (JSONObject) userlogArray.get(i);
			String user= (String)users.get("username");
			String Password= (String)users.get("password");
			System.out.println(user);
			System.out.println(Password);
			
			//arr[i]=user+","+Password;
			//String User[]= arr[i].split(",");			
			//System.out.println(User[0]);
			//System.out.println(User[1]);
						
		}
				
	}
}
