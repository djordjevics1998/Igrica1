package interfaces;

public interface OnInteractionListener {
	/*public void attack(OnInteractionListener target) {
		target.onDefend(this);
	}*/
	public int onAttackDamage();
	public boolean onDefend(OnInteractionListener attacker);
}
