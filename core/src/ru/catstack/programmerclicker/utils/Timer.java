package ru.catstack.programmerclicker.utils;

public class Timer {

    private float thisTime = 0;
    private float finalTime;
    private Runnable action = () -> {};
    private boolean isPause = false;

    public Timer(float finalTime){
        this.finalTime = finalTime;
    }

    public Timer(float finalTime, Runnable action){
        this.finalTime = finalTime;
        this.action = action;
    }

    public void update(float delta){

        if(!isPause)
            thisTime += delta;

        if(thisTime >= finalTime){
            thisTime = 0;
            action.run();
        }
    }

    public void pause(){
        isPause = true;
    }

    public void unpause(){
        isPause = false;
    }

    public void resetTimer(){
        thisTime = 0;
    }

    public void setFinalTime(float finalTime) {
        this.finalTime = finalTime;
    }

    public void setAction(Runnable action){
        this.action = action;
    }

    public Runnable getAction() {
        return action;
    }
}
