public class Pet {
    private String type;
    private String name;
    private int birthYear;
    private boolean vaccinated;
    
    public Pet() {
        this.type = "NONE";
        this.name = "NONE";
        this.birthYear = 0;
        this.vaccinated = false;
    }

    public Pet(String type, String name, int birthYear, boolean vaccinated) {
        this.type = type;
        this.name = name;
        this.birthYear = birthYear;
        this.vaccinated = vaccinated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Pet [type=" + type + ", name=" + name + ", birthYear=" + birthYear + ", vaccinated=" + vaccinated + "]";
    }

    public boolean vaccinate() {
        if (this.vaccinated) {
            return false;
        }

        this.vaccinated = true;
        return true;
    }
}
