package pl.migibud.enumerated;

public enum Size {

    SMALL,MEDIUM(10),BIG(20);

    int maxWeight;

    Size(){
        System.out.println("Tworzę egzemplarz enuma");
    }

    Size(int maxWeight){
        this.maxWeight = maxWeight;
        System.out.println("Tworzę egzemplarz enuma o wadze: "+this.maxWeight);
    }

    public int getMaxWeight(){
        return maxWeight+2;
    }

}
