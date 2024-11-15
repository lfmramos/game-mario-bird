import GameObjects.DisplayScore;
import GameObjects.Character;
import GameObjects.Scoreline;
import GameObjects.Structures.Tubes;

public class CollisionDetector {

    private final Character character;
    private final Tubes[] tubs;
    private final Scoreline[] scoreline;
    private final DisplayScore score;

    public CollisionDetector(Character character, Tubes[] tubs, Scoreline[] scoreline, DisplayScore score) {
        this.character = character;
        this.tubs = tubs;
        this.scoreline = scoreline;
        this.score = score;
    }

    public boolean isCrashed() {
        for (Tubes tube : tubs) {
            // Verifica colisão com a parte de baixo do tubo (tube bottom)
            if ((character.getX() + character.getCharacterWidth() >= tube.getXBot() &&
                    character.getX() <= tube.getXBot() + tube.getWidth() &&
                    character.getY() + character.getCharacterHeight() >= tube.getYBot())) {
                return true;
                // Verifica colisão com a parte de cima do tubo (tube top)
            } else if (character.getX() + character.getCharacterWidth() >= tube.getXTop() &&
                    character.getX() <= tube.getXTop() + tube.getWidth() &&
                    character.getY() <= tube.getYTop() + tube.getHeightTop()) {
                return true;
            }
        }
        return false;
    }

    public void incrementScore() {
        for (Scoreline line : scoreline) {
            if (character.getX() >= line.getX() && line.canScore()) {
                score.setScore();
                line.setScored();// Marca a linha como já pontuada
                // Se a linha estiver sendo resetada, pode permitir que seja pontuada novamente
            } else if (line.isReset()) {
                line.setCanScore(true);
                line.setReset(false);
            }
        }
    }
}