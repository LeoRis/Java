package GitHub;

class Prasanje {
		private int shifra;
		private String oblast;
		private String prasanje;
		
		public Prasanje() {}
		public Prasanje(int code, String area, String question) {
			shifra = code;
			oblast = area;
			prasanje = question;
		}
		
		public void setShifra(int code) {
			this.shifra = code;
		}
		
		public int getShifra() {
			return shifra;
		}
		
		public void setOblast(String area) {
			this.oblast = area;
		}
		
		public String getOblast() {
			return oblast;
		}
		
		public void setPrasanje(String question) {
			this.prasanje = question;
		}
		
		public String getPrasanje() {
			return prasanje;
		}
		
		public String toString() {
			String s;
			s = "Shifra: " + getShifra() + "\n";
			s += "Oblast: " + getOblast() + "\n";
			s += "Tekst: " + getPrasanje() + "\n";
			return s;
		}
		
		public void Prikazi_Podatoci() {
			System.out.println(this.toString());
		}	
		
	}