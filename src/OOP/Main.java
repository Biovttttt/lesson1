package OOP;

public class Main {
    public static void main(String[] args) {



        Car[] carr = new Car[2];
        carr[0].Model="190";
        carr[0].obem=1.9;
        carr[1].Model="210";
        carr[1].obem=2.1;

        System.out.println(carr[0].Marka+ "  "+ carr[0].Model+ "  "+ carr[0].obem);
        System.out.println(carr[1].Marka+ "  "+ carr[1].Model+ "  "+ carr[1].obem);

    }

}
