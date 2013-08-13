package com.myx.hub.response;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.myx.hub.structure.ContextUtil;
import com.myx.hub.structure.Response;
import com.myx.hub.structure.XMLParser;

public class CallPhone implements Response {
	public void callPhone(String phoneNumber){
		ArrayList<String> result = new ArrayList<String>();
		Intent callIntent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+phoneNumber));
		callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		Log.e("say","call end");
		Context context =ContextUtil.getInstance();
		
		context.startActivity(callIntent);
		result.add(phoneNumber);
		XMLParser x =new XMLParser();
		x.addOutput("5", "1", result);
	}
}
