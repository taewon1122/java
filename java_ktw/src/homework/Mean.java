package homework;

import java.util.Objects;

public class Mean {
	String mean, type;

	@Override
	public int hashCode() {
		return Objects.hash(mean, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mean other = (Mean) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(type, other.type);
	}
	
	
}
