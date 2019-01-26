package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture texture;
    Sprite s[];

    @Override
    public void create() {
        batch = new SpriteBatch();
        texture = new Texture("tex4096.png");
        texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Nearest);

        s = new Sprite[4];
        for (int i = 0; i < 4; i++) {
            s[i] = new Sprite(texture, 1268 + 8 * i, 3771 + i, 1, 10);
            s[i].setBounds(100 + 100 * i, 100, s[i].getRegionWidth() * 30, s[i].getRegionHeight() * 30);
        }
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        for (int i = 0; i < 4; i++)
            s[i].draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        texture.dispose();
    }
}
