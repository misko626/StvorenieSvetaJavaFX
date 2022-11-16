package sample.demo.services;

import sample.demo.entity.Planeta;
import sample.demo.entity.Space;

public class Controller {

    public Space mySpace;

    public Planeta currentPlaneta;

    public Space getMySpace() {
        return mySpace;
    }

    public void setMySpace(Space mySpace) {
        this.mySpace = mySpace;
    }

    public Planeta getCurrentPlaneta() {
        return currentPlaneta;
    }

    public void setCurrentPlaneta(Planeta currentPlaneta) {
        this.currentPlaneta = currentPlaneta;
    }
}
