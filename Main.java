import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        ArrayList<HashMap> movieList = new ArrayList<HashMap>();
        HashMap<String, String> movieDictionary = new HashMap<String, String>();
        HashMap<String, String> movieDictionary1 = new HashMap<String, String>();
        HashMap<String, Integer> movieDictionary2 = new HashMap<String, Integer>();



        while(true) {
            System.out.println("1. Choose my movie!");
            System.out.println("2. See available movies");
            System.out.println("3. See my movie list!");
            System.out.println("4. Edit extra properties!");
            System.out.println("5. exit");
            Scanner scan1 = new Scanner(System.in);
            int num = scan1.nextInt();

            if(num == 1) {
                System.out.println("What do you want?");
                Scanner scan2 = new Scanner(System.in);
                String movieChoose = scan2.nextLine();
                movieDictionary.put("Movie Name", movieChoose);
                movieList.add(movieDictionary);
            }
            else if(num == 2) {
                System.out.println("********************************************************");
                System.out.println("Harry Potter, Avengers, Thor, Conjuring, Quite Place2");
                System.out.println("********************************************************");
            }
            else if(num == 3) {
                for(int i = 0; i < movieList.size(); i++) {
                    System.out.println(movieList.get(i));
                }
            }
            else if(num == 4) {
                System.out.println("Please choose between 1 & 2 !!!");
                System.out.println("1. Edit date");
                System.out.println("2. Edit place");
                Scanner scan3 = new Scanner(System.in);
                int num1 = scan3.nextInt();

                if(num1 == 1) {
                    System.out.println("Please type the date!");
                    Scanner scan4 = new Scanner(System.in);
                    int movieDate = Integer.parseInt(scan4.nextLine());
                    movieDictionary2.put("Date", movieDate);
                    movieList.add(movieDictionary2);
                }
                else if(num1 == 2) {
                    System.out.println("Plese type the place!");
                    Scanner scan5 = new Scanner(System.in);
                    String moviePlace = scan5.nextLine();
                    movieDictionary1.put("Place", moviePlace);
                    movieList.add(movieDictionary1);

                }
                else {
                    System.out.println("Please choose between 1 & 2 !!!");
                }
            }
            else if(num == 5) {
                break;
            }
            else {
                System.out.println("Please choose among 1,2,3,4,5!!!");
            }
        }
        
    }
   
}

// 아직 무비 클라스 사용 못함 
class Movie {
    private String name;
    private String place;
    private int date;

    Movie() {

    }

    Movie(Scanner scan) {
        
        // place = _place;
        // date = _date;
    }

    public String getName() {
        return name;
    }
    public String getPlace() {
        return place;
    }
    public int getDate() {
        return date;
    }
    
    public void setName(String _name) {
        name = _name;
    }
    public void setPlace(String _place) {
        place = _place;
    }
    public void setDate(int _date) {
        date = _date;
    }

}