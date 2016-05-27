package com.jasonscott.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jasonscott.game.JumpyDemo;
import com.jasonscott.game.sprites.Bird;
import com.jasonscott.game.sprites.Tube;

/**
 * Created by hus on 5/26/16.
 */
public class PlayState extends State {
    private Bird bird;
    private Texture bg;
    private Tube tube;



    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Bird(50, 300);
        cam.setToOrtho(false, JumpyDemo.WIDTH / 2, JumpyDemo.HEIGHT / 2);
        bg = new Texture("bg.png");
        tube = new Tube(100);
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched())
            bird.jump();

    }

    @Override
    public void update(float dt) {
        handleInput();
        bird.update(dt);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x - (cam.viewportWidth / 2), 0);
        sb.draw(bird.getTexture(), bird.getPosition().x, bird.getPosition().y);
        sb.draw(tube.getTopTube(), tube.getPosTopTube().x, tube.getPosTopTube().y);
        sb.draw(tube.getBottomTube(), tube.getPosBottomTube().x, tube.getPosBottomTube().y);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
