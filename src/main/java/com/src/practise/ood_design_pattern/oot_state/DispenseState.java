package com.src.practise.ood_design_pattern.oot_state;

public class DispenseState extends State{
    /**
     *  初始化时传入活动引用，发放奖品后改变其状态
     */
    RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        if (raffleActivity.getCount()>0){
            System.out.println("恭喜中奖了");
            raffleActivity.setState(raffleActivity.getNoRaffleState());
        }else {
            System.out.println("很遗憾，奖品发放完了");
            //改变状态为奖品发放完毕，后面就不能抽奖了
            raffleActivity.setState(raffleActivity.getDispenseOutState());
            //System.out.println("抽奖活动结束");
            //System.exit(0);
        }

    }
}
