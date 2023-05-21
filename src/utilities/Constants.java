package utilities;

public class Constants {

	public static class Projectiles {
		public static final int CROISSANT = 0;
		public static final int MACARONS = 1;
		public static final int CUPCAKE = 2;
		public static final int BLUEMACARONS = 3;
		public static final int YELLOWMACARONS = 4;
		

		public static float getConstantSpeed(int type) {
			switch (type) {
				case CUPCAKE:
					return 7f;
				case CROISSANT:
					return 8f;
			}
			return 0f;
		}
	}

	public static class Direction {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}

	public static class Enemies {
		public static final int CORN = 0;
		public static final int TOMATO = 1;
		public static final int CABBAGE = 2;
		public static final int ONION = 3;

		public static int getConstantReward(int enemyType) {
			switch (enemyType) {
			case CORN:
				return 5;
			case TOMATO:
				return 5;
			case CABBAGE:
				return 25;
			case ONION:
				return 10;
			}
			return 0;
		}

		public static float getConstantSpeed(int enemyType) {
			switch (enemyType) {
			case CORN:
				return 1.2f;
			case TOMATO:
				return 1.6f;
			case CABBAGE:
				return 2.4f;
			case ONION:
				return 2.8f;
			}
			return 0;
		}

		public static int getConstantStartHealth(int enemyType) {
			switch (enemyType) {
			case CORN:
				return 300;
			case TOMATO:
				return 500;
			case CABBAGE:
				return 650;
			case ONION:
				return 850;
			}
			return 0;
		}
	}

	public static class Towers {
		public static final int PRINCESS = 0;
		public static final int CHEF = 1;
		public static final int OWNER = 2;

		public static int getConstantStartDamage(int towerType) {
			switch (towerType) {
			case PRINCESS:
				return 80;
			case CHEF:
				return 30;
			case OWNER:
				return 1;
			}

			return 0;
		}

		public static float getConstantDefaultRange(int towerType) {
			switch (towerType) {
			case PRINCESS:
				return 300;
			case CHEF:
				return 300;
			case OWNER:
				return 300;
			}

			return 0;
		}

		public static float getConstantDefaultCooldown(int towerType) {
			switch (towerType) {
			case PRINCESS:
				return 100;
			case CHEF:
				return 50;
			case OWNER:
				return 5 * 60;
			}

			return 0;
		}

		public static String getConstantTowerName(int towerType) {
			switch (towerType) {
			case PRINCESS:
				return "Princess";
			case CHEF:
				return "Chef";
			case OWNER:
				return "Owner";
			}
			return "";
		}

		public static int getConstantTowerCost(int towerType) {
			switch (towerType) {
			case PRINCESS:
				return 60;
			case CHEF:
				return 40;
			case OWNER:
				return 800;
			}
			return 0;
		}

	}

	public static class Tiles {
		public static final int WATER_TILE = 0;
		public static final int GRASS_TILE = 1;
		public static final int ROAD_TILE = 2;
	}
}
