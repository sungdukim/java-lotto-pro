package lotto.application;

import lotto.domain.Prize;
import lotto.domain.Result;

public class LottoResultResponse {

    private static final String NEWLINE = "\n";

    private final Result result;

    public LottoResultResponse(final Result result) {
        this.result = result;
    }

    public String asString() {
        return "당첨 통계" + NEWLINE
            + "---------" + NEWLINE
            + prizesAsString() + NEWLINE
            + returnOnInvestmentAsString();
    }

    private String prizesAsString() {
        return prizeString(Prize.FOURTH, result.getNumberOfFourthPrizes()) + NEWLINE
            + prizeString(Prize.THIRD, result.getNumberOfThirdPrizes()) + NEWLINE
            + prizeString(Prize.SECOND, result.getNumberOfSecondPrizes()) + NEWLINE
            + prizeString(Prize.FIRST, result.getNumberOfFirstPrizes());
    }

    private String prizeString(final Prize prize, final int numberOfPrizes) {
        return prize.getMatchCount()
            + " 개 일치 ("
            + prize.getAmountAsString()
            + " 원)- "
            + numberOfPrizes
            + "개";
    }

    private String returnOnInvestmentAsString() {
        return "총 수익률은 " + result.calculateReturnOnInvestment() + " 입니다.";
    }
}
