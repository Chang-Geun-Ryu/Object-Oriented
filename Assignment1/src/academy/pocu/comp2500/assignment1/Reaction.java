package academy.pocu.comp2500.assignment1;

public class Reaction {
    private boolean bGreat;
    private boolean bSad;
    private boolean bAngry;
    private boolean bFun;
    private boolean bLove;

    public enum ReactionType {
        Great,
        Sad,
        Angry,
        Fun,
        Love
    }

    public Reaction() {
    }

    public  void setStatus(ReactionType type, boolean status) {
        switch (type) {
            case Great:
                this.bGreat = status;
                break;
            case Sad:
                this.bSad = status;
                break;
            case Angry:
                this.bAngry = status;
                break;
            case Fun:
                this.bFun = status;
                break;
            case Love:
                this.bLove = status;
                break;
            default:
                assert (true);
        }
    }

    public boolean isGreat() {
        return bGreat;
    }

    public boolean isSad() {
        return bSad;
    }

    public boolean isAngry() {
        return bAngry;
    }

    public boolean isFun() {
        return bFun;
    }

    public boolean isLove() {
        return bLove;
    }
}
