package actions;

import org.json.JSONArray;
import org.json.JSONObject;

import helper.JsonSchema;

/*
*created method for get foregin player present in team.
*/

public class ForeignPlayer extends JsonSchema {

	public int getForeginPlayerCount() {

		String playerString = rcbJson.optString("player");
		JSONArray playerArray = new JSONArray(playerString);

		int foreignPlayer = 0;
		String india = "India";
		String countryName = null;

		for (int i = 0; i < playerArray.length(); i++) {
			JSONObject playerJson = new JSONObject(playerArray.optString(i));
			countryName = playerJson.get("country").toString();

			if (!countryName.equals(india)) {
				foreignPlayer++;
			}
		}
		System.out.println("Total Foreign player in Team: " + foreignPlayer);

		return foreignPlayer;
	}
}
