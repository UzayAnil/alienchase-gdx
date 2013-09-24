package tk.makigas.chase.actor;

import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class DisparadorActor extends CuerpoActor {

	protected Stage stage;
	protected final List<BulletActor> bullets = new LinkedList<BulletActor>();

	public DisparadorActor(Stage stage) {
		this.stage = stage;
	}

	public abstract void disparar();

	public List<BulletActor> getBullets() {
		return bullets;
	}

}