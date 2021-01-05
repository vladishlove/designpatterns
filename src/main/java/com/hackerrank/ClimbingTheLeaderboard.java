package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        String ranked = "100 100 50 40 40 20 10";
        String player = "5 25 50 120 121";
//        String ranked = "100 90 90 80 75 60";
//        String player = "50 65 77 90 102";

        /*
         * 100 100 50 40 40 20 10
         *    1    2    3   4  5
         *
         * 5 25 50 120
         * 6 4  2  1
         *
         * ExpectedOutput
         * 6 4  2  1
         *
         * */

        List<Integer> rankedList = Arrays.stream(ranked.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> playerList = Arrays.stream(player.split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        System.out.println("result " + climbingLeaderboard(rankedList, playerList));
    }


    private static List<Integer> climbingLeaderboard(List<Integer> rankedList, List<Integer> playerList) {
        int rankSize = new HashSet<>(rankedList).size();
        List<Integer> playerRanks = new ArrayList<>();
        if (playerList == null || playerList.size() == 0) {
            return Collections.emptyList();
        }

        if (rankedList == null || rankedList.size() == 0) {
            for (Integer integer : playerList) {
                playerRanks.add(1);
            }

            return playerRanks;
        }

        for (Integer playerScore : playerList) {
            int prevScore = rankedList.get(rankedList.size() - 1);
            int currentRank = rankSize;


            for (int i = rankedList.size() - 1; i >= 0; i--) {
                int currentScore = rankedList.get(i);

                if (playerScore >= currentScore) {
                    while (playerScore >= currentScore && i != 0) {
                        if (prevScore != currentScore) {
                            currentRank--;
                        }
                        i--;
                        prevScore = currentScore;
                        currentScore = rankedList.get(i);
                    }

                    if (i == 0 && playerScore >= currentScore) {
                        playerRanks.add(1);
                        rankedList.add(i, playerScore);
                        if (playerScore != prevScore) {
                            rankSize++;
                        }
                        break;
                    }

                    playerRanks.add(currentRank);
                    rankedList.add(++i, playerScore);
                    if (playerScore != prevScore) {
                        rankSize++;
                    }
                    break;
                }

                if (i == rankedList.size() - 1) {
                    playerRanks.add(++currentRank);
                    rankedList.add(++i, playerScore);
                    rankSize++;
                    break;
                }

            }
        }

        return playerRanks;
    }

    public static List<Integer> climbingLeaderboardLong(List<Integer> ranked, List<Integer> player) {
        ArrayList<Integer> playerRanks = new ArrayList<>();
        TreeSet<Integer> scores = new TreeSet<>(ranked);

        for (Integer playerScore : player) {
            Map<Integer, Integer> scoreRank = new HashMap<>();
            scores.add(playerScore);

            int i = 1;
            Iterator<Integer> iterator = scores.descendingIterator();
            while (iterator.hasNext()) {
                Integer score = iterator.next();
                scoreRank.put(score, i);

                i++;
            }

            playerRanks.add(scoreRank.get(playerScore));
        }

        return playerRanks;
    }
}
