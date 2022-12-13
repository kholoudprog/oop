package oop2;

public class Player {
private float score ;
private  static int No_of_winners;
public Player(float score) {
	this.score=score;
	if(score>=3000) {
		No_of_winners++;
	}
}
public float getScore() {
	return score;
}
public void setScore(float score) {
	this.score = score;
}
public static int getNo_of_winners() {
	return No_of_winners;
}
public float  Increment_score(float score) {
	this.score=this.score+score;
	return this.score;
}
public float Decrement_score(float score) {
	this.score=this.score-score;
	return this.score;
}
public boolean equals(Object obj) {
	 return (this == obj);
}
@Override
public String toString() {
	return "Player [score=" + score + ", No_of_winners=" + No_of_winners + ", getScore()=" + getScore()
			+ ", getNo_of_winners()=" + getNo_of_winners() + "]";
}

}
















