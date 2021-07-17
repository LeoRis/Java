package GitHub;

public class Publication extends Sample {
	private float influenceFactor;
	
	public Publication(String publicationTitle, String publicationPublisher, int days, float influenceFactor) {
		super(publicationTitle, publicationPublisher, days);
		this.influenceFactor = influenceFactor;
	}

	public void setInfluenceFactor(float influenceFactor) {
		this.influenceFactor = influenceFactor;
	}
	
	public float getInfluenceFactor() {
		return this.influenceFactor;
	}
	
	@Override
	
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}
	
	@Override
	
	public String toString() {
		return "Publication { Title: " + getTitle() + " Publisher: " + getPublisher() + " Number of pages: " + getInfluenceFactor() + " }";
	}
	
	@Override
	
	public int Score() {
		return (int)(getNumberOfRentals() * getInfluenceFactor());
	}
	
}
