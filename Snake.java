/**
Class for defining a snake in a virtual pet simulator.
*/
public class Snake extends Pet {
	/**
	Constructor for Snake. Uses the Super constructor from Pet to set
	the name of the Snake
	@param name the name of the snake
	*/
    public Snake(String name) {
        super(name);
    }

	/**
	Prints the name of the snake followed by "says: Hiss!"
	*/
    public void hiss() {
        System.out.println(getName() + " says: Hiss!");
    }

    /**
	Prints the slither action of the snake.
	*/
	public void slither() {
		System.out.println(getName() + " slithers on the ground!");
	}
}
