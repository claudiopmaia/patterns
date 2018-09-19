package br.uece.ees.adapter;

import java.util.ArrayList;

public class Amazon {

	public ArrayList<String> ids = new ArrayList<String>();
	
	public Amazon(){
		ids.add("paulo");
		ids.add("henrique");
	}
	
	public boolean store(String id, String arquivo){
		if (ids.contains(id)){
			System.out.println("Salvando arquivo " + arquivo + " na nuvem");
			return true;
		}			
		
		return false;
	}
}
