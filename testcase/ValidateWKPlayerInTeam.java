package testcase;

import org.testng.annotations.Test;

import actions.WicketKeeperPlayer;

/*
 * Validating team have at least one wicket keeper.
 */

public class ValidateWKPlayerInTeam {

	@Test
	public void validateWKPlayerInTeam() {
		WicketKeeperPlayer wk = new WicketKeeperPlayer();
		int wkPlayer = wk.getWKPlayerCount();

		if (wkPlayer >= 1) {
			System.out.println("Followed the criteria of minimum wicket-keeper present for team building.");
		} else {
			System.err.println("Team should have atleast 1 Wicket-Keeper");
		}
	}

}
