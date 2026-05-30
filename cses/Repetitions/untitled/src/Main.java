import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        char lastopp = 'z';
        long  maxac = 1;
        long accac =1;
        String inp = scanner.next();
        for(char c: inp.toCharArray()){
            switch(c){
                case 'A':
                    if(lastopp == 'A'){
                        accac++;
                        if(accac>maxac){
                            maxac=accac;
                        }
                    }
                    else accac =1;
                    lastopp = 'A';
                    break;
                case 'C':
                    if(lastopp == 'C'){
                        accac++;
                        if(accac>maxac){
                            maxac=accac;
                        }
                    }
                    else accac =1;
                    lastopp = 'C';
                    break;
                case 'G':
                    if(lastopp == 'G'){
                        accac++;
                        if(accac>maxac){
                            maxac=accac;
                        }
                    }
                    else accac =1;
                    lastopp = 'G';
                    break;
                case 'T':
                    if(lastopp == 'T'){
                        accac++;
                        if(accac>maxac){
                            maxac=accac;
                        }
                    }
                    else accac =1;
                    lastopp = 'T';
                    break;
            }
        }
        System.out.println(maxac);
    }
}
//read the problem in: https://cses.fi/problemset/task/1083
