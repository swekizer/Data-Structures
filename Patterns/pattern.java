package Patterns;

public class pattern{
    public static void main(String[] args) {
        pattern1(5);
        
        pattern2(5);

        pattern3(5);

        pattern4(5);

        pattern5(5);

        pattern6(5);

        pattern7(5);

        pattern8(5);

        pattern9(5);
        
        pattern10(5);

        pattern12(5);

        pattern13(4);

        pattern14(5);

        pattern15(5);

        pattern16(5);

        pattern17(5);
    }


    //Square pattern
    static void pattern1(int n){

        for(int i=0; i< n; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //Triangle pattern
    static void pattern2(int n){

        for(int i=1; i <= n; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern3(int n){

        for(int i=1; i<= n; i++){
            int num =1;
            for(int j=1; j<= i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }


    static void pattern4(int n){

        int num = 1;
        for(int i=1; i<= n; i++){
            for(int j=1; j<= i; j++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }



    static void pattern5(int n){

        for(int i=n; i >= 1; i--){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern6(int n){

        for(int i=n; i>= 1; i--){
            int num =1;
            for(int j=1; j<= i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }


    static void pattern7(int n){
        
        for(int i=1; i <=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k <= 2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    static void pattern8(int n){
        
        for(int i=n; i >=1; i--){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k <= 2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    static void pattern9(int n){
      
        for(int i=1; i <= n; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i >= 1; i--){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern10(int n){

        for(int i=1; i<= n; i++){
            for(int j=1; j<= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        
        }
    }

    

    static void pattern11(int n){

        int p = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(p + " ");
                p++;
            }
            System.out.println();

        }
    }



    static void pattern12(int n){

        for(int i=1; i <=n; i++){

            for(int j=1; j<= i; j++){
                System.out.print(j);
            }
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j = i; j >=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }



    static void pattern13(int n){

        
        for(int i=1; i<= n; i++){
            char alpha = 'A';
            for(int j=1; j<= i; j++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
        
    }


    static void pattern14(int n){

        
        for(int i=n; i>= 1; i--){
            char alpha = 'A';
            for(int j=1; j<= i; j++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
        
    }


    static void pattern15(int n){

        char alpha = 'A';
        for(int i=1; i<= n; i++){
            
            for(int j=1; j<= i; j++){
                System.out.print(alpha);
            }
            alpha++;
            System.out.println();
        }
        
    }


    static void pattern16(int n){

        
        for(int i=1; i<=n; i++){
            char alpha = 'A';
            for(int j=1; j<= n-i-1; j++){
                System.out.print(" ");
            }

            for(int k=1; k<= i; k++){
                System.out.print(alpha);
                alpha++;
            }

            alpha--;
            for(int c=1; c<= i; c++){
                alpha--;
                System.out.print(alpha);
            }
            System.out.println();
        }
        
    }


    static void pattern17(int n){

        for(int i=1; i<= n; i++){
            char ch = (char) ('E' - i+1);

            for(int j=1; j<= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }


}