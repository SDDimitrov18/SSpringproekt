package lesson3;

public abstract class CollaborativeFIlter implements Filter{
    public String[] getRecommandation(String movie){
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};

    }
}
