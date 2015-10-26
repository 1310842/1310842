package tpe_gruppe11_hs.mannheim;

public class Rassen {
		
		/** Attribute
		 */
		private double leben; 
		private double schaden;
		private double geschwindigkeit;
		private double rüstung;
		
		/** Constructor
		 * @param leben
		 * @param schaden
		 * @param geschwindigkeit
		 * @param rüstung
		 */
		public Rassen (double leben, double schaden, double geschwindigkeit, double rüstung) {
			this.leben = leben;
			this.schaden = schaden;
			this.geschwindigkeit = geschwindigkeit;
			this.rüstung = rüstung;
			}

		/**Method attack
		 */
		public double attack (Rassen rasse) {
			double damage = this.geschwindigkeit*this.schaden;
			return damage;
		}
		
		/**Method isLebendig
		 */
		public boolean isLebendig () {
			if (this.leben>0) {
				return true;
			}
			 return false;
		}
			 
		/**Method to offer attribute
		 * @return
		 */
		public double getLeben () {
			return this.leben;
		}
			
			
		}
		}