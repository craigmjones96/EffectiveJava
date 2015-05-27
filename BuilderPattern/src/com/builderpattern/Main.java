package com.builderpattern;

import com.builderpattern.FootballTeamFacts.FootballTeamFactsBuilder;

public class Main {
	
	public static void main(String[] args) {
		FootballTeamFactsBuilder builder = 
				new FootballTeamFactsBuilder("Old Trafford", 70000, "Manchester");
		
		builder.managerName("Sir Alex Ferguson");
		
		FootballTeamFacts facts = builder.build();
		
		System.out.println(facts.toString());
		
		// FootballTeamFacts facts2 = new FootballTeamFacts();
		// can't do this anymore as we have a private constructor that only
		// takes a FootballTeamFactsBuilder. So we must use the builder to
		// create the facts object every time
	}
}
