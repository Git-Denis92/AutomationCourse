import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        // if else petlje
//        boolean res = 10 == 10; // isto samo drugi oblik
//
//        String ime = "Pera";
//
//        if (true) System.out.println("True");
//
//
//        if (10 == 10 && 5 > 43 || true || ime.equals("Pera")) { // linija u petlji se izvrsava jedna za drugom
//            if (ime.contains("a")) {
//                if (!ime.contains("z")) {
//                    System.out.println("Ne sadrzi dato slovo!");
//                }
//                System.out.println("Sadrzi slovo a!");
//            }
//            System.out.println("Tacno!");
//        } else if (10 > 5) {
//            System.out.println("Drugi uslov je tacan!");
//        } else if (ime.equals("Pera!")) {
//            System.out.println("Ime je tacno!");
//        } else {
//            System.out.println("Nista od navedenog!");
//        }
//    }
//}

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(523135);
        int y = scanner.nextInt(324323);
        System.out.println(("Rezultat djeljenja je:") + x/y);

        if (x/y > 1000){
            System.out.println("Ostatak je veci od hiljadu:");
        }



//        System.out.println("Unesite prvi broj: ");
//        int operand1 = scanner.nextInt();
//
//        System.out.println("Unesite drugi broj: ");
//        int operand2 = scanner.nextInt();
//
//        System.out.println("Unesite racunsku operaciju:");
//        String operator = scanner.next();

//        if (operator.equals("+")) {
//            System.out.println("Rezultat sabiranja je:" + (operand1 + operand2));
//        } else if (operator.equals("-")) {
//            System.out.println("Rezultat oduzimanja je:" + (operand1 - operand2));
//        } else if (operator.equals("*")) {
//            System.out.println("Rezultat mnozenja je:" + (operand1 * operand2));
//        } else if (operator.equals("/")) {
//            System.out.println("Rezultat djelenja je:" + (operand1 / operand2));
//        }else {
//            System.out.println("Greska pri unosu");
//        }

        // switch koristimo ukoliko poredimo jedan operator
//        switch (operator){
//            case "+":{
//                System.out.println("Rezultat sabiranja je:" + (operand1 + operand2));
//            }break;
//            case"-":{
//                System.out.println("Rezultat oduzimanja je:" + (operand1 - operand2));
//            }break;
//            case"*":{
//                System.out.println("Rezultat mnozenja je:" + (operand1 * operand2));
//            }break;
//            case "/":{
//                if (operand2 == 0){
//                    System.out.println("Djeljenje sa nulom nije dozvoljeno!");
//                }
//                System.out.println("Rezultat djelenja je:" + (operand1 / operand2));
//            }break;
//            default:System.out.println("Greska pri unosu");
//        }
    }
}

