class makhluk_hidup {
    private String nama;
    private String gigi;
    private String jenis;

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getGigi() {
        return gigi;
    }
    public void setGigi(String gigi) {
        this.gigi = gigi;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void nafas(){
        System.out.println("bernafas");
    }
    public void jalan(){
        System.out.println("jalan");
    }
}

//****************************************

//************* hewan.java ***************
class herbivora extends makhluk_hidup{
    private String tumbuhan;
    private String kambing;

    public String getKambing() {
        return kambing;
    }
    public void setKambing(String kambing) {
        this.kambing = kambing;
    }
    public String getTumbuhan() {
        return tumbuhan;
    }
    public void setTumbuhan(String tumbuhan) {
        this.tumbuhan = tumbuhan;
    }
    @Override
    public String getJenis() {
        return super.getJenis();
    }
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public void jalan() {
        super.jalan();
    }
    @Override
    public void nafas() {
        super.nafas();
    }
    @Override
    public void setJenis(String jenis) {
        super.setJenis(jenis);
    }
    @Override
    public void setGigi(String gigi) {
        super.setGigi(gigi);
    }
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
}
//****************************************


//*************** Main.java ***************
class Main {
    public static void main(String[] args) {

        herbivora animal = new herbivora();
        animal.setTumbuhan("tumbuhan");
        animal.setKambing("kambing");
        animal.setJenis("herbivora");
        animal.setGigi("tumpul teeth");
        System.out.println();
        System.out.println("Hi i'm "+animal.getJenis()+",My Name is "+animal.getKambing()+", My Food is "+animal.getTumbuhan()+",i have " + animal.getGigi() );
    }
}
//****************************************