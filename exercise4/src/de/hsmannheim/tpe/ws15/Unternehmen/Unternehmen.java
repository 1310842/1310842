package de.hsmannheim.tpe.ws15.Unternehmen;

public class Unternehmen {

	private String unternehmenName;
	private int gewinn;

	public Unternehmen(String unternehmenName, int gewinn) {
		this.unternehmenName = unternehmenName;
		this.gewinn = gewinn;

	}

	@Override
	public String toString() {
		return ("(" + this.getClass().getSimpleName() + ") " + this.getUnternehmenName() + ", Gewinn: "
				+ this.getGewinn());
	}

	private String getUnternehmenName() {
		return unternehmenName;
	}

	private void setUnternehmenName(String unternehmenName) {
		this.unternehmenName = unternehmenName;
	}

	public int getGewinn() {
		return gewinn;
	}

	private void setGewinn(int gewinn) {
		this.gewinn = gewinn;
	}

}
