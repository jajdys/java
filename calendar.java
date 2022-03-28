import java.util.Scanner;
public class Kalendarz{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String[] miesionce = new String[] {"styczeń", "luty"," marzec", "kwiecien","maj","czerwiec","lipiec", "sierpiem","wrzesien", "pazdziernik","listopad","grudzien"}; //tablica dla miesiecy 
        String[][] styczen = {//tablica dla miesiaca styczen
	     	{ "==", "==", "==", "==", "==", "01", "02"},
		{ "03", "04", "05", "06", "07", "08", "09"},
		{ "10", "11", "12", "13", "14", "15", "16"},
		{ "17", "18", "19", "20", "21", "22", "23"},
		{ "24", "25", "26", "27", "28", "29", "30"},
		{ "31", "==", "==", "==", "==", "==", "=="}
            };
        String[][] luty = {//tablica dla miesiaca luty
		{ "==", "01", "02", "03", "04", "05", "06"},
            	{ "07", "08", "09", "10", "11", "12", "13"},
            	{ "14", "15", "16", "17", "18", "19", "20"},
            	{ "21", "22", "23", "24", "25", "26", "27"},
            	{ "28", "==", "==", "==", "==", "==", "=="}
            };

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Który rok chciałbyś zobaczyć?");
        int rok = keyboard.nextInt();
        System.out.println("Wybierz podany miesiąc(1-12): ");
        int miesionc = keyboard.nextInt();

        if(miesionc==1){
            System.out.println("| Styczeń " + rok + " |");
                for(int x = 0; x < 31; x++){
                    if(x % 7 == 0){
                        System.out.printf("| " + styczen[0][x] + " |\t");
                    }
                    else{
                        System.out.printf("| " + styczen[0][x] + " |\t");
                    }
                }
                for(int y = 1; y < 4; y++){
                    System.out.printf("| " + styczen[y][0] + " |\t\n");
                }
        }
        else if(miesionc==2){
            System.out.println("| Luty " + rok + " |");
                for(int x = 0; x < 28; x++){
                    if(x % 7 == 0){
                        System.out.printf("| " + luty[0][x] + " |\t");
                    }
                    else{
                        System.out.printf("| " + luty[0][x] + " |\t");
                    }
                }
                for(int y = 1; y < 4; y++){
                    System.out.printf("| " + luty[y][0] + " |\t\n");
                }
        }
        else if(miesionc==3){
            
        }
        else if(miesionc==4){
            
        } 
        else if(miesionc==5){
            
        }
        else if(miesionc==6){
            
        }
        else if(miesionc==7){
            
        }
        else if(miesionc==8){
            
        }
        else if(miesionc==9){
          
        }
        else if(miesionc==10){
            
        }
        else if(miesionc==11){
            
        }
        else if(miesionc==12){
            
        }
    }
}
