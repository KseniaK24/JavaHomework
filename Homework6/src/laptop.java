class laptop {
    String firm;
    String model;
    int ram;
    int hardDisk;
    String operatingSystem;

    laptop (String f, String m, int r, int hd, String os){
        firm = f;
        model = m;
        ram = r;
        hardDisk = hd;
        operatingSystem = os;
    }
public String toString(){
        String str;
        str = "----------------------------------------------\n" + "Firm: " + firm + "\n" + "Model: " + model + "\n" + "RAM: " + ram + "\n" + "Hard dick: " + hardDisk + "\n" + "OS: " + operatingSystem;
        return  str;
}
}