package bean;

public class tuijian {
    String zd;
    String zz;
    String tj;
    public String getZd() {
        return zd;
    }
    public void setZd(String zd){
        this.zd=zd;
    }
    public String getZz() {
        return zz;
    }
    public void setZZ(String zz){
        this.zz=zz;
    }
    public String getTj() {
        return tj;
    }
    public void setTj(String tj){
        this.tj=tj;
    }
    public tuijian(){

    }
    public tuijian(String zd,String zz,String tj){
        super();
        this.zd=zd;
        this.zz=zz;
        this.tj=tj;
    }
    @Override
    public String toString(){
        return "症状为="+ zz + ",推荐菜品或建议="+ tj ;
    }
}
