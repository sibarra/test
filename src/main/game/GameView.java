package main.game;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView {
	private SurfaceHolder holder;

	public GameView (Context context)
	{
		super(context);
		holder = getHolder();
		holder.addCallback(new SurfaceHolder.Callback() 
		{
			
			public void surfaceDestroyed(SurfaceHolder holder) 
			{
				// TODO Auto-generated method stub
				
			}
			
			public void surfaceCreated(SurfaceHolder holder) 
			{
				// TODO Auto-generated method stub
				
			}
			
			public void surfaceChanged(SurfaceHolder holder, int format, int width,
					int height) 
			{
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}
