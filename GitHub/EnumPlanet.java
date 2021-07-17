package GitHub;

public enum EnumPlanet {
	
	Mercury(3.303e+23, 2.4397e6),
	Venus(4.869e+24, 6.0518e6),
	Earth(5.976e+24, 6.37814e6),
	Mars(6.421e+23, 3.3972e6),
	Jupiter(1.9e+27, 7.1492e7),
	Saturn(5.688e+26, 6.0268e7),
	Uranus(8.686e+25, 2.5559e7),
	Neptune(1.024e+26, 2.4746e7),
	Pluto(1.21e+22, 1.185e7);
	
	private final double p_mass;
	private final double p_radius;
	
	EnumPlanet(double mass, double radius){
		this.p_mass = mass;
		this.p_radius = radius;
	}
	
	public double getMass() {
		return p_mass;
	}
	
	public double getRadius() {
		return p_radius;
	}
	
	public static final double G = 6.67300e-11;
	
	public double surfaceGravity() {
		return G * p_mass / Math.pow(p_radius, 2);
	}
	
	public double surfaceWeight(double surfaceMass) {
		return surfaceMass * surfaceGravity();
	}
}