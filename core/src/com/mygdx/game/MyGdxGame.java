package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture back;
	Sprite backSprite;
	Texture heroTexture;
	Sprite heroSprite;
	
	@Override
	public void create () {
		OrthographicCamera camera = new OrthographicCamera();
		camera.setToOrtho(false, 900, 900);
		batch = new SpriteBatch();
		batch.setProjectionMatrix(camera.combined);
		back = new Texture("background.png");
		backSprite = new Sprite(back);

		heroTexture = new Texture("hero1.png");
		heroSprite = new Sprite(heroTexture, 0, 0, 92, 90);
		heroSprite.setPosition(300, 300);
		heroSprite.rotate(45);
	}

	@Override
	public void render () {
		batch.begin();
		backSprite.draw(batch);
		heroSprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		heroTexture.dispose();
		back.dispose();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}
}
