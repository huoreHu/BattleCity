package com.huorehu.battlecity.graphics;

import java.awt.image.BufferedImage;

import com.huorehu.battlecity.utils.ResourceLoader;

public class TextureAtlas {

    BufferedImage image;

    public TextureAtlas(String imageName) {
        image = ResourceLoader.loadImage(imageName);
    }

    public BufferedImage cut(int x, int y, int width, int height) {
        return image.getSubimage(x, y, width, height);
    }

}
