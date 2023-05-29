package com.src.practise.ood_design_pattern.oot_state;

import java.util.Random;

public class CanRaffleState extends State{
    RaffleActivity raffleActity;

    public CanRaffleState(RaffleActivity raffleActity) {
        this.raffleActity = raffleActity;
    }

    /**
     * 已经扣除了积分，不能再扣
     */
    @Override
    public void deductMoney() {
        System.out.println("已经取过了积分");
    }

    /**
     * 可以抽奖，抽完奖后，根据实际情况，改成新的状态
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请超等");
        Random random = new Random();
        int num = random.nextInt(10);
        //百分之10的抽奖机会
        if (num==0){
            //改变活动状态为发放奖品 context
            raffleActity.setState(raffleActity.getDispenseState());
            return true;
        }else {
            raffleActity.setState(raffleActity.getNoRaffleState());
            return false;
        }
    }

    /**
     * 不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
