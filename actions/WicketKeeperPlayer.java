package actions;

import org.json.JSONArray;
import org.json.JSONObject;

import helper.JsonSchema;

public class WicketKeeperPlayer extends JsonSchema{
	
	public int getWKPlayerCount() {

		String playerString = rcbJson.optString("player");
		JSONArray playerArray = new JSONArray(playerString);

		int wkRole = 0;
		String wk = "Wicket-keeper";
		String role = null;

		for (int i = 0; i < playerArray.length(); i++) {
			JSONObject playerJson = new JSONObject(playerArray.optString(i));
			role = playerJson.get("role").toString();

			if (role.equals(wk)) {
				wkRole++;
			}
		}
		System.out.println("Total Wicket-keeper player in Team: " + wkRole);

		return wkRole;
	}

}
