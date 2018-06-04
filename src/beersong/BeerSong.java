package beersong;

public class BeerSong {

    public static void main(String[] args) {

        String word = "bottles";
        int beerNum = 99;

        while (beerNum > 0) {

            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "bottle";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
                System.out.println("");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
