package company;

public class Project {

    private String nameProject;
    private int priceProject;
    private boolean isFinish;

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public int getPriceProject() {
        return priceProject;
    }

    public void setPriceProject(int priceProject) {
        this.priceProject = priceProject;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public Project(String nameProject, int priceProject, boolean isFinish) {

        this.nameProject = nameProject;
        this.priceProject = priceProject;
        this.isFinish = isFinish;
    }
}
