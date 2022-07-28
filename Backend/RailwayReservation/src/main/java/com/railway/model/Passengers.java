package com.railway.model;

/**
 * The Class Passengers.
 */
public class Passengers {

	/** The adults. */
	private int adults;
	
	/** The children. */
	private int children;

	/**
	 * Instantiates a new passengers.
	 */
	public Passengers() {
		super();
	}

	/**
	 * Instantiates a new passengers.
	 *
	 * @param adults the adults
	 * @param children the children
	 */
	public Passengers(int adults, int children) {
		super();
		this.adults = adults;
		this.children = children;
	}

	/**
	 * Gets the adults.
	 *
	 * @return the adults
	 */
	public int getAdults() {
		return adults;
	}

	/**
	 * Sets the adults.
	 *
	 * @param adults the new adults
	 */
	public void setAdults(int adults) {
		this.adults = adults;
	}

	/**
	 * Gets the children.
	 *
	 * @return the children
	 */
	public int getChildren() {
		return children;
	}

	/**
	 * Sets the children.
	 *
	 * @param children the new children
	 */
	public void setChildren(int children) {
		this.children = children;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Passengers [adults=" + adults + ", children=" + children + "]";
	}

}
