package com.qa.swampAssessment;


public class Runner extends Utils {
	public static void main(String[] args) {
		System.out.println("Welcome to the swamp! There is nothing but horrible water and mud around you here,"
				+ "But dear traveler there is hope! There is a portal out of this place some distance away from you,"
				+ "please use the commands: north, south, east and west to move around"
				+ "you have been given a magic compass telling you how far away from the portal you are"
				+ "move around to figure out where the portal is to escape this swamp or get stuck here for ever");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		boolean treasureFound = false;
		double playerPosX = Math.round(Math.random() * 10); // moving north +1 south -1
		double playerPosY = Math.round(Math.random() * 10); // moving east +1 west -1
		double treasurePosX = Math.round(Math.random() * 10);
		double treasurePosY = Math.round(Math.random() * 10);

		double x = playerPosX - treasurePosX;
		double y = playerPosY - treasurePosY;

//		System.out.println(playerPosX);

//			System.out.println(playerPosY);
//		System.out.println(treasurePosX);
//			System.out.println(treasurePosY);
		if (playerPosX == treasurePosX && playerPosY == treasurePosY) {
			treasureFound = true;
			System.out.println("Well done young traveler you have reached the portal!");
			System.exit(0);
		}
		while (treasureFound == false) {
			System.out.println("Please enter a valid direction:");
			String direction = Utils.direction();

			if (direction.equalsIgnoreCase("north")) {
				playerPosX = playerPosX + 1;
				System.out.println(Math.hypot(x, y) + "Meters Away");

			} else if (direction.equalsIgnoreCase("south")) {
				playerPosX = playerPosX - 1;
				System.out.println(Math.hypot(x, y) + "Meters Away");

			} else if (direction.equalsIgnoreCase("east")) {
				playerPosY = playerPosY + 1;
				System.out.println(Math.hypot(x, y) + "Meters Away");

			} else if (direction.equalsIgnoreCase("west")) {
				playerPosY = playerPosY - 1;
				System.out.println(Math.hypot(x, y) + "Meters Away");

			} else {
				System.out.println("Enter an actual direction");
			}
		}
	}
}