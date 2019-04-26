package uqu.jeelab.model;

public class movieslist {
	private String Name;
	private String Date;
	private String Time;
	
	public movieslist(String Name,String Date, String Time) {
		Name = Name;
		Date = Date;
		Time = Time;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}


}
