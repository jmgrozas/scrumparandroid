package org.rozas.scrumparaandroid;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.Toast;

/**
 * Principal activity Scrum cards  for Paradigma Tecnologico
 *  
 * @author jmgrozas
 *
 */
public class ScrumParaAndroid extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        
        Gallery g = (Gallery) findViewById(R.id.gallery);
        /* Si no lo pongo asi no me funciona ...... debe de ser por algo interno del widget de la galeria */
        g.setBackgroundColor(Color.parseColor("#E84114"));
        g.setAdapter(new ImageAdapter(this));
        g.setSpacing(9);
        g.setAlwaysDrawnWithCacheEnabled(true);
        /* Para que todas esten seleccionadas (no haya ninguna sombreada no tiene sentido)*/
        g.setUnselectedAlpha(1);
        
        g.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
            	String text = ImageAdapter.MY_CARDS_TEXT[position];
                Toast.makeText(ScrumParaAndroid.this,  text, Toast.LENGTH_SHORT).show();
            }
        });
        
        
    }  
    
    
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
	   	MenuInflater mi = getMenuInflater();
	   	mi.inflate(R.menu.menu, menu);
		return true;
	}
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    		
    	switch (item.getItemId()) {
		case R.id.about:
			startActivity(new Intent(this,About.class));
			break;

		default:
			break;
		}
    	return false;
    }
    
    
}