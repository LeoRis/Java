package GitHub;

class IzborPrasanje extends Prasanje{
		private int br_odgovori;
		private Odgovor[] odgovori;
		
		public IzborPrasanje() {}
		public IzborPrasanje(int code, String area, String question, int nrAnswers, Odgovor[] answers) {
			super();
			br_odgovori = nrAnswers;
			odgovori = new Odgovor[nrAnswers];
			
		}
		
		public void setBrOdgovori(int nrAnswers) {
			this.br_odgovori = nrAnswers;
		}
		
		public int getBrOdgovori() {
			return br_odgovori;
		}
		
		public void setOdgovori(Odgovor[] answers) {
			odgovori = new Odgovor[getBrOdgovori()]; // this.odgovori = answers;
		}
		
		public Odgovor[] getOdgovori() {
			return odgovori;
		}
		
		public String toString() {
			String s;
			s = super.toString();
			s += "Ponudeni odgovori: \n";
			for(int i = 0; i < getBrOdgovori(); i++) {
				s += " " + (i + 1) + ". " + odgovori[i].getTekst() + "\n";
			}
			return s;
		}
		
		public void Prikazi_Podatoci() {
			System.out.println(this.toString());
		}
	}
