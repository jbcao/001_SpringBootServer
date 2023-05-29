package com.src.practise.ood_design_pattern.oom_command;

public class RemoteController {
    //开按钮的命令数组
    Command[] onCommands;
    //关按钮的命令数组
    Command[] offCommands;
    //执行撤销的命令
    Command undoCommand;

    //构造器
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            offCommands[i] = new NoCommand();
            onCommands[i] = new NoCommand();
        }
    }

    //设置命令
    //给我们的按钮设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int no) {
        //找到你按下的开的按钮，并调用对应方法
        onCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = onCommands[no];
    }

    //按下关按钮
    public void offButtonWasPushed(int no) {
        //找到你按下的开的按钮，并调用对应方法
        offCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = offCommands[no];
    }

    //撤销按钮
    public void undoButtonWasPushewd() {
        undoCommand.undo();
    }
}
