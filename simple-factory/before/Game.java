public class Game {
  public static void main(String[] args) {
    CharacterFactory cFactory = new SimpleCharacterFactory();

    Character troll = cFactory.createCharacter(CharacterType.TROLL, WeaponType.CLUB, "Lillfjant");
    Character sirJames = cFactory.createCharacter(CharacterType.KNIGHT, WeaponType.SWORD, "Sir James");
    Character blackKnight = cFactory.createCharacter(CharacterType.KNIGHT, WeaponType.UNARMED, "Fistfighting Black Knight");

    System.out.println(troll);
    System.out.println(sirJames);
    System.out.println(blackKnight);
  }
}
