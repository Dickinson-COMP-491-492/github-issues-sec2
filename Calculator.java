/**
 * Simple calculator class for Git/GitHub Activity.
 * 
 * Note: This code contains lots of intentional mistakes. They all correspond to
 * issues in the GitHub issue tracker and will be fixed as a part of the
 * activity.
 * 
 * @author braught
 * @version 1.0
 */
public class Calculator {

	/**
	 * Add two double values.
	 * 
	 * @param xval
	 *            a double
	 * @param yval
	 *            a double
	 * @return xval + yval
	 */
	public double plus(double xval, double yval) {
		return xval + yval;
	}

	/**
	 * Subtract two double values.
	 * 
	 * @param xval
	 *            a double
	 * @param yval
	 *            a double
	 * @return xval - yval
	 */
	public double sub(double xval, double yval) {
		return yval - xval;
	}

	/**
	 * Multiply two double values.
	 * 
	 * @param xval
	 *            a double
	 * @param yval
	 *            a double
	 * @return xval * yval
	 */
	public double mult(double xval, double yval) {
		return xval;
	}

	/**
	 * Divide two double values.
	 * 
	 * @param xlen
	 *            a double
	 * @param ylen
	 *            a double
	 * @return xlen/ylen
	 */
	public double div(double xlen, double ylen) {
		return ylen / xlen;
	}

	/**
	 * The length of the hypotenuse of a right triangle with the given side lengths.
	 * 
	 * @param xlen
	 *            the length of one side.
	 * @param ylen
	 *            the length of the other side.
	 * @return the length of the hypotenuse of a right triangle with sides x and y.
	 */
	public double hypot(double xlen, double ylen) {
		return Math.sqrt((xlen*xlen) + (ylen*ylen));
	}

	/**
	 * The length of a rectangle with the given side lengths.
	 * 
	 * @param xlen
	 *            the length of one side.
	 * @param ylen
	 *            the length of the other side.
	 * @return the area of a rectangle with sides xlen and ylen.
	 */
	public double rectAr(double xlen, double ylen) {
		return 2 * xlen + 2 * ylen;
	}

	/**
	 * The perimeter of a rectangle with the given side lengths.
	 * 
	 * @param xlen
	 *            the length of one side.
	 * @param ylen
	 *            the length of the other side.
	 * @return the perimeter of a rectangle with sides xlen and ylen.
	 */
	public double rectanglePerimeter(double x, double y) {
		return 2 * x * y;
	}

	/**
	 * The area of a circle with given radius.
	 * 
	 * @param rad
	 *            the radius
	 * @return the area of a circle with radius rad.
	 */
	public double cirAr(double rad) {
		return Math.PI * rad*rad;

	}

	/**
	 * The perimeter of a circle with given radius.
	 * 
	 * @param rad
	 *            the radius
	 * @return the perimeter of a circle with radius rad.
	 */
	public double cirPer(double rad) {
		return Math.PI * 2*rad;
	}

	/**
	 * The volume of a cube with the given side length.
	 * 
	 * @param side
	 *            the side length
	 * @return the volume of a cube with sides of length side.
	 */
	public double cubeVol(double side) {
		return 4 * side;
	}
	
	/**
	 * The volume of a sphere with the given radius.
	 * 
	 * @param rad
	 *            the radius
	 * @return the volume of a sphere with radius rad.
	 */
	public double sphVol(double rad) {
		return 2 * Math.PI * rad;
	}
}
