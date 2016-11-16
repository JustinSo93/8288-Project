package domain;

public class SoloistID implements ID{

		public static int soloCount = 0;
			String soloCode = "SOL";

			@Override
			public String createID() {
						
						return soloCode.toString();
			}
			@Override 
			public String toString(){
				soloCount++;
				return soloCode + soloCount;
			}
		}
