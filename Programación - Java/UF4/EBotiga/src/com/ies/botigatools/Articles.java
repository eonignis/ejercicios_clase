package com.ies.botigatools;

public class Articles implements Comparable {
	private String id, nom;
	private double detall, preu;
	private int quantitat;

	public Articles(String id, String nom, double detall, double preu, int quantitat) {
		this.id = id;
		this.nom = nom;
		this.detall = detall;
		this.preu = preu;
		this.quantitat = quantitat;
	}
	
	public Articles(String idIn, String nomIn, String detallIn, String qtyIn) {
		id = idIn;
		nom = nomIn;
		detall = Double.parseDouble(detallIn);
		quantitat = Integer.parseInt(qtyIn);
		if (quantitat> 400)
			preu = detall * .5D;
		else if (quantitat > 200)
			preu = detall * .6D;
		else
			preu = detall * .7D;
		preu = Math.floor(preu * 100 + .5) / 100;
	}

	@Override
	public int compareTo(Object objeto) {
		Articles temp=(Articles) objeto;
		if(this.preu<temp.preu)	
			return -1;
		else if(this.preu>temp.preu)	
			return 1;
		return 0;
	}

	
	
	// GETTERS Y SETTERS - TO_STRING
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getDetall() {
		return detall;
	}

	public void setDetall(double detall) {
		this.detall = detall;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public int getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}

	@Override
	public String toString() {
		return "Articles [id=" + id + ", nom=" + nom + ", detall=" + detall + ", preu=" + preu + ", quantitat="
				+ quantitat + "]";
	}

}
