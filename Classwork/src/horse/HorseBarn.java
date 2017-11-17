package horse;

public class HorseBarn {

	
	public HorseBarn(Horse[] horses) {
		this.spaces = horses;
	}
	private Horse[] spaces;

	public int findHorseSpace(String Name) {
		for(int i = 0; i < this.spaces.length; i++) {
			if(this.spaces[i] != null && Name.equals(this.spaces[i].getName())) {
				return i;
			}
		}
		return -1;
	}
	
	public void consolidate() {
		for(int i = 0; i < spaces.length - 1; i++) {
			if(this.spaces[i] == null) {
				for(int j = i+1; j < this.spaces.length; j++) {
					if(this.spaces[j] != null) {
						this.spaces[i] = this.spaces[j];
						this.spaces[j] = null;
						j = this.spaces.length;
					}
				}
			}
		}
	}
	
	public String toString() {
		String sadman = "";
		for(int i = 0; i < spaces.length; i++) {
			if(spaces[i] != null) {
				sadman += "[" + spaces[i] + "]";
			}
			else {
				sadman += "[" + "null" + "]";
			}
		}
		return sadman;
	}
	
}
