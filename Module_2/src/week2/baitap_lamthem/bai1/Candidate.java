package week2.baitap_lamthem.bai1;


public class Candidate {
    private int msv;
    private String name;
    private String dOB;
    private double diemToan;
    private double diemAnh;
    private double diemVan;
    public Candidate() {

    }
    public Candidate(int msv, String name, String dOB, double diemToan, double diemAnh, double diemVan) {
        this.msv = msv;
        this.name = name;
        this.dOB = dOB;
        this.diemToan = diemToan;
        this.diemAnh = diemAnh;
        this.diemVan = diemVan;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }



    @Override
    public String toString() {
        return "Candidate{" +
                "msv=" + msv +
                ", name='" + name + '\'' +
                ", dOB='" + dOB + '\'' +
                ", diemToan=" + diemToan +
                ", diemAnh=" + diemAnh +
                ", diemVan=" + diemVan +
                '}';
    }


    public double tongDiem(){
        double tong;
        tong = getDiemAnh() + getDiemToan() + getDiemVan();
        return tong;
    }
}
