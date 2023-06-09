package scenes;

import main.Game;
import ui.MyButton;
import static main.GameState.*;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Menu extends GameScene implements SceneMethods {

	/*
	 * playing button.
	 */
	private MyButton bPlaying;
	/*
	 * edit button.
	 */
	private MyButton bEdit;
	/*
	 * quit button.
	 */
	private MyButton bQuit;

	/*
	 * initialize fields.
	 */
	public Menu(Game game) {
		super(game);
		initButtons();
	}

	/*
	 * initialize buttons.
	 */
	private void initButtons() {

		int w = 150;
		int h = w / 3;
		int x = 640 / 2 - w / 2;
		int y = 400;
		int yOffset = 100;

		bPlaying = new MyButton("Play", x, y, w, h);
		bEdit = new MyButton("Edit", x, y + yOffset, w, h);
		bQuit = new MyButton("Quit", x, y + yOffset * 2, w, h);

	}

	@Override
	/*
	 * render menu.
	 */
	public void render(GraphicsContext gc) {
		gc.drawImage(new Image(ClassLoader.getSystemResource("images/title.jpg").toString()), 0, 0, 640, 800);

		
		drawButtons(gc);
	}
	/*
	 * draw buttons.
	 */
	private void drawButtons(GraphicsContext gc) {
		bPlaying.draw(gc);
		bEdit.draw(gc);
		bQuit.draw(gc);

	}

	@Override
	/*
	 * handle mouse click.
	 */
	public void mouseClicked(int x, int y) {

		if (bPlaying.getBounds().contains(x, y)) {
			game.getPlaying().getSoundPlayer().gameStart();
			setGameState(PLAYING);
		}
		else if (bEdit.getBounds().contains(x, y))
			setGameState(EDIT);
		else if (bQuit.getBounds().contains(x, y))
			System.exit(0);
	}

	@Override
	/*
	 * handle mouse move.
	 */
	public void mouseMoved(int x, int y) {
		bPlaying.setMouseOver(false);
		bEdit.setMouseOver(false);
		bQuit.setMouseOver(false);

		if (bPlaying.getBounds().contains(x, y))
			bPlaying.setMouseOver(true);
		else if (bEdit.getBounds().contains(x, y))
			bEdit.setMouseOver(true);
		else if (bQuit.getBounds().contains(x, y))
			bQuit.setMouseOver(true);

	}

	@Override
	/*
	 * handle moudse press.
	 */
	public void mousePressed(int x, int y) {

		if (bPlaying.getBounds().contains(x, y))
			bPlaying.setMousePressed(true);
		else if (bEdit.getBounds().contains(x, y))
			bEdit.setMousePressed(true);
		else if (bQuit.getBounds().contains(x, y))
			bQuit.setMousePressed(true);

	}

	@Override
	/*
	 * handle mouse release.
	 */
	public void mouseReleased(int x, int y) {
		resetButtons();
	}
	/*
	 * handle reset button clicked.
	 */
	private void resetButtons() {
		bPlaying.resetBooleans();
		bEdit.resetBooleans();
		bQuit.resetBooleans();

	}

	@Override
	/*
	 * handle mouse drag.
	 */
	public void mouseDragged(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	/*
	 * handle mouse right clicked.
	 */
	public void mouseRightClicked(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}