public class Demo8 {

        
        private String name;
        private double rating;
        private int releaseYear;
    
        
        public Demo8(String name, double rating, int releaseYear) {
            this.name = name;
            this.rating = rating;
            this.releaseYear = releaseYear;
        }
    
       
        public int getReleaseYear() {
            return releaseYear;
        }
    
     
        public void displayDetails() {
            System.out.println("Movie Name: " + name);
            System.out.println("Rating: " + rating);
            System.out.println("Release Year: " + releaseYear);
            System.out.println("--------------------------");
        }
    
       
        public static void main(String[] args) {
           
            Demo8 m1 = new Demo8("Avengers: Endgame", 8.4, 2019);
            Demo8 m2 = new Demo8("Dune", 8.2, 2021);
            Demo8 m3 = new Demo8("The Batman", 7.9, 2022);
            Demo8 m4 = new Demo8("Tenet", 7.4, 2020);
            Demo8 m5 = new Demo8("Oppenheimer", 8.6, 2023);
    
           
            Demo8[] movies = { m1, m2, m3, m4, m5 };
    
            
            System.out.println("Movies released after 2020:");
            System.out.println("===========================");
            for (Movie movie : movies) {
                if (movie.getReleaseYear() > 2020) {
                    movie.displayDetails();
                }
            }
        }
    }
    

