package OurGame.Player.Cards.Normal;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Lion extends NormalCard{

    public Lion() {
        super("Lion");
        animalPicture = new Picture(550, 85, "LION.jpg");
        animalPicture.draw();

    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void actionOne() {
        super.actionOne();

    }

    @Override
    public void actionTwo() {
        super.actionTwo();

    }

    @Override
    public void actionThree() {

    }

    @Override
    public void actionFour() {

    }

    @Override
    public void actionSelected() {
        super.actionSelected();
    }


    @Override
    public void cardSelected() {
        super.cardSelected();
        animalString = new Picture();
        actionRandomizer();
    }

    @Override
    public void actionRandomizer() {
        int randomize = (int) ((Math.random() * 4) + 1);

        switch (randomize) {
            case 1:
                actionOne();
                break;
            case 2:
                actionTwo();
                break;
            case 3:
                actionThree();
                break;
            case 4:
                actionFour();
                break;
            default:
                System.out.println("Something unexpected happened!");
        }

    }
}