public class Shoe {
    private String manufacturer;
    private String model; 
    private int year;
    private float price;
    
    public Shoe() {
        this.manufacturer = "None";
        this.model = "None";
        this.year = 0;
        this.price = -1f;
    }

    public Shoe(String manafacturer, String model, int year, float price) {
        this.manufacturer = manafacturer;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public void discount() {
        this.price -= (this.price * 0.05);
    }

    

     
}