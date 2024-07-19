package days15;

public interface Engine {

	
		
		//method
		public abstract void moreFuel(int fuel);
		void lessFuel(int fuel);
		void stop();

		static void staticMethod() {
			//
		}
		
		default void newMethod() {
			//몸체 구현
		}

}
