package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.ArrayList;
import java.util.List;

/**
 * Climbing the Leaderboard
 * <p>
 * Alice is playing an arcade game and wants to climb to the top of the leaderboard. Can you help her track her ranking
 * as she plays? The game uses Dense Ranking, so its leaderboard works like this:
 * <p>
 * The player with the highest score is ranked number on the leaderboard. Players who have equal scores receive the same
 * ranking number, and the next player(s) receive the immediately following ranking number.
 * <p>
 * We want to determine Alice's rank as she progresses up the leaderboard. For example, the four players on the
 * leaderboard have high scores of , , , and . Those players will have ranks , , , and , respectively. If Alice's scores
 * are , and , her rankings after each game are , and .
 * <p>
 * You are given an array, , of monotonically decreasing leaderboard scores, and another array, , of Alice's scores for
 * the game. You must print integers. The integer should indicate the current rank of alice after her game.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer , the number of players on the leaderboard. The next line contains space-separated
 * integers , the leaderboard scores in decreasing order. The next line contains an integer, , denoting the number games
 * Alice plays. The last line contains space-separated integers , her game scores.
 * <p>
 * Example :
 * <p>
 * Inputs : 7
 * 100 100 50 40 40 20 10
 * 4 5 25 50 120
 * <p>
 * Outputs : 6 4 2 1
 */
public class Day11 {

    public static List<Integer> climb(final List<Integer> leaderboardScores, final List<Integer> aliceScores) {
        final List<Integer> positions = new ArrayList<>(aliceScores.size());

        for(final Integer aliceScore : aliceScores) {
            int currentPosition = 1;

            for(int index = 0, max = leaderboardScores.size(); index < max && leaderboardScores.get(index) >
                    aliceScore; ++index) {
                if(!(index != 0 && leaderboardScores.get(index).equals(leaderboardScores
                        .get(index - 1)))) {
                    ++currentPosition;
                }
            }

            positions.add(currentPosition);
        }

        return positions;
    }
}
