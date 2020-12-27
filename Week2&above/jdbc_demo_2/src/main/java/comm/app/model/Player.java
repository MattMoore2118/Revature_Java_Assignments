package comm.app.model;

import java.util.Date;

public class Player {
	
	private int id;
	private String player_name;
	private int team_id;
	private int goals;
	private Date dob;
	private long earnings;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String player_name, int team_id, int goals, Date dob, long earnings) {
		super();
		this.id = id;
		this.player_name = player_name;
		this.team_id = team_id;
		this.goals = goals;
		this.dob = dob;
		this.earnings = earnings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getEarnings() {
		return earnings;
	}

	public void setEarnings(long earnings) {
		this.earnings = earnings;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", player_name=" + player_name + ", team_id=" + team_id + ", goals=" + goals
				+ ", dob=" + dob + ", earnings=" + earnings + "]";
	}
	
	

}
