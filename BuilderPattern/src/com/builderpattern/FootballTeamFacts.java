package com.builderpattern;

public class FootballTeamFacts {

	private final String stadiumName;
	private final int stadiumCapacity;
	private final String city;	
	private final String managerName;
	private final String captainName;
	
	private FootballTeamFacts(FootballTeamFactsBuilder builder) {
		this.stadiumName = builder.stadiumName;
		this.stadiumCapacity = builder.stadiumCapacity;
		this.city = builder.city;
		this.managerName = builder.managerName;
		this.captainName = builder.captainName;
	}
	
	@Override
	public String toString() {
		return "FootballTeamFacts [stadiumName=" + stadiumName
				+ ", stadiumCapacity=" + stadiumCapacity + ", city=" + city
				+ ", managerName=" + managerName + ", captainName="
				+ captainName + "]";
	}

	public static class FootballTeamFactsBuilder {
		// required fields
		private final String stadiumName;
		private final int stadiumCapacity;
		private final String city;
		
		// optional fields
		private String managerName = "";
		private String captainName = "";
		
		public FootballTeamFactsBuilder(String stadiumName, int stadiumCapacity, String city) {
			this.stadiumName = stadiumName;
			this.stadiumCapacity = stadiumCapacity;
			this.city = city;
		}
		
		public FootballTeamFactsBuilder managerName(String managerName) {
			this.managerName = managerName;
			return this;
		}
		
		public FootballTeamFactsBuilder captainName(String captainName) {
			this.captainName = captainName;
			return this;
		}
		
		public FootballTeamFacts build() {
			return new FootballTeamFacts(this);
		}
	}
}
