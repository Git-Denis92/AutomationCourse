public class Loops {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ispis:" + i); // ispisuje od 0 do 9

//            for (int i = 10; i > 0; i--) { // dodati >= ako zelimo da ispise 0
//                System.out.println("Ispis:" + i); // ispisuje od 10 do 1

        // for (int i = 0; i < ; i++) { // f0ri i tab napravi for petlju automatski

//        for (int i = 10; i < 0; i++)
//            for (int j = 0; j < 20; j++) {
//                System.out.println("Brojac i:" + i + "brojac j: " + j);
//            }
//            }
        int a = 0;
        while (a < 10){
          //  System.out.println(a);
            a++;
            if (a == 5){
               continue;
            }else {
                System.out.println(a);
            }
//
//            while (true){
//                System.out.println("Infinite loop!!!"); // beskonacna petlja
//            }
        }

        }
    }
//}

// github ------------ main/master

        // --------------------feature/add-new-changes --> pull/merge request

// local git init ------- main - main grana

// git branch feature/add-new-changes - nova grana za nove izmjene

// git add . - dodavanje fajlova za commit
// git commit  -m "adding new changes regarding main method" -------> pripema za slanje na server

// git push origin/feature/add-new-changes

// git checkout master ---- prebacujem se na local main/master granu

// git pull origin/main ----> lokalmo dobijam najnovije promjene sa main-a

