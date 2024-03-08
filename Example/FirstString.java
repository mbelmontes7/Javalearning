package Example;
public class FirstString {    
        public static void main(String[] args) {
            char sport = 'y';
            char outdoor = 'n';
            if(sport == 'n') {
              if(outdoor == 'n') {
                System.out.println("No sport.");
              }
            } else {
              if(outdoor == 'n') {
                System.out.println("Indoor sport.");
              } else {
                System.out.println("Outdoor sport.");
              }
            }
        }
}