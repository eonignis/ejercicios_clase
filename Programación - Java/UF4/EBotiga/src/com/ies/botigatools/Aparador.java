package com.ies.botigatools;

import java.util.Collections;
import java.util.LinkedList;

public class Aparador {
	private LinkedList cataleg=new LinkedList();
	
	public void addArticle(String id, String nom, String preu, String quantitat) {
		Articles art=new Articles (id, nom, preu, quantitat);
		cataleg.add(art);
		
	}
	
	public Articles getArticle(int i) {
		return (Articles) cataleg.get(i);
	}
	
	public int getSize() {
		return cataleg.size();
	}
	
	public void sort() {
		Collections.sort(cataleg);
	}
}
