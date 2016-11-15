package symphony;

public class TicketID implements ID{

		public static int tickCount = 0;
			String tickCode = "TIC";

			@Override
			public String createID() {
						
						return tickCode.toString();
			}
			@Override 
			public String toString(){
				tickCount++;
				return tickCode + tickCount;
			}
		}


