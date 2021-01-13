package com.hackerrank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public static void main(String[] args) throws IOException {
        String ranked = "100 100 50 40 40 20 10";
        String player = "5 25 50 120";
        String ranked2 = "100 90 90 80 75 60";
        String player2 = "50 65 77 90 102";
        String ranked4 = "120 20 19 10 5";
        String player4 = "0 1 2 3 4 4";

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

        List<Integer> rankedList2 = Arrays.stream(ranked2.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> playerList2 = Arrays.stream(player2.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> rankedList4 = Arrays.stream(ranked4.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> playerList4 = Arrays.stream(player4.split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        Path path = Paths.get("C:\\Dev\\java\\design-patterns\\src\\main\\java\\com\\hackerrank\\rank2");
        String ranked3 = Files.readAllLines(path).get(0);
        Path path2 = Paths.get("C:\\Dev\\java\\design-patterns\\src\\main\\java\\com\\hackerrank\\player");
        String player3 = Files.readAllLines(path2).get(0);
        List<Integer> rankedList3 = Arrays.stream(ranked3.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> playerList3 = Arrays.stream(player3.split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        System.out.println("result " + climbingLeaderboard(rankedList, playerList));
        System.out.println("result2 " + climbingLeaderboard(rankedList2, playerList2));
        System.out.println(climbingLeaderboard(rankedList4, playerList4));
//        System.out.println(climbingLeaderboard(rankedList3, playerList3));
    }

    private static List<Integer> climbingLeaderboard(List<Integer> rankedList, List<Integer> playerList) {
        int rankSize = (int) rankedList.stream().distinct().count();
        List<Integer> playerRanks = new ArrayList<>();

        int i = rankedList.size() - 1;
        int j = 0;
        int currentRank = rankSize;
        int prevScore = rankedList.get(rankedList.size() - 1);

        for (Integer playerScore : playerList) {
            while (true) {
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
                        break;
                    }
                }

                if (i == rankedList.size() - 1) {
                    int playrank = currentRank + 1;
                    playerRanks.add(playrank);
                    break;
                }

                playerRanks.add(currentRank);
                break;
            }
        }

        return playerRanks;
    }


    private static List<Integer> climbingLeaderboardOld(List<Integer> rankedList, List<Integer> playerList) {
        int rankSize = (int) rankedList.stream().distinct().count();
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

        int loopCount = 0;
        int i = rankedList.size() - 1;
        int currentRank = rankSize;
        int prevScore = rankedList.get(rankedList.size() - 1);
        for (Integer playerScore : playerList) {
            while (i >= 0) {
                int currentScore = rankedList.get(i);

                if (playerScore >= currentScore) {
                    while (playerScore >= currentScore && i != 0) {
                        loopCount++;
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
//                        if (playerScore != prevScore) {
////                            rankSize++;
//                        }
                        break;
                    }

                    playerRanks.add(currentRank);
                    int playrank = i + 1;
                    rankedList.add(playrank, playerScore);
//                    if (playerScore != prevScore) {
////                        rankSize++;
//                    }
                    break;
                }

                if (i == rankedList.size() - 1) {
                    int playrank = currentRank + 1;
                    playerRanks.add(playrank);
                    rankedList.add(++i, playerScore);
                    i--;
//                    rankSize++;
                    break;
                }

            }
        }

        System.out.println("loop count " + loopCount);
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
