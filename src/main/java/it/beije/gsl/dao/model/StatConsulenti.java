package it.beije.gsl.dao.model;

import java.io.Serializable;

public class StatConsulenti implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int totale;
	private int numJava;
	private int numDotNet;
	private int numAltro;
	private int numFrontEnd;
	private int numBackEnd;

	public int getNumJava() {
		return numJava;
	}

	public void setNumJava(int numJava) {
		this.numJava = numJava;
	}

	public int getNumDotNet() {
		return numDotNet;
	}

	public void setNumDotNet(int numDotNet) {
		this.numDotNet = numDotNet;
	}

	public int getNumAltro() {
		return numAltro;
	}

	public void setNumAltro(int numAltro) {
		this.numAltro = numAltro;
	}

	public int getNumFrontEnd() {
		return numFrontEnd;
	}
	
	public int getTotale() {
		return totale;
	}

	public void setTotale(int totale) {
		this.totale = totale;
	}

	@Override
	public String toString() {
		return "StatConsulenti [totale=" + totale + ", numJava=" + numJava + ", numDotNet=" + numDotNet + ", numAltro="
				+ numAltro + ", numFrontEnd=" + numFrontEnd + ", numBackEnd=" + numBackEnd + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numAltro;
		result = prime * result + numBackEnd;
		result = prime * result + numDotNet;
		result = prime * result + numFrontEnd;
		result = prime * result + numJava;
		result = prime * result + totale;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatConsulenti other = (StatConsulenti) obj;
		if (numAltro != other.numAltro)
			return false;
		if (numBackEnd != other.numBackEnd)
			return false;
		if (numDotNet != other.numDotNet)
			return false;
		if (numFrontEnd != other.numFrontEnd)
			return false;
		if (numJava != other.numJava)
			return false;
		if (totale != other.totale)
			return false;
		return true;
	}

	public void setNumFrontEnd(int numFrontEnd) {
		this.numFrontEnd = numFrontEnd;
	}

	public int getNumBackEnd() {
		return numBackEnd;
	}

	public void setNumBackEnd(int numBackEnd) {
		this.numBackEnd = numBackEnd;
	}

}
