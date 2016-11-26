package domain;
/**
 * StaffID class implements ID interface.
 * this class is used for create unique ID for new staff member.
 * Example STA1, STA2, STA3 
 * @author Nirav
 *
 */
public class StaffID implements ID {

			/**
			 * @param staffCount type of static int with default value "0"
			 */
			public static int staffCount = 0;
				String staffCode = "STA";

				/**
				 * override method CreateID(),
				 *@return toString of staffCode
				 */
				@Override
				public String createID() {
							
							return staffCode.toString();
				}
				/**
				 * override method of toString(),
				 * @return staffCode+ staffCount as string.
				 */
				@Override 
				public String toString(){
					staffCount++;
					return staffCode + staffCount;
				}
			}
