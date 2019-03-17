
public abstract class Character {

	private int score = 0;
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int Score) {
		this.score = score;
	}
	
	public void increaseScore(int num) {
		score += num;
	}
	
	public void resetScore() {
		score=0;
	}
}
