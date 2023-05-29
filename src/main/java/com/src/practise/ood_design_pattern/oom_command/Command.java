package com.src.practise.ood_design_pattern.oom_command;

/**
 * 创建命令接口
 */
public interface Command {
    //执行动作
    public void execute();
    //撤销动作
    public void undo();
}
