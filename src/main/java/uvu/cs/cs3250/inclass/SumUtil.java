package uvu.cs.cs3250.inclass;

import java.math.BigInteger;

public class SumUtil {
	public static <T> T sum(T ... elements) throws Exception {
		if (elements.length > 0) {
			T firstElement = elements[0];
			if (firstElement instanceof Integer) {
				Integer s = (Integer)firstElement;
				for (int n = 1; n< elements.length; n++) {
					s += (Integer)elements[n];
				}
				return (T) s;
			}
			else if (firstElement instanceof BigInteger) {
				BigInteger s = (BigInteger)firstElement;
				for (int n = 1; n< elements.length; n++) {
					s = s.add((BigInteger)elements[n]);
				}
				return (T) s;
			}
			else {
				throw new Exception("Type is not support");
			}
		}
		else {
			throw new Exception("Empty array!");
		}
		
	}
}
