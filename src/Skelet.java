public class Skelet extends Boss {
    int strel;

    public int getStrel() {
        return strel;
    }

    public void setStrel(int strel) {
        this.strel = strel;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " strela;  " + this.strel;
    }
}
