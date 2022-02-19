package main.view;

import java.util.List;
import main.domain.HorizontalLine;
import main.util.NameFormatter;

public class OutputView {
    public static final String NUM_OF_ATTENDANTS = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    public static final String MAXIMUM_HEIGHT_OF_LADDERS = "최대 사다리 높이는 몇 개 인가요?";

    public static void printParticipantsNameQueryText() {
        System.out.println(NUM_OF_ATTENDANTS);
    }
    public static void printMaxHeightOfLadderQueryText() {
        System.out.println(MAXIMUM_HEIGHT_OF_LADDERS);
    }

    public static void printLadderBoard(String names, List<HorizontalLine> ladderBoard) {
        StringBuilder sb = new StringBuilder();
        getNamesRow(names,sb);
        getLaddersRow(ladderBoard,sb);
        System.out.println(sb);
    }

    public static void getNamesRow(String names, StringBuilder sb) {
        String[] nameList = names.split(",");
        for (String name: nameList) {
            sb.append(" ").append(NameFormatter.blankPadding(name));
        }
        sb.append("\n");
    }

    public static void getLaddersRow(List<HorizontalLine> ladderBoard, StringBuilder sb) {
        for (HorizontalLine line : ladderBoard) {
            getLaddersCol(line,sb);
        }
    }


    public static void getLaddersCol(HorizontalLine line, StringBuilder sb) {
        sb.append("   ");
        for (boolean bool : line.getPoints()) {
            sb.append("|").append(ladderSign(bool));
        }
        sb.append("|\n");
    }

    public static String ladderSign(boolean b) {
        if (b) {
            return "-----";
        }
        return "     ";
    }
}
