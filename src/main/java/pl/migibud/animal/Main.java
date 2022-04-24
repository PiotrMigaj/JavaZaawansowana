package pl.migibud.animal;

public class Main {
    public static void main(String[] args) {

        Runner runner = new Dog("Piotr");
//        runner.run();

        FastRunner fastRunner = new Dog("Piotr FastRunner");

//        fastRunner.runFaster();
//        fastRunner.run();

        Runner[] runners = new Runner[2];
        runners[0]=runner;
        runners[1]=fastRunner;

//        for (Runner r:runners) {
//            r.run();
//        }


        if (fastRunner instanceof Dog){
            Dog dog = (Dog)fastRunner;
            dog.saySomething();
        }

        Animal animal = new Animal("Ślimak Romek") {
            @Override
            public void saySomething() {
                System.out.println("Cześć jestem ślimak Romek");
            }
        };

        Runner runner1 = new Runner() {
            @Override
            public void run() {
                System.out.println("Hej ho");
            }
        };

        runner1.run();



    }
}
