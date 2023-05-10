public class Puerto {

    private Hub[] puerto = new Hub[3];

    public Puerto() {
        for(int i = 0; i < this.puerto.length; ++i) {
            this.puerto[i] = new Hub();
        }

    }

}
