import java.util.Formatter;

public class createfile {

	private Formatter x;

	public void openFile() {
		try {
			x = new Formatter("chinese.txt");

		} catch (Exception e) {

			System.out.println("error");
		}
	}

	public void addRecords() {

		x.format("%s%s%s", "20", "haah", "ojj");
	}

	public void closeFile() {

		x.close();
	}

}
