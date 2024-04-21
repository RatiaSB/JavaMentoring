import javax.swing.*;


public class Main {
    public static void main(String[] args) {
// Try exception
        try{
            //statement allows you to define a block of code to be tested for errors while it is being executed.
        String[] arr = new String[9];

        for(int i = 0; i < 11; i++){
            System.out.println("index is" + arr[i] );

        }

    } catch (ArrayIndexOutOfBoundsException ex){
            // code to be executed if error occurs
           // System.out.println("Please enter value from 0 to 9 ");
            JOptionPane.showMessageDialog(null,"array only have 9 index \n"+ ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }

        }

}