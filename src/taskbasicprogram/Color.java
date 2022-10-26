package taskbasicprogram;
// EX 9
	public enum Color{//swami - resolved
		Violet(1),Indigo(2),Blue(3),Green(4),Yellow(5),Orange(6),Red(7);
		private int value;
		
		private Color(int value) {
			this.value=value;
		}

		public int value() {
			return value;
		}
		}
