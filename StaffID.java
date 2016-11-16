package domain;

public class StaffID implements ID {


			public static int staffCount = 0;
				String staffCode = "STA";

				@Override
				public String createID() {
							
							return staffCode.toString();
				}
				@Override 
				public String toString(){
					staffCount++;
					return staffCode + staffCount;
				}
			}
