package comStrategy;
import Pedal.Speed;
import Pedal.MTB;

public enum TipoPedal {
	MTB {
		@Override
		public Pedal obterPedal() {
			return new MTB();
		}
	},
	SPEED {
		@Override
		public Pedal obterPedal() {
			return new Speed();
		}
	};
	
	public abstract Pedal obterPedal();

	
}
