import java.io.Serializable;

public class SerilizationEx implements Serializable {

	public String name;
	public String color;
	public String type;

	public SerilizationEx(String name, String color, String type) {
		this.name = name;
		this.color = color;
		this.type = type;
	}

}

