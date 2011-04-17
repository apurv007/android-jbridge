package android.jbridge.client;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class Shop extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        View productsButton = findViewById(R.id.products_button);
        productsButton.setOnClickListener(this);
        
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
        
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
        
        
		String jsonTxt = "[{color: \"yellow\",value: \"#ff0\"},{color: \"black\",value: \"#000\"}]";
		try
		{
			JSONObject jsonResponse = new JSONObject(jsonTxt);
		}
		catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.products_button:
			Intent productsWindow = new Intent(this, Products.class);
			startActivity(productsWindow);
			break;
		case R.id.about_button:
			Intent aboutWindow = new Intent(this, About.class);
			startActivity(aboutWindow);
			break;
		case R.id.exit_button:
			finish();
			break;
		}
	}
}