package org.rozas.scrumparaandroid;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * 
 * @author manuel
 *
 */
public class ImageAdapter extends BaseAdapter {
	
	    private Context mContext;

	    private Integer[] myCards = {
	            R.drawable.card0,
	            R.drawable.card05,
	            R.drawable.card1,
	            R.drawable.card2,
	            R.drawable.card3,
	            R.drawable.card5,
	            R.drawable.card8,
	            R.drawable.card13,
	            R.drawable.card20,
	            R.drawable.card40,
	            R.drawable.card100,
	            R.drawable.card_question,
	            R.drawable.card_infinito,
	            R.drawable.card_beer,
	            R.drawable.card_coffe
	    };

	    public static final String[] MY_CARDS_TEXT = {
	            "0",
	            "1/2",
	            "1",
	            "2",
	            "3",
	            "5",
	            "8",
	            "13",
	            "20",
	            "40",
	            "100",
	            "???",
	            "infinite",
	            "a beer",
	            "a coffee"
	    };

	    
	    
	    
	    public ImageAdapter(Context c) {
	        mContext = c;
	        
	    }

	    public int getCount() {
	        return myCards.length;
	    }

	    public Object getItem(int position) {
	        return position;
	    }

	    public long getItemId(int position) {
	        return position;
	    }

	    public View getView(int position, View convertView, ViewGroup parent) {
	        ImageView i = new ImageView(mContext);
	        i.setFocusable(true);
	        i.setFocusableInTouchMode(true);
	        i.setImageResource(myCards[position]);
	        i.setScaleType(ImageView.ScaleType.FIT_XY);
	        i.setAdjustViewBounds(true);
	        i.bringToFront();
	        return i;
	    }


}
