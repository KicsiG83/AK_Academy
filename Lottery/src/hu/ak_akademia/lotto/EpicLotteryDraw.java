package hu.ak_akademia.lotto;

public class EpicLotteryDraw extends Lottery {

    public EpicLotteryDraw(int max, int db) {
        super(max, db);
    }

    public void print() {

        for (int number : getWinNum()) {
            if (number == 9) {
                System.out.println("6-os! Faszt 9-es :) https://www.youtube.com/watch?v=bI0dtt_W6EE");
            } else {
                System.out.println(number);
            }
        }
    }
}
