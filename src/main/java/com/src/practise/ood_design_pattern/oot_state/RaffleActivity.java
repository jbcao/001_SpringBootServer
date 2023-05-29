package com.src.practise.ood_design_pattern.oot_state;

/**
 * 抽奖活动
 */
public class RaffleActivity {
    /**
     * state 表示活动当前的状态，是变化
     */
    State state = null;
    /**
     * 奖品数量
     */
    int count = 0;
    /**
     * 四个属性，表示四种状态
     */
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    /**
     * 构造器
     * 1.初始化当前状态为noRaffleState(即不能抽奖的状态)
     * 2.初始化奖品的数量
     */
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 扣分，调用当前状态的deduceMoney
     *
     * @return
     */
    public void deduceMoney() {
        state.deductMoney();
    }

    /**
     * 抽奖
     *
     * @return
     */
    public void raffle() {
        //如果当前状态是抽奖成功
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }
    }
    /**
     * 注意 每领取一次奖品，count--
     *
     * @return
     */
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }
    public State getState() {
        return state;
    }

    public RaffleActivity setState(State state) {
        this.state = state;
        return this;
    }

    public RaffleActivity setCount(int count) {
        this.count = count;
        return this;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public RaffleActivity setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
        return this;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public RaffleActivity setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
        return this;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public RaffleActivity setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
        return this;
    }

    public State getDispenseOutState() {

        return dispenseOutState;
    }

    public RaffleActivity setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
        return this;
    }
}
