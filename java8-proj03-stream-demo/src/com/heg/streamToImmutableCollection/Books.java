package com.heg.streamToImmutableCollection;

public class Books {

	// Member variables of this class
	int rank;
	String name;
	int value;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Books(int rank, String name, int value) {
		super();
		this.rank = rank;
		this.name = name;
		this.value = value;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

}
