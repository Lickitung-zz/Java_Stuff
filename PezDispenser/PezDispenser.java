class PezDispenser {
	private String characterName = "Yoda";
	public String getCharacterName() {
		return characterName;
	};
	public PezDispenser(String characterName) {
		this.characterName = characterName;
	};
	public String swapHead(String characterName) {
		String originalCharacterName = this.characterName;
		this.characterName = characterName;
		return originalCharacterName;
	}
}