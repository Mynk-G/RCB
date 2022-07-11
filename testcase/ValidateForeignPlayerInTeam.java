package testcase;

import org.testng.annotations.Test;

import actions.ForeignPlayer;

/*
 * Validating team has only 4 Foreign player.
 */

public class ValidateForeignPlayerInTeam {

	@Test
	public void validateForeignPlayerInTeam() {

		ForeignPlayer ac = new ForeignPlayer();
		int foreignPlayer = ac.getForeginPlayerCount();

		// More than 4 foreign players have not been accepted in this condition.
		if (foreignPlayer > 4) {
			System.err.println("Team does not have foreign player more than 4");
		} else {
			System.out.println("Followed the criteria of maximum foreign player present in team");
		}

	}

}
