package com.builderpattern;

import com.builderpattern.FootballTeamFacts.FootballTeamFactsBuilder;

public class Main {
	
	public static void main(String[] args) {
		FootballTeamFactsBuilder builder = 
				new FootballTeamFactsBuilder("Old Trafford", 70000, "Manchester");
		
		builder.managerName("Sir Alex Ferguson");
		
		FootballTeamFacts facts = builder.build();
		
		System.out.println(facts.toString());
	}
}
