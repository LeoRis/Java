package GitHub;
	
class Odgovor {
		private String tekst;
		private boolean tocno;
		private int poeni;
		
		public Odgovor() {}
		public Odgovor(String text, boolean exactly, int points) {
			tekst = text;
			tocno = exactly;
			poeni = points;
		}
		
		public void setTekst(String text) {
			this.tekst = text;
		}
		
		public String getTekst() {
			return tekst;
		}
		
		public void setTocno(boolean exactly) {
			this.tocno = exactly;
		}
		
		public boolean getTocno() {
			return tocno;
		}
		
		public void setPoeni(int points) {
			this.poeni = points;
		}
		
		public int getPoeni() {
			return poeni;
		}
		
		public String toString() {
			String s;
			s = super.toString();
			s += "Tekst: " + getTekst() + "\n";
			s += "Tocno: " + getTocno() + "\n";
			s += "Poeni: " + getPoeni() + "\n";
			return s;
		}
		
		public void Prikazi_Podatoci() {
			System.out.println(this.toString());
		}
	}
