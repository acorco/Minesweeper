package game;

public class Mine implements ICell {

    public void draw() {
        System.out.printf("%2c |", '-');
    }
}
