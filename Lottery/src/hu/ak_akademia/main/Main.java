package hu.ak_akademia.main;

import hu.ak_akademia.lotto.EpicLotteryDraw;
import hu.ak_akademia.lotto.Lottery;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        Lottery lottery = new Lottery();
        lottery.draw();
        System.out.println(lottery.toString());
        
        Lottery parametersLottery = new Lottery(10, 10);
        parametersLottery.draw();
        System.out.println(parametersLottery.toString() + "\n");
        
        EpicLotteryDraw funny = new EpicLotteryDraw(10, 9);
        funny.draw();
        funny.print();
    }
}
