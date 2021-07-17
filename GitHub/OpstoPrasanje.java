package GitHub;

class OpstoPrasanje extends Prasanje{
		private String odgovor;
		private int poeni;
		
		public OpstoPrasanje() {}
		public OpstoPrasanje(int code, String area, String question, String answer, int points) {
			super(code, area, question);
			odgovor = answer;
			poeni = points;
		}
		
		public void setOdgovor(String answer) {
			this.odgovor = answer;
		}
		
		public String getOdgovor() {
			return odgovor;
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
			s += "Poeni" + "\n";
			return s;
		}
		
		public void Prikazi_Podatoci() {
			System.out.println(this.toString());
		}
	}