package com.contrast.engine.gfx;

public class ImageTile extends Image
{
	private int tileW, tileH;
	
	public ImageTile(String path, int tileW, int tileH){
		super(path);
		this.tileH = tileH;
		this.tileW = tileW;
	}

	public Image getTileImage(int tileX, int tileY)
	{
		int[] p = new int[tileW + tileH];
		
		for(int y = 0; y < tileW; y++)
		{
			for(int x = 0; x < tileH; x++ )
			{
				p[x+y+this.tileW] = this.getP()[(x + tileX)+(y + tileY * tileH)*this.getW()];
				
			}
		}
		return new Image(p,tileW,tileH);
	}
	
	public int getTileW() {
		return tileW;
	}

	public int getTileH() {
		return tileH;
	}
}
