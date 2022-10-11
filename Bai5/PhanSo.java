package Bai5;

public class PhanSo{
    public int tuSo;
    public int getTuSo() {
        return tuSo;
    }
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int mauSo;
    public int getMauSo() {
        return mauSo;
    }
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public String toString(){
        return String.format("%.0f/%.0f", this.getTuSo(), this.getMauSo());
    }

    public int toiGian(){
        int a = this.getTuSo();
        int b = this.getMauSo();
        while(a != b){
            if(a > b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        return a;
    }
}
