package buildings;

abstract public class MilitaryBuilding extends Building {
	public int getRecruitmentCost() {
		return recruitmentCost;
	}

	public void setRecruitmentCost(int recruitmentCost) {
		this.recruitmentCost = recruitmentCost;
	}

	public int getCurrentRecruit() {
		return currentRecruit;
	}

	public void setCurrentRecruit(int currentRecruit) {
		this.currentRecruit = currentRecruit;
	}

	public int getMaxRecruit() {
		return maxRecruit;
	}

	private int recruitmentCost;
	private int currentRecruit;
	private final int maxRecruit = 3;
	
	public MilitaryBuilding(int cost , int upgradeCost , int recruitmentCost){
		super(cost, upgradeCost);
		this.recruitmentCost = recruitmentCost;
	}
}
